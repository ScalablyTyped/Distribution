package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewData extends js.Object {
  var NewData: String
  var Response: Double
}

object NewData {
  @scala.inline
  def apply(NewData: String, Response: Double): NewData = {
    val __obj = js.Dynamic.literal(NewData = NewData.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewData]
  }
}

