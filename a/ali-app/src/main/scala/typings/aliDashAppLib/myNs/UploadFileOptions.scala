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
  var success_UploadFileOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Data, scala.Unit]] = js.undefined
  /** 开发者服务器地址 */
  var url: java.lang.String
}

