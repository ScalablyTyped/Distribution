package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The key of a filter.
    */
  var Key: FilterKey
  
  /**
    * The values of a filter.
    */
  var Values: FilterValueList
}
object Filter {
  
  @scala.inline
  def apply(Key: FilterKey, Values: FilterValueList): Filter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: FilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: FilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
