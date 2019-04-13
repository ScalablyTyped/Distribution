package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAliasRequest extends js.Object {
  /**
    * String that contains the name of the alias to be modified. The name must start with the word "alias" followed by a forward slash (alias/). Aliases that begin with "alias/aws" are reserved.
    */
  var AliasName: AliasNameType
  /**
    * Unique identifier of the customer master key to be mapped to the alias. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To verify that the alias is mapped to the correct CMK, use ListAliases.
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

