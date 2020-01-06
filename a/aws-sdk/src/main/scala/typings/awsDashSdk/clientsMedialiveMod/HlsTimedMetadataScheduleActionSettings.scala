package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsTimedMetadataScheduleActionSettings extends js.Object {
  /**
    * Base64 string formatted according to the ID3 specification: http://id3.org/id3v2.4.0-structure
    */
  var Id3: __string = js.native
}

object HlsTimedMetadataScheduleActionSettings {
  @scala.inline
  def apply(Id3: __string): HlsTimedMetadataScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Id3 = Id3.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HlsTimedMetadataScheduleActionSettings]
  }
}

