package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardHlsSettings extends js.Object {
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[__string] = js.undefined
  var M3u8Settings: typings.awsDashSdk.clientsMedialiveMod.M3u8Settings
}

object StandardHlsSettings {
  @scala.inline
  def apply(M3u8Settings: M3u8Settings, AudioRenditionSets: __string = null): StandardHlsSettings = {
    val __obj = js.Dynamic.literal(M3u8Settings = M3u8Settings)
    if (AudioRenditionSets != null) __obj.updateDynamic("AudioRenditionSets")(AudioRenditionSets)
    __obj.asInstanceOf[StandardHlsSettings]
  }
}

