package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaInsightsPipelineConfigurationSummary extends StObject {
  
  /**
    * The ARN of the media insights pipeline configuration.
    */
  var MediaInsightsPipelineConfigurationArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the media insights pipeline configuration.
    */
  var MediaInsightsPipelineConfigurationId: js.UndefOr[GuidString] = js.undefined
  
  /**
    * The name of the media insights pipeline configuration.
    */
  var MediaInsightsPipelineConfigurationName: js.UndefOr[MediaInsightsPipelineConfigurationNameString] = js.undefined
}
object MediaInsightsPipelineConfigurationSummary {
  
  inline def apply(): MediaInsightsPipelineConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaInsightsPipelineConfigurationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaInsightsPipelineConfigurationSummary] (val x: Self) extends AnyVal {
    
    inline def setMediaInsightsPipelineConfigurationArn(value: Arn): Self = StObject.set(x, "MediaInsightsPipelineConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsPipelineConfigurationArnUndefined: Self = StObject.set(x, "MediaInsightsPipelineConfigurationArn", js.undefined)
    
    inline def setMediaInsightsPipelineConfigurationId(value: GuidString): Self = StObject.set(x, "MediaInsightsPipelineConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsPipelineConfigurationIdUndefined: Self = StObject.set(x, "MediaInsightsPipelineConfigurationId", js.undefined)
    
    inline def setMediaInsightsPipelineConfigurationName(value: MediaInsightsPipelineConfigurationNameString): Self = StObject.set(x, "MediaInsightsPipelineConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsPipelineConfigurationNameUndefined: Self = StObject.set(x, "MediaInsightsPipelineConfigurationName", js.undefined)
  }
}
