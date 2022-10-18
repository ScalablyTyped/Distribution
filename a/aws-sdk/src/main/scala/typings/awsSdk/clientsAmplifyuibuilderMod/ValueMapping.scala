package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueMapping extends StObject {
  
  /**
    * The value to display for the complex object.
    */
  var displayValue: js.UndefOr[FormInputValueProperty] = js.undefined
  
  /**
    * The complex object.
    */
  var value: FormInputValueProperty
}
object ValueMapping {
  
  inline def apply(value: FormInputValueProperty): ValueMapping = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueMapping]
  }
  
  extension [Self <: ValueMapping](x: Self) {
    
    inline def setDisplayValue(value: FormInputValueProperty): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
    
    inline def setValue(value: FormInputValueProperty): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
