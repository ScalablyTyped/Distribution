package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewData extends js.Object {
  var NewData: String
  var Response: Double
}

object AnonNewData {
  @scala.inline
  def apply(NewData: String, Response: Double): AnonNewData = {
    val __obj = js.Dynamic.literal(NewData = NewData.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewData]
  }
}

