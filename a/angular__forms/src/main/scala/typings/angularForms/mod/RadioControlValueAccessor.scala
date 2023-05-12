package typings.angularForms.mod

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Injector
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.angularFormsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.angularForms.mod.ControlValueAccessor because var conflicts: setDisabledState. Inlined writeValue */ @JSImport("@angular/forms", "RadioControlValueAccessor")
@js.native
open class RadioControlValueAccessor protected ()
  extends StObject
     with BaseControlValueAccessor
     with OnDestroy
     with OnInit {
  def this(
    renderer: Renderer2,
    elementRef: ElementRef[Any],
    _registry: RadioControlRegistry,
    _injector: Injector
  ) = this()
  
  /* private */ var _checkName: Any = js.native
  
  /* private */ /* CompleteClass */
  var _elementRef: Any = js.native
  
  /* private */ var _injector: Any = js.native
  
  /* private */ var _registry: Any = js.native
  
  /* private */ /* CompleteClass */
  var _renderer: Any = js.native
  
  /* private */ var callSetDisabledState: Any = js.native
  
  /**
    * Sets the "value" on the radio input element and unchecks it.
    *
    * @param value
    */
  def fireUncheck(value: Any): Unit = js.native
  
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
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  /* CompleteClass */
  override def ngOnInit(): Unit = js.native
  
  /**
    * The registered callback function called when a change event occurs on the input element.
    * Note: we declare `onChange` here (also used as host listener) as a function with no arguments
    * to override the `onChange` function (which expects 1 argument) in the parent
    * `BaseControlValueAccessor` class.
    * @nodoc
    */
  def onChange(): Unit = js.native
  /**
    * The registered callback function called when a change or input event occurs on the input
    * element.
    * @nodoc
    */
  /* CompleteClass */
  override def onChange(_underscore: Any): Unit = js.native
  
  /**
    * The registered callback function called when a blur event occurs on the input element.
    * @nodoc
    */
  /* CompleteClass */
  override def onTouched(): Unit = js.native
  
  /**
    * Registers a function called when the control value changes.
    * @nodoc
    */
  /* CompleteClass */
  override def registerOnChange(fn: js.Function1[/* _ */ Any, js.Object]): Unit = js.native
  
  /**
    * Registers a function called when the control is touched.
    * @nodoc
    */
  /* CompleteClass */
  override def registerOnTouched(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Sets the "disabled" property on the range input element.
    * @nodoc
    */
  /* CompleteClass */
  override def setDisabledState(isDisabled: Boolean): Unit = js.native
  
  /* private */ var setDisabledStateFired: Any = js.native
  
  /**
    * Helper method that sets a property on a target element using the current Renderer
    * implementation.
    * @nodoc
    */
  /* protected */ /* CompleteClass */
  override def setProperty(key: String, value: Any): Unit = js.native
  
  /**
    * @description
    * Tracks the value of the radio input element
    */
  var value: Any = js.native
  
  /**
    * Sets the "checked" property value on the radio input element.
    * @nodoc
    */
  /**
    * @description
    * Writes a new value to the element.
    *
    * This method is called by the forms API to write to the view when programmatic
    * changes from model to view are requested.
    *
    * @usageNotes
    * ### Write a value to the element
    *
    * The following example writes a value to the native DOM element.
    *
    * ```ts
    * writeValue(value: any): void {
    *   this._renderer.setProperty(this._elementRef.nativeElement, 'value', value);
    * }
    * ```
    *
    * @param obj The new value for the element
    */
  def writeValue(value: Any): Unit = js.native
}
/* static members */
object RadioControlValueAccessor {
  
  @JSImport("@angular/forms", "RadioControlValueAccessor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "RadioControlValueAccessor.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    RadioControlValueAccessor, 
    /* input[type=radio][formControlName],input[type=radio][formControl],input[type=radio][ngModel] */ String, 
    scala.Nothing, 
    typings.angularForms.anon.FormControlName, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      RadioControlValueAccessor, 
      /* input[type=radio][formControlName],input[type=radio][formControl],input[type=radio][ngModel] */ String, 
      scala.Nothing, 
      typings.angularForms.anon.FormControlName, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "RadioControlValueAccessor.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[RadioControlValueAccessor, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[RadioControlValueAccessor, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
