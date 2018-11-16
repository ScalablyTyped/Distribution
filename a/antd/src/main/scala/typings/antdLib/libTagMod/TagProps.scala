package typings
package antdLib.libTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TagProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  /** 动画关闭后的回调 */
  var afterClose: js.UndefOr[js.Function] = js.undefined
  /** 标签是否可以关闭 */
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  /** 关闭时的回调 */
  var onClose: js.UndefOr[js.Function] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

