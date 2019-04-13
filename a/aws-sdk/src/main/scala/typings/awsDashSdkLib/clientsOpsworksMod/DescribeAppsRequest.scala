package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAppsRequest extends js.Object {
  /**
    * An array of app IDs for the apps to be described. If you use this parameter, DescribeApps returns a description of the specified apps. Otherwise, it returns a description of every app.
    */
  var AppIds: js.UndefOr[Strings] = js.undefined
  /**
    * The app stack ID. If you use this parameter, DescribeApps returns a description of the apps in the specified stack.
    */
  var StackId: js.UndefOr[String] = js.undefined
}

object DescribeAppsRequest {
  @scala.inline
  def apply(AppIds: Strings = null, StackId: String = null): DescribeAppsRequest = {
    val __obj = js.Dynamic.literal()
    if (AppIds != null) __obj.updateDynamic("AppIds")(AppIds)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[DescribeAppsRequest]
  }
}

