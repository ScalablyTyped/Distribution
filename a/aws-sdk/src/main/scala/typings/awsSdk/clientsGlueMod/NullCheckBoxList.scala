package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullCheckBoxList extends StObject {
  
  /**
    * Specifies that an empty string is considered as a null value.
    */
  var IsEmpty: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Specifies that an integer value of -1 is considered as a null value.
    */
  var IsNegOne: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Specifies that a value spelling out the word 'null' is considered as a null value.
    */
  var IsNullString: js.UndefOr[BoxedBoolean] = js.undefined
}
object NullCheckBoxList {
  
  inline def apply(): NullCheckBoxList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NullCheckBoxList]
  }
  
  extension [Self <: NullCheckBoxList](x: Self) {
    
    inline def setIsEmpty(value: BoxedBoolean): Self = StObject.set(x, "IsEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsEmptyUndefined: Self = StObject.set(x, "IsEmpty", js.undefined)
    
    inline def setIsNegOne(value: BoxedBoolean): Self = StObject.set(x, "IsNegOne", value.asInstanceOf[js.Any])
    
    inline def setIsNegOneUndefined: Self = StObject.set(x, "IsNegOne", js.undefined)
    
    inline def setIsNullString(value: BoxedBoolean): Self = StObject.set(x, "IsNullString", value.asInstanceOf[js.Any])
    
    inline def setIsNullStringUndefined: Self = StObject.set(x, "IsNullString", js.undefined)
  }
}
