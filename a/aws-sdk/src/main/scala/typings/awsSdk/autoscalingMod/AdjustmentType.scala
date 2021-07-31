package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustmentType extends StObject {
  
  /**
    * The policy adjustment type. The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object AdjustmentType {
  
  @scala.inline
  def apply(): AdjustmentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustmentType]
  }
  
  @scala.inline
  implicit class AdjustmentTypeMutableBuilder[Self <: AdjustmentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustmentType(value: XmlStringMaxLen255): Self = StObject.set(x, "AdjustmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustmentTypeUndefined: Self = StObject.set(x, "AdjustmentType", js.undefined)
  }
}
