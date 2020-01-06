package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAcceleratorsResponse extends js.Object {
  /**
    * The list of accelerators for a customer account.
    */
  var Accelerators: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.Accelerators] = js.native
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListAcceleratorsResponse {
  @scala.inline
  def apply(Accelerators: Accelerators = null, NextToken: GenericString = null): ListAcceleratorsResponse = {
    val __obj = js.Dynamic.literal()
    if (Accelerators != null) __obj.updateDynamic("Accelerators")(Accelerators.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAcceleratorsResponse]
  }
}

