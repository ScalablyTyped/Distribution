package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSymbol3DLayerProperties
  extends StObject
     with Symbol3DLayerProperties {
  
  /**
    * The font of the text label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#font)
    */
  var font: js.UndefOr[FontProperties] = js.undefined
  
  /**
    * The halo surrounding the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#halo)
    */
  var halo: js.UndefOr[TextSymbol3DLayerHaloProperties] = js.undefined
  
  /**
    * The material used to color the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[TextSymbol3DLayerMaterialProperties] = js.undefined
  
  /**
    * Size of the text label in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#size)
    */
  var size: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The text to be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#text)
    */
  var text: js.UndefOr[String] = js.undefined
}
object TextSymbol3DLayerProperties {
  
  @scala.inline
  def apply(): TextSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSymbol3DLayerProperties]
  }
  
  @scala.inline
  implicit class TextSymbol3DLayerPropertiesMutableBuilder[Self <: TextSymbol3DLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: FontProperties): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHalo(value: TextSymbol3DLayerHaloProperties): Self = StObject.set(x, "halo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaloUndefined: Self = StObject.set(x, "halo", js.undefined)
    
    @scala.inline
    def setMaterial(value: TextSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
