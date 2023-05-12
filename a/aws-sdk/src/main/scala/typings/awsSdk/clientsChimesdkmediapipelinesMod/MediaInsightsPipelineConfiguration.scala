package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaInsightsPipelineConfiguration extends StObject {
  
  /**
    * The time at which the configuration was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The elements in the configuration.
    */
  var Elements: js.UndefOr[MediaInsightsPipelineConfigurationElements] = js.undefined
  
  /**
    * The ARN of the configuration.
    */
  var MediaInsightsPipelineConfigurationArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the configuration.
    */
  var MediaInsightsPipelineConfigurationId: js.UndefOr[GuidString] = js.undefined
  
  /**
    * The name of the configuration.
    */
  var MediaInsightsPipelineConfigurationName: js.UndefOr[MediaInsightsPipelineConfigurationNameString] = js.undefined
  
  /**
    * Lists the rules that trigger a real-time alert.
    */
  var RealTimeAlertConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.RealTimeAlertConfiguration] = js.undefined
  
  /**
    * The ARN of the role used by the service to access Amazon Web Services resources.
    */
  var ResourceAccessRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time at which the configuration was last updated.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object MediaInsightsPipelineConfiguration {
  
  inline def apply(): MediaInsightsPipelineConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaInsightsPipelineConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaInsightsPipelineConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setElements(value: MediaInsightsPipelineConfigurationElements): Self = StObject.set(x, "Elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "Elements", js.undefined)
    
    inline def setElementsVarargs(value: MediaInsightsPipelineConfigurationElement*): Self = StObject.set(x, "Elements", js.Array(value*))
    
    inline def setMediaInsightsPipelineConfigurationArn(value: Arn): Self = StObject.set(x, "MediaInsightsPipelineConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsPipelineConfigurationArnUndefined: Self = StObject.set(x, "MediaInsightsPipelineConfigurationArn", js.undefined)
    
    inline def setMediaInsightsPipelineConfigurationId(value: GuidString): Self = StObject.set(x, "MediaInsightsPipelineConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsPipelineConfigurationIdUndefined: Self = StObject.set(x, "MediaInsightsPipelineConfigurationId", js.undefined)
    
    inline def setMediaInsightsPipelineConfigurationName(value: MediaInsightsPipelineConfigurationNameString): Self = StObject.set(x, "MediaInsightsPipelineConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsPipelineConfigurationNameUndefined: Self = StObject.set(x, "MediaInsightsPipelineConfigurationName", js.undefined)
    
    inline def setRealTimeAlertConfiguration(value: RealTimeAlertConfiguration): Self = StObject.set(x, "RealTimeAlertConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRealTimeAlertConfigurationUndefined: Self = StObject.set(x, "RealTimeAlertConfiguration", js.undefined)
    
    inline def setResourceAccessRoleArn(value: Arn): Self = StObject.set(x, "ResourceAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setResourceAccessRoleArnUndefined: Self = StObject.set(x, "ResourceAccessRoleArn", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
