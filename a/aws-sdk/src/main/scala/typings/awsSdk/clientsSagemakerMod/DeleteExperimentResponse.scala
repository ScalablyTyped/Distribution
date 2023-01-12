package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExperimentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the experiment that is being deleted.
    */
  var ExperimentArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExperimentArn] = js.undefined
}
object DeleteExperimentResponse {
  
  inline def apply(): DeleteExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteExperimentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteExperimentResponse] (val x: Self) extends AnyVal {
    
    inline def setExperimentArn(value: ExperimentArn): Self = StObject.set(x, "ExperimentArn", value.asInstanceOf[js.Any])
    
    inline def setExperimentArnUndefined: Self = StObject.set(x, "ExperimentArn", js.undefined)
  }
}
