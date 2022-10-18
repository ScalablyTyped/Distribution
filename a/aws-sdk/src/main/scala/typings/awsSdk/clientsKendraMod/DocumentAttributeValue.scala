package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentAttributeValue extends StObject {
  
  /**
    * A date expressed as an ISO 8601 string. It is important for the time zone to be included in the ISO 8601 date-time format. For example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at 12:30PM (plus 10 seconds) in Central European Time.
    */
  var DateValue: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A long integer value.
    */
  var LongValue: js.UndefOr[Long] = js.undefined
  
  /**
    * A list of strings. 
    */
  var StringListValue: js.UndefOr[DocumentAttributeStringListValue] = js.undefined
  
  /**
    * A string, such as "department".
    */
  var StringValue: js.UndefOr[DocumentAttributeStringValue] = js.undefined
}
object DocumentAttributeValue {
  
  inline def apply(): DocumentAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAttributeValue]
  }
  
  extension [Self <: DocumentAttributeValue](x: Self) {
    
    inline def setDateValue(value: js.Date): Self = StObject.set(x, "DateValue", value.asInstanceOf[js.Any])
    
    inline def setDateValueUndefined: Self = StObject.set(x, "DateValue", js.undefined)
    
    inline def setLongValue(value: Long): Self = StObject.set(x, "LongValue", value.asInstanceOf[js.Any])
    
    inline def setLongValueUndefined: Self = StObject.set(x, "LongValue", js.undefined)
    
    inline def setStringListValue(value: DocumentAttributeStringListValue): Self = StObject.set(x, "StringListValue", value.asInstanceOf[js.Any])
    
    inline def setStringListValueUndefined: Self = StObject.set(x, "StringListValue", js.undefined)
    
    inline def setStringListValueVarargs(value: String*): Self = StObject.set(x, "StringListValue", js.Array(value*))
    
    inline def setStringValue(value: DocumentAttributeStringValue): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
