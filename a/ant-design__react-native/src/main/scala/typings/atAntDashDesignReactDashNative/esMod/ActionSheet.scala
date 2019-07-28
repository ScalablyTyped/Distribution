package typings.atAntDashDesignReactDashNative.esMod

import typings.reactDashNative.reactDashNativeMod.ActionSheetIOSOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/es", "ActionSheet")
@js.native
object ActionSheet extends js.Object {
  def close(): Unit = js.native
  def showActionSheetWithOptions(config: ActionSheetIOSOptions, callback: js.Function1[/* index */ Double, Unit]): Unit = js.native
  def showShareActionSheetWithOptions(config: js.Any): Unit = js.native
  def showShareActionSheetWithOptions(
    config: js.Any,
    failureCallback: js.UndefOr[scala.Nothing],
    successCallback: js.Function2[/* arg0 */ Boolean, /* activityType */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def showShareActionSheetWithOptions(config: js.Any, failureCallback: js.Function1[/* arg0 */ js.Any, Unit]): Unit = js.native
  def showShareActionSheetWithOptions(
    config: js.Any,
    failureCallback: js.Function1[/* arg0 */ js.Any, Unit],
    successCallback: js.Function2[/* arg0 */ Boolean, /* activityType */ js.UndefOr[String], Unit]
  ): Unit = js.native
}

