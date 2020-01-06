package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonDetection extends js.Object {
  /**
    * Details about a person whose path was tracked in a video.
    */
  var Person: js.UndefOr[PersonDetail] = js.native
  /**
    * The time, in milliseconds from the start of the video, that the person's path was tracked.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Timestamp] = js.native
}

object PersonDetection {
  @scala.inline
  def apply(Person: PersonDetail = null, Timestamp: Int | Double = null): PersonDetection = {
    val __obj = js.Dynamic.literal()
    if (Person != null) __obj.updateDynamic("Person")(Person.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonDetection]
  }
}

