package typings.angularForms.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description
  * Class used by Angular to track radio buttons. For internal use only.
  */
trait RadioControlRegistry extends StObject {
  
  /* private */ var _accessors: Any
  
  /* private */ var _isSameGroup: Any
  
  /**
    * @description
    * Adds a control to the internal registry. For internal use only.
    */
  def add(control: NgControl, accessor: RadioControlValueAccessor): Unit
  
  /**
    * @description
    * Removes a control from the internal registry. For internal use only.
    */
  def remove(accessor: RadioControlValueAccessor): Unit
  
  /**
    * @description
    * Selects a radio button. For internal use only.
    */
  def select(accessor: RadioControlValueAccessor): Unit
}
object RadioControlRegistry {
  
  inline def apply(
    _accessors: Any,
    _isSameGroup: Any,
    add: (NgControl, RadioControlValueAccessor) => Unit,
    remove: RadioControlValueAccessor => Unit,
    select: RadioControlValueAccessor => Unit
  ): RadioControlRegistry = {
    val __obj = js.Dynamic.literal(_accessors = _accessors.asInstanceOf[js.Any], _isSameGroup = _isSameGroup.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), remove = js.Any.fromFunction1(remove), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[RadioControlRegistry]
  }
  
  extension [Self <: RadioControlRegistry](x: Self) {
    
    inline def setAdd(value: (NgControl, RadioControlValueAccessor) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setRemove(value: RadioControlValueAccessor => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSelect(value: RadioControlValueAccessor => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def set_accessors(value: Any): Self = StObject.set(x, "_accessors", value.asInstanceOf[js.Any])
    
    inline def set_isSameGroup(value: Any): Self = StObject.set(x, "_isSameGroup", value.asInstanceOf[js.Any])
  }
}
