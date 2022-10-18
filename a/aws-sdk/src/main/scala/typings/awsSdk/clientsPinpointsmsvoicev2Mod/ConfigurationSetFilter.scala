package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationSetFilter extends StObject {
  
  /**
    * The name of the attribute to filter on.
    */
  var Name: ConfigurationSetFilterName
  
  /**
    * An array values to filter for.
    */
  var Values: FilterValueList
}
object ConfigurationSetFilter {
  
  inline def apply(Name: ConfigurationSetFilterName, Values: FilterValueList): ConfigurationSetFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationSetFilter]
  }
  
  extension [Self <: ConfigurationSetFilter](x: Self) {
    
    inline def setName(value: ConfigurationSetFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
