package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the interface for a single control in an {@link ObjectInspector}
  * @since OOo 2.0.3
  */
trait XPropertyControl extends js.Object {
  /**
    * specifies the context of the control within the {@link ObjectInspector} .
    *
    * The property control should actively notify its state changes to the context. In particular, changes in the focus and the value of the control must be
    * notified.
    */
  var ControlContext: XPropertyControlContext
  /** denotes the type of the control, as one of the {@link PropertyControlType} constants */
  var ControlType: scala.Double
  /**
    * denotes the window which is the real UI representation of the property control.
    *
    * The {@link ObjectInspector} will automatically position and size this control as needed, care for its Z-order, and so on.
    *
    * This Window must not be `NULL` , else the whole control is not usable.
    */
  var ControlWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * denotes the current content of the control.
    *
    * At every point in time, this value is either `VOID` , or of the type described by {@link ValueType} .
    * @throws com::sun::star::beans::IllegalTypeException if an attempt is made to set a value which is not `VOID` and whose type does not equal {@link ValueType} .
    */
  var Value: js.Any
  /**
    * denotes the value type of the control.
    * @see Value
    */
  var ValueType: activexDashLibreofficeLib.`type`
  /**
    * determines whether the control content is currently modified
    *
    * An {@link XPropertyControl} internally manages a flag indicating whether its content is modified. This flag is reset to `FALSE` every time our {@link
    * ControlContext} is notified of our current value. Also, the control implementation must set this flag to `TRUE` if and only if the user changed the
    * control content.
    * @see notifyModifiedValue
    * @see ControlContext
    * @see XPropertyControlContext.valueChanged
    */
  def isModified(): scala.Boolean
  /**
    * notifies the context in which the control lives of the current control value, if this value is currently modified
    * @see isModified
    * @see ControlContext
    * @see XPropertyControlListener.valueChanged
    */
  def notifyModifiedValue(): scala.Unit
}

object XPropertyControl {
  @scala.inline
  def apply(
    ControlContext: XPropertyControlContext,
    ControlType: scala.Double,
    ControlWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    Value: js.Any,
    ValueType: activexDashLibreofficeLib.`type`,
    isModified: js.Function0[scala.Boolean],
    notifyModifiedValue: js.Function0[scala.Unit]
  ): XPropertyControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ControlContext")(ControlContext)
    __obj.updateDynamic("ControlType")(ControlType)
    __obj.updateDynamic("ControlWindow")(ControlWindow)
    __obj.updateDynamic("Value")(Value)
    __obj.updateDynamic("ValueType")(ValueType)
    __obj.updateDynamic("isModified")(isModified)
    __obj.updateDynamic("notifyModifiedValue")(notifyModifiedValue)
    __obj.asInstanceOf[XPropertyControl]
  }
}

