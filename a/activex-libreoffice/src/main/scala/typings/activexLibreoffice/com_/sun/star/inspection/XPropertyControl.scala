package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the interface for a single control in an {@link ObjectInspector}
  * @since OOo 2.0.3
  */
trait XPropertyControl extends StObject {
  
  /**
    * specifies the context of the control within the {@link ObjectInspector} .
    *
    * The property control should actively notify its state changes to the context. In particular, changes in the focus and the value of the control must be
    * notified.
    */
  var ControlContext: XPropertyControlContext
  
  /** denotes the type of the control, as one of the {@link PropertyControlType} constants */
  var ControlType: Double
  
  /**
    * denotes the window which is the real UI representation of the property control.
    *
    * The {@link ObjectInspector} will automatically position and size this control as needed, care for its Z-order, and so on.
    *
    * This Window must not be `NULL` , else the whole control is not usable.
    */
  var ControlWindow: XWindow
  
  /**
    * denotes the current content of the control.
    *
    * At every point in time, this value is either `VOID` , or of the type described by {@link ValueType} .
    * @throws com::sun::star::beans::IllegalTypeException if an attempt is made to set a value which is not `VOID` and whose type does not equal {@link ValueType} .
    */
  var Value: Any
  
  /**
    * denotes the value type of the control.
    * @see Value
    */
  var ValueType: `type`
  
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
  def isModified(): Boolean
  
  /**
    * notifies the context in which the control lives of the current control value, if this value is currently modified
    * @see isModified
    * @see ControlContext
    * @see XPropertyControlListener.valueChanged
    */
  def notifyModifiedValue(): Unit
}
object XPropertyControl {
  
  inline def apply(
    ControlContext: XPropertyControlContext,
    ControlType: Double,
    ControlWindow: XWindow,
    Value: Any,
    ValueType: `type`,
    isModified: () => Boolean,
    notifyModifiedValue: () => Unit
  ): XPropertyControl = {
    val __obj = js.Dynamic.literal(ControlContext = ControlContext.asInstanceOf[js.Any], ControlType = ControlType.asInstanceOf[js.Any], ControlWindow = ControlWindow.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], isModified = js.Any.fromFunction0(isModified), notifyModifiedValue = js.Any.fromFunction0(notifyModifiedValue))
    __obj.asInstanceOf[XPropertyControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPropertyControl] (val x: Self) extends AnyVal {
    
    inline def setControlContext(value: XPropertyControlContext): Self = StObject.set(x, "ControlContext", value.asInstanceOf[js.Any])
    
    inline def setControlType(value: Double): Self = StObject.set(x, "ControlType", value.asInstanceOf[js.Any])
    
    inline def setControlWindow(value: XWindow): Self = StObject.set(x, "ControlWindow", value.asInstanceOf[js.Any])
    
    inline def setIsModified(value: () => Boolean): Self = StObject.set(x, "isModified", js.Any.fromFunction0(value))
    
    inline def setNotifyModifiedValue(value: () => Unit): Self = StObject.set(x, "notifyModifiedValue", js.Any.fromFunction0(value))
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueType(value: `type`): Self = StObject.set(x, "ValueType", value.asInstanceOf[js.Any])
  }
}
