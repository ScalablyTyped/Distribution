package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait PropertyChangeEvent
  extends StObject
     with EventObject {
  
  /** contains `TRUE` if further events in the same transaction occur. */
  var Further: Boolean
  
  /** contains the new value of the property. */
  var NewValue: js.Any
  
  /** contains the old value of the property. */
  var OldValue: js.Any
  
  /**
    * contains the implementation handle for the property.
    *
    * May be -1 if the implementation has no handle. You can use this handle to get values from the {@link XFastPropertySet} .
    */
  var PropertyHandle: Double
  
  /** contains the unique name of the property which changes its value. */
  var PropertyName: String
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
  implicit class PropertyChangeEventMutableBuilder[Self <: PropertyChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFurther(value: Boolean): Self = StObject.set(x, "Further", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: js.Any): Self = StObject.set(x, "NewValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: js.Any): Self = StObject.set(x, "OldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyHandle(value: Double): Self = StObject.set(x, "PropertyHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "PropertyName", value.asInstanceOf[js.Any])
  }
}
