package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMediaInsightsPipelineConfigurationResponse extends StObject {
  
  /**
    * The requested media insights pipeline configuration.
    */
  var MediaInsightsPipelineConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaInsightsPipelineConfiguration
  ] = js.undefined
}
object GetMediaInsightsPipelineConfigurationResponse {
  
  inline def apply(): GetMediaInsightsPipelineConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMediaInsightsPipelineConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMediaInsightsPipelineConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setMediaInsightsPipelineConfiguration(value: MediaInsightsPipelineConfiguration): Self = StObject.set(x, "MediaInsightsPipelineConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsPipelineConfigurationUndefined: Self = StObject.set(x, "MediaInsightsPipelineConfiguration", js.undefined)
  }
}
