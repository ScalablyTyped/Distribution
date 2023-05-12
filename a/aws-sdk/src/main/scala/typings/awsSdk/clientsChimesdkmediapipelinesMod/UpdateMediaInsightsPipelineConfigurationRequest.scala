package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMediaInsightsPipelineConfigurationRequest extends StObject {
  
  /**
    * The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data Stream..
    */
  var Elements: MediaInsightsPipelineConfigurationElements
  
  /**
    * The unique identifier for the resource to be updated. Valid values include the name and ARN of the media insights pipeline configuration.
    */
  var Identifier: NonEmptyString
  
  /**
    * The configuration settings for real-time alerts for the media insights pipeline.
    */
  var RealTimeAlertConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.RealTimeAlertConfiguration] = js.undefined
  
  /**
    * The ARN of the role used by the service to access Amazon Web Services resources.
    */
  var ResourceAccessRoleArn: Arn
}
object UpdateMediaInsightsPipelineConfigurationRequest {
  
  inline def apply(
    Elements: MediaInsightsPipelineConfigurationElements,
    Identifier: NonEmptyString,
    ResourceAccessRoleArn: Arn
  ): UpdateMediaInsightsPipelineConfigurationRequest = {
    val __obj = js.Dynamic.literal(Elements = Elements.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], ResourceAccessRoleArn = ResourceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMediaInsightsPipelineConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMediaInsightsPipelineConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setElements(value: MediaInsightsPipelineConfigurationElements): Self = StObject.set(x, "Elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: MediaInsightsPipelineConfigurationElement*): Self = StObject.set(x, "Elements", js.Array(value*))
    
    inline def setIdentifier(value: NonEmptyString): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setRealTimeAlertConfiguration(value: RealTimeAlertConfiguration): Self = StObject.set(x, "RealTimeAlertConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRealTimeAlertConfigurationUndefined: Self = StObject.set(x, "RealTimeAlertConfiguration", js.undefined)
    
    inline def setResourceAccessRoleArn(value: Arn): Self = StObject.set(x, "ResourceAccessRoleArn", value.asInstanceOf[js.Any])
  }
}
