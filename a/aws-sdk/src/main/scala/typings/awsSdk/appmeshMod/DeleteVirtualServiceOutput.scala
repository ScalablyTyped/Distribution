package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVirtualServiceOutput extends js.Object {
  /**
    * The virtual service that was deleted.
    */
  var virtualService: VirtualServiceData = js.native
}

object DeleteVirtualServiceOutput {
  @scala.inline
  def apply(virtualService: VirtualServiceData): DeleteVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteVirtualServiceOutput]
  }
}

