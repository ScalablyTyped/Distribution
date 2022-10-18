package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionExecutionResult extends StObject {
  
  /**
    * The action provider's external ID for the action execution.
    */
  var externalExecutionId: js.UndefOr[ExternalExecutionId] = js.undefined
  
  /**
    * The action provider's summary for the action execution.
    */
  var externalExecutionSummary: js.UndefOr[ExternalExecutionSummary] = js.undefined
  
  /**
    * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is used when running the action.
    */
  var externalExecutionUrl: js.UndefOr[Url] = js.undefined
}
object ActionExecutionResult {
  
  inline def apply(): ActionExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionResult]
  }
  
  extension [Self <: ActionExecutionResult](x: Self) {
    
    inline def setExternalExecutionId(value: ExternalExecutionId): Self = StObject.set(x, "externalExecutionId", value.asInstanceOf[js.Any])
    
    inline def setExternalExecutionIdUndefined: Self = StObject.set(x, "externalExecutionId", js.undefined)
    
    inline def setExternalExecutionSummary(value: ExternalExecutionSummary): Self = StObject.set(x, "externalExecutionSummary", value.asInstanceOf[js.Any])
    
    inline def setExternalExecutionSummaryUndefined: Self = StObject.set(x, "externalExecutionSummary", js.undefined)
    
    inline def setExternalExecutionUrl(value: Url): Self = StObject.set(x, "externalExecutionUrl", value.asInstanceOf[js.Any])
    
    inline def setExternalExecutionUrlUndefined: Self = StObject.set(x, "externalExecutionUrl", js.undefined)
  }
}
