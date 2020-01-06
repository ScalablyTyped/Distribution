package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /**
    * Reserved for future use.
    */
  var Details: js.UndefOr[SessionDetails] = js.native
  /**
    * The name of the Session Manager SSM document used to define the parameters and plugin settings for the session. For example, SSM-SessionManagerRunShell.
    */
  var DocumentName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentName] = js.native
  /**
    * The date and time, in ISO-8601 Extended format, when the session was terminated.
    */
  var EndDate: js.UndefOr[DateTime] = js.native
  /**
    * Reserved for future use.
    */
  var OutputUrl: js.UndefOr[SessionManagerOutputUrl] = js.native
  /**
    * The ID of the AWS user account that started the session.
    */
  var Owner: js.UndefOr[SessionOwner] = js.native
  /**
    * The ID of the session.
    */
  var SessionId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.SessionId] = js.native
  /**
    * The date and time, in ISO-8601 Extended format, when the session began.
    */
  var StartDate: js.UndefOr[DateTime] = js.native
  /**
    * The status of the session. For example, "Connected" or "Terminated".
    */
  var Status: js.UndefOr[SessionStatus] = js.native
  /**
    * The instance that the Session Manager session connected to.
    */
  var Target: js.UndefOr[SessionTarget] = js.native
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
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (DocumentName != null) __obj.updateDynamic("DocumentName")(DocumentName.asInstanceOf[js.Any])
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate.asInstanceOf[js.Any])
    if (OutputUrl != null) __obj.updateDynamic("OutputUrl")(OutputUrl.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (SessionId != null) __obj.updateDynamic("SessionId")(SessionId.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Target != null) __obj.updateDynamic("Target")(Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

