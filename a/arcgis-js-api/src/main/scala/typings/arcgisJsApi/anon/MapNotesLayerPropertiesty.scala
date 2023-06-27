package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`color-burn`
import typings.arcgisJsApi.arcgisJsApiStrings.`color-dodge`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-over`
import typings.arcgisJsApi.arcgisJsApiStrings.`hard-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.`map-notes`
import typings.arcgisJsApi.arcgisJsApiStrings.`soft-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`vivid-light`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.color
import typings.arcgisJsApi.arcgisJsApiStrings.darken
import typings.arcgisJsApi.arcgisJsApiStrings.difference
import typings.arcgisJsApi.arcgisJsApiStrings.exclusion
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.hue
import typings.arcgisJsApi.arcgisJsApiStrings.invert
import typings.arcgisJsApi.arcgisJsApiStrings.lighten
import typings.arcgisJsApi.arcgisJsApiStrings.lighter
import typings.arcgisJsApi.arcgisJsApiStrings.luminosity
import typings.arcgisJsApi.arcgisJsApiStrings.minus
import typings.arcgisJsApi.arcgisJsApiStrings.multiply
import typings.arcgisJsApi.arcgisJsApiStrings.normal
import typings.arcgisJsApi.arcgisJsApiStrings.overlay
import typings.arcgisJsApi.arcgisJsApiStrings.plus
import typings.arcgisJsApi.arcgisJsApiStrings.reflect
import typings.arcgisJsApi.arcgisJsApiStrings.saturation
import typings.arcgisJsApi.arcgisJsApiStrings.screen
import typings.arcgisJsApi.arcgisJsApiStrings.show
import typings.arcgisJsApi.arcgisJsApiStrings.xor
import typings.arcgisJsApi.esri.BasemapProperties
import typings.arcgisJsApi.esri.ExtentProperties
import typings.arcgisJsApi.esri.GroundProperties
import typings.arcgisJsApi.esri.MapProperties
import typings.arcgisJsApi.esri.PortalItemProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.MapNotesLayerProperties & {  type :'map-notes'} */
trait MapNotesLayerPropertiesty extends StObject {
  
  /**
  		 * Blend modes are used to blend layers together to create an interesting effect in a layer, or even to produce what seems like a new layer.
  		 *
  		 * @default normal
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#blendMode)
  		 */
  var blendMode: js.UndefOr[
    average | `color-burn` | `color-dodge` | color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor
  ] = js.undefined
  
  /**
  		 * Effect provides various filter functions that can be performed on the layer to achieve different visual effects similar to how image filters work.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#effect)
  		 */
  var effect: js.UndefOr[js.Array[Any] | String] = js.undefined
  
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
  		 * The maximum scale (most zoomed in) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
  		 */
  var maxScale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum scale (most zoomed out) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
  		 */
  var minScale: js.UndefOr[Double] = js.undefined
  
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
  		 * The portal item from which the layer is loaded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
  		 */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
  
  /**
  		 * The title of the layer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: `map-notes`
  
  /**
  		 * Indicates if the layer is visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#visible)
  		 */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object MapNotesLayerPropertiesty {
  
  inline def apply(): MapNotesLayerPropertiesty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("map-notes")
    __obj.asInstanceOf[MapNotesLayerPropertiesty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapNotesLayerPropertiesty] (val x: Self) extends AnyVal {
    
    inline def setBlendMode(
      value: average | `color-burn` | `color-dodge` | color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor
    ): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
    
    inline def setEffect(value: js.Array[Any] | String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setEffectVarargs(value: Any*): Self = StObject.set(x, "effect", js.Array(value*))
    
    inline def setFullExtent(value: ExtentProperties): Self = StObject.set(x, "fullExtent", value.asInstanceOf[js.Any])
    
    inline def setFullExtentUndefined: Self = StObject.set(x, "fullExtent", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setListMode(value: show | hide | `hide-children`): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
    
    inline def setListModeUndefined: Self = StObject.set(x, "listMode", js.undefined)
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setParent(value: MapProperties | BasemapProperties | GroundProperties | GroupLayerPropertiestypeg): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPortalItem(value: PortalItemProperties): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
    
    inline def setPortalItemUndefined: Self = StObject.set(x, "portalItem", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: `map-notes`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
