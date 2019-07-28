package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  /**
    * Reserved for future use.
    */
  var Details: js.UndefOr[SessionDetails] = js.undefined
  /**
    * The name of the Session Manager SSM document used to define the parameters and plugin settings for the session. For example, SSM-SessionManagerRunShell.
    */
  var DocumentName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentName] = js.undefined
  /**
    * The date and time, in ISO-8601 Extended format, when the session was terminated.
    */
  var EndDate: js.UndefOr[DateTime] = js.undefined
  /**
    * Reserved for future use.
    */
  var OutputUrl: js.UndefOr[SessionManagerOutputUrl] = js.undefined
  /**
    * The ID of the AWS user account that started the session.
    */
  var Owner: js.UndefOr[SessionOwner] = js.undefined
  /**
    * The ID of the session.
    */
  var SessionId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.SessionId] = js.undefined
  /**
    * The date and time, in ISO-8601 Extended format, when the session began.
    */
  var StartDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The status of the session. For example, "Connected" or "Terminated".
    */
  var Status: js.UndefOr[SessionStatus] = js.undefined
  /**
    * The instance that the Session Manager session connected to.
    */
  var Target: js.UndefOr[SessionTarget] = js.undefined
}

object Session {
  @scala.inline
  def apply(
    Details: SessionDetails = null,
    DocumentName: DocumentName = null,
    EndDate: DateTime = null,
    OutputUrl: SessionManagerOutputUrl = null,
    Owner: SessionOwner = null,
    SessionId: SessionId = null,
    StartDate: DateTime = null,
    Status: SessionStatus = null,
    Target: SessionTarget = null
  ): Session = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details)
    if (DocumentName != null) __obj.updateDynamic("DocumentName")(DocumentName)
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate)
    if (OutputUrl != null) __obj.updateDynamic("OutputUrl")(OutputUrl)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (SessionId != null) __obj.updateDynamic("SessionId")(SessionId)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Target != null) __obj.updateDynamic("Target")(Target)
    __obj.asInstanceOf[Session]
  }
}

