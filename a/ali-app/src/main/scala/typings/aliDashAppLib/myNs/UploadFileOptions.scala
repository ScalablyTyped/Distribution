package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 文件名，即对应的 key, 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var fileName: java.lang.String
  /** 要上传文件资源的本地定位符 */
  var filePath: java.lang.String
  /**
  		 * 文件类型
  		 */
  var fileType: aliDashAppLib.aliDashAppLibStrings.image | aliDashAppLib.aliDashAppLibStrings.video | aliDashAppLib.aliDashAppLibStrings.audio
  /** HTTP 请求中其他额外的 form 数据 */
  var formData: js.UndefOr[js.Any] = js.undefined
  /** HTTP 请求 Header */
  var header: js.UndefOr[RequestHeader] = js.undefined
  @JSName("success")
  var success_UploadFileOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_DataHeader, scala.Unit]] = js.undefined
  /** 开发者服务器地址 */
  var url: java.lang.String
}

object UploadFileOptions {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    filePath: java.lang.String,
    fileType: aliDashAppLib.aliDashAppLibStrings.image | aliDashAppLib.aliDashAppLibStrings.video | aliDashAppLib.aliDashAppLibStrings.audio,
    url: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    formData: js.Any = null,
    header: RequestHeader = null,
    success: js.Function1[/* res */ aliDashAppLib.Anon_DataHeader, scala.Unit] = null
  ): UploadFileOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName, filePath = filePath, fileType = fileType.asInstanceOf[js.Any], url = url)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (formData != null) __obj.updateDynamic("formData")(formData)
    if (header != null) __obj.updateDynamic("header")(header)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[UploadFileOptions]
  }
}

