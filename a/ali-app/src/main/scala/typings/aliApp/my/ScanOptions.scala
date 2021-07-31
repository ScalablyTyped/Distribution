package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 是否隐藏相册（不允许从相册选择图片），只能从相机扫码
    */
  var hideAlbum: js.UndefOr[Boolean] = js.undefined
  
  @JSName("success")
  var success_ScanOptions: js.UndefOr[js.Function1[/* res */ ScanCodeData, Unit]] = js.undefined
  
  /**
    * 扫码样式(默认 qr)：
    * 1. qr,扫码框样式为二维码扫码框
    * 1. bar，扫码样式为条形码扫码框
    */
  var `type`: js.UndefOr[scanType] = js.undefined
}
object ScanOptions {
  
  @scala.inline
  def apply(): ScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanOptions]
  }
  
  @scala.inline
  implicit class ScanOptionsMutableBuilder[Self <: ScanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideAlbum(value: Boolean): Self = StObject.set(x, "hideAlbum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideAlbumUndefined: Self = StObject.set(x, "hideAlbum", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ ScanCodeData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setType(value: scanType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
