package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMPictureFill
  extends StObject
     with CIMSymbolLayer {
  
  /**
  		 * A value indicating whether the color can be changed for this symbol layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureFill)
  		 */
  var colorLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The color substitutions which allows colors in the image to be substituted with a different color.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureFill)
  		 */
  var colorSubstitutions: js.UndefOr[js.Array[CIMColorSubstitution]] = js.undefined
  
  /**
  		 * The geometric effects applied to the symbol layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureFill)
  		 */
  var effects: js.UndefOr[js.Array[CIMGeometricEffect]] = js.undefined
  
  /**
  		 * A value indicating whether the symbol layer is visible.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureFill)
  		 */
  var enable: Boolean
  
  /**
  		 * The height of the image.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureFill)
  		 */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The distance that the image is offset in the horizontal direction.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureFill)
  		 */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The distance that the image is offset in the vertical direction.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureFill)
  		 */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The primitive name of the symbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureFill)
  		 */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
  		 * The angle of the image within the fill.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureFill)
  		 */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The width of the symbol without changing the height, as a ratio.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureFill)
  		 */
  var scaleX: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The color that is applied as a tint to the image.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureFill)
  		 */
  var tintColor: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureFill
  
  /**
  		 * The url of the image.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPictureFill)
  		 */
  var url: String
}
object CIMPictureFill {
  
  inline def apply(enable: Boolean, url: String): CIMPictureFill = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMPictureFill")
    __obj.asInstanceOf[CIMPictureFill]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMPictureFill] (val x: Self) extends AnyVal {
    
    inline def setColorLocked(value: Boolean): Self = StObject.set(x, "colorLocked", value.asInstanceOf[js.Any])
    
    inline def setColorLockedUndefined: Self = StObject.set(x, "colorLocked", js.undefined)
    
    inline def setColorSubstitutions(value: js.Array[CIMColorSubstitution]): Self = StObject.set(x, "colorSubstitutions", value.asInstanceOf[js.Any])
    
    inline def setColorSubstitutionsUndefined: Self = StObject.set(x, "colorSubstitutions", js.undefined)
    
    inline def setColorSubstitutionsVarargs(value: CIMColorSubstitution*): Self = StObject.set(x, "colorSubstitutions", js.Array(value*))
    
    inline def setEffects(value: js.Array[CIMGeometricEffect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: CIMGeometricEffect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setTintColor(value: js.Array[Double]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTintColorVarargs(value: Double*): Self = StObject.set(x, "tintColor", js.Array(value*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureFill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
