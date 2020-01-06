package typings.awsDashSdk.clientsLexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSessionResponse extends js.Object {
  /**
    * Describes the current state of the bot.
    */
  var dialogAction: js.UndefOr[DialogAction] = js.native
  /**
    * An array of information about the intents used in the session. The array can contain a maximum of three summaries. If more than three intents are used in the session, the recentIntentSummaryView operation contains information about the last three intents used. If you set the checkpointLabelFilter parameter in the request, the array contains only the intents with the specified label.
    */
  var recentIntentSummaryView: js.UndefOr[IntentSummaryList] = js.native
  /**
    * Map of key/value pairs representing the session-specific context information. It contains application information passed between Amazon Lex and a client application.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.native
  /**
    * A unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.native
}

object GetSessionResponse {
  @scala.inline
  def apply(
    dialogAction: DialogAction = null,
    recentIntentSummaryView: IntentSummaryList = null,
    sessionAttributes: StringMap = null,
    sessionId: String = null
  ): GetSessionResponse = {
    val __obj = js.Dynamic.literal()
    if (dialogAction != null) __obj.updateDynamic("dialogAction")(dialogAction.asInstanceOf[js.Any])
    if (recentIntentSummaryView != null) __obj.updateDynamic("recentIntentSummaryView")(recentIntentSummaryView.asInstanceOf[js.Any])
    if (sessionAttributes != null) __obj.updateDynamic("sessionAttributes")(sessionAttributes.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSessionResponse]
  }
}

