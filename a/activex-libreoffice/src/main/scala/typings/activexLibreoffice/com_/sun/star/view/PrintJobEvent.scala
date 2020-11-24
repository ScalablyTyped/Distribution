package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the print progress of an {@link XPrintJob} .
  *
  * {@link com.sun.star.lang.EventObject.Source} contains the {@link XPrintJob} having changed its state
  *
  * .
  * @since OOo 1.1.2
  */
@js.native
trait PrintJobEvent extends EventObject {
  
  var State: PrintableState = js.native
}
object PrintJobEvent {
  
  @scala.inline
  def apply(Source: XInterface, State: PrintableState): PrintJobEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintJobEvent]
  }
  
  @scala.inline
  implicit class PrintJobEventOps[Self <: PrintJobEvent] (val x: Self) extends AnyVal {
    
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
