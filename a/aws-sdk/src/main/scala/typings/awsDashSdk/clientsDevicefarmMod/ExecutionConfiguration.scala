package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionConfiguration extends js.Object {
  /**
    * True if account cleanup is enabled at the beginning of the test. Otherwise, false.
    */
  var accountsCleanup: js.UndefOr[AccountsCleanup] = js.native
  /**
    * True if app package cleanup is enabled at the beginning of the test. Otherwise, false.
    */
  var appPackagesCleanup: js.UndefOr[AppPackagesCleanup] = js.native
  /**
    * The number of minutes a test run executes before it times out.
    */
  var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.native
  /**
    * Set to true to enable video capture. Otherwise, set to false. The default is true.
    */
  var videoCapture: js.UndefOr[VideoCapture] = js.native
}

object ExecutionConfiguration {
  @scala.inline
  def apply(
    accountsCleanup: js.UndefOr[scala.Boolean] = js.undefined,
    appPackagesCleanup: js.UndefOr[scala.Boolean] = js.undefined,
    jobTimeoutMinutes: Int | scala.Double = null,
    skipAppResign: js.UndefOr[scala.Boolean] = js.undefined,
    videoCapture: js.UndefOr[scala.Boolean] = js.undefined
  ): ExecutionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountsCleanup)) __obj.updateDynamic("accountsCleanup")(accountsCleanup.asInstanceOf[js.Any])
    if (!js.isUndefined(appPackagesCleanup)) __obj.updateDynamic("appPackagesCleanup")(appPackagesCleanup.asInstanceOf[js.Any])
    if (jobTimeoutMinutes != null) __obj.updateDynamic("jobTimeoutMinutes")(jobTimeoutMinutes.asInstanceOf[js.Any])
    if (!js.isUndefined(skipAppResign)) __obj.updateDynamic("skipAppResign")(skipAppResign.asInstanceOf[js.Any])
    if (!js.isUndefined(videoCapture)) __obj.updateDynamic("videoCapture")(videoCapture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionConfiguration]
  }
}

