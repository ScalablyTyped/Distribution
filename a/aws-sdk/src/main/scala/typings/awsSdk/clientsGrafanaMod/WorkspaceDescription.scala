package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceDescription extends StObject {
  
  /**
    * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If this is ORGANIZATION, the workspaceOrganizationalUnits parameter specifies which organizational units the workspace can access.
    */
  var accountAccessType: js.UndefOr[AccountAccessType] = js.undefined
  
  /**
    * A structure that describes whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication.
    */
  var authentication: AuthenticationSummary
  
  /**
    * The date that the workspace was created.
    */
  var created: js.Date
  
  /**
    * Specifies the Amazon Web Services data sources that have been configured to have IAM roles and permissions created to allow Amazon Managed Grafana to read data from these sources. This list is only used when the workspace was created through the Amazon Web Services console, and the permissionType is SERVICE_MANAGED.
    */
  var dataSources: DataSourceTypesList
  
  /**
    * The user-defined description of the workspace.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The URL that users can use to access the Grafana console in the workspace.
    */
  var endpoint: Endpoint
  
  /**
    * Specifies whether this workspace has already fully used its free trial for Grafana Enterprise.
    */
  var freeTrialConsumed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If this workspace is currently in the free trial period for Grafana Enterprise, this value specifies when that free trial ends.
    */
  var freeTrialExpiration: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The version of Grafana supported in this workspace.
    */
  var grafanaVersion: GrafanaVersion
  
  /**
    * The unique ID of this workspace.
    */
  var id: WorkspaceId
  
  /**
    * If this workspace has a full Grafana Enterprise license, this specifies when the license ends and will need to be renewed.
    */
  var licenseExpiration: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies whether this workspace has a full Grafana Enterprise license or a free trial license.
    */
  var licenseType: js.UndefOr[LicenseType] = js.undefined
  
  /**
    * The most recent date that the workspace was modified.
    */
  var modified: js.Date
  
  /**
    * The name of the workspace.
    */
  var name: js.UndefOr[WorkspaceName] = js.undefined
  
  /**
    * The configuration settings for network access to your workspace.
    */
  var networkAccessControl: js.UndefOr[NetworkAccessConfiguration] = js.undefined
  
  /**
    * The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM roles and permissions for, to allow Amazon Managed Grafana to use these channels.
    */
  var notificationDestinations: js.UndefOr[NotificationDestinationsList] = js.undefined
  
  /**
    * The name of the IAM role that is used to access resources through Organizations.
    */
  var organizationRoleName: js.UndefOr[OrganizationRoleName] = js.undefined
  
  /**
    * Specifies the organizational units that this workspace is allowed to use data sources from, if this workspace is in an account that is part of an organization.
    */
  var organizationalUnits: js.UndefOr[OrganizationalUnitList] = js.undefined
  
  /**
    * If this is SERVICE_MANAGED, and the workplace was created through the Amazon Managed Grafana console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the permissions that the workspace needs to use Amazon Web Services data sources and notification channels. If this is CUSTOMER_MANAGED, you must manage those roles and permissions yourself. If you are working with a workspace in a member account of an organization and that account is not a delegated administrator account, and you want the workspace to access data sources in other Amazon Web Services accounts in the organization, this parameter must be set to CUSTOMER_MANAGED. For more information about converting between customer and service managed, see Managing permissions for data sources and notification channels. For more information about the roles and permissions that must be managed for customer managed workspaces, see Amazon Managed Grafana permissions and policies for Amazon Web Services data sources and notification channels 
    */
  var permissionType: js.UndefOr[PermissionType] = js.undefined
  
  /**
    * The name of the CloudFormation stack set that is used to generate IAM roles to be used for this workspace.
    */
  var stackSetName: js.UndefOr[StackSetName] = js.undefined
  
  /**
    * The current status of the workspace.
    */
  var status: WorkspaceStatus
  
  /**
    * The list of tags associated with the workspace.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The configuration for connecting to data sources in a private VPC (Amazon Virtual Private Cloud).
    */
  var vpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined
  
  /**
    * The IAM role that grants permissions to the Amazon Web Services resources that the workspace will view data from. This role must already exist.
    */
  var workspaceRoleArn: js.UndefOr[IamRoleArn] = js.undefined
}
object WorkspaceDescription {
  
  inline def apply(
    authentication: AuthenticationSummary,
    created: js.Date,
    dataSources: DataSourceTypesList,
    endpoint: Endpoint,
    grafanaVersion: GrafanaVersion,
    id: WorkspaceId,
    modified: js.Date,
    status: WorkspaceStatus
  ): WorkspaceDescription = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], dataSources = dataSources.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], grafanaVersion = grafanaVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceDescription] (val x: Self) extends AnyVal {
    
    inline def setAccountAccessType(value: AccountAccessType): Self = StObject.set(x, "accountAccessType", value.asInstanceOf[js.Any])
    
    inline def setAccountAccessTypeUndefined: Self = StObject.set(x, "accountAccessType", js.undefined)
    
    inline def setAuthentication(value: AuthenticationSummary): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDataSources(value: DataSourceTypesList): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesVarargs(value: DataSourceType*): Self = StObject.set(x, "dataSources", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialConsumed(value: Boolean): Self = StObject.set(x, "freeTrialConsumed", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialConsumedUndefined: Self = StObject.set(x, "freeTrialConsumed", js.undefined)
    
    inline def setFreeTrialExpiration(value: js.Date): Self = StObject.set(x, "freeTrialExpiration", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialExpirationUndefined: Self = StObject.set(x, "freeTrialExpiration", js.undefined)
    
    inline def setGrafanaVersion(value: GrafanaVersion): Self = StObject.set(x, "grafanaVersion", value.asInstanceOf[js.Any])
    
    inline def setId(value: WorkspaceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLicenseExpiration(value: js.Date): Self = StObject.set(x, "licenseExpiration", value.asInstanceOf[js.Any])
    
    inline def setLicenseExpirationUndefined: Self = StObject.set(x, "licenseExpiration", js.undefined)
    
    inline def setLicenseType(value: LicenseType): Self = StObject.set(x, "licenseType", value.asInstanceOf[js.Any])
    
    inline def setLicenseTypeUndefined: Self = StObject.set(x, "licenseType", js.undefined)
    
    inline def setModified(value: js.Date): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setName(value: WorkspaceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkAccessControl(value: NetworkAccessConfiguration): Self = StObject.set(x, "networkAccessControl", value.asInstanceOf[js.Any])
    
    inline def setNetworkAccessControlUndefined: Self = StObject.set(x, "networkAccessControl", js.undefined)
    
    inline def setNotificationDestinations(value: NotificationDestinationsList): Self = StObject.set(x, "notificationDestinations", value.asInstanceOf[js.Any])
    
    inline def setNotificationDestinationsUndefined: Self = StObject.set(x, "notificationDestinations", js.undefined)
    
    inline def setNotificationDestinationsVarargs(value: NotificationDestinationType*): Self = StObject.set(x, "notificationDestinations", js.Array(value*))
    
    inline def setOrganizationRoleName(value: OrganizationRoleName): Self = StObject.set(x, "organizationRoleName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationRoleNameUndefined: Self = StObject.set(x, "organizationRoleName", js.undefined)
    
    inline def setOrganizationalUnits(value: OrganizationalUnitList): Self = StObject.set(x, "organizationalUnits", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitsUndefined: Self = StObject.set(x, "organizationalUnits", js.undefined)
    
    inline def setOrganizationalUnitsVarargs(value: OrganizationalUnit*): Self = StObject.set(x, "organizationalUnits", js.Array(value*))
    
    inline def setPermissionType(value: PermissionType): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
    
    inline def setStackSetName(value: StackSetName): Self = StObject.set(x, "stackSetName", value.asInstanceOf[js.Any])
    
    inline def setStackSetNameUndefined: Self = StObject.set(x, "stackSetName", js.undefined)
    
    inline def setStatus(value: WorkspaceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "vpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "vpcConfiguration", js.undefined)
    
    inline def setWorkspaceRoleArn(value: IamRoleArn): Self = StObject.set(x, "workspaceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceRoleArnUndefined: Self = StObject.set(x, "workspaceRoleArn", js.undefined)
  }
}
