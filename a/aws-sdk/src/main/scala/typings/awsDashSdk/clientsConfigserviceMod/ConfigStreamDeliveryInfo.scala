package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigStreamDeliveryInfo extends js.Object {
  /**
    * The error code from the last attempted delivery.
    */
  var lastErrorCode: js.UndefOr[String] = js.undefined
  /**
    * The error message from the last attempted delivery.
    */
  var lastErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * Status of the last attempted delivery.  Note Providing an SNS topic on a DeliveryChannel for AWS Config is optional. If the SNS delivery is turned off, the last status will be Not_Applicable.
    */
  var lastStatus: js.UndefOr[DeliveryStatus] = js.undefined
  /**
    * The time from the last status change.
    */
  var lastStatusChangeTime: js.UndefOr[_Date] = js.undefined
}

object ConfigStreamDeliveryInfo {
  @scala.inline
  def apply(
    lastErrorCode: String = null,
    lastErrorMessage: String = null,
    lastStatus: DeliveryStatus = null,
    lastStatusChangeTime: _Date = null
  ): ConfigStreamDeliveryInfo = {
    val __obj = js.Dynamic.literal()
    if (lastErrorCode != null) __obj.updateDynamic("lastErrorCode")(lastErrorCode)
    if (lastErrorMessage != null) __obj.updateDynamic("lastErrorMessage")(lastErrorMessage)
    if (lastStatus != null) __obj.updateDynamic("lastStatus")(lastStatus.asInstanceOf[js.Any])
    if (lastStatusChangeTime != null) __obj.updateDynamic("lastStatusChangeTime")(lastStatusChangeTime)
    __obj.asInstanceOf[ConfigStreamDeliveryInfo]
  }
}

