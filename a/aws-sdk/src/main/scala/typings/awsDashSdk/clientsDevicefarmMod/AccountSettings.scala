package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountSettings extends js.Object {
  /**
    * The AWS account number specified in the AccountSettings container.
    */
  var awsAccountNumber: js.UndefOr[AWSAccountNumber] = js.undefined
  /**
    * The default number of minutes (at the account level) a test run will execute before it times out. The default value is 150 minutes.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
  /**
    * The maximum number of minutes a test run will execute before it times out.
    */
  var maxJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
  /**
    * The maximum number of device slots that the AWS account can purchase. Each maximum is expressed as an offering-id:number pair, where the offering-id represents one of the IDs returned by the ListOfferings command.
    */
  var maxSlots: js.UndefOr[MaxSlotMap] = js.undefined
  /**
    * When set to true, for private devices, Device Farm will not sign your app again. For public devices, Device Farm always signs your apps again and this parameter has no effect. For more information about how Device Farm re-signs your app(s), see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.undefined
  /**
    * Information about an AWS account's usage of free trial device minutes.
    */
  var trialMinutes: js.UndefOr[TrialMinutes] = js.undefined
  /**
    * Returns the unmetered devices you have purchased or want to purchase.
    */
  var unmeteredDevices: js.UndefOr[PurchasedDevicesMap] = js.undefined
  /**
    * Returns the unmetered remote access devices you have purchased or want to purchase.
    */
  var unmeteredRemoteAccessDevices: js.UndefOr[PurchasedDevicesMap] = js.undefined
}

object AccountSettings {
  @scala.inline
  def apply(
    awsAccountNumber: AWSAccountNumber = null,
    defaultJobTimeoutMinutes: Int | scala.Double = null,
    maxJobTimeoutMinutes: Int | scala.Double = null,
    maxSlots: MaxSlotMap = null,
    skipAppResign: js.UndefOr[scala.Boolean] = js.undefined,
    trialMinutes: TrialMinutes = null,
    unmeteredDevices: PurchasedDevicesMap = null,
    unmeteredRemoteAccessDevices: PurchasedDevicesMap = null
  ): AccountSettings = {
    val __obj = js.Dynamic.literal()
    if (awsAccountNumber != null) __obj.updateDynamic("awsAccountNumber")(awsAccountNumber)
    if (defaultJobTimeoutMinutes != null) __obj.updateDynamic("defaultJobTimeoutMinutes")(defaultJobTimeoutMinutes.asInstanceOf[js.Any])
    if (maxJobTimeoutMinutes != null) __obj.updateDynamic("maxJobTimeoutMinutes")(maxJobTimeoutMinutes.asInstanceOf[js.Any])
    if (maxSlots != null) __obj.updateDynamic("maxSlots")(maxSlots)
    if (!js.isUndefined(skipAppResign)) __obj.updateDynamic("skipAppResign")(skipAppResign)
    if (trialMinutes != null) __obj.updateDynamic("trialMinutes")(trialMinutes)
    if (unmeteredDevices != null) __obj.updateDynamic("unmeteredDevices")(unmeteredDevices)
    if (unmeteredRemoteAccessDevices != null) __obj.updateDynamic("unmeteredRemoteAccessDevices")(unmeteredRemoteAccessDevices)
    __obj.asInstanceOf[AccountSettings]
  }
}

