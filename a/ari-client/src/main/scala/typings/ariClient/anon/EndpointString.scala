package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointString extends js.Object {
  var endpoint: String
}

object EndpointString {
  @scala.inline
  def apply(endpoint: String): EndpointString = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointString]
  }
}

