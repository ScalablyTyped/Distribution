package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConditionalForwardersResult extends js.Object {
  /**
    * The list of conditional forwarders that have been created.
    */
  var ConditionalForwarders: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.ConditionalForwarders] = js.native
}

object DescribeConditionalForwardersResult {
  @scala.inline
  def apply(ConditionalForwarders: ConditionalForwarders = null): DescribeConditionalForwardersResult = {
    val __obj = js.Dynamic.literal()
    if (ConditionalForwarders != null) __obj.updateDynamic("ConditionalForwarders")(ConditionalForwarders.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConditionalForwardersResult]
  }
}

