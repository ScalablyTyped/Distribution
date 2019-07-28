package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVirtualServiceOutput extends js.Object {
  /**
    * The virtual service that was deleted.
    */
  var virtualService: VirtualServiceData
}

object DeleteVirtualServiceOutput {
  @scala.inline
  def apply(virtualService: VirtualServiceData): DeleteVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService)
  
    __obj.asInstanceOf[DeleteVirtualServiceOutput]
  }
}

