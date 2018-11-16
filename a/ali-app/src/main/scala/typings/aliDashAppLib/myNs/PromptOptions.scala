package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PromptOptions
  extends BaseOptions[js.Any, js.Any] {
  /** message对齐方式，可用枚举left/center/right，iOS ‘center’, android ‘left’ */
  var align: js.UndefOr[
    aliDashAppLib.aliDashAppLibStrings.left | aliDashAppLib.aliDashAppLibStrings.center | aliDashAppLib.aliDashAppLibStrings.right | java.lang.String
  ] = js.undefined
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: java.lang.String
  /** prompt框文本，默认‘请输入内容’ */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** 确认按钮文字，默认‘确定’ */
  var okButtonText: java.lang.String
  /** 输入框内的提示文案 */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /** prompt框标题 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  @JSName("success")
  def success_MPromptOptions(result: aliDashAppLib.Anon_InputValue): scala.Unit
}

