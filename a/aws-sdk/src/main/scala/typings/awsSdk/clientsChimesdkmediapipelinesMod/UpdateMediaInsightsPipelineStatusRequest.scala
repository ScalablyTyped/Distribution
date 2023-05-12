package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMediaInsightsPipelineStatusRequest extends StObject {
  
  /**
    * The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media insights pipeline.
    */
  var Identifier: NonEmptyString
  
  /**
    * The requested status of the media insights pipeline.
    */
  var UpdateStatus: MediaPipelineStatusUpdate
}
object UpdateMediaInsightsPipelineStatusRequest {
  
  inline def apply(Identifier: NonEmptyString, UpdateStatus: MediaPipelineStatusUpdate): UpdateMediaInsightsPipelineStatusRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], UpdateStatus = UpdateStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMediaInsightsPipelineStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMediaInsightsPipelineStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: NonEmptyString): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatus(value: MediaPipelineStatusUpdate): Self = StObject.set(x, "UpdateStatus", value.asInstanceOf[js.Any])
  }
}
