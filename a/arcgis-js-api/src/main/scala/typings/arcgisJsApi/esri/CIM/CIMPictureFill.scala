package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMPictureFill
  extends StObject
     with CIMSymbolLayerBase
     with CIMSymbolLayerType {
  
  /**
    * The color substitutions which allows colors in the image to be substituted with a different color.
    */
  var colorSubstitutions: js.UndefOr[js.Array[CIMColorSubstitution]] = js.undefined
  
  /**
    * The height of the image.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance that the image is offset in the horizontal direction.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance that the image is offset in the vertical direction.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * Angle of the image within the fill.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the symbol without changing the height (or depth in 3D), as a ratio.
    */
  var scaleX: js.UndefOr[Double] = js.undefined
  
  /**
    * How the image is resampled.
    */
  var textureFilter: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextureFilter * / any */ String
  ] = js.undefined
  
  /**
    * The color that is applied as a tint to the image. The color is applied to the whole image. When the tint is set to white the image appears with its native colors.
    */
  var tintColor: js.UndefOr[js.Array[Double]] = js.undefined
  
  @JSName("type")
  var type_CIMPictureFill: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureFill
  
  /**
    * The URL of the image. Typically a base64 encoded image.
    */
  var url: js.UndefOr[String] = js.undefined
}
object CIMPictureFill {
  
  inline def apply(): CIMPictureFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMPictureFill")
    __obj.asInstanceOf[CIMPictureFill]
  }
  
  extension [Self <: CIMPictureFill](x: Self) {
    
    inline def setColorSubstitutions(value: js.Array[CIMColorSubstitution]): Self = StObject.set(x, "colorSubstitutions", value.asInstanceOf[js.Any])
    
    inline def setColorSubstitutionsUndefined: Self = StObject.set(x, "colorSubstitutions", js.undefined)
    
    inline def setColorSubstitutionsVarargs(value: CIMColorSubstitution*): Self = StObject.set(x, "colorSubstitutions", js.Array(value :_*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setTextureFilter(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextureFilter * / any */ String
    ): Self = StObject.set(x, "textureFilter", value.asInstanceOf[js.Any])
    
    inline def setTextureFilterUndefined: Self = StObject.set(x, "textureFilter", js.undefined)
    
    inline def setTintColor(value: js.Array[Double]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTintColorVarargs(value: Double*): Self = StObject.set(x, "tintColor", js.Array(value :_*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureFill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
