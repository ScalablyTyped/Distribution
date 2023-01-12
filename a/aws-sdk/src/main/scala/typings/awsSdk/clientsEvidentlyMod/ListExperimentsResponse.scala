package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExperimentsResponse extends StObject {
  
  /**
    * An array of structures that contain the configuration details of the experiments in the specified project.
    */
  var experiments: js.UndefOr[ExperimentList] = js.undefined
  
  /**
    * The token to use in a subsequent ListExperiments operation to return the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListExperimentsResponse {
  
  inline def apply(): ListExperimentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExperimentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExperimentsResponse] (val x: Self) extends AnyVal {
    
    inline def setExperiments(value: ExperimentList): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
    
    inline def setExperimentsUndefined: Self = StObject.set(x, "experiments", js.undefined)
    
    inline def setExperimentsVarargs(value: Experiment*): Self = StObject.set(x, "experiments", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
