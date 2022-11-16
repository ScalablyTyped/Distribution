package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Bevel
import typings.arcgisJsApi.arcgisJsApiStrings.Butt
import typings.arcgisJsApi.arcgisJsApiStrings.Miter
import typings.arcgisJsApi.arcgisJsApiStrings.Round
import typings.arcgisJsApi.arcgisJsApiStrings.Square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMPictureStroke
  extends StObject
     with CIMSymbolLayer {
  
  /**
    * Determines how the stroke should draw at the ends of the geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureStroke)
    */
  var capStyle: js.UndefOr[Butt | Round | Square] = js.undefined
  
  /**
    * A value indicating whether the color can be changed for this symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureStroke)
    */
  var colorLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color substitutions which allows colors in the image to be substituted with a different color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureStroke)
    */
  var colorSubstitutions: js.UndefOr[js.Array[CIMColorSubstitution]] = js.undefined
  
  /**
    * The geometric effects applied to the symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureStroke)
    */
  var effects: js.UndefOr[js.Array[CIMGeometricEffect]] = js.undefined
  
  /**
    * A value indicating whether the symbol layer is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureStroke)
    */
  var enable: Boolean
  
  /**
    * Determines how the symbol is drawn at the stroke segment connections.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureStroke)
    */
  var joinStyle: js.UndefOr[Bevel | Round | Miter] = js.undefined
  
  /**
    * The maximum 'sharpness' that is allowed for miter joins.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureStroke)
    */
  var miterLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * The primitive name of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureStroke)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
    * The color that is applied as a tint to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureStroke)
    */
  var tintColor: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureStroke
  
  /**
    * The url of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureStroke)
    */
  var url: String
  
  /**
    * The width of the stroke.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureStroke)
    */
  var width: Double
}
object CIMPictureStroke {
  
  inline def apply(enable: Boolean, url: String, width: Double): CIMPictureStroke = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMPictureStroke")
    __obj.asInstanceOf[CIMPictureStroke]
  }
  
  extension [Self <: CIMPictureStroke](x: Self) {
    
    inline def setCapStyle(value: Butt | Round | Square): Self = StObject.set(x, "capStyle", value.asInstanceOf[js.Any])
    
    inline def setCapStyleUndefined: Self = StObject.set(x, "capStyle", js.undefined)
    
    inline def setColorLocked(value: Boolean): Self = StObject.set(x, "colorLocked", value.asInstanceOf[js.Any])
    
    inline def setColorLockedUndefined: Self = StObject.set(x, "colorLocked", js.undefined)
    
    inline def setColorSubstitutions(value: js.Array[CIMColorSubstitution]): Self = StObject.set(x, "colorSubstitutions", value.asInstanceOf[js.Any])
    
    inline def setColorSubstitutionsUndefined: Self = StObject.set(x, "colorSubstitutions", js.undefined)
    
    inline def setColorSubstitutionsVarargs(value: CIMColorSubstitution*): Self = StObject.set(x, "colorSubstitutions", js.Array(value*))
    
    inline def setEffects(value: js.Array[CIMGeometricEffect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: CIMGeometricEffect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setJoinStyle(value: Bevel | Round | Miter): Self = StObject.set(x, "joinStyle", value.asInstanceOf[js.Any])
    
    inline def setJoinStyleUndefined: Self = StObject.set(x, "joinStyle", js.undefined)
    
    inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setTintColor(value: js.Array[Double]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTintColorVarargs(value: Double*): Self = StObject.set(x, "tintColor", js.Array(value*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureStroke): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
