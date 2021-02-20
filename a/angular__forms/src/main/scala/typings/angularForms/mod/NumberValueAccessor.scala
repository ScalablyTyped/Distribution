package typings.angularForms.mod

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "NumberValueAccessor")
@js.native
class NumberValueAccessor protected () extends ControlValueAccessor {
  def this(_renderer: Renderer2, _elementRef: ElementRef[_]) = this()
  
  var _elementRef: js.Any = js.native
  
  var _renderer: js.Any = js.native
  
  /**
    * The registered callback function called when a change or input event occurs on the input
    * element.
    * @nodoc
    */
  def onChange(_underscore: js.Any): Unit = js.native
  
  /**
    * The registered callback function called when a blur event occurs on the input element.
    * @nodoc
    */
  def onTouched(): Unit = js.native
  
  /**
    * Registers a function called when the control value changes.
    * @nodoc
    */
  def registerOnChange(fn: js.Function1[/* _ */ Double | Null, Unit]): Unit = js.native
  
  /**
    * Registers a function called when the control is touched.
    * @nodoc
    */
  def registerOnTouched(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Sets the "disabled" property on the input element.
    * @nodoc
    */
  @JSName("setDisabledState")
  def setDisabledState_MNumberValueAccessor(isDisabled: Boolean): Unit = js.native
  
  /**
    * Sets the "value" property on the input element.
    * @nodoc
    */
  def writeValue(value: Double): Unit = js.native
}
