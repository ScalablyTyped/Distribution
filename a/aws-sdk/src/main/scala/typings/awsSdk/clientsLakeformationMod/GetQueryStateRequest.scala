package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryStateRequest extends StObject {
  
  /**
    * The ID of the plan query operation.
    */
  var QueryId: GetQueryStateRequestQueryIdString
}
object GetQueryStateRequest {
  
  inline def apply(QueryId: GetQueryStateRequestQueryIdString): GetQueryStateRequest = {
    val __obj = js.Dynamic.literal(QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryStateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetQueryStateRequest] (val x: Self) extends AnyVal {
    
    inline def setQueryId(value: GetQueryStateRequestQueryIdString): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
  }
}
