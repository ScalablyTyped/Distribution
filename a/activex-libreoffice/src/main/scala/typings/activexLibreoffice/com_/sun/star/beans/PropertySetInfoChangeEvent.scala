package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gets delivered whenever an {@link XPropertySetInfo} is changed.
  *
  * A {@link PropertySetInfoChangeEvent} object is sent to XPropertySetInfoChangeListeners.
  */
@js.native
trait PropertySetInfoChangeEvent extends EventObject {
  /**
    * contains the implementation handle for the property.
    *
    * May be -1 if the implementation has no handle.
    */
  var Handle: Double = js.native
  /** contains the name of the property. */
  var Name: String = js.native
  /**
    * contains the reason for the event.
    * @see PropertySetInfoChange
    */
  var Reason: Double = js.native
}

object PropertySetInfoChangeEvent {
  @scala.inline
  def apply(Handle: Double, Name: String, Reason: Double, Source: XInterface): PropertySetInfoChangeEvent = {
    val __obj = js.Dynamic.literal(Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertySetInfoChangeEvent]
  }
  @scala.inline
  implicit class PropertySetInfoChangeEventOps[Self <: PropertySetInfoChangeEvent] (val x: Self) extends AnyVal {
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
    def setHandle(value: Double): Self = this.set("Handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: Double): Self = this.set("Reason", value.asInstanceOf[js.Any])
  }
  
}

