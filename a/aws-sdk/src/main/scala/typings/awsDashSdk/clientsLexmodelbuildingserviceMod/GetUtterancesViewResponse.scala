package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUtterancesViewResponse extends js.Object {
  /**
    * The name of the bot for which utterance information was returned.
    */
  var botName: js.UndefOr[BotName] = js.undefined
  /**
    * An array of UtteranceList objects, each containing a list of UtteranceData objects describing the utterances that were processed by your bot. The response contains a maximum of 100 UtteranceData objects for each version.
    */
  var utterances: js.UndefOr[ListsOfUtterances] = js.undefined
}

object GetUtterancesViewResponse {
  @scala.inline
  def apply(botName: BotName = null, utterances: ListsOfUtterances = null): GetUtterancesViewResponse = {
    val __obj = js.Dynamic.literal()
    if (botName != null) __obj.updateDynamic("botName")(botName)
    if (utterances != null) __obj.updateDynamic("utterances")(utterances)
    __obj.asInstanceOf[GetUtterancesViewResponse]
  }
}

