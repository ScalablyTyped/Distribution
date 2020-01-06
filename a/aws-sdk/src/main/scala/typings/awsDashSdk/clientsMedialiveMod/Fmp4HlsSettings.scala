package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fmp4HlsSettings extends js.Object {
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[__string] = js.native
}

object Fmp4HlsSettings {
  @scala.inline
  def apply(AudioRenditionSets: __string = null): Fmp4HlsSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioRenditionSets != null) __obj.updateDynamic("AudioRenditionSets")(AudioRenditionSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fmp4HlsSettings]
  }
}

