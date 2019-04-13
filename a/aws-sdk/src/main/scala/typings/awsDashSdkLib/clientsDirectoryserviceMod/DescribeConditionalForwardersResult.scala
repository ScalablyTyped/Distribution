package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConditionalForwardersResult extends js.Object {
  /**
    * The list of conditional forwarders that have been created.
    */
  var ConditionalForwarders: js.UndefOr[ConditionalForwarders] = js.undefined
}

object DescribeConditionalForwardersResult {
  @scala.inline
  def apply(ConditionalForwarders: ConditionalForwarders = null): DescribeConditionalForwardersResult = {
    val __obj = js.Dynamic.literal()
    if (ConditionalForwarders != null) __obj.updateDynamic("ConditionalForwarders")(ConditionalForwarders)
    __obj.asInstanceOf[DescribeConditionalForwardersResult]
  }
}

