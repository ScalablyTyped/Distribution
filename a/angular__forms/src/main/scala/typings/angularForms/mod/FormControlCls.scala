package typings.angularForms.mod

import typings.angularForms.anon.FormControlOptionsinitial
import typings.angularForms.anon.FormControlOptionsnonNull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("@angular/forms", "FormControl")
@js.native
open class FormControlCls[T] protected () extends FormControl[T] {
  def this(value: T, opts: FormControlOptionsinitial) = this()
  def this(value: T, opts: FormControlOptionsnonNull) = this()
  /**
    * @deprecated Use `nonNullable` instead.
    */
  def this(value: FormControlState[T], opts: FormControlOptionsinitial) = this()
  /**
    * Creates a new `FormControl` instance.
    *
    * @param formState Initializes the control with an initial value,
    * or an object that defines the initial value and disabled state.
    *
    * @param validatorOrOpts A synchronous validator function, or an array of
    * such functions, or a `FormControlOptions` object that contains validation functions
    * and a validation trigger.
    *
    * @param asyncValidator A single async validator or array of async validator functions
    */
  def this(value: FormControlState[T], opts: FormControlOptionsnonNull) = this()
}
