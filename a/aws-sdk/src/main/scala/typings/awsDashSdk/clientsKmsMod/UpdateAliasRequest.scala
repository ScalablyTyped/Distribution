package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAliasRequest extends js.Object {
  /**
    * Specifies the name of the alias to change. This value must begin with alias/ followed by the alias name, such as alias/ExampleAlias.
    */
  var AliasName: AliasNameType
  /**
    * Unique identifier of the customer master key (CMK) to be mapped to the alias. When the update operation completes, the alias will point to this CMK. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To verify that the alias is mapped to the correct CMK, use ListAliases.
    */
  var TargetKeyId: KeyIdType
}

object UpdateAliasRequest {
  @scala.inline
  def apply(AliasName: AliasNameType, TargetKeyId: KeyIdType): UpdateAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName, TargetKeyId = TargetKeyId)
  
    __obj.asInstanceOf[UpdateAliasRequest]
  }
}

