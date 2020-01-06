package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataflowEndpointConfig extends js.Object {
  /**
    * Name of a dataflow endpoint.
    */
  var dataflowEndpointName: String = js.native
}

object DataflowEndpointConfig {
  @scala.inline
  def apply(dataflowEndpointName: String): DataflowEndpointConfig = {
    val __obj = js.Dynamic.literal(dataflowEndpointName = dataflowEndpointName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataflowEndpointConfig]
  }
}

