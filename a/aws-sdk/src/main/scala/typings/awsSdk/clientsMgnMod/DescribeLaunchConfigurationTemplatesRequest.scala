package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLaunchConfigurationTemplatesRequest extends StObject {
  
  /**
    * Request to filter Launch Configuration Templates list by Launch Configuration Template ID.
    */
  var launchConfigurationTemplateIDs: js.UndefOr[LaunchConfigurationTemplateIDs] = js.undefined
  
  /**
    * Maximum results to be returned in DescribeLaunchConfigurationTemplates.
    */
  var maxResults: js.UndefOr[MaxResultsType] = js.undefined
  
  /**
    * Next pagination token returned from DescribeLaunchConfigurationTemplates.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeLaunchConfigurationTemplatesRequest {
  
  inline def apply(): DescribeLaunchConfigurationTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLaunchConfigurationTemplatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLaunchConfigurationTemplatesRequest] (val x: Self) extends AnyVal {
    
    inline def setLaunchConfigurationTemplateIDs(value: LaunchConfigurationTemplateIDs): Self = StObject.set(x, "launchConfigurationTemplateIDs", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationTemplateIDsUndefined: Self = StObject.set(x, "launchConfigurationTemplateIDs", js.undefined)
    
    inline def setLaunchConfigurationTemplateIDsVarargs(value: LaunchConfigurationTemplateID*): Self = StObject.set(x, "launchConfigurationTemplateIDs", js.Array(value*))
    
    inline def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
