package typings.angularForms.mod

import typings.angularForms.anon.EmitEvent
import typings.angularForms.anon.EmitModelToViewChange
import typings.angularForms.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormControl[TValue] extends AbstractControl[TValue, TValue] {
  
  /**
    * The default value of this FormControl, used whenever the control is reset without an explicit
    * value. See {@link FormControlOptions#nonNullable} for more information on configuring
    * a default value.
    */
  val defaultValue: TValue = js.native
  
  def patchValue(value: TValue, options: EmitModelToViewChange): Unit = js.native
  
  /**
    * Register a listener for change events.
    *
    * @param fn The method that is called when the value changes
    */
  def registerOnChange(fn: js.Function): Unit = js.native
  
  /**
    * Register a listener for disabled events.
    *
    * @param fn The method that is called when the disabled status changes.
    */
  def registerOnDisabledChange(fn: js.Function1[/* isDisabled */ Boolean, Unit]): Unit = js.native
  
  def reset(formState: TValue, options: EmitEvent): Unit = js.native
  def reset(formState: Unit, options: EmitEvent): Unit = js.native
  def reset(formState: FormControlState[TValue]): Unit = js.native
  def reset(formState: FormControlState[TValue], options: EmitEvent): Unit = js.native
  
  def setValue(value: TValue, options: EmitModelToViewChange): Unit = js.native
}
object FormControl {
  
  inline def apply: ɵFormControlCtor = ^.asInstanceOf[js.Dynamic].selectDynamic("FormControl").asInstanceOf[ɵFormControlCtor]
}
