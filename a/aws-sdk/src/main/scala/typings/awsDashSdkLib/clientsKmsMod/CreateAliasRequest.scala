package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAliasRequest extends js.Object {
  /**
    * String that contains the display name. The name must start with the word "alias" followed by a forward slash (alias/). Aliases that begin with "alias/AWS" are reserved.
    */
  var AliasName: AliasNameType
  /**
    * Identifies the CMK for which you are creating the alias. This value cannot be an alias. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var TargetKeyId: KeyIdType
}

object CreateAliasRequest {
  @scala.inline
  def apply(AliasName: AliasNameType, TargetKeyId: KeyIdType): CreateAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName, TargetKeyId = TargetKeyId)
  
    __obj.asInstanceOf[CreateAliasRequest]
  }
}

