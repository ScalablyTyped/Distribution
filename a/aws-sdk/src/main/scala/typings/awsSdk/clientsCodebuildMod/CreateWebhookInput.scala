package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWebhookInput extends StObject {
  
  /**
    * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.  It is recommended that you use filterGroups instead of branchFilter.  
    */
  var branchFilter: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of build this webhook will trigger.
    */
  var buildType: js.UndefOr[WebhookBuildType] = js.undefined
  
  /**
    * An array of arrays of WebhookFilter objects used to determine which webhooks are triggered. At least one WebhookFilter in the array must specify EVENT as its type.  For a build to be triggered, at least one filter group in the filterGroups array must pass. For a filter group to pass, each of its filters must pass. 
    */
  var filterGroups: js.UndefOr[FilterGroups] = js.undefined
  
  /**
    * The name of the CodeBuild project.
    */
  var projectName: ProjectName
}
object CreateWebhookInput {
  
  inline def apply(projectName: ProjectName): CreateWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebhookInput]
  }
  
  extension [Self <: CreateWebhookInput](x: Self) {
    
    inline def setBranchFilter(value: String): Self = StObject.set(x, "branchFilter", value.asInstanceOf[js.Any])
    
    inline def setBranchFilterUndefined: Self = StObject.set(x, "branchFilter", js.undefined)
    
    inline def setBuildType(value: WebhookBuildType): Self = StObject.set(x, "buildType", value.asInstanceOf[js.Any])
    
    inline def setBuildTypeUndefined: Self = StObject.set(x, "buildType", js.undefined)
    
    inline def setFilterGroups(value: FilterGroups): Self = StObject.set(x, "filterGroups", value.asInstanceOf[js.Any])
    
    inline def setFilterGroupsUndefined: Self = StObject.set(x, "filterGroups", js.undefined)
    
    inline def setFilterGroupsVarargs(value: FilterGroup*): Self = StObject.set(x, "filterGroups", js.Array(value*))
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
