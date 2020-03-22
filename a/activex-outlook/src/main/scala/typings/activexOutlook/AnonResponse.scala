package typings.activexOutlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResponse extends js.Object {
  var Cancel: Boolean
  val Response: js.Any
}

object AnonResponse {
  @scala.inline
  def apply(Cancel: Boolean, Response: js.Any): AnonResponse = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResponse]
  }
}

