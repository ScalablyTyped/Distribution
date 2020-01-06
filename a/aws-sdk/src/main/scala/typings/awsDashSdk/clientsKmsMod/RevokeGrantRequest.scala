package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeGrantRequest extends js.Object {
  /**
    * Identifier of the grant to be revoked.
    */
  var GrantId: GrantIdType = js.native
  /**
    * A unique identifier for the customer master key associated with the grant. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType = js.native
}

object RevokeGrantRequest {
  @scala.inline
  def apply(GrantId: GrantIdType, KeyId: KeyIdType): RevokeGrantRequest = {
    val __obj = js.Dynamic.literal(GrantId = GrantId.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RevokeGrantRequest]
  }
}

