package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEnum
  extends StObject
     with AnyNestedObject {
  
  /** Enum options */
  var options: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /** Enum values */
  var values: StringDictionary[Double]
}
object IEnum {
  
  inline def apply(values: StringDictionary[Double]): IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEnum] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setValues(value: StringDictionary[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
