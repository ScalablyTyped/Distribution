package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowPreviousOptions extends StObject {
  
  /**
    * Cancels the current workflow when calling this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#previous)
    */
  var cancelCurrentStep: Boolean
}
object WorkflowPreviousOptions {
  
  inline def apply(cancelCurrentStep: Boolean): WorkflowPreviousOptions = {
    val __obj = js.Dynamic.literal(cancelCurrentStep = cancelCurrentStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowPreviousOptions]
  }
  
  extension [Self <: WorkflowPreviousOptions](x: Self) {
    
    inline def setCancelCurrentStep(value: Boolean): Self = StObject.set(x, "cancelCurrentStep", value.asInstanceOf[js.Any])
  }
}
