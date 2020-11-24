package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 是否隐藏相册（不允许从相册选择图片），只能从相机扫码
    */
  var hideAlbum: js.UndefOr[Boolean] = js.native
  
  @JSName("success")
  var success_ScanOptions: js.UndefOr[js.Function1[/* res */ ScanCodeData, Unit]] = js.native
  
  /**
    * 扫码样式(默认 qr)：
    * 1. qr,扫码框样式为二维码扫码框
    * 1. bar，扫码样式为条形码扫码框
    */
  var `type`: js.UndefOr[scanType] = js.native
}
object ScanOptions {
  
  @scala.inline
  def apply(): ScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanOptions]
  }
  
  @scala.inline
  implicit class ScanOptionsOps[Self <: ScanOptions] (val x: Self) extends AnyVal {
    
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
    def setHideAlbum(value: Boolean): Self = this.set("hideAlbum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideAlbum: Self = this.set("hideAlbum", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ ScanCodeData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setType(value: scanType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
