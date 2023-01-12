package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaCapturePipelineRequest extends StObject {
  
  /**
    * The configuration for a specified media capture pipeline. SourceType must be ChimeSdkMeeting.
    */
  var ChimeSdkMeetingConfiguration: js.UndefOr[typings.awsSdk.clientsChimeMod.ChimeSdkMeetingConfiguration] = js.undefined
  
  /**
    * The token assigned to the client making the pipeline request.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsChimeMod.ClientRequestToken] = js.undefined
  
  /**
    * The ARN of the sink type.
    */
  var SinkArn: Arn
  
  /**
    * Destination type to which the media artifacts are saved. You must use an S3 bucket. 
    */
  var SinkType: MediaPipelineSinkType
  
  /**
    * ARN of the source from which the media artifacts are captured.
    */
  var SourceArn: Arn
  
  /**
    * Source type from which the media artifacts will be captured. A Chime SDK Meeting is the only supported source.
    */
  var SourceType: MediaPipelineSourceType
}
object CreateMediaCapturePipelineRequest {
  
  inline def apply(SinkArn: Arn, SinkType: MediaPipelineSinkType, SourceArn: Arn, SourceType: MediaPipelineSourceType): CreateMediaCapturePipelineRequest = {
    val __obj = js.Dynamic.literal(SinkArn = SinkArn.asInstanceOf[js.Any], SinkType = SinkType.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMediaCapturePipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMediaCapturePipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setChimeSdkMeetingConfiguration(value: ChimeSdkMeetingConfiguration): Self = StObject.set(x, "ChimeSdkMeetingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setChimeSdkMeetingConfigurationUndefined: Self = StObject.set(x, "ChimeSdkMeetingConfiguration", js.undefined)
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setSinkArn(value: Arn): Self = StObject.set(x, "SinkArn", value.asInstanceOf[js.Any])
    
    inline def setSinkType(value: MediaPipelineSinkType): Self = StObject.set(x, "SinkType", value.asInstanceOf[js.Any])
    
    inline def setSourceArn(value: Arn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: MediaPipelineSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
  }
}
