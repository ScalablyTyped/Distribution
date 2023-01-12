package typings.awsSdk.clientsChimesdkmediapipelinesMod

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
  var PresenterOnlyConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.PresenterOnlyConfiguration] = js.undefined
}
object GridViewConfiguration {
  
  inline def apply(ContentShareLayout: ContentShareLayoutOption): GridViewConfiguration = {
    val __obj = js.Dynamic.literal(ContentShareLayout = ContentShareLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridViewConfiguration] (val x: Self) extends AnyVal {
    
    inline def setContentShareLayout(value: ContentShareLayoutOption): Self = StObject.set(x, "ContentShareLayout", value.asInstanceOf[js.Any])
    
    inline def setPresenterOnlyConfiguration(value: PresenterOnlyConfiguration): Self = StObject.set(x, "PresenterOnlyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPresenterOnlyConfigurationUndefined: Self = StObject.set(x, "PresenterOnlyConfiguration", js.undefined)
  }
}
