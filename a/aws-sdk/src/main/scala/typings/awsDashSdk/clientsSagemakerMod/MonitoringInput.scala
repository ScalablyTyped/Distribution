package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringInput extends js.Object {
  /**
    * The endpoint for a monitoring job.
    */
  var EndpointInput: typings.awsDashSdk.clientsSagemakerMod.EndpointInput = js.native
}

object MonitoringInput {
  @scala.inline
  def apply(EndpointInput: EndpointInput): MonitoringInput = {
    val __obj = js.Dynamic.literal(EndpointInput = EndpointInput.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MonitoringInput]
  }
}

