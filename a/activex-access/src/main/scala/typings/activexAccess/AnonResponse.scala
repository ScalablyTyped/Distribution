package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResponse extends js.Object {
  var Cancel: Double
  var Response: Double
}

object AnonResponse {
  @scala.inline
  def apply(Cancel: Double, Response: Double): AnonResponse = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResponse]
  }
}

