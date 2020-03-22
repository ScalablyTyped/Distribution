package typings.awsSdk

import typings.awsSdk.ec2Mod.Boolean
import typings.awsSdk.ec2Mod.FilterList
import typings.awsSdk.ec2Mod.KeyNameStringList
import typings.awsSdk.ec2Mod.KeyPairIdStringList
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeKeyPairsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeKeyPairsRequestwa extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    fingerprint - The fingerprint of the key pair.    key-name - The name of the key pair.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The key pair names. Default: Describes all your key pairs.
    */
  var KeyNames: js.UndefOr[KeyNameStringList] = js.native
  /**
    * The IDs of the key pairs.
    */
  var KeyPairIds: js.UndefOr[KeyPairIdStringList] = js.native
}

