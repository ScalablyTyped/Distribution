package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaInsightsPipeline extends StObject {
  
  /**
    * The time at which the media insights pipeline was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The runtime configuration settings for a Kinesis recording video stream in a media insights pipeline.
    */
  var KinesisVideoStreamRecordingSourceRuntimeConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.KinesisVideoStreamRecordingSourceRuntimeConfiguration
  ] = js.undefined
  
  /**
    * The configuration settings for a Kinesis runtime video stream in a media insights pipeline.
    */
  var KinesisVideoStreamSourceRuntimeConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.KinesisVideoStreamSourceRuntimeConfiguration
  ] = js.undefined
  
  /**
    * The ARN of a media insight pipeline's configuration settings.
    */
  var MediaInsightsPipelineConfigurationArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The runtime metadata of a media insights pipeline.
    */
  var MediaInsightsRuntimeMetadata: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaInsightsRuntimeMetadata] = js.undefined
  
  /**
    * The ARN of a media insights pipeline.
    */
  var MediaPipelineArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of a media insights pipeline.
    */
  var MediaPipelineId: js.UndefOr[GuidString] = js.undefined
  
  /**
    * The runtime configuration of the Amazon S3 bucket that stores recordings in a media insights pipeline.
    */
  var S3RecordingSinkRuntimeConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.S3RecordingSinkRuntimeConfiguration
  ] = js.undefined
  
  /**
    * The status of a media insights pipeline.
    */
  var Status: js.UndefOr[MediaPipelineStatus] = js.undefined
}
object MediaInsightsPipeline {
  
  inline def apply(): MediaInsightsPipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaInsightsPipeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaInsightsPipeline] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setKinesisVideoStreamRecordingSourceRuntimeConfiguration(value: KinesisVideoStreamRecordingSourceRuntimeConfiguration): Self = StObject.set(x, "KinesisVideoStreamRecordingSourceRuntimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKinesisVideoStreamRecordingSourceRuntimeConfigurationUndefined: Self = StObject.set(x, "KinesisVideoStreamRecordingSourceRuntimeConfiguration", js.undefined)
    
    inline def setKinesisVideoStreamSourceRuntimeConfiguration(value: KinesisVideoStreamSourceRuntimeConfiguration): Self = StObject.set(x, "KinesisVideoStreamSourceRuntimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKinesisVideoStreamSourceRuntimeConfigurationUndefined: Self = StObject.set(x, "KinesisVideoStreamSourceRuntimeConfiguration", js.undefined)
    
    inline def setMediaInsightsPipelineConfigurationArn(value: Arn): Self = StObject.set(x, "MediaInsightsPipelineConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsPipelineConfigurationArnUndefined: Self = StObject.set(x, "MediaInsightsPipelineConfigurationArn", js.undefined)
    
    inline def setMediaInsightsRuntimeMetadata(value: MediaInsightsRuntimeMetadata): Self = StObject.set(x, "MediaInsightsRuntimeMetadata", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsRuntimeMetadataUndefined: Self = StObject.set(x, "MediaInsightsRuntimeMetadata", js.undefined)
    
    inline def setMediaPipelineArn(value: Arn): Self = StObject.set(x, "MediaPipelineArn", value.asInstanceOf[js.Any])
    
    inline def setMediaPipelineArnUndefined: Self = StObject.set(x, "MediaPipelineArn", js.undefined)
    
    inline def setMediaPipelineId(value: GuidString): Self = StObject.set(x, "MediaPipelineId", value.asInstanceOf[js.Any])
    
    inline def setMediaPipelineIdUndefined: Self = StObject.set(x, "MediaPipelineId", js.undefined)
    
    inline def setS3RecordingSinkRuntimeConfiguration(value: S3RecordingSinkRuntimeConfiguration): Self = StObject.set(x, "S3RecordingSinkRuntimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3RecordingSinkRuntimeConfigurationUndefined: Self = StObject.set(x, "S3RecordingSinkRuntimeConfiguration", js.undefined)
    
    inline def setStatus(value: MediaPipelineStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
