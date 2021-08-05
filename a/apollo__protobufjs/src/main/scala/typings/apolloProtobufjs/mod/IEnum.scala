package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEnum
  extends StObject
     with AnyNestedObject {
  
  /** Enum options */
  var options: js.UndefOr[StringDictionary[js.UndefOr[js.Any]]] = js.undefined
  
  /** Enum values */
  var values: StringDictionary[js.UndefOr[Double]]
}
object IEnum {
  
  inline def apply(values: StringDictionary[js.UndefOr[Double]]): IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnum]
  }
  
  extension [Self <: IEnum](x: Self) {
    
    inline def setOptions(value: StringDictionary[js.UndefOr[js.Any]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setValues(value: StringDictionary[js.UndefOr[Double]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
