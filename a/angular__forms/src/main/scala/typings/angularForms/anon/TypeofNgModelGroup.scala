package typings.angularForms.anon

import org.scalablytyped.runtime.Instantiable3
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.`[ngModelGroup]`
import typings.angularForms.angularFormsStrings.ngModelGroup
import typings.angularForms.mod.AsyncValidator
import typings.angularForms.mod.AsyncValidatorFn
import typings.angularForms.mod.ControlContainer
import typings.angularForms.mod.NgModelGroup
import typings.angularForms.mod.Validator
import typings.angularForms.mod.ValidatorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNgModelGroup
  extends StObject
     with Instantiable3[
      /* parent */ ControlContainer, 
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      NgModelGroup
    ] {
  
  var ɵdir: ɵɵDirectiveDeclaration[
    NgModelGroup, 
    `[ngModelGroup]`, 
    js.Array[ngModelGroup], 
    Name8, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`, 
    scala.Nothing
  ] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[NgModelGroup, js.Tuple3[SkipSelf, Self, Self]] = js.native
}
