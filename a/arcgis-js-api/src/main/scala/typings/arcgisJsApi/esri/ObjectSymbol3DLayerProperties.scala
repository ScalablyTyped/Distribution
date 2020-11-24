package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bottom
import typings.arcgisJsApi.arcgisJsApiStrings.center
import typings.arcgisJsApi.arcgisJsApiStrings.origin
import typings.arcgisJsApi.arcgisJsApiStrings.relative
import typings.arcgisJsApi.arcgisJsApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectSymbol3DLayerProperties extends Symbol3DLayerProperties {
  
  /**
    * The positioning of the symbol relative to the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor)
    */
  var anchor: js.UndefOr[center | top | bottom | origin | relative] = js.native
  
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor) relative to the center of the [symbol layer resource](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: js.UndefOr[ObjectSymbol3DLayerAnchorPosition] = js.native
  
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#castShadows)
    */
  var castShadows: js.UndefOr[Boolean] = js.native
  
  /**
    * The depth, or diameter from north to south, of the object in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#depth)
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * The clockwise rotation of the symbol in the horizontal plane (i.e., around the z axis).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#heading)
    */
  var heading: js.UndefOr[Double] = js.native
  
  /**
    * The height of the object in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#height)
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The material used to shade the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[ObjectSymbol3DLayerMaterialProperties] = js.native
  
  /**
    * The primitive shape (`primitive`) or external 3D model (`href`) used to visualize the points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
    */
  var resource: js.UndefOr[ObjectSymbol3DLayerResource] = js.native
  
  /**
    * The rotation of the symbol in the lateral vertical plane (i.e., around the y axis).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#roll)
    */
  var roll: js.UndefOr[Double] = js.native
  
  /**
    * The rotation of the symbol in the longitudinal vertical plane (i.e., around the x axis).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#tilt)
    */
  var tilt: js.UndefOr[Double] = js.native
  
  /**
    * The width, or diameter from east to west, of the object in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#width)
    */
  var width: js.UndefOr[Double] = js.native
}
object ObjectSymbol3DLayerProperties {
  
  @scala.inline
  def apply(): ObjectSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectSymbol3DLayerProperties]
  }
  
  @scala.inline
  implicit class ObjectSymbol3DLayerPropertiesOps[Self <: ObjectSymbol3DLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnchor(value: center | top | bottom | origin | relative): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAnchorPosition(value: ObjectSymbol3DLayerAnchorPosition): Self = this.set("anchorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorPosition: Self = this.set("anchorPosition", js.undefined)
    
    @scala.inline
    def setCastShadows(value: Boolean): Self = this.set("castShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCastShadows: Self = this.set("castShadows", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMaterial(value: ObjectSymbol3DLayerMaterialProperties): Self = this.set("material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    
    @scala.inline
    def setResource(value: ObjectSymbol3DLayerResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setRoll(value: Double): Self = this.set("roll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoll: Self = this.set("roll", js.undefined)
    
    @scala.inline
    def setTilt(value: Double): Self = this.set("tilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTilt: Self = this.set("tilt", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
