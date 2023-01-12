package typings.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageAttributeValue extends StObject {
  
  /**
    * Not implemented. Reserved for future use.
    */
  var BinaryListValues: js.UndefOr[BinaryList] = js.undefined
  
  /**
    * Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
    */
  var BinaryValue: js.UndefOr[Binary] = js.undefined
  
  /**
    * Amazon SQS supports the following logical data types: String, Number, and Binary. For the Number data type, you must use StringValue. You can also append custom labels. For more information, see Amazon SQS Message Attributes in the Amazon SQS Developer Guide.
    */
  var DataType: String
  
  /**
    * Not implemented. Reserved for future use.
    */
  var StringListValues: js.UndefOr[StringList] = js.undefined
  
  /**
    * Strings are Unicode with UTF-8 binary encoding. For a list of code values, see ASCII Printable Characters.
    */
  var StringValue: js.UndefOr[String] = js.undefined
}
object MessageAttributeValue {
  
  inline def apply(DataType: String): MessageAttributeValue = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttributeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageAttributeValue] (val x: Self) extends AnyVal {
    
    inline def setBinaryListValues(value: BinaryList): Self = StObject.set(x, "BinaryListValues", value.asInstanceOf[js.Any])
    
    inline def setBinaryListValuesUndefined: Self = StObject.set(x, "BinaryListValues", js.undefined)
    
    inline def setBinaryListValuesVarargs(value: Binary*): Self = StObject.set(x, "BinaryListValues", js.Array(value*))
    
    inline def setBinaryValue(value: Binary): Self = StObject.set(x, "BinaryValue", value.asInstanceOf[js.Any])
    
    inline def setBinaryValueUndefined: Self = StObject.set(x, "BinaryValue", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setStringListValues(value: StringList): Self = StObject.set(x, "StringListValues", value.asInstanceOf[js.Any])
    
    inline def setStringListValuesUndefined: Self = StObject.set(x, "StringListValues", js.undefined)
    
    inline def setStringListValuesVarargs(value: String*): Self = StObject.set(x, "StringListValues", js.Array(value*))
    
    inline def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
