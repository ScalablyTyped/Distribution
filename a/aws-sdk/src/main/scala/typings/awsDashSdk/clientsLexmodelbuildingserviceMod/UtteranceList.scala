package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtteranceList extends js.Object {
  /**
    * The version of the bot that processed the list.
    */
  var botVersion: js.UndefOr[Version] = js.native
  /**
    * One or more UtteranceData objects that contain information about the utterances that have been made to a bot. The maximum number of object is 100.
    */
  var utterances: js.UndefOr[ListOfUtterance] = js.native
}

object UtteranceList {
  @scala.inline
  def apply(botVersion: Version = null, utterances: ListOfUtterance = null): UtteranceList = {
    val __obj = js.Dynamic.literal()
    if (botVersion != null) __obj.updateDynamic("botVersion")(botVersion.asInstanceOf[js.Any])
    if (utterances != null) __obj.updateDynamic("utterances")(utterances.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtteranceList]
  }
}

