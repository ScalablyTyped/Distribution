package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailMatchingCriteria extends StObject {
  
  /**
    * The dynamic variable(s) that MediaTailor should use as avail matching criteria. MediaTailor only places the prefetched ads into the avail if the avail matches the criteria defined by the dynamic variable. For information about dynamic variables, see Using dynamic ad variables in the MediaTailor User Guide. You can include up to 100 dynamic variables.
    */
  var DynamicVariable: string
  
  /**
    * For the DynamicVariable specified in AvailMatchingCriteria, the Operator that is used for the comparison.
    */
  var Operator: typings.awsSdk.clientsMediatailorMod.Operator
}
object AvailMatchingCriteria {
  
  inline def apply(DynamicVariable: string, Operator: Operator): AvailMatchingCriteria = {
    val __obj = js.Dynamic.literal(DynamicVariable = DynamicVariable.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailMatchingCriteria]
  }
  
  extension [Self <: AvailMatchingCriteria](x: Self) {
    
    inline def setDynamicVariable(value: string): Self = StObject.set(x, "DynamicVariable", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: Operator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
  }
}
