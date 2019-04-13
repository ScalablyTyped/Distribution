package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionAtRest extends js.Object {
  /**
    * The encryption-at-rest mode for encrypting Data Catalog data.
    */
  var CatalogEncryptionMode: awsDashSdkLib.clientsGlueMod.CatalogEncryptionMode
  /**
    * The ID of the AWS KMS key to use for encryption at rest.
    */
  var SseAwsKmsKeyId: js.UndefOr[NameString] = js.undefined
}

object EncryptionAtRest {
  @scala.inline
  def apply(CatalogEncryptionMode: CatalogEncryptionMode, SseAwsKmsKeyId: NameString = null): EncryptionAtRest = {
    val __obj = js.Dynamic.literal(CatalogEncryptionMode = CatalogEncryptionMode.asInstanceOf[js.Any])
    if (SseAwsKmsKeyId != null) __obj.updateDynamic("SseAwsKmsKeyId")(SseAwsKmsKeyId)
    __obj.asInstanceOf[EncryptionAtRest]
  }
}

