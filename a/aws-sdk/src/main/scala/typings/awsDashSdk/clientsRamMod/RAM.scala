package typings.awsDashSdk.clientsRamMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RAM extends Service {
  @JSName("config")
  var config_RAM: ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts an invitation to a resource share from another AWS account.
    */
  def acceptResourceShareInvitation(): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  def acceptResourceShareInvitation(callback: js.Function2[/* err */ AWSError, /* data */ AcceptResourceShareInvitationResponse, Unit]): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  /**
    * Accepts an invitation to a resource share from another AWS account.
    */
  def acceptResourceShareInvitation(params: AcceptResourceShareInvitationRequest): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  def acceptResourceShareInvitation(
    params: AcceptResourceShareInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptResourceShareInvitationResponse, Unit]
  ): Request[AcceptResourceShareInvitationResponse, AWSError] = js.native
  /**
    * Associates the specified resource share with the specified principals and resources.
    */
  def associateResourceShare(): Request[AssociateResourceShareResponse, AWSError] = js.native
  def associateResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceShareResponse, Unit]): Request[AssociateResourceShareResponse, AWSError] = js.native
  /**
    * Associates the specified resource share with the specified principals and resources.
    */
  def associateResourceShare(params: AssociateResourceShareRequest): Request[AssociateResourceShareResponse, AWSError] = js.native
  def associateResourceShare(
    params: AssociateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceShareResponse, Unit]
  ): Request[AssociateResourceShareResponse, AWSError] = js.native
  /**
    * Creates a resource share.
    */
  def createResourceShare(): Request[CreateResourceShareResponse, AWSError] = js.native
  def createResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceShareResponse, Unit]): Request[CreateResourceShareResponse, AWSError] = js.native
  /**
    * Creates a resource share.
    */
  def createResourceShare(params: CreateResourceShareRequest): Request[CreateResourceShareResponse, AWSError] = js.native
  def createResourceShare(
    params: CreateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceShareResponse, Unit]
  ): Request[CreateResourceShareResponse, AWSError] = js.native
  /**
    * Deletes the specified resource share.
    */
  def deleteResourceShare(): Request[DeleteResourceShareResponse, AWSError] = js.native
  def deleteResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceShareResponse, Unit]): Request[DeleteResourceShareResponse, AWSError] = js.native
  /**
    * Deletes the specified resource share.
    */
  def deleteResourceShare(params: DeleteResourceShareRequest): Request[DeleteResourceShareResponse, AWSError] = js.native
  def deleteResourceShare(
    params: DeleteResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceShareResponse, Unit]
  ): Request[DeleteResourceShareResponse, AWSError] = js.native
  /**
    * Disassociates the specified principals or resources from the specified resource share.
    */
  def disassociateResourceShare(): Request[DisassociateResourceShareResponse, AWSError] = js.native
  def disassociateResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceShareResponse, Unit]): Request[DisassociateResourceShareResponse, AWSError] = js.native
  /**
    * Disassociates the specified principals or resources from the specified resource share.
    */
  def disassociateResourceShare(params: DisassociateResourceShareRequest): Request[DisassociateResourceShareResponse, AWSError] = js.native
  def disassociateResourceShare(
    params: DisassociateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceShareResponse, Unit]
  ): Request[DisassociateResourceShareResponse, AWSError] = js.native
  /**
    * Enables resource sharing within your organization.
    */
  def enableSharingWithAwsOrganization(): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  def enableSharingWithAwsOrganization(
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSharingWithAwsOrganizationResponse, Unit]
  ): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  /**
    * Enables resource sharing within your organization.
    */
  def enableSharingWithAwsOrganization(params: EnableSharingWithAwsOrganizationRequest): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  def enableSharingWithAwsOrganization(
    params: EnableSharingWithAwsOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSharingWithAwsOrganizationResponse, Unit]
  ): Request[EnableSharingWithAwsOrganizationResponse, AWSError] = js.native
  /**
    * Gets the policies for the specifies resources.
    */
  def getResourcePolicies(): Request[GetResourcePoliciesResponse, AWSError] = js.native
  def getResourcePolicies(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePoliciesResponse, Unit]): Request[GetResourcePoliciesResponse, AWSError] = js.native
  /**
    * Gets the policies for the specifies resources.
    */
  def getResourcePolicies(params: GetResourcePoliciesRequest): Request[GetResourcePoliciesResponse, AWSError] = js.native
  def getResourcePolicies(
    params: GetResourcePoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePoliciesResponse, Unit]
  ): Request[GetResourcePoliciesResponse, AWSError] = js.native
  /**
    * Gets the associations for the specified resource share.
    */
  def getResourceShareAssociations(): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  def getResourceShareAssociations(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareAssociationsResponse, Unit]): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  /**
    * Gets the associations for the specified resource share.
    */
  def getResourceShareAssociations(params: GetResourceShareAssociationsRequest): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  def getResourceShareAssociations(
    params: GetResourceShareAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareAssociationsResponse, Unit]
  ): Request[GetResourceShareAssociationsResponse, AWSError] = js.native
  /**
    * Gets the specified invitations for resource sharing.
    */
  def getResourceShareInvitations(): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  def getResourceShareInvitations(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareInvitationsResponse, Unit]): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  /**
    * Gets the specified invitations for resource sharing.
    */
  def getResourceShareInvitations(params: GetResourceShareInvitationsRequest): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  def getResourceShareInvitations(
    params: GetResourceShareInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceShareInvitationsResponse, Unit]
  ): Request[GetResourceShareInvitationsResponse, AWSError] = js.native
  /**
    * Gets the specified resource shares or all of your resource shares.
    */
  def getResourceShares(): Request[GetResourceSharesResponse, AWSError] = js.native
  def getResourceShares(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceSharesResponse, Unit]): Request[GetResourceSharesResponse, AWSError] = js.native
  /**
    * Gets the specified resource shares or all of your resource shares.
    */
  def getResourceShares(params: GetResourceSharesRequest): Request[GetResourceSharesResponse, AWSError] = js.native
  def getResourceShares(
    params: GetResourceSharesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceSharesResponse, Unit]
  ): Request[GetResourceSharesResponse, AWSError] = js.native
  /**
    * Lists the principals with access to the specified resource.
    */
  def listPrincipals(): Request[ListPrincipalsResponse, AWSError] = js.native
  def listPrincipals(callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalsResponse, Unit]): Request[ListPrincipalsResponse, AWSError] = js.native
  /**
    * Lists the principals with access to the specified resource.
    */
  def listPrincipals(params: ListPrincipalsRequest): Request[ListPrincipalsResponse, AWSError] = js.native
  def listPrincipals(
    params: ListPrincipalsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPrincipalsResponse, Unit]
  ): Request[ListPrincipalsResponse, AWSError] = js.native
  /**
    * Lists the resources that the specified principal can access.
    */
  def listResources(): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]): Request[ListResourcesResponse, AWSError] = js.native
  /**
    * Lists the resources that the specified principal can access.
    */
  def listResources(params: ListResourcesRequest): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(
    params: ListResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]
  ): Request[ListResourcesResponse, AWSError] = js.native
  /**
    * Rejects an invitation to a resource share from another AWS account.
    */
  def rejectResourceShareInvitation(): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  def rejectResourceShareInvitation(callback: js.Function2[/* err */ AWSError, /* data */ RejectResourceShareInvitationResponse, Unit]): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  /**
    * Rejects an invitation to a resource share from another AWS account.
    */
  def rejectResourceShareInvitation(params: RejectResourceShareInvitationRequest): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  def rejectResourceShareInvitation(
    params: RejectResourceShareInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectResourceShareInvitationResponse, Unit]
  ): Request[RejectResourceShareInvitationResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource share.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource share.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource share.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource share.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates the specified resource share.
    */
  def updateResourceShare(): Request[UpdateResourceShareResponse, AWSError] = js.native
  def updateResourceShare(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceShareResponse, Unit]): Request[UpdateResourceShareResponse, AWSError] = js.native
  /**
    * Updates the specified resource share.
    */
  def updateResourceShare(params: UpdateResourceShareRequest): Request[UpdateResourceShareResponse, AWSError] = js.native
  def updateResourceShare(
    params: UpdateResourceShareRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceShareResponse, Unit]
  ): Request[UpdateResourceShareResponse, AWSError] = js.native
}

