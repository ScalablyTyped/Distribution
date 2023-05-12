package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFaceLivenessSessionResultsRequest extends StObject {
  
  /**
    * A unique 128-bit UUID. This is used to uniquely identify the session and also acts as an idempotency token for all operations associated with the session.
    */
  var SessionId: LivenessSessionId
}
object GetFaceLivenessSessionResultsRequest {
  
  inline def apply(SessionId: LivenessSessionId): GetFaceLivenessSessionResultsRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFaceLivenessSessionResultsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFaceLivenessSessionResultsRequest] (val x: Self) extends AnyVal {
    
    inline def setSessionId(value: LivenessSessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
