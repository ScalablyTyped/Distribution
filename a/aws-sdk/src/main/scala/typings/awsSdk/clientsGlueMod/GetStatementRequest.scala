package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStatementRequest extends StObject {
  
  /**
    * The Id of the statement.
    */
  var Id: IntegerValue
  
  /**
    * The origin of the request.
    */
  var RequestOrigin: js.UndefOr[OrchestrationNameString] = js.undefined
  
  /**
    * The Session ID of the statement.
    */
  var SessionId: NameString
}
object GetStatementRequest {
  
  inline def apply(Id: IntegerValue, SessionId: NameString): GetStatementRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStatementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStatementRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: IntegerValue): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setRequestOrigin(value: OrchestrationNameString): Self = StObject.set(x, "RequestOrigin", value.asInstanceOf[js.Any])
    
    inline def setRequestOriginUndefined: Self = StObject.set(x, "RequestOrigin", js.undefined)
    
    inline def setSessionId(value: NameString): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
