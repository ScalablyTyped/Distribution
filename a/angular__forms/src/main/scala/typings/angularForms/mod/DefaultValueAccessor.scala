package typings.angularForms.mod

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "DefaultValueAccessor")
@js.native
class DefaultValueAccessor protected () extends ControlValueAccessor {
  def this(_renderer: Renderer2, _elementRef: ElementRef[_], _compositionMode: Boolean) = this()
  
  /** Whether the user is creating a composition string (IME events). */
  var _composing: js.Any = js.native
  
  var _compositionMode: js.Any = js.native
  
  var _elementRef: js.Any = js.native
  
  var _renderer: js.Any = js.native
  
  /**
    * The registered callback function called when an input event occurs on the input element.
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
  def registerOnChange(fn: js.Function1[/* _ */ js.Any, Unit]): Unit = js.native
  
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
  def setDisabledState_MDefaultValueAccessor(isDisabled: Boolean): Unit = js.native
}
