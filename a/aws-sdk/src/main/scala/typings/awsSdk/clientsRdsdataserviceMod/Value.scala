package typings.awsSdk.clientsRdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  /**
    * An array of column values.
    */
  var arrayValues: js.UndefOr[ArrayValueList] = js.undefined
  
  /**
    * A value for a column of big integer data type.
    */
  var bigIntValue: js.UndefOr[BoxedLong] = js.undefined
  
  /**
    * A value for a column of BIT data type.
    */
  var bitValue: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * A value for a column of BLOB data type.
    */
  var blobValue: js.UndefOr[_Blob] = js.undefined
  
  /**
    * A value for a column of double data type.
    */
  var doubleValue: js.UndefOr[BoxedDouble] = js.undefined
  
  /**
    * A value for a column of integer data type.
    */
  var intValue: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * A NULL value.
    */
  var isNull: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * A value for a column of real data type.
    */
  var realValue: js.UndefOr[BoxedFloat] = js.undefined
  
  /**
    * A value for a column of string data type.
    */
  var stringValue: js.UndefOr[String] = js.undefined
  
  /**
    * A value for a column of STRUCT data type.
    */
  var structValue: js.UndefOr[StructValue] = js.undefined
}
object Value {
  
  inline def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setArrayValues(value: ArrayValueList): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
    
    inline def setArrayValuesUndefined: Self = StObject.set(x, "arrayValues", js.undefined)
    
    inline def setArrayValuesVarargs(value: Value*): Self = StObject.set(x, "arrayValues", js.Array(value*))
    
    inline def setBigIntValue(value: BoxedLong): Self = StObject.set(x, "bigIntValue", value.asInstanceOf[js.Any])
    
    inline def setBigIntValueUndefined: Self = StObject.set(x, "bigIntValue", js.undefined)
    
    inline def setBitValue(value: BoxedBoolean): Self = StObject.set(x, "bitValue", value.asInstanceOf[js.Any])
    
    inline def setBitValueUndefined: Self = StObject.set(x, "bitValue", js.undefined)
    
    inline def setBlobValue(value: _Blob): Self = StObject.set(x, "blobValue", value.asInstanceOf[js.Any])
    
    inline def setBlobValueUndefined: Self = StObject.set(x, "blobValue", js.undefined)
    
    inline def setDoubleValue(value: BoxedDouble): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setIntValue(value: BoxedInteger): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    inline def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    inline def setIsNull(value: BoxedBoolean): Self = StObject.set(x, "isNull", value.asInstanceOf[js.Any])
    
    inline def setIsNullUndefined: Self = StObject.set(x, "isNull", js.undefined)
    
    inline def setRealValue(value: BoxedFloat): Self = StObject.set(x, "realValue", value.asInstanceOf[js.Any])
    
    inline def setRealValueUndefined: Self = StObject.set(x, "realValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setStructValue(value: StructValue): Self = StObject.set(x, "structValue", value.asInstanceOf[js.Any])
    
    inline def setStructValueUndefined: Self = StObject.set(x, "structValue", js.undefined)
  }
}
