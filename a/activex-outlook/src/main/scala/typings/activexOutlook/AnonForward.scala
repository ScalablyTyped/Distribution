package typings.activexOutlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForward extends js.Object {
  var Cancel: Boolean
  val Forward: js.Any
}

object AnonForward {
  @scala.inline
  def apply(Cancel: Boolean, Forward: js.Any): AnonForward = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonForward]
  }
}

