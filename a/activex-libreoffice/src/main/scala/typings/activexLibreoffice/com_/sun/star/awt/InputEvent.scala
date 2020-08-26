package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the root event class for all component-level input events.
  *
  * Input events are delivered to listeners before they are processed normally by the source where they originated.
  * @see WindowEvent
  */
@js.native
trait InputEvent extends EventObject {
  /**
    * contains the modifier keys which were pressed while the event occurred.
    *
    * Zero or more constants from the {@link com.sun.star.awt.KeyModifier} group.
    */
  var Modifiers: Double = js.native
}

object InputEvent {
  @scala.inline
  def apply(Modifiers: Double, Source: XInterface): InputEvent = {
    val __obj = js.Dynamic.literal(Modifiers = Modifiers.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEvent]
  }
  @scala.inline
  implicit class InputEventOps[Self <: InputEvent] (val x: Self) extends AnyVal {
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
    def setModifiers(value: Double): Self = this.set("Modifiers", value.asInstanceOf[js.Any])
  }
  
}

