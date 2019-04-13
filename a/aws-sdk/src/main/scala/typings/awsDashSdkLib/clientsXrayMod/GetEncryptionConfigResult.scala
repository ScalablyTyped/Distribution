package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEncryptionConfigResult extends js.Object {
  /**
    * The encryption configuration document.
    */
  var EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
}

object GetEncryptionConfigResult {
  @scala.inline
  def apply(EncryptionConfig: EncryptionConfig = null): GetEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig)
    __obj.asInstanceOf[GetEncryptionConfigResult]
  }
}

