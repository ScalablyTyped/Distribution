package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowPreviousOptions
  extends StObject
     with Object {
  
  /**
    * Cancels the current workflow when calling this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#previous)
    */
  var cancelCurrentStep: Boolean
}
object WorkflowPreviousOptions {
  
  inline def apply(
    cancelCurrentStep: Boolean,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WorkflowPreviousOptions = {
    val __obj = js.Dynamic.literal(cancelCurrentStep = cancelCurrentStep.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WorkflowPreviousOptions]
  }
  
  extension [Self <: WorkflowPreviousOptions](x: Self) {
    
    inline def setCancelCurrentStep(value: Boolean): Self = StObject.set(x, "cancelCurrentStep", value.asInstanceOf[js.Any])
  }
}
