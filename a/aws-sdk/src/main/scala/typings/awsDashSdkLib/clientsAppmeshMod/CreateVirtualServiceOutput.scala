package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVirtualServiceOutput extends js.Object {
  /**
    * The full description of your virtual service following the create call.
    */
  var virtualService: VirtualServiceData
}

object CreateVirtualServiceOutput {
  @scala.inline
  def apply(virtualService: VirtualServiceData): CreateVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService)
  
    __obj.asInstanceOf[CreateVirtualServiceOutput]
  }
}

