package typings.apn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseSent extends js.Object {
  var device: String
}

object ResponseSent {
  @scala.inline
  def apply(device: String): ResponseSent = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseSent]
  }
}

