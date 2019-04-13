package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceConnectorSettings extends js.Object {
  /**
    * The Amazon S3 bucket designated for call detail record storage.
    */
  var CdrBucket: js.UndefOr[String] = js.undefined
}

object VoiceConnectorSettings {
  @scala.inline
  def apply(CdrBucket: String = null): VoiceConnectorSettings = {
    val __obj = js.Dynamic.literal()
    if (CdrBucket != null) __obj.updateDynamic("CdrBucket")(CdrBucket)
    __obj.asInstanceOf[VoiceConnectorSettings]
  }
}

