package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to veto changes in an object's internal mode.
  * @see XModeChangeBroadcaster
  * @see XModeChangeListener
  * @since OOo 1.1.2
  */
@js.native
trait ModeChangeEvent extends EventObject {
  /**
    * denotes the new internal mode of a component
    *
    * The semantics of the mode string is to be defined by the component broadcasting this event.
    */
  var NewMode: String = js.native
}

object ModeChangeEvent {
  @scala.inline
  def apply(NewMode: String, Source: XInterface): ModeChangeEvent = {
    val __obj = js.Dynamic.literal(NewMode = NewMode.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeChangeEvent]
  }
  @scala.inline
  implicit class ModeChangeEventOps[Self <: ModeChangeEvent] (val x: Self) extends AnyVal {
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
    def setNewMode(value: String): Self = this.set("NewMode", value.asInstanceOf[js.Any])
  }
  
}

