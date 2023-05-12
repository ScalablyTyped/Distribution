package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFaceLivenessSessionResponse extends StObject {
  
  /**
    * A unique 128-bit UUID identifying a Face Liveness session.
    */
  var SessionId: LivenessSessionId
}
object CreateFaceLivenessSessionResponse {
  
  inline def apply(SessionId: LivenessSessionId): CreateFaceLivenessSessionResponse = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFaceLivenessSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFaceLivenessSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setSessionId(value: LivenessSessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
