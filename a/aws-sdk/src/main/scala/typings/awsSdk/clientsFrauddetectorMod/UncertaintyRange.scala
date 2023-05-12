package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UncertaintyRange extends StObject {
  
  /**
    *  The lower bound value of the area under curve (auc). 
    */
  var lowerBoundValue: float
  
  /**
    *  The lower bound value of the area under curve (auc). 
    */
  var upperBoundValue: float
}
object UncertaintyRange {
  
  inline def apply(lowerBoundValue: float, upperBoundValue: float): UncertaintyRange = {
    val __obj = js.Dynamic.literal(lowerBoundValue = lowerBoundValue.asInstanceOf[js.Any], upperBoundValue = upperBoundValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncertaintyRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UncertaintyRange] (val x: Self) extends AnyVal {
    
    inline def setLowerBoundValue(value: float): Self = StObject.set(x, "lowerBoundValue", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundValue(value: float): Self = StObject.set(x, "upperBoundValue", value.asInstanceOf[js.Any])
  }
}
