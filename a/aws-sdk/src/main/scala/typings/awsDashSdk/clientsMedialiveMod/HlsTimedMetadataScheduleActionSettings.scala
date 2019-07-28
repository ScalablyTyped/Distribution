package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsTimedMetadataScheduleActionSettings extends js.Object {
  /**
    * Base64 string formatted according to the ID3 specification: http://id3.org/id3v2.4.0-structure
    */
  var Id3: __string
}

object HlsTimedMetadataScheduleActionSettings {
  @scala.inline
  def apply(Id3: __string): HlsTimedMetadataScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Id3 = Id3)
  
    __obj.asInstanceOf[HlsTimedMetadataScheduleActionSettings]
  }
}

