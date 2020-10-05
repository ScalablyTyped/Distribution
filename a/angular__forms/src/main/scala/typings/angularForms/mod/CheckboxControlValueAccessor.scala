package typings.angularForms.mod

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "CheckboxControlValueAccessor")
@js.native
class CheckboxControlValueAccessor protected () extends ControlValueAccessor {
  def this(_renderer: Renderer2, _elementRef: ElementRef[_]) = this()
  var _elementRef: js.Any = js.native
  var _renderer: js.Any = js.native
  /**
    * @description
    * The registered callback function called when a change event occurs on the input element.
    */
  def onChange(_underscore: js.Any): Unit = js.native
  /**
    * @description
    * The registered callback function called when a blur event occurs on the input element.
    */
  def onTouched(): Unit = js.native
  /**
    * @description
    * Registers a function called when the control value changes.
    *
    * @param fn The callback function
    */
  def registerOnChange(fn: js.Function1[/* _ */ js.Any, js.Object]): Unit = js.native
  /**
    * @description
    * Registers a function called when the control is touched.
    *
    * @param fn The callback function
    */
  def registerOnTouched(fn: js.Function0[js.Object]): Unit = js.native
  /**
    * Sets the "disabled" property on the input element.
    *
    * @param isDisabled The disabled value
    */
  @JSName("setDisabledState")
  def setDisabledState_MCheckboxControlValueAccessor(isDisabled: Boolean): Unit = js.native
}

