package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMPictureMarker
  extends CIMMarker
     with CIMSymbolLayerType {
  
  /**
    * The color substitutions for the picture.
    */
  var colorSubstitutions: js.UndefOr[js.Array[CIMColorSubstitution]] = js.native
  
  /**
    * The depth of the image when drawn in 3D.
    */
  var depth3D: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether the image is right-reading when viewed from behind.
    */
  var invertBackfaceTexture: js.UndefOr[Boolean] = js.native
  
  /**
    * The scale X which changes the width of the symbol without changing the height (or depth in 3D), as a ratio.
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
  var type_CIMPictureMarker: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureMarker = js.native
  
  /**
    * The image that is used in the symbol layer. Typically a base64 encoded image.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * A value indicating whether the marker stands upright as though locked in place. The marker can be viewed from all angles.
    */
  var verticalOrientation3D: js.UndefOr[Boolean] = js.native
}
object CIMPictureMarker {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureMarker): CIMPictureMarker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMPictureMarker]
  }
  
  @scala.inline
  implicit class CIMPictureMarkerOps[Self <: CIMPictureMarker] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPictureMarker): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSubstitutionsVarargs(value: CIMColorSubstitution*): Self = this.set("colorSubstitutions", js.Array(value :_*))
    
    @scala.inline
    def setColorSubstitutions(value: js.Array[CIMColorSubstitution]): Self = this.set("colorSubstitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSubstitutions: Self = this.set("colorSubstitutions", js.undefined)
    
    @scala.inline
    def setDepth3D(value: Double): Self = this.set("depth3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth3D: Self = this.set("depth3D", js.undefined)
    
    @scala.inline
    def setInvertBackfaceTexture(value: Boolean): Self = this.set("invertBackfaceTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertBackfaceTexture: Self = this.set("invertBackfaceTexture", js.undefined)
    
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
    
    @scala.inline
    def setVerticalOrientation3D(value: Boolean): Self = this.set("verticalOrientation3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOrientation3D: Self = this.set("verticalOrientation3D", js.undefined)
  }
}
