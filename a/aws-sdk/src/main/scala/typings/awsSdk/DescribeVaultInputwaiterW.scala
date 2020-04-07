package typings.awsSdk

import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/glacier.DescribeVaultInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeVaultInputwaiterW extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: String = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}

object DescribeVaultInputwaiterW {
  @scala.inline
  def apply(accountId: String, vaultName: String, $waiter: WaiterConfiguration = null): DescribeVaultInputwaiterW = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVaultInputwaiterW]
  }
}

