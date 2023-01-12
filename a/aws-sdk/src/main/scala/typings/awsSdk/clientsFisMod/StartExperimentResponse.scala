package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExperimentResponse extends StObject {
  
  /**
    * Information about the experiment.
    */
  var experiment: js.UndefOr[Experiment] = js.undefined
}
object StartExperimentResponse {
  
  inline def apply(): StartExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartExperimentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartExperimentResponse] (val x: Self) extends AnyVal {
    
    inline def setExperiment(value: Experiment): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
    
    inline def setExperimentUndefined: Self = StObject.set(x, "experiment", js.undefined)
  }
}
