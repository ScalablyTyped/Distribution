package typings.angularForms.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.angularForms.anon.FormControlOptionsinitial
import typings.angularForms.anon.FormControlOptionsnonNull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵFormControlCtor
  extends StObject
     with /**
  * @deprecated Use `nonNullable` instead.
  */
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
Instantiable2[
      (/* value */ FormControlState[js.Object]) | (/* value */ js.Object), 
      (/* validatorOrOpts */ js.Array[ValidatorFn]) | (/* validatorOrOpts */ FormControlOptions) | (/* opts */ FormControlOptionsinitial) | (/* opts */ FormControlOptionsnonNull) | (/* validatorOrOpts */ ValidatorFn), 
      FormControl[Null | js.Object]
    ]
     with /**
  * @deprecated When passing an `options` argument, the `asyncValidator` argument has no effect.
  */
Instantiable3[
      (/* value */ FormControlState[js.Object]) | (/* value */ js.Object), 
      (/* validatorOrOpts */ js.Array[ValidatorFn]) | (/* opts */ FormControlOptions) | (/* validatorOrOpts */ Null) | (/* validatorOrOpts */ Unit) | (/* validatorOrOpts */ ValidatorFn), 
      (/* asyncValidator */ js.Array[AsyncValidatorFn]) | (/* asyncValidator */ AsyncValidatorFn), 
      FormControl[Null | js.Object]
    ]
     with /**
  * Construct a FormControl with no initial value or validators.
  */
Instantiable0[FormControl[Any]]
     with Instantiable1[
      (/* value */ FormControlState[js.Object]) | (/* value */ js.Object), 
      FormControl[Null | js.Object]
    ]
