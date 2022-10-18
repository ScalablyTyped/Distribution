package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExperimentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExperimentArn] = js.undefined
}
object UpdateExperimentResponse {
  
  inline def apply(): UpdateExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateExperimentResponse]
  }
  
  extension [Self <: UpdateExperimentResponse](x: Self) {
    
    inline def setExperimentArn(value: ExperimentArn): Self = StObject.set(x, "ExperimentArn", value.asInstanceOf[js.Any])
    
    inline def setExperimentArnUndefined: Self = StObject.set(x, "ExperimentArn", js.undefined)
  }
}
