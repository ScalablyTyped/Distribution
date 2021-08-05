package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMPictureStroke
  extends StObject
     with CIMStroke
     with CIMSymbolLayerType {
  
  /**
    * The color substitutions for the picture.
    */
  var colorSubstitutions: js.UndefOr[js.Array[CIMColorSubstitution]] = js.undefined
  
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
  var type_CIMPictureStroke: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureStroke
  
  /**
    * The image that is used in the symbol layer. Typically a base64 encoded image.
    */
  var url: js.UndefOr[String] = js.undefined
}
object CIMPictureStroke {
  
  inline def apply(): CIMPictureStroke = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMPictureStroke")
    __obj.asInstanceOf[CIMPictureStroke]
  }
  
  extension [Self <: CIMPictureStroke](x: Self) {
    
    inline def setColorSubstitutions(value: js.Array[CIMColorSubstitution]): Self = StObject.set(x, "colorSubstitutions", value.asInstanceOf[js.Any])
    
    inline def setColorSubstitutionsUndefined: Self = StObject.set(x, "colorSubstitutions", js.undefined)
    
    inline def setColorSubstitutionsVarargs(value: CIMColorSubstitution*): Self = StObject.set(x, "colorSubstitutions", js.Array(value :_*))
    
    inline def setTextureFilter(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextureFilter * / any */ String
    ): Self = StObject.set(x, "textureFilter", value.asInstanceOf[js.Any])
    
    inline def setTextureFilterUndefined: Self = StObject.set(x, "textureFilter", js.undefined)
    
    inline def setTintColor(value: js.Array[Double]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTintColorVarargs(value: Double*): Self = StObject.set(x, "tintColor", js.Array(value :_*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureStroke): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
