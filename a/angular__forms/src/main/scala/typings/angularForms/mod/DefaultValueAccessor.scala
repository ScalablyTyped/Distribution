package typings.angularForms.mod

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.anon.Optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.angularForms.mod.ControlValueAccessor because var conflicts: setDisabledState. Inlined writeValue */ @JSImport("@angular/forms", "DefaultValueAccessor")
@js.native
open class DefaultValueAccessor protected ()
  extends StObject
     with BaseControlValueAccessor {
  def this(renderer: Renderer2, elementRef: ElementRef[Any], _compositionMode: Boolean) = this()
  
  /** Whether the user is creating a composition string (IME events). */
  /* private */ var _composing: Any = js.native
  
  /* private */ var _compositionMode: Any = js.native
  
  /* private */ /* CompleteClass */
  var _elementRef: Any = js.native
  
  /* private */ /* CompleteClass */
  var _renderer: Any = js.native
  
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
  
  /**
    * Helper method that sets a property on a target element using the current Renderer
    * implementation.
    * @nodoc
    */
  /* protected */ /* CompleteClass */
  override def setProperty(key: String, value: Any): Unit = js.native
  
  /**
    * Sets the "value" property on the input element.
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
object DefaultValueAccessor {
  
  @JSImport("@angular/forms", "DefaultValueAccessor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "DefaultValueAccessor.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    DefaultValueAccessor, 
    /* input:not([type=checkbox])[formControlName],textarea[formControlName],input:not([type=checkbox])[formControl],textarea[formControl],input:not([type=checkbox])[ngModel],textarea[ngModel],[ngDefaultControl] */ String, 
    scala.Nothing, 
    js.Object, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    false, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      DefaultValueAccessor, 
      /* input:not([type=checkbox])[formControlName],textarea[formControlName],input:not([type=checkbox])[formControl],textarea[formControl],input:not([type=checkbox])[ngModel],textarea[ngModel],[ngDefaultControl] */ String, 
      scala.Nothing, 
      js.Object, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      false, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "DefaultValueAccessor.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[DefaultValueAccessor, js.Tuple3[Null, Null, Optional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[DefaultValueAccessor, js.Tuple3[Null, Null, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
