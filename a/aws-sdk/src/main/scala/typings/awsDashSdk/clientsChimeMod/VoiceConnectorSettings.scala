package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceConnectorSettings extends js.Object {
  /**
    * The Amazon S3 bucket designated for call detail record storage.
    */
  var CdrBucket: js.UndefOr[String] = js.native
}

object VoiceConnectorSettings {
  @scala.inline
  def apply(CdrBucket: String = null): VoiceConnectorSettings = {
    val __obj = js.Dynamic.literal()
    if (CdrBucket != null) __obj.updateDynamic("CdrBucket")(CdrBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceConnectorSettings]
  }
}

