package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaInsightsPipelineConfigurationResponse extends StObject {
  
  /**
    * The configuration settings for the media insights pipeline.
    */
  var MediaInsightsPipelineConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaInsightsPipelineConfiguration
  ] = js.undefined
}
object CreateMediaInsightsPipelineConfigurationResponse {
  
  inline def apply(): CreateMediaInsightsPipelineConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMediaInsightsPipelineConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMediaInsightsPipelineConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setMediaInsightsPipelineConfiguration(value: MediaInsightsPipelineConfiguration): Self = StObject.set(x, "MediaInsightsPipelineConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsPipelineConfigurationUndefined: Self = StObject.set(x, "MediaInsightsPipelineConfiguration", js.undefined)
  }
}
