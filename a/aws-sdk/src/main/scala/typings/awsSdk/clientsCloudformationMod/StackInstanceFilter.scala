package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackInstanceFilter extends StObject {
  
  /**
    * The type of filter to apply.
    */
  var Name: js.UndefOr[StackInstanceFilterName] = js.undefined
  
  /**
    * The status to filter by.
    */
  var Values: js.UndefOr[StackInstanceFilterValues] = js.undefined
}
object StackInstanceFilter {
  
  inline def apply(): StackInstanceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackInstanceFilter]
  }
  
  extension [Self <: StackInstanceFilter](x: Self) {
    
    inline def setName(value: StackInstanceFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValues(value: StackInstanceFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
  }
}
