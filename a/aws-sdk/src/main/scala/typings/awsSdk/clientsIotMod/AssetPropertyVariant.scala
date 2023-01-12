package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetPropertyVariant extends StObject {
  
  /**
    * Optional. A string that contains the boolean value (true or false) of the value entry. Accepts substitution templates.
    */
  var booleanValue: js.UndefOr[AssetPropertyBooleanValue] = js.undefined
  
  /**
    * Optional. A string that contains the double value of the value entry. Accepts substitution templates.
    */
  var doubleValue: js.UndefOr[AssetPropertyDoubleValue] = js.undefined
  
  /**
    * Optional. A string that contains the integer value of the value entry. Accepts substitution templates.
    */
  var integerValue: js.UndefOr[AssetPropertyIntegerValue] = js.undefined
  
  /**
    * Optional. The string value of the value entry. Accepts substitution templates.
    */
  var stringValue: js.UndefOr[AssetPropertyStringValue] = js.undefined
}
object AssetPropertyVariant {
  
  inline def apply(): AssetPropertyVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetPropertyVariant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetPropertyVariant] (val x: Self) extends AnyVal {
    
    inline def setBooleanValue(value: AssetPropertyBooleanValue): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setDoubleValue(value: AssetPropertyDoubleValue): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setIntegerValue(value: AssetPropertyIntegerValue): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setStringValue(value: AssetPropertyStringValue): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
