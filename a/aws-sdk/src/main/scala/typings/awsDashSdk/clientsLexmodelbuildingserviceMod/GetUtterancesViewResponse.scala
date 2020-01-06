package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUtterancesViewResponse extends js.Object {
  /**
    * The name of the bot for which utterance information was returned.
    */
  var botName: js.UndefOr[BotName] = js.native
  /**
    * An array of UtteranceList objects, each containing a list of UtteranceData objects describing the utterances that were processed by your bot. The response contains a maximum of 100 UtteranceData objects for each version. Amazon Lex returns the most frequent utterances received by the bot in the last 15 days.
    */
  var utterances: js.UndefOr[ListsOfUtterances] = js.native
}

object GetUtterancesViewResponse {
  @scala.inline
  def apply(botName: BotName = null, utterances: ListsOfUtterances = null): GetUtterancesViewResponse = {
    val __obj = js.Dynamic.literal()
    if (botName != null) __obj.updateDynamic("botName")(botName.asInstanceOf[js.Any])
    if (utterances != null) __obj.updateDynamic("utterances")(utterances.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUtterancesViewResponse]
  }
}

