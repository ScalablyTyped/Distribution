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
trait PropertySetInfoChangeEvent extends EventObject {
  /**
    * contains the implementation handle for the property.
    *
    * May be -1 if the implementation has no handle.
    */
  var Handle: Double
  /** contains the name of the property. */
  var Name: String
  /**
    * contains the reason for the event.
    * @see PropertySetInfoChange
    */
  var Reason: Double
}

object PropertySetInfoChangeEvent {
  @scala.inline
  def apply(Handle: Double, Name: String, Reason: Double, Source: XInterface): PropertySetInfoChangeEvent = {
    val __obj = js.Dynamic.literal(Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertySetInfoChangeEvent]
  }
}

