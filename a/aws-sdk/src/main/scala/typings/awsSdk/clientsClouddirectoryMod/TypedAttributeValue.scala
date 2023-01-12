package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedAttributeValue extends StObject {
  
  /**
    * A binary data value.
    */
  var BinaryValue: js.UndefOr[BinaryAttributeValue] = js.undefined
  
  /**
    * A Boolean data value.
    */
  var BooleanValue: js.UndefOr[BooleanAttributeValue] = js.undefined
  
  /**
    * A date and time value.
    */
  var DatetimeValue: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A number data value.
    */
  var NumberValue: js.UndefOr[NumberAttributeValue] = js.undefined
  
  /**
    * A string data value.
    */
  var StringValue: js.UndefOr[StringAttributeValue] = js.undefined
}
object TypedAttributeValue {
  
  inline def apply(): TypedAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedAttributeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypedAttributeValue] (val x: Self) extends AnyVal {
    
    inline def setBinaryValue(value: BinaryAttributeValue): Self = StObject.set(x, "BinaryValue", value.asInstanceOf[js.Any])
    
    inline def setBinaryValueUndefined: Self = StObject.set(x, "BinaryValue", js.undefined)
    
    inline def setBooleanValue(value: BooleanAttributeValue): Self = StObject.set(x, "BooleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "BooleanValue", js.undefined)
    
    inline def setDatetimeValue(value: js.Date): Self = StObject.set(x, "DatetimeValue", value.asInstanceOf[js.Any])
    
    inline def setDatetimeValueUndefined: Self = StObject.set(x, "DatetimeValue", js.undefined)
    
    inline def setNumberValue(value: NumberAttributeValue): Self = StObject.set(x, "NumberValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValueUndefined: Self = StObject.set(x, "NumberValue", js.undefined)
    
    inline def setStringValue(value: StringAttributeValue): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
