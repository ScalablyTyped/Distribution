package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceRequest extends StObject {
  
  /**
    * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If you specify ORGANIZATION, you must specify which organizational units the workspace can access in the workspaceOrganizationalUnits parameter.
    */
  var accountAccessType: AccountAccessType
  
  /**
    * Specifies whether this workspace uses SAML 2.0, Amazon Web Services Single Sign On, or both to authenticate users for using the Grafana console within a workspace. For more information, see User authentication in Amazon Managed Grafana.
    */
  var authenticationProviders: AuthenticationProviders
  
  /**
    * A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The name of an IAM role that already exists to use with Organizations to access Amazon Web Services data sources and notification channels in other accounts in an organization.
    */
  var organizationRoleName: js.UndefOr[OrganizationRoleName] = js.undefined
  
  /**
    * If you specify SERVICE_MANAGED on AWS Grafana console, Amazon Managed Grafana automatically creates the IAM roles and provisions the permissions that the workspace needs to use Amazon Web Services data sources and notification channels. In CLI mode, the permissionType SERVICE_MANAGED will not create the IAM role for you. If you specify CUSTOMER_MANAGED, you will manage those roles and permissions yourself. If you are creating this workspace in a member account of an organization that is not a delegated administrator account, and you want the workspace to access data sources in other Amazon Web Services accounts in the organization, you must choose CUSTOMER_MANAGED. For more information, see Amazon Managed Grafana permissions and policies for Amazon Web Services data sources and notification channels.
    */
  var permissionType: PermissionType
  
  /**
    * The name of the CloudFormation stack set to use to generate IAM roles to be used for this workspace.
    */
  var stackSetName: js.UndefOr[StackSetName] = js.undefined
  
  /**
    * The list of tags associated with the workspace.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed Grafana to read data from these sources. You must still add them as data sources in the Grafana console in the workspace. If you don't specify a data source here, you can still add it as a data source in the workspace console later. However, you will then have to manually configure permissions for it.
    */
  var workspaceDataSources: js.UndefOr[DataSourceTypesList] = js.undefined
  
  /**
    * A description for the workspace. This is used only to help you identify this workspace. Pattern: ^[\\p{L}\\p{Z}\\p{N}\\p{P}]{0,2048}$ 
    */
  var workspaceDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The name for the workspace. It does not have to be unique.
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
    * The workspace needs an IAM role that grants permissions to the Amazon Web Services resources that the workspace will view data from. If you already have a role that you want to use, specify it here. The permission type should be set to CUSTOMER_MANAGED.
    */
  var workspaceRoleArn: js.UndefOr[IamRoleArn] = js.undefined
}
object CreateWorkspaceRequest {
  
  inline def apply(
    accountAccessType: AccountAccessType,
    authenticationProviders: AuthenticationProviders,
    permissionType: PermissionType
  ): CreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(accountAccessType = accountAccessType.asInstanceOf[js.Any], authenticationProviders = authenticationProviders.asInstanceOf[js.Any], permissionType = permissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceRequest]
  }
  
  extension [Self <: CreateWorkspaceRequest](x: Self) {
    
    inline def setAccountAccessType(value: AccountAccessType): Self = StObject.set(x, "accountAccessType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProviders(value: AuthenticationProviders): Self = StObject.set(x, "authenticationProviders", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProvidersVarargs(value: AuthenticationProviderTypes*): Self = StObject.set(x, "authenticationProviders", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setOrganizationRoleName(value: OrganizationRoleName): Self = StObject.set(x, "organizationRoleName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationRoleNameUndefined: Self = StObject.set(x, "organizationRoleName", js.undefined)
    
    inline def setPermissionType(value: PermissionType): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setStackSetName(value: StackSetName): Self = StObject.set(x, "stackSetName", value.asInstanceOf[js.Any])
    
    inline def setStackSetNameUndefined: Self = StObject.set(x, "stackSetName", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWorkspaceDataSources(value: DataSourceTypesList): Self = StObject.set(x, "workspaceDataSources", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceDataSourcesUndefined: Self = StObject.set(x, "workspaceDataSources", js.undefined)
    
    inline def setWorkspaceDataSourcesVarargs(value: DataSourceType*): Self = StObject.set(x, "workspaceDataSources", js.Array(value*))
    
    inline def setWorkspaceDescription(value: Description): Self = StObject.set(x, "workspaceDescription", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceDescriptionUndefined: Self = StObject.set(x, "workspaceDescription", js.undefined)
    
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
