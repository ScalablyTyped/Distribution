package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEncryptionConfigResult extends js.Object {
  /**
    * The new encryption configuration.
    */
  var EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
}

object PutEncryptionConfigResult {
  @scala.inline
  def apply(EncryptionConfig: EncryptionConfig = null): PutEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig)
    __obj.asInstanceOf[PutEncryptionConfigResult]
  }
}

