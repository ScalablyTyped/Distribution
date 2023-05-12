package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaInsightsPipelineRequest extends StObject {
  
  /**
    * The unique identifier for the media insights pipeline request.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.ClientRequestToken] = js.undefined
  
  /**
    * The runtime configuration for the Kinesis video recording stream source.
    */
  var KinesisVideoStreamRecordingSourceRuntimeConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.KinesisVideoStreamRecordingSourceRuntimeConfiguration
  ] = js.undefined
  
  /**
    * The runtime configuration for the Kinesis video stream source of the media insights pipeline.
    */
  var KinesisVideoStreamSourceRuntimeConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.KinesisVideoStreamSourceRuntimeConfiguration
  ] = js.undefined
  
  /**
    * The ARN of the pipeline's configuration.
    */
  var MediaInsightsPipelineConfigurationArn: Arn
  
  /**
    * The runtime metadata for the media insights pipeline. Consists of a key-value map of strings.
    */
  var MediaInsightsRuntimeMetadata: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaInsightsRuntimeMetadata] = js.undefined
  
  /**
    * The runtime configuration for the S3 recording sink.
    */
  var S3RecordingSinkRuntimeConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.S3RecordingSinkRuntimeConfiguration
  ] = js.undefined
  
  /**
    * The tags assigned to the media insights pipeline.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateMediaInsightsPipelineRequest {
  
  inline def apply(MediaInsightsPipelineConfigurationArn: Arn): CreateMediaInsightsPipelineRequest = {
    val __obj = js.Dynamic.literal(MediaInsightsPipelineConfigurationArn = MediaInsightsPipelineConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMediaInsightsPipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMediaInsightsPipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setKinesisVideoStreamRecordingSourceRuntimeConfiguration(value: KinesisVideoStreamRecordingSourceRuntimeConfiguration): Self = StObject.set(x, "KinesisVideoStreamRecordingSourceRuntimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKinesisVideoStreamRecordingSourceRuntimeConfigurationUndefined: Self = StObject.set(x, "KinesisVideoStreamRecordingSourceRuntimeConfiguration", js.undefined)
    
    inline def setKinesisVideoStreamSourceRuntimeConfiguration(value: KinesisVideoStreamSourceRuntimeConfiguration): Self = StObject.set(x, "KinesisVideoStreamSourceRuntimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKinesisVideoStreamSourceRuntimeConfigurationUndefined: Self = StObject.set(x, "KinesisVideoStreamSourceRuntimeConfiguration", js.undefined)
    
    inline def setMediaInsightsPipelineConfigurationArn(value: Arn): Self = StObject.set(x, "MediaInsightsPipelineConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsRuntimeMetadata(value: MediaInsightsRuntimeMetadata): Self = StObject.set(x, "MediaInsightsRuntimeMetadata", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsRuntimeMetadataUndefined: Self = StObject.set(x, "MediaInsightsRuntimeMetadata", js.undefined)
    
    inline def setS3RecordingSinkRuntimeConfiguration(value: S3RecordingSinkRuntimeConfiguration): Self = StObject.set(x, "S3RecordingSinkRuntimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3RecordingSinkRuntimeConfigurationUndefined: Self = StObject.set(x, "S3RecordingSinkRuntimeConfiguration", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
