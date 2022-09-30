package typings.angularForms.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormControlOptions
  extends StObject
     with AbstractControlOptions {
  
  /**
    * @deprecated Use `nonNullable` instead.
    */
  var initialValueIsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description
    * Whether to use the initial value used to construct the `FormControl` as its default value
    * as well. If this option is false or not provided, the default value of a FormControl is `null`.
    * When a FormControl is reset without an explicit value, its value reverts to
    * its default value.
    */
  var nonNullable: js.UndefOr[Boolean] = js.undefined
}
object FormControlOptions {
  
  inline def apply(): FormControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormControlOptions]
  }
  
  extension [Self <: FormControlOptions](x: Self) {
    
    inline def setInitialValueIsDefault(value: Boolean): Self = StObject.set(x, "initialValueIsDefault", value.asInstanceOf[js.Any])
    
    inline def setInitialValueIsDefaultUndefined: Self = StObject.set(x, "initialValueIsDefault", js.undefined)
    
    inline def setNonNullable(value: Boolean): Self = StObject.set(x, "nonNullable", value.asInstanceOf[js.Any])
    
    inline def setNonNullableUndefined: Self = StObject.set(x, "nonNullable", js.undefined)
  }
}
