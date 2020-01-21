package typings.activexOutlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelResponse extends js.Object {
  var Cancel: Boolean
  val Response: js.Any
}

object AnonCancelResponse {
  @scala.inline
  def apply(Cancel: Boolean, Response: js.Any): AnonCancelResponse = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelResponse]
  }
}

