package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimedMetadataInsertion extends js.Object {
  /**
    * Id3Insertions contains the array of Id3Insertion instances.
    */
  var Id3Insertions: js.UndefOr[__listOfId3Insertion] = js.native
}

object TimedMetadataInsertion {
  @scala.inline
  def apply(Id3Insertions: __listOfId3Insertion = null): TimedMetadataInsertion = {
    val __obj = js.Dynamic.literal()
    if (Id3Insertions != null) __obj.updateDynamic("Id3Insertions")(Id3Insertions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataInsertion]
  }
}

