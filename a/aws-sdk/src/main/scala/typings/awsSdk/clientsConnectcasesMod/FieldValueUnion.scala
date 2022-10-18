package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldValueUnion extends StObject {
  
  /**
    * Can be either null, or have a Boolean value type. Only one value can be provided.
    */
  var booleanValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Can be either null, or have a Double number value type. Only one value can be provided.
    */
  var doubleValue: js.UndefOr[Double] = js.undefined
  
  /**
    * String value type.
    */
  var stringValue: js.UndefOr[FieldValueUnionStringValueString] = js.undefined
}
object FieldValueUnion {
  
  inline def apply(): FieldValueUnion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldValueUnion]
  }
  
  extension [Self <: FieldValueUnion](x: Self) {
    
    inline def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setStringValue(value: FieldValueUnionStringValueString): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
