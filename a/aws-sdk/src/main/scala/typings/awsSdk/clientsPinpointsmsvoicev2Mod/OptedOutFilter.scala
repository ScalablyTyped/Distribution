package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptedOutFilter extends StObject {
  
  /**
    * The name of the attribute to filter on.
    */
  var Name: OptedOutFilterName
  
  /**
    * An array of values to filter for.
    */
  var Values: FilterValueList
}
object OptedOutFilter {
  
  inline def apply(Name: OptedOutFilterName, Values: FilterValueList): OptedOutFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptedOutFilter]
  }
  
  extension [Self <: OptedOutFilter](x: Self) {
    
    inline def setName(value: OptedOutFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
