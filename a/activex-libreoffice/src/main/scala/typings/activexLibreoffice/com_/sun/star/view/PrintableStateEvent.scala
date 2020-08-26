package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the print progress of an {@link XPrintable} .
  *
  * {@link com.sun.star.lang.EventObject.Source} contains the {@link XPrintable} having changed its state
  *
  * .
  */
@js.native
trait PrintableStateEvent extends EventObject {
  var State: PrintableState = js.native
}

object PrintableStateEvent {
  @scala.inline
  def apply(Source: XInterface, State: PrintableState): PrintableStateEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintableStateEvent]
  }
  @scala.inline
  implicit class PrintableStateEventOps[Self <: PrintableStateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setState(value: PrintableState): Self = this.set("State", value.asInstanceOf[js.Any])
  }
  
}

