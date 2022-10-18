package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaCapturePipeline extends StObject {
  
  /**
    * The configuration for a specified media capture pipeline. SourceType must be ChimeSdkMeeting.
    */
  var ChimeSdkMeetingConfiguration: js.UndefOr[typings.awsSdk.clientsChimeMod.ChimeSdkMeetingConfiguration] = js.undefined
  
  /**
    * The time at which the capture pipeline was created, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of a media capture pipeline.
    */
  var MediaPipelineId: js.UndefOr[GuidString] = js.undefined
  
  /**
    * ARN of the destination to which the media artifacts are saved.
    */
  var SinkArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Destination type to which the media artifacts are saved. You must use an S3 Bucket.
    */
  var SinkType: js.UndefOr[MediaPipelineSinkType] = js.undefined
  
  /**
    * ARN of the source from which the media artifacts will be saved.
    */
  var SourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Source type from which media artifacts are saved. You must use ChimeMeeting.
    */
  var SourceType: js.UndefOr[MediaPipelineSourceType] = js.undefined
  
  /**
    * The status of the media capture pipeline.
    */
  var Status: js.UndefOr[MediaPipelineStatus] = js.undefined
  
  /**
    * The time at which the capture pipeline was updated, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object MediaCapturePipeline {
  
  inline def apply(): MediaCapturePipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaCapturePipeline]
  }
  
  extension [Self <: MediaCapturePipeline](x: Self) {
    
    inline def setChimeSdkMeetingConfiguration(value: ChimeSdkMeetingConfiguration): Self = StObject.set(x, "ChimeSdkMeetingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setChimeSdkMeetingConfigurationUndefined: Self = StObject.set(x, "ChimeSdkMeetingConfiguration", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setMediaPipelineId(value: GuidString): Self = StObject.set(x, "MediaPipelineId", value.asInstanceOf[js.Any])
    
    inline def setMediaPipelineIdUndefined: Self = StObject.set(x, "MediaPipelineId", js.undefined)
    
    inline def setSinkArn(value: Arn): Self = StObject.set(x, "SinkArn", value.asInstanceOf[js.Any])
    
    inline def setSinkArnUndefined: Self = StObject.set(x, "SinkArn", js.undefined)
    
    inline def setSinkType(value: MediaPipelineSinkType): Self = StObject.set(x, "SinkType", value.asInstanceOf[js.Any])
    
    inline def setSinkTypeUndefined: Self = StObject.set(x, "SinkType", js.undefined)
    
    inline def setSourceArn(value: Arn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    inline def setSourceType(value: MediaPipelineSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setStatus(value: MediaPipelineStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
