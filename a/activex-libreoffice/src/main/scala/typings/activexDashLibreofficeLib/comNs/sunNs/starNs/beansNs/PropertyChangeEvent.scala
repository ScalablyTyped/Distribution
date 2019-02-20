package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gets delivered whenever a "bound" or "constrained" property is changed.
  *
  * A {@link PropertyChangeEvent} object is sent as an argument to the methods of {@link XPropertyChangeListener} and {@link XVetoableChangeListener} .
  *
  * Normally such events contain the name and the old and new value of the changed property.
  *
  * Void values may be provided for the old and new values if their true values are not known.
  */
trait PropertyChangeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** contains `TRUE` if further events in the same transaction occur. */
  var Further: scala.Boolean
  /** contains the new value of the property. */
  var NewValue: js.Any
  /** contains the old value of the property. */
  var OldValue: js.Any
  /**
    * contains the implementation handle for the property.
    *
    * May be -1 if the implementation has no handle. You can use this handle to get values from the {@link XFastPropertySet} .
    */
  var PropertyHandle: scala.Double
  /** contains the unique name of the property which changes its value. */
  var PropertyName: java.lang.String
}

