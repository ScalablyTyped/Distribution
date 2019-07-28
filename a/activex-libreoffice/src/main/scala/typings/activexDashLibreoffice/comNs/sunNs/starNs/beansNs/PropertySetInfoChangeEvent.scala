package typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
    val __obj = js.Dynamic.literal(Handle = Handle, Name = Name, Reason = Reason, Source = Source)
  
    __obj.asInstanceOf[PropertySetInfoChangeEvent]
  }
}

