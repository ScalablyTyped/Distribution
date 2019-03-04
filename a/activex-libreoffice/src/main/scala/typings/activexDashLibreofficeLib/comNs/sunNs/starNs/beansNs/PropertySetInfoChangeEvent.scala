package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gets delivered whenever an {@link XPropertySetInfo} is changed.
  *
  * A {@link PropertySetInfoChangeEvent} object is sent to XPropertySetInfoChangeListeners.
  */
trait PropertySetInfoChangeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * contains the implementation handle for the property.
    *
    * May be -1 if the implementation has no handle.
    */
  var Handle: scala.Double
  /** contains the name of the property. */
  var Name: java.lang.String
  /**
    * contains the reason for the event.
    * @see PropertySetInfoChange
    */
  var Reason: scala.Double
}

object PropertySetInfoChangeEvent {
  @scala.inline
  def apply(
    Handle: scala.Double,
    Name: java.lang.String,
    Reason: scala.Double,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): PropertySetInfoChangeEvent = {
    val __obj = js.Dynamic.literal(Handle = Handle, Name = Name, Reason = Reason, Source = Source)
  
    __obj.asInstanceOf[PropertySetInfoChangeEvent]
  }
}

