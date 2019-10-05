package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeKeyPairsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The filters.    fingerprint - The fingerprint of the key pair.    key-name - The name of the key pair.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The key pair names. Default: Describes all your key pairs.
    */
  var KeyNames: js.UndefOr[KeyNameStringList] = js.undefined
}

object DescribeKeyPairsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    KeyNames: KeyNameStringList = null
  ): DescribeKeyPairsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (KeyNames != null) __obj.updateDynamic("KeyNames")(KeyNames)
    __obj.asInstanceOf[DescribeKeyPairsRequest]
  }
}

