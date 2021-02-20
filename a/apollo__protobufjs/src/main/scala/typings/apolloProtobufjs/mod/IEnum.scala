package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnum extends AnyNestedObject {
  
  /** Enum options */
  var options: js.UndefOr[StringDictionary[js.UndefOr[js.Any]]] = js.native
  
  /** Enum values */
  var values: StringDictionary[js.UndefOr[Double]] = js.native
}
object IEnum {
  
  @scala.inline
  def apply(values: StringDictionary[js.UndefOr[Double]]): IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnum]
  }
  
  @scala.inline
  implicit class IEnumMutableBuilder[Self <: IEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: StringDictionary[js.UndefOr[js.Any]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setValues(value: StringDictionary[js.UndefOr[Double]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
