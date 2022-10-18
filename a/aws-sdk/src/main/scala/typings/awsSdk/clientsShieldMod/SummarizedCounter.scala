package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummarizedCounter extends StObject {
  
  /**
    * The average value of the counter for a specified time period.
    */
  var Average: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum value of the counter for a specified time period.
    */
  var Max: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of counters for a specified time period.
    */
  var N: js.UndefOr[Integer] = js.undefined
  
  /**
    * The counter name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The total of counter values for a specified time period.
    */
  var Sum: js.UndefOr[Double] = js.undefined
  
  /**
    * The unit of the counters.
    */
  var Unit: js.UndefOr[String] = js.undefined
}
object SummarizedCounter {
  
  inline def apply(): SummarizedCounter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummarizedCounter]
  }
  
  extension [Self <: SummarizedCounter](x: Self) {
    
    inline def setAverage(value: Double): Self = StObject.set(x, "Average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "Average", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setN(value: Integer): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "N", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSum(value: Double): Self = StObject.set(x, "Sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "Sum", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
