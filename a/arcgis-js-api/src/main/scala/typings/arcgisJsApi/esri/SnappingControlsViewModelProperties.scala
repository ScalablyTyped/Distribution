package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnappingControlsViewModelProperties extends StObject {
  
  /**
  		 * The [SnappingOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html) for sketching.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls-SnappingControlsViewModel.html#snappingOptions)
  		 */
  var snappingOptions: js.UndefOr[SnappingOptionsProperties] = js.undefined
  
  /**
  		 * The view associated with the SnappingControls widget instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls-SnappingControlsViewModel.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object SnappingControlsViewModelProperties {
  
  inline def apply(): SnappingControlsViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnappingControlsViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnappingControlsViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setSnappingOptions(value: SnappingOptionsProperties): Self = StObject.set(x, "snappingOptions", value.asInstanceOf[js.Any])
    
    inline def setSnappingOptionsUndefined: Self = StObject.set(x, "snappingOptions", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
