package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAdjustmentTypesAnswer extends StObject {
  
  /**
    * The policy adjustment types.
    */
  var AdjustmentTypes: js.UndefOr[typings.awsSdk.autoscalingMod.AdjustmentTypes] = js.undefined
}
object DescribeAdjustmentTypesAnswer {
  
  inline def apply(): DescribeAdjustmentTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAdjustmentTypesAnswer]
  }
  
  extension [Self <: DescribeAdjustmentTypesAnswer](x: Self) {
    
    inline def setAdjustmentTypes(value: AdjustmentTypes): Self = StObject.set(x, "AdjustmentTypes", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentTypesUndefined: Self = StObject.set(x, "AdjustmentTypes", js.undefined)
    
    inline def setAdjustmentTypesVarargs(value: AdjustmentType*): Self = StObject.set(x, "AdjustmentTypes", js.Array(value*))
  }
}
