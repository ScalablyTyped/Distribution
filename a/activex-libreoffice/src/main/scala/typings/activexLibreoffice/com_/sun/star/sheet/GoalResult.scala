package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is the result of a goal seek operation. */
trait GoalResult extends StObject {
  
  /** the amount by which the result changed in the last iteration. */
  var Divergence: Double
  
  /** the resulting value. */
  var Result: Double
}
object GoalResult {
  
  inline def apply(Divergence: Double, Result: Double): GoalResult = {
    val __obj = js.Dynamic.literal(Divergence = Divergence.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoalResult]
  }
  
  extension [Self <: GoalResult](x: Self) {
    
    inline def setDivergence(value: Double): Self = StObject.set(x, "Divergence", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Double): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
