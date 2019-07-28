package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDsn extends js.Object {
  /**
    * When the message was received by the reporting mail transfer agent (MTA), in RFC 822 date-time format.
    */
  var ArrivalDate: js.UndefOr[typings.awsDashSdk.clientsSesMod.ArrivalDate] = js.undefined
  /**
    * Additional X-headers to include in the DSN.
    */
  var ExtensionFields: js.UndefOr[ExtensionFieldList] = js.undefined
  /**
    * The reporting MTA that attempted to deliver the message, formatted as specified in RFC 3464 (mta-name-type; mta-name). The default value is dns; inbound-smtp.[region].amazonaws.com.
    */
  var ReportingMta: typings.awsDashSdk.clientsSesMod.ReportingMta
}

object MessageDsn {
  @scala.inline
  def apply(
    ReportingMta: ReportingMta,
    ArrivalDate: ArrivalDate = null,
    ExtensionFields: ExtensionFieldList = null
  ): MessageDsn = {
    val __obj = js.Dynamic.literal(ReportingMta = ReportingMta)
    if (ArrivalDate != null) __obj.updateDynamic("ArrivalDate")(ArrivalDate)
    if (ExtensionFields != null) __obj.updateDynamic("ExtensionFields")(ExtensionFields)
    __obj.asInstanceOf[MessageDsn]
  }
}

