package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataErr extends js.Object {
  var DataErr: Double
  var Response: Double
}

object AnonDataErr {
  @scala.inline
  def apply(DataErr: Double, Response: Double): AnonDataErr = {
    val __obj = js.Dynamic.literal(DataErr = DataErr.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataErr]
  }
}

