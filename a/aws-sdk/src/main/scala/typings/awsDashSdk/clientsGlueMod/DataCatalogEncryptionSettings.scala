package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCatalogEncryptionSettings extends js.Object {
  /**
    * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption.
    */
  var ConnectionPasswordEncryption: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ConnectionPasswordEncryption] = js.undefined
  /**
    * Specifies the encryption-at-rest configuration for the Data Catalog.
    */
  var EncryptionAtRest: js.UndefOr[typings.awsDashSdk.clientsGlueMod.EncryptionAtRest] = js.undefined
}

object DataCatalogEncryptionSettings {
  @scala.inline
  def apply(
    ConnectionPasswordEncryption: ConnectionPasswordEncryption = null,
    EncryptionAtRest: EncryptionAtRest = null
  ): DataCatalogEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    if (ConnectionPasswordEncryption != null) __obj.updateDynamic("ConnectionPasswordEncryption")(ConnectionPasswordEncryption)
    if (EncryptionAtRest != null) __obj.updateDynamic("EncryptionAtRest")(EncryptionAtRest)
    __obj.asInstanceOf[DataCatalogEncryptionSettings]
  }
}

