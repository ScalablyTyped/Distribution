package typings.aliDashApp.my

import typings.aliDashApp.Anon_DataHeader
import typings.aliDashApp.aliDashAppStrings.audio
import typings.aliDashApp.aliDashAppStrings.image
import typings.aliDashApp.aliDashAppStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 文件名，即对应的 key, 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var fileName: String
  /** 要上传文件资源的本地定位符 */
  var filePath: String
  /**
  		 * 文件类型
  		 */
  var fileType: image | video | audio
  /** HTTP 请求中其他额外的 form 数据 */
  var formData: js.UndefOr[js.Any] = js.undefined
  /** HTTP 请求 Header */
  var header: js.UndefOr[RequestHeader] = js.undefined
  @JSName("success")
  var success_UploadFileOptions: js.UndefOr[js.Function1[/* res */ Anon_DataHeader, Unit]] = js.undefined
  /** 开发者服务器地址 */
  var url: String
}

object UploadFileOptions {
  @scala.inline
  def apply(
    fileName: String,
    filePath: String,
    fileType: image | video | audio,
    url: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    formData: js.Any = null,
    header: RequestHeader = null,
    success: /* res */ Anon_DataHeader => Unit = null
  ): UploadFileOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[UploadFileOptions]
  }
}

