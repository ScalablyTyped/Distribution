package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrollmentFilter extends StObject {
  
  /**
    * The name of the filter. Specify Status to return accounts with a specific enrollment status (for example, Active).
    */
  var name: js.UndefOr[EnrollmentFilterName] = js.undefined
  
  /**
    * The value of the filter. The valid values are Active, Inactive, Pending, and Failed.
    */
  var values: js.UndefOr[FilterValues] = js.undefined
}
object EnrollmentFilter {
  
  inline def apply(): EnrollmentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrollmentFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnrollmentFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: EnrollmentFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
