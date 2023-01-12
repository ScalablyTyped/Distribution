package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStoredQueryRequest extends StObject {
  
  /**
    * The name of the query that you want to delete.
    */
  var QueryName: typings.awsSdk.clientsConfigserviceMod.QueryName
}
object DeleteStoredQueryRequest {
  
  inline def apply(QueryName: QueryName): DeleteStoredQueryRequest = {
    val __obj = js.Dynamic.literal(QueryName = QueryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStoredQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteStoredQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setQueryName(value: QueryName): Self = StObject.set(x, "QueryName", value.asInstanceOf[js.Any])
  }
}
