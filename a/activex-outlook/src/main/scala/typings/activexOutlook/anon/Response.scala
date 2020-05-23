package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var Cancel: Boolean
  val Response: js.Any
}

object Response {
  @scala.inline
  def apply(Cancel: Boolean, Response: js.Any): Response = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

