package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartQueryRequest extends StObject {
  
  /**
    * The SQL code of your query.
    */
  var QueryStatement: typings.awsSdk.clientsCloudtrailMod.QueryStatement
}
object StartQueryRequest {
  
  inline def apply(QueryStatement: QueryStatement): StartQueryRequest = {
    val __obj = js.Dynamic.literal(QueryStatement = QueryStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartQueryRequest]
  }
  
  extension [Self <: StartQueryRequest](x: Self) {
    
    inline def setQueryStatement(value: QueryStatement): Self = StObject.set(x, "QueryStatement", value.asInstanceOf[js.Any])
  }
}
