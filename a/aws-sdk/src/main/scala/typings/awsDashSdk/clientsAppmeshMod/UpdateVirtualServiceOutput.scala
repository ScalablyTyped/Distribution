package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVirtualServiceOutput extends js.Object {
  /**
    * A full description of the virtual service that was updated.
    */
  var virtualService: VirtualServiceData = js.native
}

object UpdateVirtualServiceOutput {
  @scala.inline
  def apply(virtualService: VirtualServiceData): UpdateVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateVirtualServiceOutput]
  }
}

