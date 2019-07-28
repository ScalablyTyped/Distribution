package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataflowEndpointConfig extends js.Object {
  /**
    * Name of a dataflow endpoint.
    */
  var dataflowEndpointName: String
}

object DataflowEndpointConfig {
  @scala.inline
  def apply(dataflowEndpointName: String): DataflowEndpointConfig = {
    val __obj = js.Dynamic.literal(dataflowEndpointName = dataflowEndpointName)
  
    __obj.asInstanceOf[DataflowEndpointConfig]
  }
}

