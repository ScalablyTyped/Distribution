package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumberCapabilities extends js.Object {
  /**
    * Allows or denies inbound calling for the specified phone number.
    */
  var InboundCall: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Allows or denies inbound MMS messaging for the specified phone number.
    */
  var InboundMMS: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Allows or denies inbound SMS messaging for the specified phone number.
    */
  var InboundSMS: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Allows or denies outbound calling for the specified phone number.
    */
  var OutboundCall: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Allows or denies outbound MMS messaging for the specified phone number.
    */
  var OutboundMMS: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Allows or denies outbound SMS messaging for the specified phone number.
    */
  var OutboundSMS: js.UndefOr[NullableBoolean] = js.undefined
}

object PhoneNumberCapabilities {
  @scala.inline
  def apply(
    InboundCall: js.UndefOr[scala.Boolean] = js.undefined,
    InboundMMS: js.UndefOr[scala.Boolean] = js.undefined,
    InboundSMS: js.UndefOr[scala.Boolean] = js.undefined,
    OutboundCall: js.UndefOr[scala.Boolean] = js.undefined,
    OutboundMMS: js.UndefOr[scala.Boolean] = js.undefined,
    OutboundSMS: js.UndefOr[scala.Boolean] = js.undefined
  ): PhoneNumberCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(InboundCall)) __obj.updateDynamic("InboundCall")(InboundCall)
    if (!js.isUndefined(InboundMMS)) __obj.updateDynamic("InboundMMS")(InboundMMS)
    if (!js.isUndefined(InboundSMS)) __obj.updateDynamic("InboundSMS")(InboundSMS)
    if (!js.isUndefined(OutboundCall)) __obj.updateDynamic("OutboundCall")(OutboundCall)
    if (!js.isUndefined(OutboundMMS)) __obj.updateDynamic("OutboundMMS")(OutboundMMS)
    if (!js.isUndefined(OutboundSMS)) __obj.updateDynamic("OutboundSMS")(OutboundSMS)
    __obj.asInstanceOf[PhoneNumberCapabilities]
  }
}

