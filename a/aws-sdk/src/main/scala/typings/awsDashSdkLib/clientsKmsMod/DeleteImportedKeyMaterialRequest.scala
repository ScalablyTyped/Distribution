package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteImportedKeyMaterialRequest extends js.Object {
  /**
    * The identifier of the CMK whose key material to delete. The CMK's Origin must be EXTERNAL. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
}

object DeleteImportedKeyMaterialRequest {
  @scala.inline
  def apply(KeyId: KeyIdType): DeleteImportedKeyMaterialRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId)
  
    __obj.asInstanceOf[DeleteImportedKeyMaterialRequest]
  }
}

