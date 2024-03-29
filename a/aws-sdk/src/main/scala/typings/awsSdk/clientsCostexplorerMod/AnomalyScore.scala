package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyScore extends StObject {
  
  /**
    * The last observed score. 
    */
  var CurrentScore: GenericDouble
  
  /**
    * The maximum score that's observed during the AnomalyDateInterval. 
    */
  var MaxScore: GenericDouble
}
object AnomalyScore {
  
  inline def apply(CurrentScore: GenericDouble, MaxScore: GenericDouble): AnomalyScore = {
    val __obj = js.Dynamic.literal(CurrentScore = CurrentScore.asInstanceOf[js.Any], MaxScore = MaxScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyScore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnomalyScore] (val x: Self) extends AnyVal {
    
    inline def setCurrentScore(value: GenericDouble): Self = StObject.set(x, "CurrentScore", value.asInstanceOf[js.Any])
    
    inline def setMaxScore(value: GenericDouble): Self = StObject.set(x, "MaxScore", value.asInstanceOf[js.Any])
  }
}
