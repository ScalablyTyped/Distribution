package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionConfiguration extends js.Object {
  /**
    * The encryption key.
    */
  var KMSEncryptionConfig: js.UndefOr[KMSEncryptionConfig] = js.undefined
  /**
    * Specifically override existing encryption information to ensure that no encryption is used.
    */
  var NoEncryptionConfig: js.UndefOr[NoEncryptionConfig] = js.undefined
}

object EncryptionConfiguration {
  @scala.inline
  def apply(KMSEncryptionConfig: KMSEncryptionConfig = null, NoEncryptionConfig: NoEncryptionConfig = null): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (KMSEncryptionConfig != null) __obj.updateDynamic("KMSEncryptionConfig")(KMSEncryptionConfig)
    if (NoEncryptionConfig != null) __obj.updateDynamic("NoEncryptionConfig")(NoEncryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfiguration]
  }
}

