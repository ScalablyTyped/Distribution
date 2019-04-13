package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientDsnFields extends js.Object {
  /**
    * The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the message to the recipient address. This is required by RFC 3464.
    */
  var Action: DsnAction
  /**
    * An extended explanation of what went wrong; this is usually an SMTP response. See RFC 3463 for the correct formatting of this parameter.
    */
  var DiagnosticCode: js.UndefOr[DiagnosticCode] = js.undefined
  /**
    * Additional X-headers to include in the DSN.
    */
  var ExtensionFields: js.UndefOr[ExtensionFieldList] = js.undefined
  /**
    * The email address that the message was ultimately delivered to. This corresponds to the Final-Recipient in the DSN. If not specified, FinalRecipient will be set to the Recipient specified in the BouncedRecipientInfo structure. Either FinalRecipient or the recipient in BouncedRecipientInfo must be a recipient of the original bounced message.  Do not prepend the FinalRecipient email address with rfc 822;, as described in RFC 3798. 
    */
  var FinalRecipient: js.UndefOr[Address] = js.undefined
  /**
    * The time the final delivery attempt was made, in RFC 822 date-time format.
    */
  var LastAttemptDate: js.UndefOr[LastAttemptDate] = js.undefined
  /**
    * The MTA to which the remote MTA attempted to deliver the message, formatted as specified in RFC 3464 (mta-name-type; mta-name). This parameter typically applies only to propagating synchronous bounces.
    */
  var RemoteMta: js.UndefOr[RemoteMta] = js.undefined
  /**
    * The status code that indicates what went wrong. This is required by RFC 3464.
    */
  var Status: DsnStatus
}

object RecipientDsnFields {
  @scala.inline
  def apply(
    Action: DsnAction,
    Status: DsnStatus,
    DiagnosticCode: DiagnosticCode = null,
    ExtensionFields: ExtensionFieldList = null,
    FinalRecipient: Address = null,
    LastAttemptDate: LastAttemptDate = null,
    RemoteMta: RemoteMta = null
  ): RecipientDsnFields = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Status = Status)
    if (DiagnosticCode != null) __obj.updateDynamic("DiagnosticCode")(DiagnosticCode)
    if (ExtensionFields != null) __obj.updateDynamic("ExtensionFields")(ExtensionFields)
    if (FinalRecipient != null) __obj.updateDynamic("FinalRecipient")(FinalRecipient)
    if (LastAttemptDate != null) __obj.updateDynamic("LastAttemptDate")(LastAttemptDate)
    if (RemoteMta != null) __obj.updateDynamic("RemoteMta")(RemoteMta)
    __obj.asInstanceOf[RecipientDsnFields]
  }
}

