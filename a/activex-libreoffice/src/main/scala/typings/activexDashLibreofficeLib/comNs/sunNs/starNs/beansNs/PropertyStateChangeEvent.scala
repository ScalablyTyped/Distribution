package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is delivered whenever the state of a "bound" property is changed.
  *
  * It is sent as an argument to the method of {@link XPropertyStateChangeListener} .
  *
  * Normally these events are accompanied by the name, and the old and new values of the changed property.
  *
  * Void values may be provided for the old and new values if their true values are not known.
  */
trait PropertyStateChangeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** contains the new value of the property. */
  var NewValue: PropertyState
  /** contains the old value of the property. */
  var OldValue: PropertyState
  /**
    * contains the implementation handle for the property.
    *
    * It may be -1 if the implementation has no handle. You can use this handle to get values from the {@link XFastPropertySet} interface.
    */
  var PropertyHandle: scala.Double
  /**
    * specifies the name of the property which changes its value.
    *
    * This name identifies the property uniquely within an {@link XPropertySet} . Upper and lower case are distinguished.
    */
  var PropertyName: java.lang.String
}

object PropertyStateChangeEvent {
  @scala.inline
  def apply(
    NewValue: PropertyState,
    OldValue: PropertyState,
    PropertyHandle: scala.Double,
    PropertyName: java.lang.String,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): PropertyStateChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("NewValue")(NewValue)
    __obj.updateDynamic("OldValue")(OldValue)
    __obj.updateDynamic("PropertyHandle")(PropertyHandle)
    __obj.updateDynamic("PropertyName")(PropertyName)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[PropertyStateChangeEvent]
  }
}

