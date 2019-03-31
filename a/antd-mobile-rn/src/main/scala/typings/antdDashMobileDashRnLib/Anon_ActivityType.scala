package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ActivityType extends js.Object {
  def close(): scala.Unit = js.native
  def showActionSheetWithOptions(
    config: reactDashNativeLib.reactDashNativeMod.ActionSheetIOSOptions,
    callback: js.Function1[/* index */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def showShareActionSheetWithOptions(config: js.Any): scala.Unit = js.native
  def showShareActionSheetWithOptions(config: js.Any, failureCallback: js.Function1[/* arg0 */ js.Any, scala.Unit]): scala.Unit = js.native
  def showShareActionSheetWithOptions(
    config: js.Any,
    failureCallback: js.Function1[/* arg0 */ js.Any, scala.Unit],
    successCallback: js.Function2[
      /* arg0 */ scala.Boolean, 
      /* activityType */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def showShareActionSheetWithOptions(
    config: js.Any,
    failureCallback: js.UndefOr[scala.Nothing],
    successCallback: js.Function2[
      /* arg0 */ scala.Boolean, 
      /* activityType */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

