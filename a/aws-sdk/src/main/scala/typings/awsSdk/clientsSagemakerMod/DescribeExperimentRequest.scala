package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExperimentRequest extends StObject {
  
  /**
    * The name of the experiment to describe.
    */
  var ExperimentName: ExperimentEntityName
}
object DescribeExperimentRequest {
  
  inline def apply(ExperimentName: ExperimentEntityName): DescribeExperimentRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExperimentRequest]
  }
  
  extension [Self <: DescribeExperimentRequest](x: Self) {
    
    inline def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
  }
}
