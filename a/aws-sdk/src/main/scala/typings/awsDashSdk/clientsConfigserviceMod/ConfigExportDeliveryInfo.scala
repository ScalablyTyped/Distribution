package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigExportDeliveryInfo extends js.Object {
  /**
    * The time of the last attempted delivery.
    */
  var lastAttemptTime: js.UndefOr[_Date] = js.undefined
  /**
    * The error code from the last attempted delivery.
    */
  var lastErrorCode: js.UndefOr[String] = js.undefined
  /**
    * The error message from the last attempted delivery.
    */
  var lastErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * Status of the last attempted delivery.
    */
  var lastStatus: js.UndefOr[DeliveryStatus] = js.undefined
  /**
    * The time of the last successful delivery.
    */
  var lastSuccessfulTime: js.UndefOr[_Date] = js.undefined
  /**
    * The time that the next delivery occurs.
    */
  var nextDeliveryTime: js.UndefOr[_Date] = js.undefined
}

object ConfigExportDeliveryInfo {
  @scala.inline
  def apply(
    lastAttemptTime: _Date = null,
    lastErrorCode: String = null,
    lastErrorMessage: String = null,
    lastStatus: DeliveryStatus = null,
    lastSuccessfulTime: _Date = null,
    nextDeliveryTime: _Date = null
  ): ConfigExportDeliveryInfo = {
    val __obj = js.Dynamic.literal()
    if (lastAttemptTime != null) __obj.updateDynamic("lastAttemptTime")(lastAttemptTime)
    if (lastErrorCode != null) __obj.updateDynamic("lastErrorCode")(lastErrorCode)
    if (lastErrorMessage != null) __obj.updateDynamic("lastErrorMessage")(lastErrorMessage)
    if (lastStatus != null) __obj.updateDynamic("lastStatus")(lastStatus.asInstanceOf[js.Any])
    if (lastSuccessfulTime != null) __obj.updateDynamic("lastSuccessfulTime")(lastSuccessfulTime)
    if (nextDeliveryTime != null) __obj.updateDynamic("nextDeliveryTime")(nextDeliveryTime)
    __obj.asInstanceOf[ConfigExportDeliveryInfo]
  }
}

