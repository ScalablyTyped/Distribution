package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RAM
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_RAM: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts an invitation to a resource share from another AWS account.
    */
  def acceptResourceShareInvitation(): awsDashSdkLib.libRequestMod.Request[AcceptResourceShareInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptResourceShareInvitation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptResourceShareInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AcceptResourceShareInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Accepts an invitation to a resource share from another AWS account.
    */
  def acceptResourceShareInvitation(params: AcceptResourceShareInvitationRequest): awsDashSdkLib.libRequestMod.Request[AcceptResourceShareInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptResourceShareInvitation(
    params: AcceptResourceShareInvitationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptResourceShareInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AcceptResourceShareInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified resource share with the specified principals and resources.
    */
  def associateResourceShare(): awsDashSdkLib.libRequestMod.Request[AssociateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateResourceShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified resource share with the specified principals and resources.
    */
  def associateResourceShare(params: AssociateResourceShareRequest): awsDashSdkLib.libRequestMod.Request[AssociateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateResourceShare(
    params: AssociateResourceShareRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a resource share.
    */
  def createResourceShare(): awsDashSdkLib.libRequestMod.Request[CreateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResourceShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a resource share.
    */
  def createResourceShare(params: CreateResourceShareRequest): awsDashSdkLib.libRequestMod.Request[CreateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResourceShare(
    params: CreateResourceShareRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified resource share.
    */
  def deleteResourceShare(): awsDashSdkLib.libRequestMod.Request[DeleteResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResourceShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified resource share.
    */
  def deleteResourceShare(params: DeleteResourceShareRequest): awsDashSdkLib.libRequestMod.Request[DeleteResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResourceShare(
    params: DeleteResourceShareRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified principals or resources from the specified resource share.
    */
  def disassociateResourceShare(): awsDashSdkLib.libRequestMod.Request[DisassociateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateResourceShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified principals or resources from the specified resource share.
    */
  def disassociateResourceShare(params: DisassociateResourceShareRequest): awsDashSdkLib.libRequestMod.Request[DisassociateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateResourceShare(
    params: DisassociateResourceShareRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables resource sharing within your organization.
    */
  def enableSharingWithAwsOrganization(): awsDashSdkLib.libRequestMod.Request[EnableSharingWithAwsOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableSharingWithAwsOrganization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableSharingWithAwsOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableSharingWithAwsOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables resource sharing within your organization.
    */
  def enableSharingWithAwsOrganization(params: EnableSharingWithAwsOrganizationRequest): awsDashSdkLib.libRequestMod.Request[EnableSharingWithAwsOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableSharingWithAwsOrganization(
    params: EnableSharingWithAwsOrganizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableSharingWithAwsOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableSharingWithAwsOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the policies for the specifies resources.
    */
  def getResourcePolicies(): awsDashSdkLib.libRequestMod.Request[GetResourcePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourcePolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourcePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourcePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the policies for the specifies resources.
    */
  def getResourcePolicies(params: GetResourcePoliciesRequest): awsDashSdkLib.libRequestMod.Request[GetResourcePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourcePolicies(
    params: GetResourcePoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourcePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourcePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the associations for the specified resource share.
    */
  def getResourceShareAssociations(): awsDashSdkLib.libRequestMod.Request[GetResourceShareAssociationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourceShareAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourceShareAssociationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourceShareAssociationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the associations for the specified resource share.
    */
  def getResourceShareAssociations(params: GetResourceShareAssociationsRequest): awsDashSdkLib.libRequestMod.Request[GetResourceShareAssociationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourceShareAssociations(
    params: GetResourceShareAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourceShareAssociationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourceShareAssociationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified invitations for resource sharing.
    */
  def getResourceShareInvitations(): awsDashSdkLib.libRequestMod.Request[GetResourceShareInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourceShareInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourceShareInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourceShareInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified invitations for resource sharing.
    */
  def getResourceShareInvitations(params: GetResourceShareInvitationsRequest): awsDashSdkLib.libRequestMod.Request[GetResourceShareInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourceShareInvitations(
    params: GetResourceShareInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourceShareInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourceShareInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified resource shares or all of your resource shares.
    */
  def getResourceShares(): awsDashSdkLib.libRequestMod.Request[GetResourceSharesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourceShares(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourceSharesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourceSharesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified resource shares or all of your resource shares.
    */
  def getResourceShares(params: GetResourceSharesRequest): awsDashSdkLib.libRequestMod.Request[GetResourceSharesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourceShares(
    params: GetResourceSharesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourceSharesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourceSharesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the principals with access to the specified resource.
    */
  def listPrincipals(): awsDashSdkLib.libRequestMod.Request[ListPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPrincipals(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPrincipalsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the principals with access to the specified resource.
    */
  def listPrincipals(params: ListPrincipalsRequest): awsDashSdkLib.libRequestMod.Request[ListPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPrincipals(
    params: ListPrincipalsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPrincipalsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the resources that the specified principal can access.
    */
  def listResources(): awsDashSdkLib.libRequestMod.Request[ListResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the resources that the specified principal can access.
    */
  def listResources(params: ListResourcesRequest): awsDashSdkLib.libRequestMod.Request[ListResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResources(
    params: ListResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Rejects an invitation to a resource share from another AWS account.
    */
  def rejectResourceShareInvitation(): awsDashSdkLib.libRequestMod.Request[RejectResourceShareInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rejectResourceShareInvitation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RejectResourceShareInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RejectResourceShareInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Rejects an invitation to a resource share from another AWS account.
    */
  def rejectResourceShareInvitation(params: RejectResourceShareInvitationRequest): awsDashSdkLib.libRequestMod.Request[RejectResourceShareInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rejectResourceShareInvitation(
    params: RejectResourceShareInvitationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RejectResourceShareInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RejectResourceShareInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource share.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource share.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource share.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource share.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified resource share.
    */
  def updateResourceShare(): awsDashSdkLib.libRequestMod.Request[UpdateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateResourceShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified resource share.
    */
  def updateResourceShare(params: UpdateResourceShareRequest): awsDashSdkLib.libRequestMod.Request[UpdateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateResourceShare(
    params: UpdateResourceShareRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateResourceShareResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

