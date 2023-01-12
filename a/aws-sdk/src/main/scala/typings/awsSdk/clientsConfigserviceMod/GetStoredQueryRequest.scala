package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStoredQueryRequest extends StObject {
  
  /**
    * The name of the query.
    */
  var QueryName: typings.awsSdk.clientsConfigserviceMod.QueryName
}
object GetStoredQueryRequest {
  
  inline def apply(QueryName: QueryName): GetStoredQueryRequest = {
    val __obj = js.Dynamic.literal(QueryName = QueryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStoredQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStoredQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setQueryName(value: QueryName): Self = StObject.set(x, "QueryName", value.asInstanceOf[js.Any])
  }
}
