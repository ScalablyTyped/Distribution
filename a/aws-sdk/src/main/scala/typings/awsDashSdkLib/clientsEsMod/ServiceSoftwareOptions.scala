package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceSoftwareOptions extends js.Object {
  /**
    * Timestamp, in Epoch time, until which you can manually request a service software update. After this date, we automatically update your service software.
    */
  var AutomatedUpdateDate: js.UndefOr[DeploymentCloseDateTimeStamp] = js.undefined
  /**
    * True if you are able to cancel your service software version update. False if you are not able to cancel your service software version. 
    */
  var Cancellable: js.UndefOr[Boolean] = js.undefined
  /**
    * The current service software version that is present on the domain.
    */
  var CurrentVersion: js.UndefOr[String] = js.undefined
  /**
    * The description of the UpdateStatus.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The new service software version if one is available.
    */
  var NewVersion: js.UndefOr[String] = js.undefined
  /**
    * True if you are able to update you service software version. False if you are not able to update your service software version. 
    */
  var UpdateAvailable: js.UndefOr[Boolean] = js.undefined
  /**
    * The status of your service software update. This field can take the following values: ELIGIBLE, PENDING_UPDATE, IN_PROGRESS, COMPLETED, and NOT_ELIGIBLE.
    */
  var UpdateStatus: js.UndefOr[DeploymentStatus] = js.undefined
}

object ServiceSoftwareOptions {
  @scala.inline
  def apply(
    AutomatedUpdateDate: DeploymentCloseDateTimeStamp = null,
    Cancellable: js.UndefOr[Boolean] = js.undefined,
    CurrentVersion: String = null,
    Description: String = null,
    NewVersion: String = null,
    UpdateAvailable: js.UndefOr[Boolean] = js.undefined,
    UpdateStatus: DeploymentStatus = null
  ): ServiceSoftwareOptions = {
    val __obj = js.Dynamic.literal()
    if (AutomatedUpdateDate != null) __obj.updateDynamic("AutomatedUpdateDate")(AutomatedUpdateDate)
    if (!js.isUndefined(Cancellable)) __obj.updateDynamic("Cancellable")(Cancellable)
    if (CurrentVersion != null) __obj.updateDynamic("CurrentVersion")(CurrentVersion)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (NewVersion != null) __obj.updateDynamic("NewVersion")(NewVersion)
    if (!js.isUndefined(UpdateAvailable)) __obj.updateDynamic("UpdateAvailable")(UpdateAvailable)
    if (UpdateStatus != null) __obj.updateDynamic("UpdateStatus")(UpdateStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSoftwareOptions]
  }
}

