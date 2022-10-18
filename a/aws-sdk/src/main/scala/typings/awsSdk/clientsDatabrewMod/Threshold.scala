package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Threshold extends StObject {
  
  /**
    * The type of a threshold. Used for comparison of an actual count of rows that satisfy the rule to the threshold value.
    */
  var Type: js.UndefOr[ThresholdType] = js.undefined
  
  /**
    * Unit of threshold value. Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
    */
  var Unit: js.UndefOr[ThresholdUnit] = js.undefined
  
  /**
    * The value of a threshold.
    */
  var Value: ThresholdValue
}
object Threshold {
  
  inline def apply(Value: ThresholdValue): Threshold = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
  
  extension [Self <: Threshold](x: Self) {
    
    inline def setType(value: ThresholdType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUnit(value: ThresholdUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
    
    inline def setValue(value: ThresholdValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
