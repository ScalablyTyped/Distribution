package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.GroupLayerPropertiestypeg
import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerProperties
  extends StObject
     with LoadableProperties {
  
  /**
  		 * The full extent of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fullExtent)
  		 */
  var fullExtent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
  		 * The unique ID assigned to the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id)
  		 */
  var id: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
  		 *
  		 * @default "show"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#listMode)
  		 */
  var listMode: js.UndefOr[show | hide | `hide-children`] = js.undefined
  
  /**
  		 * The opacity of the layer.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#opacity)
  		 */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The parent to which the layer belongs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#parent)
  		 */
  var parent: js.UndefOr[MapProperties | BasemapProperties | GroundProperties | GroupLayerPropertiestypeg] = js.undefined
  
  /**
  		 * The title of the layer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates if the layer is visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#visible)
  		 */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object LayerProperties {
  
  inline def apply(): LayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerProperties] (val x: Self) extends AnyVal {
    
    inline def setFullExtent(value: ExtentProperties): Self = StObject.set(x, "fullExtent", value.asInstanceOf[js.Any])
    
    inline def setFullExtentUndefined: Self = StObject.set(x, "fullExtent", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setListMode(value: show | hide | `hide-children`): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
    
    inline def setListModeUndefined: Self = StObject.set(x, "listMode", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setParent(value: MapProperties | BasemapProperties | GroundProperties | GroupLayerPropertiestypeg): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
