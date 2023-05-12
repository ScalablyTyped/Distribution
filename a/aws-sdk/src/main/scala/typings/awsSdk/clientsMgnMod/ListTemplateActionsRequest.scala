package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplateActionsRequest extends StObject {
  
  /**
    * Filters to apply when listing template post migration custom actions.
    */
  var filters: js.UndefOr[TemplateActionsRequestFilters] = js.undefined
  
  /**
    * Launch configuration template ID.
    */
  var launchConfigurationTemplateID: LaunchConfigurationTemplateID
  
  /**
    * Maximum amount of items to return when listing template post migration custom actions.
    */
  var maxResults: js.UndefOr[MaxResultsType] = js.undefined
  
  /**
    * Next token to use when listing template post migration custom actions.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListTemplateActionsRequest {
  
  inline def apply(launchConfigurationTemplateID: LaunchConfigurationTemplateID): ListTemplateActionsRequest = {
    val __obj = js.Dynamic.literal(launchConfigurationTemplateID = launchConfigurationTemplateID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplateActionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTemplateActionsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: TemplateActionsRequestFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setLaunchConfigurationTemplateID(value: LaunchConfigurationTemplateID): Self = StObject.set(x, "launchConfigurationTemplateID", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
