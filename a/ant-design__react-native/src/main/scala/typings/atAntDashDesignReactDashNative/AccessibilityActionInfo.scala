package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.AccessibilityActionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native.react-native.AccessibilityActionInfo */
trait AccessibilityActionInfo extends js.Object {
  val label: js.UndefOr[String] = js.undefined
  val name: AccessibilityActionName
}

object AccessibilityActionInfo {
  @scala.inline
  def apply(name: AccessibilityActionName, label: String = null): AccessibilityActionInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityActionInfo]
  }
}

