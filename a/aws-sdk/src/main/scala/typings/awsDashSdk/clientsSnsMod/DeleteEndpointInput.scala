package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEndpointInput extends js.Object {
  /**
    * EndpointArn of endpoint to delete.
    */
  var EndpointArn: String
}

object DeleteEndpointInput {
  @scala.inline
  def apply(EndpointArn: String): DeleteEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn)
  
    __obj.asInstanceOf[DeleteEndpointInput]
  }
}

