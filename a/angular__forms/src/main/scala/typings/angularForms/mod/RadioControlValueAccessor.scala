package typings.angularForms.mod

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Injector
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import typings.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "RadioControlValueAccessor")
@js.native
class RadioControlValueAccessor protected ()
  extends ControlValueAccessor
     with OnDestroy
     with OnInit {
  def this(
    _renderer: Renderer2,
    _elementRef: ElementRef[_],
    _registry: ɵangularPackagesFormsFormsN,
    _injector: Injector
  ) = this()
  var _checkName: js.Any = js.native
  var _elementRef: js.Any = js.native
  var _injector: js.Any = js.native
  var _registry: js.Any = js.native
  var _renderer: js.Any = js.native
  var _throwNameError: js.Any = js.native
  /**
    * @description
    * Tracks the name of the `FormControl` bound to the directive. The name corresponds
    * to a key in the parent `FormGroup` or `FormArray`.
    */
  var formControlName: String = js.native
  /**
    * @description
    * Tracks the name of the radio input element.
    */
  var name: String = js.native
  /**
    * @description
    * Tracks the value of the radio input element
    */
  var value: js.Any = js.native
  /**
    * Sets the "value" on the radio input element and unchecks it.
    *
    * @param value
    */
  def fireUncheck(value: js.Any): Unit = js.native
  /**
    * @description
    * The registered callback function called when a change event occurs on the input element.
    */
  def onChange(): Unit = js.native
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
  def setDisabledState_MRadioControlValueAccessor(isDisabled: Boolean): Unit = js.native
}

