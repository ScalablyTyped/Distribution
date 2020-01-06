package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisionedCapacityInput extends js.Object {
  /**
    * The AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, don't include any hyphens ('-') in the ID. 
    */
  var accountId: String = js.native
}

object ListProvisionedCapacityInput {
  @scala.inline
  def apply(accountId: String): ListProvisionedCapacityInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListProvisionedCapacityInput]
  }
}

