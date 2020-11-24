package typings.aliApp.my

import typings.aliApp.aliAppStrings.audio
import typings.aliApp.aliAppStrings.image
import typings.aliApp.aliAppStrings.video
import typings.aliApp.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 文件名，即对应的 key, 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var fileName: String = js.native
  
  /** 要上传文件资源的本地定位符 */
  var filePath: String = js.native
  
  /**
    * 文件类型
    */
  var fileType: image | video | audio = js.native
  
  /** HTTP 请求中其他额外的 form 数据 */
  var formData: js.UndefOr[js.Any] = js.native
  
  /** HTTP 请求 Header */
  var header: js.UndefOr[RequestHeader] = js.native
  
  @JSName("success")
  var success_UploadFileOptions: js.UndefOr[js.Function1[/* res */ Data, Unit]] = js.native
  
  /** 开发者服务器地址 */
  var url: String = js.native
}
object UploadFileOptions {
  
  @scala.inline
  def apply(fileName: String, filePath: String, fileType: image | video | audio, url: String): UploadFileOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOptions]
  }
  
  @scala.inline
  implicit class UploadFileOptionsOps[Self <: UploadFileOptions] (val x: Self) extends AnyVal {
    
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileType(value: image | video | audio): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: js.Any): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setHeader(value: RequestHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ Data => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
