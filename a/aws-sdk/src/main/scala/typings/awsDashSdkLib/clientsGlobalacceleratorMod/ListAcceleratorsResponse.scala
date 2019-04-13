package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAcceleratorsResponse extends js.Object {
  /**
    * The list of accelerators for a customer account.
    */
  var Accelerators: js.UndefOr[Accelerators] = js.undefined
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object ListAcceleratorsResponse {
  @scala.inline
  def apply(Accelerators: Accelerators = null, NextToken: GenericString = null): ListAcceleratorsResponse = {
    val __obj = js.Dynamic.literal()
    if (Accelerators != null) __obj.updateDynamic("Accelerators")(Accelerators)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAcceleratorsResponse]
  }
}

