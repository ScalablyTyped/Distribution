package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionConfiguration extends js.Object {
  /**
    * True if account cleanup is enabled at the beginning of the test; otherwise, false.
    */
  var accountsCleanup: js.UndefOr[AccountsCleanup] = js.undefined
  /**
    * True if app package cleanup is enabled at the beginning of the test; otherwise, false.
    */
  var appPackagesCleanup: js.UndefOr[AppPackagesCleanup] = js.undefined
  /**
    * The number of minutes a test run will execute before it times out.
    */
  var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
  /**
    * When set to true, for private devices, Device Farm will not sign your app again. For public devices, Device Farm always signs your apps again and this parameter has no effect. For more information about how Device Farm re-signs your app(s), see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.undefined
  /**
    * Set to true to enable video capture; otherwise, set to false. The default is true.
    */
  var videoCapture: js.UndefOr[VideoCapture] = js.undefined
}

object ExecutionConfiguration {
  @scala.inline
  def apply(
    accountsCleanup: js.UndefOr[AccountsCleanup] = js.undefined,
    appPackagesCleanup: js.UndefOr[AppPackagesCleanup] = js.undefined,
    jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
    skipAppResign: js.UndefOr[SkipAppResign] = js.undefined,
    videoCapture: js.UndefOr[VideoCapture] = js.undefined
  ): ExecutionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountsCleanup)) __obj.updateDynamic("accountsCleanup")(accountsCleanup)
    if (!js.isUndefined(appPackagesCleanup)) __obj.updateDynamic("appPackagesCleanup")(appPackagesCleanup)
    if (!js.isUndefined(jobTimeoutMinutes)) __obj.updateDynamic("jobTimeoutMinutes")(jobTimeoutMinutes)
    if (!js.isUndefined(skipAppResign)) __obj.updateDynamic("skipAppResign")(skipAppResign)
    if (!js.isUndefined(videoCapture)) __obj.updateDynamic("videoCapture")(videoCapture)
    __obj.asInstanceOf[ExecutionConfiguration]
  }
}

