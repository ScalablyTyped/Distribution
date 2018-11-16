package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConfirmOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: java.lang.String
  /** 确认按钮文字，默认‘确定’ */
  var confirmButtonText: java.lang.String
  /** confirm框的内容 */
  var content: java.lang.String
  /** confirm框的标题 */
  var title: java.lang.String
  @JSName("success")
  def success_MConfirmOptions(result: aliDashAppLib.Anon_Confirm): scala.Unit
}

