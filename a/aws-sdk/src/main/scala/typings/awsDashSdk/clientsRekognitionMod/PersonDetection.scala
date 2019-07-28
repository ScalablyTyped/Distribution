package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonDetection extends js.Object {
  /**
    * Details about a person whose path was tracked in a video.
    */
  var Person: js.UndefOr[PersonDetail] = js.undefined
  /**
    * The time, in milliseconds from the start of the video, that the person's path was tracked.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Timestamp] = js.undefined
}

object PersonDetection {
  @scala.inline
  def apply(Person: PersonDetail = null, Timestamp: js.UndefOr[Timestamp] = js.undefined): PersonDetection = {
    val __obj = js.Dynamic.literal()
    if (Person != null) __obj.updateDynamic("Person")(Person)
    if (!js.isUndefined(Timestamp)) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[PersonDetection]
  }
}

