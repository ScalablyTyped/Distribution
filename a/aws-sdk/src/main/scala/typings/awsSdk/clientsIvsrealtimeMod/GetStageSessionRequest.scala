package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStageSessionRequest extends StObject {
  
  /**
    * ID of a session within the stage.
    */
  var sessionId: StageSessionId
  
  /**
    * ARN of the stage for which the information is to be retrieved.
    */
  var stageArn: StageArn
}
object GetStageSessionRequest {
  
  inline def apply(sessionId: StageSessionId, stageArn: StageArn): GetStageSessionRequest = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], stageArn = stageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStageSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStageSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setSessionId(value: StageSessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setStageArn(value: StageArn): Self = StObject.set(x, "stageArn", value.asInstanceOf[js.Any])
  }
}
