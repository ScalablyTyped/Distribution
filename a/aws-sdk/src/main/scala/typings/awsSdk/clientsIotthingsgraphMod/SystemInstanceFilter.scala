package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInstanceFilter extends StObject {
  
  /**
    * The name of the search filter field.
    */
  var name: js.UndefOr[SystemInstanceFilterName] = js.undefined
  
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search. 
    */
  var value: js.UndefOr[SystemInstanceFilterValues] = js.undefined
}
object SystemInstanceFilter {
  
  inline def apply(): SystemInstanceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInstanceFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInstanceFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: SystemInstanceFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: SystemInstanceFilterValues): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: SystemInstanceFilterValue*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
