package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEndpointResponse extends js.Object {
  /**
    * EndpointArn returned from CreateEndpoint action.
    */
  var EndpointArn: js.UndefOr[String] = js.undefined
}

object CreateEndpointResponse {
  @scala.inline
  def apply(EndpointArn: String = null): CreateEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointArn != null) __obj.updateDynamic("EndpointArn")(EndpointArn)
    __obj.asInstanceOf[CreateEndpointResponse]
  }
}

