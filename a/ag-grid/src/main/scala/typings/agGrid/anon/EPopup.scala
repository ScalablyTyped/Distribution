package typings.agGrid.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EPopup extends js.Object {
  var ePopup: HTMLElement
  var eventSource: js.Any
}

object EPopup {
  @scala.inline
  def apply(ePopup: HTMLElement, eventSource: js.Any): EPopup = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EPopup]
  }
}

