package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEvaluationResultsRequest extends StObject {
  
  /**
    * The name of the Config rule for which you want to delete the evaluation results.
    */
  var ConfigRuleName: StringWithCharLimit64
}
object DeleteEvaluationResultsRequest {
  
  inline def apply(ConfigRuleName: StringWithCharLimit64): DeleteEvaluationResultsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEvaluationResultsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEvaluationResultsRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigRuleName(value: StringWithCharLimit64): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
  }
}
