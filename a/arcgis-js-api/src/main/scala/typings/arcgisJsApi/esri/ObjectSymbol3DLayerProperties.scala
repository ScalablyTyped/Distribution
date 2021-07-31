package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bottom
import typings.arcgisJsApi.arcgisJsApiStrings.center
import typings.arcgisJsApi.arcgisJsApiStrings.origin
import typings.arcgisJsApi.arcgisJsApiStrings.relative
import typings.arcgisJsApi.arcgisJsApiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectSymbol3DLayerProperties
  extends StObject
     with Symbol3DLayerProperties {
  
  /**
    * The positioning of the symbol relative to the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor)
    */
  var anchor: js.UndefOr[center | top | bottom | origin | relative] = js.undefined
  
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor) relative to the center of the [symbol layer resource](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: js.UndefOr[ObjectSymbol3DLayerAnchorPosition] = js.undefined
  
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#castShadows)
    */
  var castShadows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The depth, or diameter from north to south, of the object in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#depth)
    */
  var depth: js.UndefOr[Double] = js.undefined
  
  /**
    * The clockwise rotation of the symbol in the horizontal plane (i.e., around the z axis).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#heading)
    */
  var heading: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of the object in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#height)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The material used to shade the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[ObjectSymbol3DLayerMaterialProperties] = js.undefined
  
  /**
    * The primitive shape (`primitive`) or external 3D model (`href`) used to visualize the points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
    */
  var resource: js.UndefOr[ObjectSymbol3DLayerResource] = js.undefined
  
  /**
    * The rotation of the symbol in the lateral vertical plane (i.e., around the y axis).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#roll)
    */
  var roll: js.UndefOr[Double] = js.undefined
  
  /**
    * The rotation of the symbol in the longitudinal vertical plane (i.e., around the x axis).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#tilt)
    */
  var tilt: js.UndefOr[Double] = js.undefined
  
  /**
    * The width, or diameter from east to west, of the object in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#width)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ObjectSymbol3DLayerProperties {
  
  @scala.inline
  def apply(): ObjectSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectSymbol3DLayerProperties]
  }
  
  @scala.inline
  implicit class ObjectSymbol3DLayerPropertiesMutableBuilder[Self <: ObjectSymbol3DLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: center | top | bottom | origin | relative): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorPosition(value: ObjectSymbol3DLayerAnchorPosition): Self = StObject.set(x, "anchorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorPositionUndefined: Self = StObject.set(x, "anchorPosition", js.undefined)
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setCastShadows(value: Boolean): Self = StObject.set(x, "castShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastShadowsUndefined: Self = StObject.set(x, "castShadows", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMaterial(value: ObjectSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setResource(value: ObjectSymbol3DLayerResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollUndefined: Self = StObject.set(x, "roll", js.undefined)
    
    @scala.inline
    def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
