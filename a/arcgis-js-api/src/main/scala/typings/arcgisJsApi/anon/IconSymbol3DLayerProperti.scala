package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typings.arcgisJsApi.arcgisJsApiStrings.bottom_
import typings.arcgisJsApi.arcgisJsApiStrings.center_
import typings.arcgisJsApi.arcgisJsApiStrings.icon
import typings.arcgisJsApi.arcgisJsApiStrings.left_
import typings.arcgisJsApi.arcgisJsApiStrings.relative_
import typings.arcgisJsApi.arcgisJsApiStrings.right_
import typings.arcgisJsApi.arcgisJsApiStrings.top_
import typings.arcgisJsApi.esri.IconSymbol3DLayerAnchorPosition
import typings.arcgisJsApi.esri.IconSymbol3DLayerMaterialProperties
import typings.arcgisJsApi.esri.IconSymbol3DLayerOutlineProperties
import typings.arcgisJsApi.esri.IconSymbol3DLayerResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.IconSymbol3DLayerProperties & {  type :'icon'} */
trait IconSymbol3DLayerProperti extends StObject {
  
  /**
    * The positioning of the icon relative to the geometry.
    *
    * @default center
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor)
    */
  var anchor: js.UndefOr[
    center_ | left_ | right_ | top_ | bottom_ | `top-left` | `top-right` | `bottom-left` | `bottom-right` | relative_
  ] = js.undefined
  
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor) relative to the center of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: js.UndefOr[IconSymbol3DLayerAnchorPosition] = js.undefined
  
  /**
    * The material used to shade the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[IconSymbol3DLayerMaterialProperties] = js.undefined
  
  /**
    * The outline of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#outline)
    */
  var outline: js.UndefOr[IconSymbol3DLayerOutlineProperties] = js.undefined
  
  /**
    * The shape (`primitive`) or image URL (`href`) used to visualize the features.
    *
    * @default { primitive: "circle" }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#resource)
    */
  var resource: js.UndefOr[IconSymbol3DLayerResource] = js.undefined
  
  /**
    * The size of the icon in points.
    *
    * @default 12
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#size)
    */
  var size: js.UndefOr[Double | String] = js.undefined
  
  var `type`: icon
}
object IconSymbol3DLayerProperti {
  
  inline def apply(): IconSymbol3DLayerProperti = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("icon")
    __obj.asInstanceOf[IconSymbol3DLayerProperti]
  }
  
  extension [Self <: IconSymbol3DLayerProperti](x: Self) {
    
    inline def setAnchor(
      value: center_ | left_ | right_ | top_ | bottom_ | `top-left` | `top-right` | `bottom-left` | `bottom-right` | relative_
    ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorPosition(value: IconSymbol3DLayerAnchorPosition): Self = StObject.set(x, "anchorPosition", value.asInstanceOf[js.Any])
    
    inline def setAnchorPositionUndefined: Self = StObject.set(x, "anchorPosition", js.undefined)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setMaterial(value: IconSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setOutline(value: IconSymbol3DLayerOutlineProperties): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setResource(value: IconSymbol3DLayerResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: icon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
