package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemTemplateFilter extends StObject {
  
  /**
    * The name of the system search filter field.
    */
  var name: SystemTemplateFilterName
  
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
    */
  var value: SystemTemplateFilterValues
}
object SystemTemplateFilter {
  
  inline def apply(name: SystemTemplateFilterName, value: SystemTemplateFilterValues): SystemTemplateFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemTemplateFilter]
  }
  
  extension [Self <: SystemTemplateFilter](x: Self) {
    
    inline def setName(value: SystemTemplateFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SystemTemplateFilterValues): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: SystemTemplateFilterValue*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
