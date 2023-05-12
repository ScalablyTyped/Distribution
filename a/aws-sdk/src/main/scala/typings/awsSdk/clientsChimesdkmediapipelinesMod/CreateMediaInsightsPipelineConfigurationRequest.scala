package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaInsightsPipelineConfigurationRequest extends StObject {
  
  /**
    * The unique identifier for the media insights pipeline configuration request.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.ClientRequestToken] = js.undefined
  
  /**
    * The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data Stream.
    */
  var Elements: MediaInsightsPipelineConfigurationElements
  
  /**
    * The name of the media insights pipeline configuration.
    */
  var MediaInsightsPipelineConfigurationName: MediaInsightsPipelineConfigurationNameString
  
  /**
    * The configuration settings for the real-time alerts in a media insights pipeline configuration.
    */
  var RealTimeAlertConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.RealTimeAlertConfiguration] = js.undefined
  
  /**
    * The ARN of the role used by the service to access Amazon Web Services resources, including Transcribe and Transcribe Call Analytics, on the caller’s behalf.
    */
  var ResourceAccessRoleArn: Arn
  
  /**
    * The tags assigned to the media insights pipeline configuration.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateMediaInsightsPipelineConfigurationRequest {
  
  inline def apply(
    Elements: MediaInsightsPipelineConfigurationElements,
    MediaInsightsPipelineConfigurationName: MediaInsightsPipelineConfigurationNameString,
    ResourceAccessRoleArn: Arn
  ): CreateMediaInsightsPipelineConfigurationRequest = {
    val __obj = js.Dynamic.literal(Elements = Elements.asInstanceOf[js.Any], MediaInsightsPipelineConfigurationName = MediaInsightsPipelineConfigurationName.asInstanceOf[js.Any], ResourceAccessRoleArn = ResourceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMediaInsightsPipelineConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMediaInsightsPipelineConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setElements(value: MediaInsightsPipelineConfigurationElements): Self = StObject.set(x, "Elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: MediaInsightsPipelineConfigurationElement*): Self = StObject.set(x, "Elements", js.Array(value*))
    
    inline def setMediaInsightsPipelineConfigurationName(value: MediaInsightsPipelineConfigurationNameString): Self = StObject.set(x, "MediaInsightsPipelineConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setRealTimeAlertConfiguration(value: RealTimeAlertConfiguration): Self = StObject.set(x, "RealTimeAlertConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRealTimeAlertConfigurationUndefined: Self = StObject.set(x, "RealTimeAlertConfiguration", js.undefined)
    
    inline def setResourceAccessRoleArn(value: Arn): Self = StObject.set(x, "ResourceAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
