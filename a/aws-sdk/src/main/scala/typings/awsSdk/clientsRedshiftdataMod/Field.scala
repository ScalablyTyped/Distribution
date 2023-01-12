package typings.awsSdk.clientsRedshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  /**
    * A value of the BLOB data type. 
    */
  var blobValue: js.UndefOr[_Blob] = js.undefined
  
  /**
    * A value of the Boolean data type. 
    */
  var booleanValue: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * A value of the double data type. 
    */
  var doubleValue: js.UndefOr[BoxedDouble] = js.undefined
  
  /**
    * A value that indicates whether the data is NULL. 
    */
  var isNull: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * A value of the long data type. 
    */
  var longValue: js.UndefOr[BoxedLong] = js.undefined
  
  /**
    * A value of the string data type. 
    */
  var stringValue: js.UndefOr[String] = js.undefined
}
object Field {
  
  inline def apply(): Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    inline def setBlobValue(value: _Blob): Self = StObject.set(x, "blobValue", value.asInstanceOf[js.Any])
    
    inline def setBlobValueUndefined: Self = StObject.set(x, "blobValue", js.undefined)
    
    inline def setBooleanValue(value: BoxedBoolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setDoubleValue(value: BoxedDouble): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setIsNull(value: BoxedBoolean): Self = StObject.set(x, "isNull", value.asInstanceOf[js.Any])
    
    inline def setIsNullUndefined: Self = StObject.set(x, "isNull", js.undefined)
    
    inline def setLongValue(value: BoxedLong): Self = StObject.set(x, "longValue", value.asInstanceOf[js.Any])
    
    inline def setLongValueUndefined: Self = StObject.set(x, "longValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
