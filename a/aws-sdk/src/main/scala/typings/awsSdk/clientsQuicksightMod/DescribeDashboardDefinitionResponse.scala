package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDashboardDefinitionResponse extends StObject {
  
  /**
    * The ID of the dashboard described.
    */
  var DashboardId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
  
  /**
    * Options for publishing the dashboard:    AvailabilityStatus for AdHocFilteringOption - This status can be either ENABLED or DISABLED. When this is set to DISABLED, Amazon QuickSight disables the left filter pane on the published dashboard, which can be used for ad hoc (one-time) filtering. This option is ENABLED by default.     AvailabilityStatus for ExportToCSVOption - This status can be either ENABLED or DISABLED. The visual option to export data to .CSV format isn't enabled when this is set to DISABLED. This option is ENABLED by default.     VisibilityState for SheetControlsOption - This visibility state can be either COLLAPSED or EXPANDED. This option is COLLAPSED by default.   
    */
  var DashboardPublishOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DashboardPublishOptions] = js.undefined
  
  /**
    * The definition of a dashboard. A definition is the data model of all features in a Dashboard, Template, or Analysis.
    */
  var Definition: js.UndefOr[DashboardVersionDefinition] = js.undefined
  
  /**
    * Errors associated with this dashboard version.
    */
  var Errors: js.UndefOr[DashboardErrorList] = js.undefined
  
  /**
    * The display name of the dashboard.
    */
  var Name: js.UndefOr[DashboardName] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * Status associated with the dashboard version.    CREATION_IN_PROGRESS     CREATION_SUCCESSFUL     CREATION_FAILED     UPDATE_IN_PROGRESS     UPDATE_SUCCESSFUL     UPDATE_FAILED     DELETED   
    */
  var ResourceStatus: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ResourceStatus] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The ARN of the theme of the dashboard.
    */
  var ThemeArn: js.UndefOr[Arn] = js.undefined
}
object DescribeDashboardDefinitionResponse {
  
  inline def apply(): DescribeDashboardDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDashboardDefinitionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDashboardDefinitionResponse] (val x: Self) extends AnyVal {
    
    inline def setDashboardId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    inline def setDashboardIdUndefined: Self = StObject.set(x, "DashboardId", js.undefined)
    
    inline def setDashboardPublishOptions(value: DashboardPublishOptions): Self = StObject.set(x, "DashboardPublishOptions", value.asInstanceOf[js.Any])
    
    inline def setDashboardPublishOptionsUndefined: Self = StObject.set(x, "DashboardPublishOptions", js.undefined)
    
    inline def setDefinition(value: DashboardVersionDefinition): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setErrors(value: DashboardErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: DashboardError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setName(value: DashboardName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setResourceStatus(value: ResourceStatus): Self = StObject.set(x, "ResourceStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceStatusUndefined: Self = StObject.set(x, "ResourceStatus", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setThemeArn(value: Arn): Self = StObject.set(x, "ThemeArn", value.asInstanceOf[js.Any])
    
    inline def setThemeArnUndefined: Self = StObject.set(x, "ThemeArn", js.undefined)
  }
}
