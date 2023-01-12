package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalImpactFilter extends StObject {
  
  /**
    * The upper bound dollar value that's used in the filter. 
    */
  var EndValue: js.UndefOr[GenericDouble] = js.undefined
  
  /**
    * The comparing value that's used in the filter. 
    */
  var NumericOperator: typings.awsSdk.clientsCostexplorerMod.NumericOperator
  
  /**
    * The lower bound dollar value that's used in the filter. 
    */
  var StartValue: GenericDouble
}
object TotalImpactFilter {
  
  inline def apply(NumericOperator: NumericOperator, StartValue: GenericDouble): TotalImpactFilter = {
    val __obj = js.Dynamic.literal(NumericOperator = NumericOperator.asInstanceOf[js.Any], StartValue = StartValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalImpactFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TotalImpactFilter] (val x: Self) extends AnyVal {
    
    inline def setEndValue(value: GenericDouble): Self = StObject.set(x, "EndValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "EndValue", js.undefined)
    
    inline def setNumericOperator(value: NumericOperator): Self = StObject.set(x, "NumericOperator", value.asInstanceOf[js.Any])
    
    inline def setStartValue(value: GenericDouble): Self = StObject.set(x, "StartValue", value.asInstanceOf[js.Any])
  }
}
