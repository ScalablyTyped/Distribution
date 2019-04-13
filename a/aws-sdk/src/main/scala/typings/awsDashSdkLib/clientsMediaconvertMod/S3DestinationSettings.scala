package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3DestinationSettings extends js.Object {
  /**
    * Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
    */
  var Encryption: js.UndefOr[S3EncryptionSettings] = js.undefined
}

object S3DestinationSettings {
  @scala.inline
  def apply(Encryption: S3EncryptionSettings = null): S3DestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    __obj.asInstanceOf[S3DestinationSettings]
  }
}

