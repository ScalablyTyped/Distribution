package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeValueList extends StObject {
  
  /**
    * The list of integer values that the filter matches.
    */
  var integerValues: js.UndefOr[IntegerList] = js.undefined
  
  /**
    * The list of string values that the filter matches.
    */
  var stringValues: js.UndefOr[StringList] = js.undefined
}
object AttributeValueList {
  
  inline def apply(): AttributeValueList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValueList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeValueList] (val x: Self) extends AnyVal {
    
    inline def setIntegerValues(value: IntegerList): Self = StObject.set(x, "integerValues", value.asInstanceOf[js.Any])
    
    inline def setIntegerValuesUndefined: Self = StObject.set(x, "integerValues", js.undefined)
    
    inline def setIntegerValuesVarargs(value: Integer*): Self = StObject.set(x, "integerValues", js.Array(value*))
    
    inline def setStringValues(value: StringList): Self = StObject.set(x, "stringValues", value.asInstanceOf[js.Any])
    
    inline def setStringValuesUndefined: Self = StObject.set(x, "stringValues", js.undefined)
    
    inline def setStringValuesVarargs(value: StringListMemberString*): Self = StObject.set(x, "stringValues", js.Array(value*))
  }
}
