package typings.aliApp.my

import typings.aliApp.aliAppStrings.audio
import typings.aliApp.aliAppStrings.image
import typings.aliApp.aliAppStrings.video
import typings.aliApp.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFileOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 文件名，即对应的 key, 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var fileName: String
  
  /** 要上传文件资源的本地定位符 */
  var filePath: String
  
  /**
    * 文件类型
    */
  var fileType: image | video | audio
  
  /** HTTP 请求中其他额外的 form 数据 */
  var formData: js.UndefOr[Any] = js.undefined
  
  /** HTTP 请求 Header */
  var header: js.UndefOr[RequestHeader] = js.undefined
  
  @JSName("success")
  var success_UploadFileOptions: js.UndefOr[js.Function1[/* res */ Data, Unit]] = js.undefined
  
  /** 开发者服务器地址 */
  var url: String
}
object UploadFileOptions {
  
  inline def apply(fileName: String, filePath: String, fileType: image | video | audio, url: String): UploadFileOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOptions]
  }
  
  extension [Self <: UploadFileOptions](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFileType(value: image | video | audio): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setHeader(value: RequestHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setSuccess(value: /* res */ Data => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
