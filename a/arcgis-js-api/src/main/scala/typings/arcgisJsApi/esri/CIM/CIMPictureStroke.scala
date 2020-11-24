package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMPictureStroke
  extends CIMStroke
     with CIMSymbolLayerType {
  
  /**
    * The color substitutions for the picture.
    */
  var colorSubstitutions: js.UndefOr[js.Array[CIMColorSubstitution]] = js.native
  
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
  var type_CIMPictureStroke: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureStroke = js.native
  
  /**
    * The image that is used in the symbol layer. Typically a base64 encoded image.
    */
  var url: js.UndefOr[String] = js.native
}
object CIMPictureStroke {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureStroke): CIMPictureStroke = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMPictureStroke]
  }
  
  @scala.inline
  implicit class CIMPictureStrokeOps[Self <: CIMPictureStroke] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureStroke): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSubstitutionsVarargs(value: CIMColorSubstitution*): Self = this.set("colorSubstitutions", js.Array(value :_*))
    
    @scala.inline
    def setColorSubstitutions(value: js.Array[CIMColorSubstitution]): Self = this.set("colorSubstitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSubstitutions: Self = this.set("colorSubstitutions", js.undefined)
    
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
