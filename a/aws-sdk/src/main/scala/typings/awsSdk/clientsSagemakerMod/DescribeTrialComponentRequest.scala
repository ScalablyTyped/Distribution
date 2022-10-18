package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrialComponentRequest extends StObject {
  
  /**
    * The name of the trial component to describe.
    */
  var TrialComponentName: ExperimentEntityNameOrArn
}
object DescribeTrialComponentRequest {
  
  inline def apply(TrialComponentName: ExperimentEntityNameOrArn): DescribeTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrialComponentRequest]
  }
  
  extension [Self <: DescribeTrialComponentRequest](x: Self) {
    
    inline def setTrialComponentName(value: ExperimentEntityNameOrArn): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
  }
}
