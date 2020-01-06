package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVirtualServiceOutput extends js.Object {
  /**
    * The full description of your virtual service following the create call.
    */
  var virtualService: VirtualServiceData = js.native
}

object CreateVirtualServiceOutput {
  @scala.inline
  def apply(virtualService: VirtualServiceData): CreateVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateVirtualServiceOutput]
  }
}

