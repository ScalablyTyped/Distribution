package typings.awsDashSdk.clientsLexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSessionResponse extends js.Object {
  /**
    * Describes the current state of the bot.
    */
  var dialogAction: js.UndefOr[DialogAction] = js.undefined
  /**
    * An array of information about the intents used in the session. The array can contain a maximum of three summaries. If more than three intents are used in the session, the recentIntentSummaryView operation contains information about the last three intents used.
    */
  var recentIntentSummaryView: js.UndefOr[IntentSummaryList] = js.undefined
  /**
    * Map of key/value pairs representing the session-specific context information. It contains application information passed between Amazon Lex and a client application.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.undefined
  /**
    * A unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.undefined
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
    if (dialogAction != null) __obj.updateDynamic("dialogAction")(dialogAction)
    if (recentIntentSummaryView != null) __obj.updateDynamic("recentIntentSummaryView")(recentIntentSummaryView)
    if (sessionAttributes != null) __obj.updateDynamic("sessionAttributes")(sessionAttributes)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    __obj.asInstanceOf[GetSessionResponse]
  }
}

