package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id3Insertion extends js.Object {
  /**
    * Use ID3 tag (Id3) to provide a tag value in base64-encode format.
    */
  var Id3: js.UndefOr[__stringPatternAZaZ0902] = js.native
  /**
    * Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
    */
  var Timecode: js.UndefOr[__stringPattern010920405090509092] = js.native
}

object Id3Insertion {
  @scala.inline
  def apply(Id3: __stringPatternAZaZ0902 = null, Timecode: __stringPattern010920405090509092 = null): Id3Insertion = {
    val __obj = js.Dynamic.literal()
    if (Id3 != null) __obj.updateDynamic("Id3")(Id3.asInstanceOf[js.Any])
    if (Timecode != null) __obj.updateDynamic("Timecode")(Timecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id3Insertion]
  }
}

