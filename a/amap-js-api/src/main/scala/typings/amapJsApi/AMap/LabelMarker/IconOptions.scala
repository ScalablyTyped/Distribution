package typings.amapJsApi.AMap.LabelMarker

import typings.amapJsApi.AMap.Pixel
import typings.amapJsApi.AMap.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconOptions extends js.Object {
  
  var anchor: js.UndefOr[Anchor] = js.native
  
  // internal
  var angel: js.UndefOr[Double] = js.native
  
  // unsupport Pixel in v1.4.14
  var clipOrigin: js.UndefOr[js.Array[Double] | Pixel] = js.native
  
  var clipSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var retina: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[js.Array[Double] | Size] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}
object IconOptions {
  
  @scala.inline
  def apply(): IconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconOptions]
  }
  
  @scala.inline
  implicit class IconOptionsOps[Self <: IconOptions] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: Anchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAngel(value: Double): Self = this.set("angel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngel: Self = this.set("angel", js.undefined)
    
    @scala.inline
    def setClipOriginVarargs(value: Double*): Self = this.set("clipOrigin", js.Array(value :_*))
    
    @scala.inline
    def setClipOrigin(value: js.Array[Double] | Pixel): Self = this.set("clipOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipOrigin: Self = this.set("clipOrigin", js.undefined)
    
    @scala.inline
    def setClipSize(value: js.Tuple2[Double, Double]): Self = this.set("clipSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipSize: Self = this.set("clipSize", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setRetina(value: Boolean): Self = this.set("retina", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetina: Self = this.set("retina", js.undefined)
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: js.Array[Double] | Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setZooms(value: js.Tuple2[Double, Double]): Self = this.set("zooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZooms: Self = this.set("zooms", js.undefined)
  }
}
