package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMediaInsightsPipelineConfigurationResponse extends StObject {
  
  /**
    * The updated configuration settings.
    */
  var MediaInsightsPipelineConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaInsightsPipelineConfiguration
  ] = js.undefined
}
object UpdateMediaInsightsPipelineConfigurationResponse {
  
  inline def apply(): UpdateMediaInsightsPipelineConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMediaInsightsPipelineConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMediaInsightsPipelineConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setMediaInsightsPipelineConfiguration(value: MediaInsightsPipelineConfiguration): Self = StObject.set(x, "MediaInsightsPipelineConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsPipelineConfigurationUndefined: Self = StObject.set(x, "MediaInsightsPipelineConfiguration", js.undefined)
  }
}
