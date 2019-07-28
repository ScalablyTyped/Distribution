package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEndpointMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: String
}

object DeleteEndpointMessage {
  @scala.inline
  def apply(EndpointArn: String): DeleteEndpointMessage = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn)
  
    __obj.asInstanceOf[DeleteEndpointMessage]
  }
}

