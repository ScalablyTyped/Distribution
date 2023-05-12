package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkspaceRequest extends StObject {
  
  /**
    * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If you specify ORGANIZATION, you must specify which organizational units the workspace can access in the workspaceOrganizationalUnits parameter.
    */
  var accountAccessType: js.UndefOr[AccountAccessType] = js.undefined
  
  /**
    * The configuration settings for network access to your workspace. When this is configured, only listed IP addresses and VPC endpoints will be able to access your workspace. Standard Grafana authentication and authorization will still be required. If this is not configured, or is removed, then all IP addresses and VPC endpoints will be allowed. Standard Grafana authentication and authorization will still be required.
    */
  var networkAccessControl: js.UndefOr[NetworkAccessConfiguration] = js.undefined
  
  /**
    * The name of an IAM role that already exists to use to access resources through Organizations. This can only be used with a workspace that has the permissionType set to CUSTOMER_MANAGED.
    */
  var organizationRoleName: js.UndefOr[OrganizationRoleName] = js.undefined
  
  /**
    * Use this parameter if you want to change a workspace from SERVICE_MANAGED to CUSTOMER_MANAGED. This allows you to manage the permissions that the workspace uses to access datasources and notification channels. If the workspace is in a member Amazon Web Services account of an organization, and that account is not a delegated administrator account, and you want the workspace to access data sources in other Amazon Web Services accounts in the organization, you must choose CUSTOMER_MANAGED. If you specify this as CUSTOMER_MANAGED, you must also specify a workspaceRoleArn that the workspace will use for accessing Amazon Web Services resources. For more information on the role and permissions needed, see Amazon Managed Grafana permissions and policies for Amazon Web Services data sources and notification channels   Do not use this to convert a CUSTOMER_MANAGED workspace to SERVICE_MANAGED. Do not include this parameter if you want to leave the workspace as SERVICE_MANAGED. You can convert a CUSTOMER_MANAGED workspace to SERVICE_MANAGED using the Amazon Managed Grafana console. For more information, see Managing permissions for data sources and notification channels. 
    */
  var permissionType: js.UndefOr[PermissionType] = js.undefined
  
  /**
    * Whether to remove the network access configuration from the workspace. Setting this to true and providing a networkAccessControl to set will return an error. If you remove this configuration by setting this to true, then all IP addresses and VPC endpoints will be allowed. Standard Grafana authentication and authorization will still be required.
    */
  var removeNetworkAccessConfiguration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to remove the VPC configuration from the workspace. Setting this to true and providing a vpcConfiguration to set will return an error.
    */
  var removeVpcConfiguration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the CloudFormation stack set to use to generate IAM roles to be used for this workspace.
    */
  var stackSetName: js.UndefOr[StackSetName] = js.undefined
  
  /**
    * The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to.
    */
  var vpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined
  
  /**
    * This parameter is for internal use only, and should not be used.
    */
  var workspaceDataSources: js.UndefOr[DataSourceTypesList] = js.undefined
  
  /**
    * A description for the workspace. This is used only to help you identify this workspace.
    */
  var workspaceDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the workspace to update.
    */
  var workspaceId: WorkspaceId
  
  /**
    * A new name for the workspace to update.
    */
  var workspaceName: js.UndefOr[WorkspaceName] = js.undefined
  
  /**
    * Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed Grafana to use these channels.
    */
  var workspaceNotificationDestinations: js.UndefOr[NotificationDestinationsList] = js.undefined
  
  /**
    * Specifies the organizational units that this workspace is allowed to use data sources from, if this workspace is in an account that is part of an organization.
    */
  var workspaceOrganizationalUnits: js.UndefOr[OrganizationalUnitList] = js.undefined
  
  /**
    * Specifies an IAM role that grants permissions to Amazon Web Services resources that the workspace accesses, such as data sources and notification channels. If this workspace has permissionType CUSTOMER_MANAGED, then this role is required.
    */
  var workspaceRoleArn: js.UndefOr[IamRoleArn] = js.undefined
}
object UpdateWorkspaceRequest {
  
  inline def apply(workspaceId: WorkspaceId): UpdateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkspaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkspaceRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountAccessType(value: AccountAccessType): Self = StObject.set(x, "accountAccessType", value.asInstanceOf[js.Any])
    
    inline def setAccountAccessTypeUndefined: Self = StObject.set(x, "accountAccessType", js.undefined)
    
    inline def setNetworkAccessControl(value: NetworkAccessConfiguration): Self = StObject.set(x, "networkAccessControl", value.asInstanceOf[js.Any])
    
    inline def setNetworkAccessControlUndefined: Self = StObject.set(x, "networkAccessControl", js.undefined)
    
    inline def setOrganizationRoleName(value: OrganizationRoleName): Self = StObject.set(x, "organizationRoleName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationRoleNameUndefined: Self = StObject.set(x, "organizationRoleName", js.undefined)
    
    inline def setPermissionType(value: PermissionType): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
    
    inline def setRemoveNetworkAccessConfiguration(value: Boolean): Self = StObject.set(x, "removeNetworkAccessConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRemoveNetworkAccessConfigurationUndefined: Self = StObject.set(x, "removeNetworkAccessConfiguration", js.undefined)
    
    inline def setRemoveVpcConfiguration(value: Boolean): Self = StObject.set(x, "removeVpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRemoveVpcConfigurationUndefined: Self = StObject.set(x, "removeVpcConfiguration", js.undefined)
    
    inline def setStackSetName(value: StackSetName): Self = StObject.set(x, "stackSetName", value.asInstanceOf[js.Any])
    
    inline def setStackSetNameUndefined: Self = StObject.set(x, "stackSetName", js.undefined)
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "vpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "vpcConfiguration", js.undefined)
    
    inline def setWorkspaceDataSources(value: DataSourceTypesList): Self = StObject.set(x, "workspaceDataSources", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceDataSourcesUndefined: Self = StObject.set(x, "workspaceDataSources", js.undefined)
    
    inline def setWorkspaceDataSourcesVarargs(value: DataSourceType*): Self = StObject.set(x, "workspaceDataSources", js.Array(value*))
    
    inline def setWorkspaceDescription(value: Description): Self = StObject.set(x, "workspaceDescription", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceDescriptionUndefined: Self = StObject.set(x, "workspaceDescription", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceName(value: WorkspaceName): Self = StObject.set(x, "workspaceName", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceNameUndefined: Self = StObject.set(x, "workspaceName", js.undefined)
    
    inline def setWorkspaceNotificationDestinations(value: NotificationDestinationsList): Self = StObject.set(x, "workspaceNotificationDestinations", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceNotificationDestinationsUndefined: Self = StObject.set(x, "workspaceNotificationDestinations", js.undefined)
    
    inline def setWorkspaceNotificationDestinationsVarargs(value: NotificationDestinationType*): Self = StObject.set(x, "workspaceNotificationDestinations", js.Array(value*))
    
    inline def setWorkspaceOrganizationalUnits(value: OrganizationalUnitList): Self = StObject.set(x, "workspaceOrganizationalUnits", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceOrganizationalUnitsUndefined: Self = StObject.set(x, "workspaceOrganizationalUnits", js.undefined)
    
    inline def setWorkspaceOrganizationalUnitsVarargs(value: OrganizationalUnit*): Self = StObject.set(x, "workspaceOrganizationalUnits", js.Array(value*))
    
    inline def setWorkspaceRoleArn(value: IamRoleArn): Self = StObject.set(x, "workspaceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceRoleArnUndefined: Self = StObject.set(x, "workspaceRoleArn", js.undefined)
  }
}
