package typings.angularForms.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for all ControlValueAccessor classes defined in Forms package.
  * Contains common logic and utility functions.
  *
  * Note: this is an *internal-only* class and should not be extended or used directly in
  * applications code.
  */
trait BaseControlValueAccessor extends StObject {
  
  /* private */ var _elementRef: Any
  
  /* private */ var _renderer: Any
  
  /**
    * The registered callback function called when a change or input event occurs on the input
    * element.
    * @nodoc
    */
  def onChange(_underscore: Any): Unit
  
  /**
    * The registered callback function called when a blur event occurs on the input element.
    * @nodoc
    */
  def onTouched(): Unit
  
  /**
    * Registers a function called when the control value changes.
    * @nodoc
    */
  def registerOnChange(fn: js.Function1[/* _ */ Any, js.Object]): Unit
  
  /**
    * Registers a function called when the control is touched.
    * @nodoc
    */
  def registerOnTouched(fn: js.Function0[Unit]): Unit
  
  /**
    * Sets the "disabled" property on the range input element.
    * @nodoc
    */
  def setDisabledState(isDisabled: Boolean): Unit
  
  /**
    * Helper method that sets a property on a target element using the current Renderer
    * implementation.
    * @nodoc
    */
  /* protected */ def setProperty(key: String, value: Any): Unit
}
object BaseControlValueAccessor {
  
  inline def apply(
    _elementRef: Any,
    _renderer: Any,
    onChange: Any => Unit,
    onTouched: () => Unit,
    registerOnChange: js.Function1[/* _ */ Any, js.Object] => Unit,
    registerOnTouched: js.Function0[Unit] => Unit,
    setDisabledState: Boolean => Unit,
    setProperty: (String, Any) => Unit
  ): BaseControlValueAccessor = {
    val __obj = js.Dynamic.literal(_elementRef = _elementRef.asInstanceOf[js.Any], _renderer = _renderer.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onTouched = js.Any.fromFunction0(onTouched), registerOnChange = js.Any.fromFunction1(registerOnChange), registerOnTouched = js.Any.fromFunction1(registerOnTouched), setDisabledState = js.Any.fromFunction1(setDisabledState), setProperty = js.Any.fromFunction2(setProperty))
    __obj.asInstanceOf[BaseControlValueAccessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseControlValueAccessor] (val x: Self) extends AnyVal {
    
    inline def setOnChange(value: Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnTouched(value: () => Unit): Self = StObject.set(x, "onTouched", js.Any.fromFunction0(value))
    
    inline def setRegisterOnChange(value: js.Function1[/* _ */ Any, js.Object] => Unit): Self = StObject.set(x, "registerOnChange", js.Any.fromFunction1(value))
    
    inline def setRegisterOnTouched(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "registerOnTouched", js.Any.fromFunction1(value))
    
    inline def setSetDisabledState(value: Boolean => Unit): Self = StObject.set(x, "setDisabledState", js.Any.fromFunction1(value))
    
    inline def setSetProperty(value: (String, Any) => Unit): Self = StObject.set(x, "setProperty", js.Any.fromFunction2(value))
    
    inline def set_elementRef(value: Any): Self = StObject.set(x, "_elementRef", value.asInstanceOf[js.Any])
    
    inline def set_renderer(value: Any): Self = StObject.set(x, "_renderer", value.asInstanceOf[js.Any])
  }
}
