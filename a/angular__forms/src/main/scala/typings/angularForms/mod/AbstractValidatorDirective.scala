package typings.angularForms.mod

import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.SimpleChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A base class for Validator-based Directives. The class contains common logic shared across such
  * Directives.
  *
  * For internal use only, this class is not intended for use outside of the Forms package.
  */
trait AbstractValidatorDirective
  extends StObject
     with Validator
     with OnChanges {
  
  /* private */ var _onChange: Any
  
  /* private */ var _validator: Any
  
  /**
    * @description
    * Determines whether this validator should be active or not based on an input.
    * Base class implementation checks whether an input is defined (if the value is different from
    * `null` and `undefined`). Validator classes that extend this base class can override this
    * function with the logic specific to a particular validator directive.
    */
  def enabled(input: Any): Boolean
  
  /** @nodoc */
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MAbstractValidatorDirective(fn: js.Function0[Unit]): Unit
}
object AbstractValidatorDirective {
  
  inline def apply(
    _onChange: Any,
    _validator: Any,
    enabled: Any => Boolean,
    ngOnChanges: SimpleChanges => Unit,
    registerOnValidatorChange: js.Function0[Unit] => Unit,
    validate: AbstractControl[Any, Any] => ValidationErrors | Null
  ): AbstractValidatorDirective = {
    val __obj = js.Dynamic.literal(_onChange = _onChange.asInstanceOf[js.Any], _validator = _validator.asInstanceOf[js.Any], enabled = js.Any.fromFunction1(enabled), ngOnChanges = js.Any.fromFunction1(ngOnChanges), registerOnValidatorChange = js.Any.fromFunction1(registerOnValidatorChange), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[AbstractValidatorDirective]
  }
  
  extension [Self <: AbstractValidatorDirective](x: Self) {
    
    inline def setEnabled(value: Any => Boolean): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
    
    inline def setRegisterOnValidatorChange(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "registerOnValidatorChange", js.Any.fromFunction1(value))
    
    inline def set_onChange(value: Any): Self = StObject.set(x, "_onChange", value.asInstanceOf[js.Any])
    
    inline def set_validator(value: Any): Self = StObject.set(x, "_validator", value.asInstanceOf[js.Any])
  }
}
