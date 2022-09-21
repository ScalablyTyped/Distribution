package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMPictureMarker
  extends StObject
     with CIMMarker
     with CIMSymbolLayerType {
  
  /**
    * The color substitutions for the picture.
    */
  var colorSubstitutions: js.UndefOr[js.Array[CIMColorSubstitution]] = js.undefined
  
  /**
    * The depth of the image when drawn in 3D.
    */
  var depth3D: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether the image is right-reading when viewed from behind.
    */
  var invertBackfaceTexture: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The scale X which changes the width of the symbol without changing the height (or depth in 3D), as a ratio.
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
  var type_CIMPictureMarker: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureMarker
  
  /**
    * The image that is used in the symbol layer. Typically a base64 encoded image.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * A value indicating whether the marker stands upright as though locked in place. The marker can be viewed from all angles.
    */
  var verticalOrientation3D: js.UndefOr[Boolean] = js.undefined
}
object CIMPictureMarker {
  
  inline def apply(): CIMPictureMarker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMPictureMarker")
    __obj.asInstanceOf[CIMPictureMarker]
  }
  
  extension [Self <: CIMPictureMarker](x: Self) {
    
    inline def setColorSubstitutions(value: js.Array[CIMColorSubstitution]): Self = StObject.set(x, "colorSubstitutions", value.asInstanceOf[js.Any])
    
    inline def setColorSubstitutionsUndefined: Self = StObject.set(x, "colorSubstitutions", js.undefined)
    
    inline def setColorSubstitutionsVarargs(value: CIMColorSubstitution*): Self = StObject.set(x, "colorSubstitutions", js.Array(value*))
    
    inline def setDepth3D(value: Double): Self = StObject.set(x, "depth3D", value.asInstanceOf[js.Any])
    
    inline def setDepth3DUndefined: Self = StObject.set(x, "depth3D", js.undefined)
    
    inline def setInvertBackfaceTexture(value: Boolean): Self = StObject.set(x, "invertBackfaceTexture", value.asInstanceOf[js.Any])
    
    inline def setInvertBackfaceTextureUndefined: Self = StObject.set(x, "invertBackfaceTexture", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setTextureFilter(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextureFilter * / any */ String
    ): Self = StObject.set(x, "textureFilter", value.asInstanceOf[js.Any])
    
    inline def setTextureFilterUndefined: Self = StObject.set(x, "textureFilter", js.undefined)
    
    inline def setTintColor(value: js.Array[Double]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTintColorVarargs(value: Double*): Self = StObject.set(x, "tintColor", js.Array(value*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureMarker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVerticalOrientation3D(value: Boolean): Self = StObject.set(x, "verticalOrientation3D", value.asInstanceOf[js.Any])
    
    inline def setVerticalOrientation3DUndefined: Self = StObject.set(x, "verticalOrientation3D", js.undefined)
  }
}
