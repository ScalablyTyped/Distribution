package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountPercent extends StObject {
  
  /**
    *  Indicates the count of occurences of the given statistic. 
    */
  var Count: Integer
  
  /**
    *  Indicates the percentage of occurances of the given statistic. 
    */
  var Percentage: Float
}
object CountPercent {
  
  inline def apply(Count: Integer, Percentage: Float): CountPercent = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Percentage = Percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountPercent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountPercent] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setPercentage(value: Float): Self = StObject.set(x, "Percentage", value.asInstanceOf[js.Any])
  }
}
