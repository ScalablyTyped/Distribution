package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CelebrityRecognition extends js.Object {
  /**
    * Information about a recognized celebrity.
    */
  var Celebrity: js.UndefOr[CelebrityDetail] = js.undefined
  /**
    * The time, in milliseconds from the start of the video, that the celebrity was recognized.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Timestamp] = js.undefined
}

object CelebrityRecognition {
  @scala.inline
  def apply(Celebrity: CelebrityDetail = null, Timestamp: js.UndefOr[Timestamp] = js.undefined): CelebrityRecognition = {
    val __obj = js.Dynamic.literal()
    if (Celebrity != null) __obj.updateDynamic("Celebrity")(Celebrity)
    if (!js.isUndefined(Timestamp)) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[CelebrityRecognition]
  }
}

