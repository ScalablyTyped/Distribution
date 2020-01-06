package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardHlsSettings extends js.Object {
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[__string] = js.native
  var M3u8Settings: typings.awsDashSdk.clientsMedialiveMod.M3u8Settings = js.native
}

object StandardHlsSettings {
  @scala.inline
  def apply(M3u8Settings: M3u8Settings, AudioRenditionSets: __string = null): StandardHlsSettings = {
    val __obj = js.Dynamic.literal(M3u8Settings = M3u8Settings.asInstanceOf[js.Any])
    if (AudioRenditionSets != null) __obj.updateDynamic("AudioRenditionSets")(AudioRenditionSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardHlsSettings]
  }
}

