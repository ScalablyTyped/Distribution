package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringCondition extends StObject {
  
  /**
    * The type of comparison to be made when evaluating the string condition.
    */
  var ComparisonType: js.UndefOr[StringComparisonType] = js.undefined
  
  /**
    * The name of the field in the string condition.
    */
  var FieldName: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the string.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object StringCondition {
  
  inline def apply(): StringCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringCondition] (val x: Self) extends AnyVal {
    
    inline def setComparisonType(value: StringComparisonType): Self = StObject.set(x, "ComparisonType", value.asInstanceOf[js.Any])
    
    inline def setComparisonTypeUndefined: Self = StObject.set(x, "ComparisonType", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "FieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "FieldName", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
