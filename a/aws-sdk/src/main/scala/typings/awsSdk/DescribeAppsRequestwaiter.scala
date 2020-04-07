package typings.awsSdk

import typings.awsSdk.opsworksMod.String
import typings.awsSdk.opsworksMod.Strings
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/opsworks.DescribeAppsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeAppsRequestwaiter extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * An array of app IDs for the apps to be described. If you use this parameter, DescribeApps returns a description of the specified apps. Otherwise, it returns a description of every app.
    */
  var AppIds: js.UndefOr[Strings] = js.native
  /**
    * The app stack ID. If you use this parameter, DescribeApps returns a description of the apps in the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeAppsRequestwaiter {
  @scala.inline
  def apply($waiter: WaiterConfiguration = null, AppIds: Strings = null, StackId: String = null): DescribeAppsRequestwaiter = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (AppIds != null) __obj.updateDynamic("AppIds")(AppIds.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppsRequestwaiter]
  }
}

