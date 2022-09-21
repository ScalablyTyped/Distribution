package typings.awsSdk.chimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewConfiguration extends StObject {
  
  /**
    * Defines the layout of the video tiles when content sharing is enabled.
    */
  var ContentShareLayout: ContentShareLayoutOption
  
  /**
    * Defines the configuration options for a presenter only video tile.
    */
  var PresenterOnlyConfiguration: js.UndefOr[typings.awsSdk.chimesdkmediapipelinesMod.PresenterOnlyConfiguration] = js.undefined
}
object GridViewConfiguration {
  
  inline def apply(ContentShareLayout: ContentShareLayoutOption): GridViewConfiguration = {
    val __obj = js.Dynamic.literal(ContentShareLayout = ContentShareLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewConfiguration]
  }
  
  extension [Self <: GridViewConfiguration](x: Self) {
    
    inline def setContentShareLayout(value: ContentShareLayoutOption): Self = StObject.set(x, "ContentShareLayout", value.asInstanceOf[js.Any])
    
    inline def setPresenterOnlyConfiguration(value: PresenterOnlyConfiguration): Self = StObject.set(x, "PresenterOnlyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPresenterOnlyConfigurationUndefined: Self = StObject.set(x, "PresenterOnlyConfiguration", js.undefined)
  }
}
