package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avg extends StObject {
  
  /**
    * The average facet value in the result set.
    */
  var avg: Double
  
  /**
    * The maximum value in the result set.
    */
  var max: Double
  
  /**
    * The minimum value in the result set.
    */
  var min: Double
  
  /**
    * The sum of all values in the result set.
    */
  var sum: Double
}
object Avg {
  
  inline def apply(avg: Double, max: Double, min: Double, sum: Double): Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avg]
  }
  
  extension [Self <: Avg](x: Self) {
    
    inline def setAvg(value: Double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
  }
}
