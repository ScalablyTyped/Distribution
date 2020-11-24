package typings.arcgisJsApi.esri.CIM

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
  implicit class CIMPictureFillOps[Self <: CIMPictureFill] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureFill): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSubstitutionsVarargs(value: CIMColorSubstitution*): Self = this.set("colorSubstitutions", js.Array(value :_*))
    
    @scala.inline
    def setColorSubstitutions(value: js.Array[CIMColorSubstitution]): Self = this.set("colorSubstitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSubstitutions: Self = this.set("colorSubstitutions", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    
    @scala.inline
    def setTextureFilter(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextureFilter * / any */ String
    ): Self = this.set("textureFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextureFilter: Self = this.set("textureFilter", js.undefined)
    
    @scala.inline
    def setTintColorVarargs(value: Double*): Self = this.set("tintColor", js.Array(value :_*))
    
    @scala.inline
    def setTintColor(value: js.Array[Double]): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
