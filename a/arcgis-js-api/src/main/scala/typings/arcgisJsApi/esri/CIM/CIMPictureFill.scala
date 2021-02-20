package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMPictureFill
  extends CIMSymbolLayerBase
     with CIMSymbolLayerType {
  
  /**
    * The color substitutions which allows colors in the image to be substituted with a different color.
    */
  var colorSubstitutions: js.UndefOr[js.Array[CIMColorSubstitution]] = js.native
  
  /**
    * The height of the image.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The distance that the image is offset in the horizontal direction.
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * The distance that the image is offset in the vertical direction.
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * Angle of the image within the fill.
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * The width of the symbol without changing the height (or depth in 3D), as a ratio.
    */
  var scaleX: js.UndefOr[Double] = js.native
  
  /**
    * How the image is resampled.
    */
  var textureFilter: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextureFilter * / any */ String
  ] = js.native
  
  /**
    * The color that is applied as a tint to the image. The color is applied to the whole image. When the tint is set to white the image appears with its native colors.
    */
  var tintColor: js.UndefOr[js.Array[Double]] = js.native
  
  @JSName("type")
  var type_CIMPictureFill: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureFill = js.native
  
  /**
    * The URL of the image. Typically a base64 encoded image.
    */
  var url: js.UndefOr[String] = js.native
}
object CIMPictureFill {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureFill): CIMPictureFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMPictureFill]
  }
  
  @scala.inline
  implicit class CIMPictureFillMutableBuilder[Self <: CIMPictureFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorSubstitutions(value: js.Array[CIMColorSubstitution]): Self = StObject.set(x, "colorSubstitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSubstitutionsUndefined: Self = StObject.set(x, "colorSubstitutions", js.undefined)
    
    @scala.inline
    def setColorSubstitutionsVarargs(value: CIMColorSubstitution*): Self = StObject.set(x, "colorSubstitutions", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setTextureFilter(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextureFilter * / any */ String
    ): Self = StObject.set(x, "textureFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureFilterUndefined: Self = StObject.set(x, "textureFilter", js.undefined)
    
    @scala.inline
    def setTintColor(value: js.Array[Double]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setTintColorVarargs(value: Double*): Self = StObject.set(x, "tintColor", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureFill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
