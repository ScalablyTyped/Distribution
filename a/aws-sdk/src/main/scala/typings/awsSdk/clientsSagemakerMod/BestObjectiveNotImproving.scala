package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BestObjectiveNotImproving extends StObject {
  
  /**
    * The number of training jobs that have failed to improve model performance by 1% or greater over prior training jobs as evaluated against an objective function.
    */
  var MaxNumberOfTrainingJobsNotImproving: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxNumberOfTrainingJobsNotImproving] = js.undefined
}
object BestObjectiveNotImproving {
  
  inline def apply(): BestObjectiveNotImproving = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BestObjectiveNotImproving]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BestObjectiveNotImproving] (val x: Self) extends AnyVal {
    
    inline def setMaxNumberOfTrainingJobsNotImproving(value: MaxNumberOfTrainingJobsNotImproving): Self = StObject.set(x, "MaxNumberOfTrainingJobsNotImproving", value.asInstanceOf[js.Any])
    
    inline def setMaxNumberOfTrainingJobsNotImprovingUndefined: Self = StObject.set(x, "MaxNumberOfTrainingJobsNotImproving", js.undefined)
  }
}
