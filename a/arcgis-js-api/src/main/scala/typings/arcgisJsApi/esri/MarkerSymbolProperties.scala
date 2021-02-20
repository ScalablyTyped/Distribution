package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-marker`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerSymbolProperties extends SymbolProperties {
  
  /**
    * The angle of the marker relative to the screen in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#angle)
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#type)
    */
  var `type`: js.UndefOr[`simple-marker` | `picture-marker`] = js.native
  
  /**
    * The offset on the x-axis in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#xoffset)
    */
  var xoffset: js.UndefOr[Double | String] = js.native
  
  /**
    * The offset on the y-axis in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#yoffset)
    */
  var yoffset: js.UndefOr[Double | String] = js.native
}
object MarkerSymbolProperties {
  
  @scala.inline
  def apply(): MarkerSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerSymbolProperties]
  }
  
  @scala.inline
  implicit class MarkerSymbolPropertiesMutableBuilder[Self <: MarkerSymbolProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setType(value: `simple-marker` | `picture-marker`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setXoffset(value: Double | String): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXoffsetUndefined: Self = StObject.set(x, "xoffset", js.undefined)
    
    @scala.inline
    def setYoffset(value: Double | String): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoffsetUndefined: Self = StObject.set(x, "yoffset", js.undefined)
  }
}
