package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeywordFilter extends StObject {
  
  /**
    * The name of the attribute to filter on.
    */
  var Name: KeywordFilterName
  
  /**
    * An array values to filter for.
    */
  var Values: FilterValueList
}
object KeywordFilter {
  
  inline def apply(Name: KeywordFilterName, Values: FilterValueList): KeywordFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeywordFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: KeywordFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
