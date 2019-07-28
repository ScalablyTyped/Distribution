package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtteranceData extends js.Object {
  /**
    * The number of times that the utterance was processed.
    */
  var count: js.UndefOr[Count] = js.undefined
  /**
    * The total number of individuals that used the utterance.
    */
  var distinctUsers: js.UndefOr[Count] = js.undefined
  /**
    * The date that the utterance was first recorded.
    */
  var firstUtteredDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The date that the utterance was last recorded.
    */
  var lastUtteredDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The text that was entered by the user or the text representation of an audio clip.
    */
  var utteranceString: js.UndefOr[UtteranceString] = js.undefined
}

object UtteranceData {
  @scala.inline
  def apply(
    count: js.UndefOr[Count] = js.undefined,
    distinctUsers: js.UndefOr[Count] = js.undefined,
    firstUtteredDate: Timestamp = null,
    lastUtteredDate: Timestamp = null,
    utteranceString: UtteranceString = null
  ): UtteranceData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    if (!js.isUndefined(distinctUsers)) __obj.updateDynamic("distinctUsers")(distinctUsers)
    if (firstUtteredDate != null) __obj.updateDynamic("firstUtteredDate")(firstUtteredDate)
    if (lastUtteredDate != null) __obj.updateDynamic("lastUtteredDate")(lastUtteredDate)
    if (utteranceString != null) __obj.updateDynamic("utteranceString")(utteranceString)
    __obj.asInstanceOf[UtteranceData]
  }
}

