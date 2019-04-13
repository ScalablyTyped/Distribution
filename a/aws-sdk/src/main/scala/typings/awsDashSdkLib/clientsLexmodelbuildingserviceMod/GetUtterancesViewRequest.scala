package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUtterancesViewRequest extends js.Object {
  /**
    * The name of the bot for which utterance information should be returned.
    */
  var botName: BotName
  /**
    * An array of bot versions for which utterance information should be returned. The limit is 5 versions per request.
    */
  var botVersions: BotVersions
  /**
    * To return utterances that were recognized and handled, useDetected. To return utterances that were not recognized, use Missed.
    */
  var statusType: StatusType
}

object GetUtterancesViewRequest {
  @scala.inline
  def apply(botName: BotName, botVersions: BotVersions, statusType: StatusType): GetUtterancesViewRequest = {
    val __obj = js.Dynamic.literal(botName = botName, botVersions = botVersions, statusType = statusType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetUtterancesViewRequest]
  }
}

