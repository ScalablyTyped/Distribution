package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColormapInfoProperties extends StObject {
  
  /**
    * The color of a given pixel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html#color)
    */
  var color: js.UndefOr[Color_] = js.native
  
  /**
    * The label for a given pixel value and color mapping.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html#label)
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The raster pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html#value)
    */
  var value: js.UndefOr[Double] = js.native
}
object ColormapInfoProperties {
  
  @scala.inline
  def apply(): ColormapInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColormapInfoProperties]
  }
  
  @scala.inline
  implicit class ColormapInfoPropertiesMutableBuilder[Self <: ColormapInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
