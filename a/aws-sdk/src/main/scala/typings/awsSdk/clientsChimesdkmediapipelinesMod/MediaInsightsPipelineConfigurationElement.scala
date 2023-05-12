package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaInsightsPipelineConfigurationElement extends StObject {
  
  /**
    * The analytics configuration settings for transcribing audio in a media insights pipeline configuration element.
    */
  var AmazonTranscribeCallAnalyticsProcessorConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.AmazonTranscribeCallAnalyticsProcessorConfiguration
  ] = js.undefined
  
  /**
    * The transcription processor configuration settings in a media insights pipeline configuration element.
    */
  var AmazonTranscribeProcessorConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.AmazonTranscribeProcessorConfiguration
  ] = js.undefined
  
  /**
    * The configuration settings for the Kinesis Data Stream Sink in a media insights pipeline configuration element.
    */
  var KinesisDataStreamSinkConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.KinesisDataStreamSinkConfiguration
  ] = js.undefined
  
  /**
    * The configuration settings for the Amazon Web Services Lambda sink in a media insights pipeline configuration element.
    */
  var LambdaFunctionSinkConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.LambdaFunctionSinkConfiguration] = js.undefined
  
  /**
    * The configuration settings for the Amazon S3 recording bucket in a media insights pipeline configuration element.
    */
  var S3RecordingSinkConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.S3RecordingSinkConfiguration] = js.undefined
  
  /**
    * The configuration settings for an SNS topic sink in a media insights pipeline configuration element.
    */
  var SnsTopicSinkConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.SnsTopicSinkConfiguration] = js.undefined
  
  /**
    * The configuration settings for an SQS queue sink in a media insights pipeline configuration element.
    */
  var SqsQueueSinkConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.SqsQueueSinkConfiguration] = js.undefined
  
  /**
    * The element type.
    */
  var Type: MediaInsightsPipelineConfigurationElementType
  
  /**
    * The voice analytics configuration settings in a media insights pipeline configuration element.
    */
  var VoiceAnalyticsProcessorConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.VoiceAnalyticsProcessorConfiguration
  ] = js.undefined
}
object MediaInsightsPipelineConfigurationElement {
  
  inline def apply(Type: MediaInsightsPipelineConfigurationElementType): MediaInsightsPipelineConfigurationElement = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaInsightsPipelineConfigurationElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaInsightsPipelineConfigurationElement] (val x: Self) extends AnyVal {
    
    inline def setAmazonTranscribeCallAnalyticsProcessorConfiguration(value: AmazonTranscribeCallAnalyticsProcessorConfiguration): Self = StObject.set(x, "AmazonTranscribeCallAnalyticsProcessorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAmazonTranscribeCallAnalyticsProcessorConfigurationUndefined: Self = StObject.set(x, "AmazonTranscribeCallAnalyticsProcessorConfiguration", js.undefined)
    
    inline def setAmazonTranscribeProcessorConfiguration(value: AmazonTranscribeProcessorConfiguration): Self = StObject.set(x, "AmazonTranscribeProcessorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAmazonTranscribeProcessorConfigurationUndefined: Self = StObject.set(x, "AmazonTranscribeProcessorConfiguration", js.undefined)
    
    inline def setKinesisDataStreamSinkConfiguration(value: KinesisDataStreamSinkConfiguration): Self = StObject.set(x, "KinesisDataStreamSinkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKinesisDataStreamSinkConfigurationUndefined: Self = StObject.set(x, "KinesisDataStreamSinkConfiguration", js.undefined)
    
    inline def setLambdaFunctionSinkConfiguration(value: LambdaFunctionSinkConfiguration): Self = StObject.set(x, "LambdaFunctionSinkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionSinkConfigurationUndefined: Self = StObject.set(x, "LambdaFunctionSinkConfiguration", js.undefined)
    
    inline def setS3RecordingSinkConfiguration(value: S3RecordingSinkConfiguration): Self = StObject.set(x, "S3RecordingSinkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3RecordingSinkConfigurationUndefined: Self = StObject.set(x, "S3RecordingSinkConfiguration", js.undefined)
    
    inline def setSnsTopicSinkConfiguration(value: SnsTopicSinkConfiguration): Self = StObject.set(x, "SnsTopicSinkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicSinkConfigurationUndefined: Self = StObject.set(x, "SnsTopicSinkConfiguration", js.undefined)
    
    inline def setSqsQueueSinkConfiguration(value: SqsQueueSinkConfiguration): Self = StObject.set(x, "SqsQueueSinkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSqsQueueSinkConfigurationUndefined: Self = StObject.set(x, "SqsQueueSinkConfiguration", js.undefined)
    
    inline def setType(value: MediaInsightsPipelineConfigurationElementType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVoiceAnalyticsProcessorConfiguration(value: VoiceAnalyticsProcessorConfiguration): Self = StObject.set(x, "VoiceAnalyticsProcessorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVoiceAnalyticsProcessorConfigurationUndefined: Self = StObject.set(x, "VoiceAnalyticsProcessorConfiguration", js.undefined)
  }
}
