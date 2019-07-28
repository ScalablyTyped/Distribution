package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonMatch extends js.Object {
  /**
    * Information about the faces in the input collection that match the face of a person in the video.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.undefined
  /**
    * Information about the matched person.
    */
  var Person: js.UndefOr[PersonDetail] = js.undefined
  /**
    * The time, in milliseconds from the beginning of the video, that the person was matched in the video.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Timestamp] = js.undefined
}

object PersonMatch {
  @scala.inline
  def apply(
    FaceMatches: FaceMatchList = null,
    Person: PersonDetail = null,
    Timestamp: js.UndefOr[Timestamp] = js.undefined
  ): PersonMatch = {
    val __obj = js.Dynamic.literal()
    if (FaceMatches != null) __obj.updateDynamic("FaceMatches")(FaceMatches)
    if (Person != null) __obj.updateDynamic("Person")(Person)
    if (!js.isUndefined(Timestamp)) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[PersonMatch]
  }
}

