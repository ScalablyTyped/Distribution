package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gets delivered whenever a "bound" or "constrained" property is changed.
  *
  * A {@link PropertyChangeEvent} object is sent as an argument to the methods of {@link XPropertyChangeListener} and {@link XVetoableChangeListener} .
  *
  * Normally such events contain the name and the old and new value of the changed property.
  *
  * Void values may be provided for the old and new values if their true values are not known.
  */
@js.native
trait PropertyChangeEvent extends EventObject {
  
  /** contains `TRUE` if further events in the same transaction occur. */
  var Further: Boolean = js.native
  
  /** contains the new value of the property. */
  var NewValue: js.Any = js.native
  
  /** contains the old value of the property. */
  var OldValue: js.Any = js.native
  
  /**
    * contains the implementation handle for the property.
    *
    * May be -1 if the implementation has no handle. You can use this handle to get values from the {@link XFastPropertySet} .
    */
  var PropertyHandle: Double = js.native
  
  /** contains the unique name of the property which changes its value. */
  var PropertyName: String = js.native
}
object PropertyChangeEvent {
  
  @scala.inline
  def apply(
    Further: Boolean,
    NewValue: js.Any,
    OldValue: js.Any,
    PropertyHandle: Double,
    PropertyName: String,
    Source: XInterface
  ): PropertyChangeEvent = {
    val __obj = js.Dynamic.literal(Further = Further.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], OldValue = OldValue.asInstanceOf[js.Any], PropertyHandle = PropertyHandle.asInstanceOf[js.Any], PropertyName = PropertyName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangeEvent]
  }
  
  @scala.inline
  implicit class PropertyChangeEventOps[Self <: PropertyChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setFurther(value: Boolean): Self = this.set("Further", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: js.Any): Self = this.set("NewValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("OldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyHandle(value: Double): Self = this.set("PropertyHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("PropertyName", value.asInstanceOf[js.Any])
  }
}
