package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancePatchStateFilter extends StObject {
  
  /**
    * The key for the filter. Supported values include the following:    InstalledCount     InstalledOtherCount     InstalledPendingRebootCount     InstalledRejectedCount     MissingCount     FailedCount     UnreportedNotApplicableCount     NotApplicableCount   
    */
  var Key: InstancePatchStateFilterKey
  
  /**
    * The type of comparison that should be performed for the value.
    */
  var Type: InstancePatchStateOperatorType
  
  /**
    * The value for the filter. Must be an integer greater than or equal to 0.
    */
  var Values: InstancePatchStateFilterValues
}
object InstancePatchStateFilter {
  
  inline def apply(
    Key: InstancePatchStateFilterKey,
    Type: InstancePatchStateOperatorType,
    Values: InstancePatchStateFilterValues
  ): InstancePatchStateFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancePatchStateFilter]
  }
  
  extension [Self <: InstancePatchStateFilter](x: Self) {
    
    inline def setKey(value: InstancePatchStateFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setType(value: InstancePatchStateOperatorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: InstancePatchStateFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: InstancePatchStateFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
