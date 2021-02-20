package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typings.arcgisJsApi.arcgisJsApiStrings.bottom
import typings.arcgisJsApi.arcgisJsApiStrings.center
import typings.arcgisJsApi.arcgisJsApiStrings.left
import typings.arcgisJsApi.arcgisJsApiStrings.relative
import typings.arcgisJsApi.arcgisJsApiStrings.right
import typings.arcgisJsApi.arcgisJsApiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconSymbol3DLayerProperties extends Symbol3DLayerProperties {
  
  /**
    * The positioning of the icon relative to the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor)
    */
  var anchor: js.UndefOr[
    center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right` | relative
  ] = js.native
  
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor) relative to the center of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: js.UndefOr[IconSymbol3DLayerAnchorPosition] = js.native
  
  /**
    * The material used to shade the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[IconSymbol3DLayerMaterialProperties] = js.native
  
  /**
    * The outline of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#outline)
    */
  var outline: js.UndefOr[IconSymbol3DLayerOutlineProperties] = js.native
  
  /**
    * The shape (`primitive`) or image URL (`href`) used to visualize the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#resource)
    */
  var resource: js.UndefOr[IconSymbol3DLayerResource] = js.native
  
  /**
    * The size of the icon in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#size)
    */
  var size: js.UndefOr[Double | String] = js.native
}
object IconSymbol3DLayerProperties {
  
  @scala.inline
  def apply(): IconSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSymbol3DLayerProperties]
  }
  
  @scala.inline
  implicit class IconSymbol3DLayerPropertiesMutableBuilder[Self <: IconSymbol3DLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(
      value: center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right` | relative
    ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorPosition(value: IconSymbol3DLayerAnchorPosition): Self = StObject.set(x, "anchorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorPositionUndefined: Self = StObject.set(x, "anchorPosition", js.undefined)
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setMaterial(value: IconSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setOutline(value: IconSymbol3DLayerOutlineProperties): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setResource(value: IconSymbol3DLayerResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
