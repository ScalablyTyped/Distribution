package typings.angularForms.mod

import typings.angularCore.mod.OnChanges
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "PatternValidator")
@js.native
class PatternValidator ()
  extends Validator
     with OnChanges {
  
  var _createValidator: js.Any = js.native
  
  var _onChange: js.Any = js.native
  
  var _validator: js.Any = js.native
  
  /**
    * @description
    * Tracks changes to the pattern bound to this directive.
    */
  var pattern: String | RegExp = js.native
  
  /**
    * Registers a callback function to call when the validator inputs change.
    * @nodoc
    */
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MPatternValidator(fn: js.Function0[Unit]): Unit = js.native
}
