package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAdjustmentTypesAnswer extends StObject {
  
  /**
    * The policy adjustment types.
    */
  var AdjustmentTypes: js.UndefOr[typings.awsSdk.autoscalingMod.AdjustmentTypes] = js.native
}
object DescribeAdjustmentTypesAnswer {
  
  @scala.inline
  def apply(): DescribeAdjustmentTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAdjustmentTypesAnswer]
  }
  
  @scala.inline
  implicit class DescribeAdjustmentTypesAnswerMutableBuilder[Self <: DescribeAdjustmentTypesAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustmentTypes(value: AdjustmentTypes): Self = StObject.set(x, "AdjustmentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustmentTypesUndefined: Self = StObject.set(x, "AdjustmentTypes", js.undefined)
    
    @scala.inline
    def setAdjustmentTypesVarargs(value: AdjustmentType*): Self = StObject.set(x, "AdjustmentTypes", js.Array(value :_*))
  }
}
