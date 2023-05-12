package typings.awsSdk.clientsRamMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RAM extends Service {
  
  /**
    * Accepts an invitation to a resource share from another Amazon Web Services account. After you accept the invitation, the resources included in the resource share are available to interact with in the relevant Amazon Web Services Management Consoles and tools.
    */
  def acceptResourceShareInvitation(): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  def acceptResourceShareInvitation(callback: js.Function2[/* err */ AWSError, /* data */ AcceptResourceShareInvitationResponse, Unit]): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  /**
    * Accepts an invitation to a resource share from another Amazon Web Services account. After you accept the invitation, the resources included in the resource share are available to interact with in the relevant Amazon Web Services Management Consoles and tools.
    */
  def acceptResourceShareInvitation(params: AcceptResourceShareInvitationRequest): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  def acceptResourceShareInvitation(
    params: AcceptResourceShareInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptResourceShareInvitationResponse, Unit]
  ): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  
  /**
    * Adds the specified list of principals and list of resources to a resource share. Principals that already have access to this resource share immediately receive access to the added resources. Newly added principals immediately receive access to the resources shared in this resource share. 
    */
  def associateResourceShare(): Request[AssociateResourceShareResponse, AWSError] = js.native
  def associateResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceShareResponse, Unit]): Request[AssociateResourceShareResponse, AWSError] = js.native
  /**
    * Adds the specified list of principals and list of resources to a resource share. Principals that already have access to this resource share immediately receive access to the added resources. Newly added principals immediately receive access to the resources shared in this resource share. 
    */
  def associateResourceShare(params: AssociateResourceShareRequest): Request[AssociateResourceShareResponse, AWSError] = js.native
  def associateResourceShare(
    params: AssociateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceShareResponse, Unit]
  ): Request[AssociateResourceShareResponse, AWSError] = js.native
  
  /**
    * Adds or replaces the RAM permission for a resource type included in a resource share. You can have exactly one permission associated with each resource type in the resource share. You can add a new RAM permission only if there are currently no resources of that resource type currently in the resource share.
    */
  def associateResourceSharePermission(): Request[AssociateResourceSharePermissionResponse, AWSError] = js.native
  def associateResourceSharePermission(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceSharePermissionResponse, Unit]
  ): Request[AssociateResourceSharePermissionResponse, AWSError] = js.native
  /**
    * Adds or replaces the RAM permission for a resource type included in a resource share. You can have exactly one permission associated with each resource type in the resource share. You can add a new RAM permission only if there are currently no resources of that resource type currently in the resource share.
    */
  def associateResourceSharePermission(params: AssociateResourceSharePermissionRequest): Request[AssociateResourceSharePermissionResponse, AWSError] = js.native
  def associateResourceSharePermission(
    params: AssociateResourceSharePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceSharePermissionResponse, Unit]
  ): Request[AssociateResourceSharePermissionResponse, AWSError] = js.native
  
  @JSName("config")
  var config_RAM: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a customer managed permission for a specified resource type that you can attach to resource shares. It is created in the Amazon Web Services Region in which you call the operation.
    */
  def createPermission(): Request[CreatePermissionResponse, AWSError] = js.native
  def createPermission(callback: js.Function2[/* err */ AWSError, /* data */ CreatePermissionResponse, Unit]): Request[CreatePermissionResponse, AWSError] = js.native
  /**
    * Creates a customer managed permission for a specified resource type that you can attach to resource shares. It is created in the Amazon Web Services Region in which you call the operation.
    */
  def createPermission(params: CreatePermissionRequest): Request[CreatePermissionResponse, AWSError] = js.native
  def createPermission(
    params: CreatePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePermissionResponse, Unit]
  ): Request[CreatePermissionResponse, AWSError] = js.native
  
  /**
    * Creates a new version of the specified customer managed permission. The new version is automatically set as the default version of the customer managed permission. New resource shares automatically use the default permission. Existing resource shares continue to use their original permission versions, but you can use ReplacePermissionAssociations to update them. If the specified customer managed permission already has the maximum of 5 versions, then you must delete one of the existing versions before you can create a new one.
    */
  def createPermissionVersion(): Request[CreatePermissionVersionResponse, AWSError] = js.native
  def createPermissionVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreatePermissionVersionResponse, Unit]): Request[CreatePermissionVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of the specified customer managed permission. The new version is automatically set as the default version of the customer managed permission. New resource shares automatically use the default permission. Existing resource shares continue to use their original permission versions, but you can use ReplacePermissionAssociations to update them. If the specified customer managed permission already has the maximum of 5 versions, then you must delete one of the existing versions before you can create a new one.
    */
  def createPermissionVersion(params: CreatePermissionVersionRequest): Request[CreatePermissionVersionResponse, AWSError] = js.native
  def createPermissionVersion(
    params: CreatePermissionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePermissionVersionResponse, Unit]
  ): Request[CreatePermissionVersionResponse, AWSError] = js.native
  
  /**
    * Creates a resource share. You can provide a list of the Amazon Resource Names (ARNs) for the resources that you want to share, a list of principals you want to share the resources with, and the permissions to grant those principals.  Sharing a resource makes it available for use by principals outside of the Amazon Web Services account that created the resource. Sharing doesn't change any permissions or quotas that apply to the resource in the account that created it. 
    */
  def createResourceShare(): Request[CreateResourceShareResponse, AWSError] = js.native
  def createResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceShareResponse, Unit]): Request[CreateResourceShareResponse, AWSError] = js.native
  /**
    * Creates a resource share. You can provide a list of the Amazon Resource Names (ARNs) for the resources that you want to share, a list of principals you want to share the resources with, and the permissions to grant those principals.  Sharing a resource makes it available for use by principals outside of the Amazon Web Services account that created the resource. Sharing doesn't change any permissions or quotas that apply to the resource in the account that created it. 
    */
  def createResourceShare(params: CreateResourceShareRequest): Request[CreateResourceShareResponse, AWSError] = js.native
  def createResourceShare(
    params: CreateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceShareResponse, Unit]
  ): Request[CreateResourceShareResponse, AWSError] = js.native
  
  /**
    * Deletes the specified customer managed permission in the Amazon Web Services Region in which you call this operation. You can delete a customer managed permission only if it isn't attached to any resource share. The operation deletes all versions associated with the customer managed permission.
    */
  def deletePermission(): Request[DeletePermissionResponse, AWSError] = js.native
  def deletePermission(callback: js.Function2[/* err */ AWSError, /* data */ DeletePermissionResponse, Unit]): Request[DeletePermissionResponse, AWSError] = js.native
  /**
    * Deletes the specified customer managed permission in the Amazon Web Services Region in which you call this operation. You can delete a customer managed permission only if it isn't attached to any resource share. The operation deletes all versions associated with the customer managed permission.
    */
  def deletePermission(params: DeletePermissionRequest): Request[DeletePermissionResponse, AWSError] = js.native
  def deletePermission(
    params: DeletePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePermissionResponse, Unit]
  ): Request[DeletePermissionResponse, AWSError] = js.native
  
  /**
    * Deletes one version of a customer managed permission. The version you specify must not be attached to any resource share and must not be the default version for the permission. If a customer managed permission has the maximum of 5 versions, then you must delete at least one version before you can create another.
    */
  def deletePermissionVersion(): Request[DeletePermissionVersionResponse, AWSError] = js.native
  def deletePermissionVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeletePermissionVersionResponse, Unit]): Request[DeletePermissionVersionResponse, AWSError] = js.native
  /**
    * Deletes one version of a customer managed permission. The version you specify must not be attached to any resource share and must not be the default version for the permission. If a customer managed permission has the maximum of 5 versions, then you must delete at least one version before you can create another.
    */
  def deletePermissionVersion(params: DeletePermissionVersionRequest): Request[DeletePermissionVersionResponse, AWSError] = js.native
  def deletePermissionVersion(
    params: DeletePermissionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePermissionVersionResponse, Unit]
  ): Request[DeletePermissionVersionResponse, AWSError] = js.native
  
  /**
    * Deletes the specified resource share.  This doesn't delete any of the resources that were associated with the resource share; it only stops the sharing of those resources through this resource share. 
    */
  def deleteResourceShare(): Request[DeleteResourceShareResponse, AWSError] = js.native
  def deleteResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceShareResponse, Unit]): Request[DeleteResourceShareResponse, AWSError] = js.native
  /**
    * Deletes the specified resource share.  This doesn't delete any of the resources that were associated with the resource share; it only stops the sharing of those resources through this resource share. 
    */
  def deleteResourceShare(params: DeleteResourceShareRequest): Request[DeleteResourceShareResponse, AWSError] = js.native
  def deleteResourceShare(
    params: DeleteResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceShareResponse, Unit]
  ): Request[DeleteResourceShareResponse, AWSError] = js.native
  
  /**
    * Removes the specified principals or resources from participating in the specified resource share.
    */
  def disassociateResourceShare(): Request[DisassociateResourceShareResponse, AWSError] = js.native
  def disassociateResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceShareResponse, Unit]): Request[DisassociateResourceShareResponse, AWSError] = js.native
  /**
    * Removes the specified principals or resources from participating in the specified resource share.
    */
  def disassociateResourceShare(params: DisassociateResourceShareRequest): Request[DisassociateResourceShareResponse, AWSError] = js.native
  def disassociateResourceShare(
    params: DisassociateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceShareResponse, Unit]
  ): Request[DisassociateResourceShareResponse, AWSError] = js.native
  
  /**
    * Removes a managed permission from a resource share. Permission changes take effect immediately. You can remove a managed permission from a resource share only if there are currently no resources of the relevant resource type currently attached to the resource share.
    */
  def disassociateResourceSharePermission(): Request[DisassociateResourceSharePermissionResponse, AWSError] = js.native
  def disassociateResourceSharePermission(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceSharePermissionResponse, Unit]
  ): Request[DisassociateResourceSharePermissionResponse, AWSError] = js.native
  /**
    * Removes a managed permission from a resource share. Permission changes take effect immediately. You can remove a managed permission from a resource share only if there are currently no resources of the relevant resource type currently attached to the resource share.
    */
  def disassociateResourceSharePermission(params: DisassociateResourceSharePermissionRequest): Request[DisassociateResourceSharePermissionResponse, AWSError] = js.native
  def disassociateResourceSharePermission(
    params: DisassociateResourceSharePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceSharePermissionResponse, Unit]
  ): Request[DisassociateResourceSharePermissionResponse, AWSError] = js.native
  
  /**
    * Enables resource sharing within your organization in Organizations. This operation creates a service-linked role called AWSServiceRoleForResourceAccessManager that has the IAM managed policy named AWSResourceAccessManagerServiceRolePolicy attached. This role permits RAM to retrieve information about the organization and its structure. This lets you share resources with all of the accounts in the calling account's organization by specifying the organization ID, or all of the accounts in an organizational unit (OU) by specifying the OU ID. Until you enable sharing within the organization, you can specify only individual Amazon Web Services accounts, or for supported resource types, IAM roles and users. You must call this operation from an IAM role or user in the organization's management account. 
    */
  def enableSharingWithAwsOrganization(): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  def enableSharingWithAwsOrganization(
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSharingWithAwsOrganizationResponse, Unit]
  ): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  /**
    * Enables resource sharing within your organization in Organizations. This operation creates a service-linked role called AWSServiceRoleForResourceAccessManager that has the IAM managed policy named AWSResourceAccessManagerServiceRolePolicy attached. This role permits RAM to retrieve information about the organization and its structure. This lets you share resources with all of the accounts in the calling account's organization by specifying the organization ID, or all of the accounts in an organizational unit (OU) by specifying the OU ID. Until you enable sharing within the organization, you can specify only individual Amazon Web Services accounts, or for supported resource types, IAM roles and users. You must call this operation from an IAM role or user in the organization's management account. 
    */
  def enableSharingWithAwsOrganization(params: EnableSharingWithAwsOrganizationRequest): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  def enableSharingWithAwsOrganization(
    params: EnableSharingWithAwsOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSharingWithAwsOrganizationResponse, Unit]
  ): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  
  /**
    * Retrieves the contents of a managed permission in JSON format.
    */
  def getPermission(): Request[GetPermissionResponse, AWSError] = js.native
  def getPermission(callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionResponse, Unit]): Request[GetPermissionResponse, AWSError] = js.native
  /**
    * Retrieves the contents of a managed permission in JSON format.
    */
  def getPermission(params: GetPermissionRequest): Request[GetPermissionResponse, AWSError] = js.native
  def getPermission(
    params: GetPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionResponse, Unit]
  ): Request[GetPermissionResponse, AWSError] = js.native
  
  /**
    * Retrieves the resource policies for the specified resources that you own and have shared.
    */
  def getResourcePolicies(): Request[GetResourcePoliciesResponse, AWSError] = js.native
  def getResourcePolicies(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePoliciesResponse, Unit]): Request[GetResourcePoliciesResponse, AWSError] = js.native
  /**
    * Retrieves the resource policies for the specified resources that you own and have shared.
    */
  def getResourcePolicies(params: GetResourcePoliciesRequest): Request[GetResourcePoliciesResponse, AWSError] = js.native
  def getResourcePolicies(
    params: GetResourcePoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePoliciesResponse, Unit]
  ): Request[GetResourcePoliciesResponse, AWSError] = js.native
  
  /**
    * Retrieves the lists of resources and principals that associated for resource shares that you own.
    */
  def getResourceShareAssociations(): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  def getResourceShareAssociations(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareAssociationsResponse, Unit]): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  /**
    * Retrieves the lists of resources and principals that associated for resource shares that you own.
    */
  def getResourceShareAssociations(params: GetResourceShareAssociationsRequest): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  def getResourceShareAssociations(
    params: GetResourceShareAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareAssociationsResponse, Unit]
  ): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  
  /**
    * Retrieves details about invitations that you have received for resource shares.
    */
  def getResourceShareInvitations(): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  def getResourceShareInvitations(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareInvitationsResponse, Unit]): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  /**
    * Retrieves details about invitations that you have received for resource shares.
    */
  def getResourceShareInvitations(params: GetResourceShareInvitationsRequest): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  def getResourceShareInvitations(
    params: GetResourceShareInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareInvitationsResponse, Unit]
  ): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  
  /**
    * Retrieves details about the resource shares that you own or that are shared with you.
    */
  def getResourceShares(): Request[GetResourceSharesResponse, AWSError] = js.native
  def getResourceShares(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceSharesResponse, Unit]): Request[GetResourceSharesResponse, AWSError] = js.native
  /**
    * Retrieves details about the resource shares that you own or that are shared with you.
    */
  def getResourceShares(params: GetResourceSharesRequest): Request[GetResourceSharesResponse, AWSError] = js.native
  def getResourceShares(
    params: GetResourceSharesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceSharesResponse, Unit]
  ): Request[GetResourceSharesResponse, AWSError] = js.native
  
  /**
    * Lists the resources in a resource share that is shared with you but for which the invitation is still PENDING. That means that you haven't accepted or rejected the invitation and the invitation hasn't expired.
    */
  def listPendingInvitationResources(): Request[ListPendingInvitationResourcesResponse, AWSError] = js.native
  def listPendingInvitationResources(
    callback: js.Function2[/* err */ AWSError, /* data */ ListPendingInvitationResourcesResponse, Unit]
  ): Request[ListPendingInvitationResourcesResponse, AWSError] = js.native
  /**
    * Lists the resources in a resource share that is shared with you but for which the invitation is still PENDING. That means that you haven't accepted or rejected the invitation and the invitation hasn't expired.
    */
  def listPendingInvitationResources(params: ListPendingInvitationResourcesRequest): Request[ListPendingInvitationResourcesResponse, AWSError] = js.native
  def listPendingInvitationResources(
    params: ListPendingInvitationResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPendingInvitationResourcesResponse, Unit]
  ): Request[ListPendingInvitationResourcesResponse, AWSError] = js.native
  
  /**
    * Lists information about the managed permission and its associations to any resource shares that use this managed permission. This lets you see which resource shares use which versions of the specified managed permission.
    */
  def listPermissionAssociations(): Request[ListPermissionAssociationsResponse, AWSError] = js.native
  def listPermissionAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionAssociationsResponse, Unit]): Request[ListPermissionAssociationsResponse, AWSError] = js.native
  /**
    * Lists information about the managed permission and its associations to any resource shares that use this managed permission. This lets you see which resource shares use which versions of the specified managed permission.
    */
  def listPermissionAssociations(params: ListPermissionAssociationsRequest): Request[ListPermissionAssociationsResponse, AWSError] = js.native
  def listPermissionAssociations(
    params: ListPermissionAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionAssociationsResponse, Unit]
  ): Request[ListPermissionAssociationsResponse, AWSError] = js.native
  
  /**
    * Lists the available versions of the specified RAM permission.
    */
  def listPermissionVersions(): Request[ListPermissionVersionsResponse, AWSError] = js.native
  def listPermissionVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionVersionsResponse, Unit]): Request[ListPermissionVersionsResponse, AWSError] = js.native
  /**
    * Lists the available versions of the specified RAM permission.
    */
  def listPermissionVersions(params: ListPermissionVersionsRequest): Request[ListPermissionVersionsResponse, AWSError] = js.native
  def listPermissionVersions(
    params: ListPermissionVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionVersionsResponse, Unit]
  ): Request[ListPermissionVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of available RAM permissions that you can use for the supported resource types. 
    */
  def listPermissions(): Request[ListPermissionsResponse, AWSError] = js.native
  def listPermissions(callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionsResponse, Unit]): Request[ListPermissionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of available RAM permissions that you can use for the supported resource types. 
    */
  def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse, AWSError] = js.native
  def listPermissions(
    params: ListPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionsResponse, Unit]
  ): Request[ListPermissionsResponse, AWSError] = js.native
  
  /**
    * Lists the principals that you are sharing resources with or that are sharing resources with you.
    */
  def listPrincipals(): Request[ListPrincipalsResponse, AWSError] = js.native
  def listPrincipals(callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalsResponse, Unit]): Request[ListPrincipalsResponse, AWSError] = js.native
  /**
    * Lists the principals that you are sharing resources with or that are sharing resources with you.
    */
  def listPrincipals(params: ListPrincipalsRequest): Request[ListPrincipalsResponse, AWSError] = js.native
  def listPrincipals(
    params: ListPrincipalsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalsResponse, Unit]
  ): Request[ListPrincipalsResponse, AWSError] = js.native
  
  /**
    * Retrieves the current status of the asynchronous tasks performed by RAM when you perform the ReplacePermissionAssociationsWork operation.
    */
  def listReplacePermissionAssociationsWork(): Request[ListReplacePermissionAssociationsWorkResponse, AWSError] = js.native
  def listReplacePermissionAssociationsWork(
    callback: js.Function2[/* err */ AWSError, /* data */ ListReplacePermissionAssociationsWorkResponse, Unit]
  ): Request[ListReplacePermissionAssociationsWorkResponse, AWSError] = js.native
  /**
    * Retrieves the current status of the asynchronous tasks performed by RAM when you perform the ReplacePermissionAssociationsWork operation.
    */
  def listReplacePermissionAssociationsWork(params: ListReplacePermissionAssociationsWorkRequest): Request[ListReplacePermissionAssociationsWorkResponse, AWSError] = js.native
  def listReplacePermissionAssociationsWork(
    params: ListReplacePermissionAssociationsWorkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReplacePermissionAssociationsWorkResponse, Unit]
  ): Request[ListReplacePermissionAssociationsWorkResponse, AWSError] = js.native
  
  /**
    * Lists the RAM permissions that are associated with a resource share.
    */
  def listResourceSharePermissions(): Request[ListResourceSharePermissionsResponse, AWSError] = js.native
  def listResourceSharePermissions(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceSharePermissionsResponse, Unit]): Request[ListResourceSharePermissionsResponse, AWSError] = js.native
  /**
    * Lists the RAM permissions that are associated with a resource share.
    */
  def listResourceSharePermissions(params: ListResourceSharePermissionsRequest): Request[ListResourceSharePermissionsResponse, AWSError] = js.native
  def listResourceSharePermissions(
    params: ListResourceSharePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceSharePermissionsResponse, Unit]
  ): Request[ListResourceSharePermissionsResponse, AWSError] = js.native
  
  /**
    * Lists the resource types that can be shared by RAM.
    */
  def listResourceTypes(): Request[ListResourceTypesResponse, AWSError] = js.native
  def listResourceTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceTypesResponse, Unit]): Request[ListResourceTypesResponse, AWSError] = js.native
  /**
    * Lists the resource types that can be shared by RAM.
    */
  def listResourceTypes(params: ListResourceTypesRequest): Request[ListResourceTypesResponse, AWSError] = js.native
  def listResourceTypes(
    params: ListResourceTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceTypesResponse, Unit]
  ): Request[ListResourceTypesResponse, AWSError] = js.native
  
  /**
    * Lists the resources that you added to a resource share or the resources that are shared with you.
    */
  def listResources(): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]): Request[ListResourcesResponse, AWSError] = js.native
  /**
    * Lists the resources that you added to a resource share or the resources that are shared with you.
    */
  def listResources(params: ListResourcesRequest): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(
    params: ListResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]
  ): Request[ListResourcesResponse, AWSError] = js.native
  
  /**
    * When you attach a resource-based policy to a resource, RAM automatically creates a resource share of featureSet=CREATED_FROM_POLICY with a managed permission that has the same IAM permissions as the original resource-based policy. However, this type of managed permission is visible to only the resource share owner, and the associated resource share can't be modified by using RAM. This operation creates a separate, fully manageable customer managed permission that has the same IAM permissions as the original resource-based policy. You can associate this customer managed permission to any resource shares. Before you use PromoteResourceShareCreatedFromPolicy, you should first run this operation to ensure that you have an appropriate customer managed permission that can be associated with the promoted resource share.    The original CREATED_FROM_POLICY policy isn't deleted, and resource shares using that original policy aren't automatically updated.   You can't modify a CREATED_FROM_POLICY resource share so you can't associate the new customer managed permission by using ReplacePermsissionAssociations. However, if you use PromoteResourceShareCreatedFromPolicy, that operation automatically associates the fully manageable customer managed permission to the newly promoted STANDARD resource share.   After you promote a resource share, if the original CREATED_FROM_POLICY managed permission has no other associations to A resource share, then RAM automatically deletes it.   
    */
  def promotePermissionCreatedFromPolicy(): Request[PromotePermissionCreatedFromPolicyResponse, AWSError] = js.native
  def promotePermissionCreatedFromPolicy(
    callback: js.Function2[/* err */ AWSError, /* data */ PromotePermissionCreatedFromPolicyResponse, Unit]
  ): Request[PromotePermissionCreatedFromPolicyResponse, AWSError] = js.native
  /**
    * When you attach a resource-based policy to a resource, RAM automatically creates a resource share of featureSet=CREATED_FROM_POLICY with a managed permission that has the same IAM permissions as the original resource-based policy. However, this type of managed permission is visible to only the resource share owner, and the associated resource share can't be modified by using RAM. This operation creates a separate, fully manageable customer managed permission that has the same IAM permissions as the original resource-based policy. You can associate this customer managed permission to any resource shares. Before you use PromoteResourceShareCreatedFromPolicy, you should first run this operation to ensure that you have an appropriate customer managed permission that can be associated with the promoted resource share.    The original CREATED_FROM_POLICY policy isn't deleted, and resource shares using that original policy aren't automatically updated.   You can't modify a CREATED_FROM_POLICY resource share so you can't associate the new customer managed permission by using ReplacePermsissionAssociations. However, if you use PromoteResourceShareCreatedFromPolicy, that operation automatically associates the fully manageable customer managed permission to the newly promoted STANDARD resource share.   After you promote a resource share, if the original CREATED_FROM_POLICY managed permission has no other associations to A resource share, then RAM automatically deletes it.   
    */
  def promotePermissionCreatedFromPolicy(params: PromotePermissionCreatedFromPolicyRequest): Request[PromotePermissionCreatedFromPolicyResponse, AWSError] = js.native
  def promotePermissionCreatedFromPolicy(
    params: PromotePermissionCreatedFromPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PromotePermissionCreatedFromPolicyResponse, Unit]
  ): Request[PromotePermissionCreatedFromPolicyResponse, AWSError] = js.native
  
  /**
    * When you attach a resource-based policy to a resource, RAM automatically creates a resource share of featureSet=CREATED_FROM_POLICY with a managed permission that has the same IAM permissions as the original resource-based policy. However, this type of managed permission is visible to only the resource share owner, and the associated resource share can't be modified by using RAM. This operation promotes the resource share to a STANDARD resource share that is fully manageable in RAM. When you promote a resource share, you can then manage the resource share in RAM and it becomes visible to all of the principals you shared it with.  Before you perform this operation, you should first run PromotePermissionCreatedFromPolicyto ensure that you have an appropriate customer managed permission that can be associated with this resource share after its is promoted. If this operation can't find a managed permission that exactly matches the existing CREATED_FROM_POLICY permission, then this operation fails. 
    */
  def promoteResourceShareCreatedFromPolicy(): Request[PromoteResourceShareCreatedFromPolicyResponse, AWSError] = js.native
  def promoteResourceShareCreatedFromPolicy(
    callback: js.Function2[/* err */ AWSError, /* data */ PromoteResourceShareCreatedFromPolicyResponse, Unit]
  ): Request[PromoteResourceShareCreatedFromPolicyResponse, AWSError] = js.native
  /**
    * When you attach a resource-based policy to a resource, RAM automatically creates a resource share of featureSet=CREATED_FROM_POLICY with a managed permission that has the same IAM permissions as the original resource-based policy. However, this type of managed permission is visible to only the resource share owner, and the associated resource share can't be modified by using RAM. This operation promotes the resource share to a STANDARD resource share that is fully manageable in RAM. When you promote a resource share, you can then manage the resource share in RAM and it becomes visible to all of the principals you shared it with.  Before you perform this operation, you should first run PromotePermissionCreatedFromPolicyto ensure that you have an appropriate customer managed permission that can be associated with this resource share after its is promoted. If this operation can't find a managed permission that exactly matches the existing CREATED_FROM_POLICY permission, then this operation fails. 
    */
  def promoteResourceShareCreatedFromPolicy(params: PromoteResourceShareCreatedFromPolicyRequest): Request[PromoteResourceShareCreatedFromPolicyResponse, AWSError] = js.native
  def promoteResourceShareCreatedFromPolicy(
    params: PromoteResourceShareCreatedFromPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PromoteResourceShareCreatedFromPolicyResponse, Unit]
  ): Request[PromoteResourceShareCreatedFromPolicyResponse, AWSError] = js.native
  
  /**
    * Rejects an invitation to a resource share from another Amazon Web Services account.
    */
  def rejectResourceShareInvitation(): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  def rejectResourceShareInvitation(callback: js.Function2[/* err */ AWSError, /* data */ RejectResourceShareInvitationResponse, Unit]): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  /**
    * Rejects an invitation to a resource share from another Amazon Web Services account.
    */
  def rejectResourceShareInvitation(params: RejectResourceShareInvitationRequest): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  def rejectResourceShareInvitation(
    params: RejectResourceShareInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectResourceShareInvitationResponse, Unit]
  ): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  
  /**
    * Updates all resource shares that use a managed permission to a different managed permission. This operation always applies the default version of the target managed permission. You can optionally specify that the update applies to only resource shares that currently use a specified version. This enables you to update to the latest version, without changing the which managed permission is used. You can use this operation to update all of your resource shares to use the current default version of the permission by specifying the same value for the fromPermissionArn and toPermissionArn parameters. You can use the optional fromPermissionVersion parameter to update only those resources that use a specified version of the managed permission to the new managed permission.  To successfully perform this operation, you must have permission to update the resource-based policy on all affected resource types. 
    */
  def replacePermissionAssociations(): Request[ReplacePermissionAssociationsResponse, AWSError] = js.native
  def replacePermissionAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ReplacePermissionAssociationsResponse, Unit]): Request[ReplacePermissionAssociationsResponse, AWSError] = js.native
  /**
    * Updates all resource shares that use a managed permission to a different managed permission. This operation always applies the default version of the target managed permission. You can optionally specify that the update applies to only resource shares that currently use a specified version. This enables you to update to the latest version, without changing the which managed permission is used. You can use this operation to update all of your resource shares to use the current default version of the permission by specifying the same value for the fromPermissionArn and toPermissionArn parameters. You can use the optional fromPermissionVersion parameter to update only those resources that use a specified version of the managed permission to the new managed permission.  To successfully perform this operation, you must have permission to update the resource-based policy on all affected resource types. 
    */
  def replacePermissionAssociations(params: ReplacePermissionAssociationsRequest): Request[ReplacePermissionAssociationsResponse, AWSError] = js.native
  def replacePermissionAssociations(
    params: ReplacePermissionAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplacePermissionAssociationsResponse, Unit]
  ): Request[ReplacePermissionAssociationsResponse, AWSError] = js.native
  
  /**
    * Designates the specified version number as the default version for the specified customer managed permission. New resource shares automatically use this new default permission. Existing resource shares continue to use their original permission version, but you can use ReplacePermissionAssociations to update them.
    */
  def setDefaultPermissionVersion(): Request[SetDefaultPermissionVersionResponse, AWSError] = js.native
  def setDefaultPermissionVersion(callback: js.Function2[/* err */ AWSError, /* data */ SetDefaultPermissionVersionResponse, Unit]): Request[SetDefaultPermissionVersionResponse, AWSError] = js.native
  /**
    * Designates the specified version number as the default version for the specified customer managed permission. New resource shares automatically use this new default permission. Existing resource shares continue to use their original permission version, but you can use ReplacePermissionAssociations to update them.
    */
  def setDefaultPermissionVersion(params: SetDefaultPermissionVersionRequest): Request[SetDefaultPermissionVersionResponse, AWSError] = js.native
  def setDefaultPermissionVersion(
    params: SetDefaultPermissionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetDefaultPermissionVersionResponse, Unit]
  ): Request[SetDefaultPermissionVersionResponse, AWSError] = js.native
  
  /**
    * Adds the specified tag keys and values to a resource share or managed permission. If you choose a resource share, the tags are attached to only the resource share, not to the resources that are in the resource share. The tags on a managed permission are the same for all versions of the managed permission.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tag keys and values to a resource share or managed permission. If you choose a resource share, the tags are attached to only the resource share, not to the resources that are in the resource share. The tags on a managed permission are the same for all versions of the managed permission.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified tag key and value pairs from the specified resource share or managed permission.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tag key and value pairs from the specified resource share or managed permission.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Modifies some of the properties of the specified resource share.
    */
  def updateResourceShare(): Request[UpdateResourceShareResponse, AWSError] = js.native
  def updateResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceShareResponse, Unit]): Request[UpdateResourceShareResponse, AWSError] = js.native
  /**
    * Modifies some of the properties of the specified resource share.
    */
  def updateResourceShare(params: UpdateResourceShareRequest): Request[UpdateResourceShareResponse, AWSError] = js.native
  def updateResourceShare(
    params: UpdateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceShareResponse, Unit]
  ): Request[UpdateResourceShareResponse, AWSError] = js.native
}
