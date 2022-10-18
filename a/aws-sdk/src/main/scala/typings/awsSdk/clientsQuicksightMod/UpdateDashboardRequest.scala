package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDashboardRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the dashboard that you're updating.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID for the dashboard.
    */
  var DashboardId: RestrictiveResourceId
  
  /**
    * Options for publishing the dashboard when you create it:    AvailabilityStatus for AdHocFilteringOption - This status can be either ENABLED or DISABLED. When this is set to DISABLED, Amazon QuickSight disables the left filter pane on the published dashboard, which can be used for ad hoc (one-time) filtering. This option is ENABLED by default.     AvailabilityStatus for ExportToCSVOption - This status can be either ENABLED or DISABLED. The visual option to export data to .CSV format isn't enabled when this is set to DISABLED. This option is ENABLED by default.     VisibilityState for SheetControlsOption - This visibility state can be either COLLAPSED or EXPANDED. This option is COLLAPSED by default.   
    */
  var DashboardPublishOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DashboardPublishOptions] = js.undefined
  
  /**
    * The display name of the dashboard.
    */
  var Name: DashboardName
  
  /**
    * A structure that contains the parameters of the dashboard. These are parameter overrides for a dashboard. A dashboard can have any type of parameters, and some parameters might accept multiple values.
    */
  var Parameters: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Parameters] = js.undefined
  
  /**
    * The entity that you are using as a source when you update the dashboard. In SourceEntity, you specify the type of object you're using as source. You can only update a dashboard from a template, so you use a SourceTemplate entity. If you need to update a dashboard from an analysis, first convert the analysis to a template by using the  CreateTemplate  API operation. For SourceTemplate, specify the Amazon Resource Name (ARN) of the source template. The SourceTemplate ARN can contain any Amazon Web Services account and any Amazon QuickSight-supported Amazon Web Services Region.  Use the DataSetReferences entity within SourceTemplate to list the replacement datasets for the placeholders listed in the original. The schema in each dataset must match its placeholder. 
    */
  var SourceEntity: DashboardSourceEntity
  
  /**
    * The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. If you add a value for this field, it overrides the value that was originally associated with the entity. The theme ARN must exist in the same Amazon Web Services account where you create the dashboard.
    */
  var ThemeArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A description for the first version of the dashboard being created.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VersionDescription] = js.undefined
}
object UpdateDashboardRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    DashboardId: RestrictiveResourceId,
    Name: DashboardName,
    SourceEntity: DashboardSourceEntity
  ): UpdateDashboardRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceEntity = SourceEntity.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDashboardRequest]
  }
  
  extension [Self <: UpdateDashboardRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    inline def setDashboardPublishOptions(value: DashboardPublishOptions): Self = StObject.set(x, "DashboardPublishOptions", value.asInstanceOf[js.Any])
    
    inline def setDashboardPublishOptionsUndefined: Self = StObject.set(x, "DashboardPublishOptions", js.undefined)
    
    inline def setName(value: DashboardName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setSourceEntity(value: DashboardSourceEntity): Self = StObject.set(x, "SourceEntity", value.asInstanceOf[js.Any])
    
    inline def setThemeArn(value: Arn): Self = StObject.set(x, "ThemeArn", value.asInstanceOf[js.Any])
    
    inline def setThemeArnUndefined: Self = StObject.set(x, "ThemeArn", js.undefined)
    
    inline def setVersionDescription(value: VersionDescription): Self = StObject.set(x, "VersionDescription", value.asInstanceOf[js.Any])
    
    inline def setVersionDescriptionUndefined: Self = StObject.set(x, "VersionDescription", js.undefined)
  }
}
