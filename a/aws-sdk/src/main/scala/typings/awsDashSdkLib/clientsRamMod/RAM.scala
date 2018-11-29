package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RAM
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_RAM: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsRamMod.RAMNs.ClientConfiguration = js.native
  /**
     * Accepts an invitation to a resource share from another AWS account.
     */
  def acceptResourceShareInvitation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.AcceptResourceShareInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts an invitation to a resource share from another AWS account.
     */
  def acceptResourceShareInvitation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.AcceptResourceShareInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.AcceptResourceShareInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts an invitation to a resource share from another AWS account.
     */
  def acceptResourceShareInvitation(params: awsDashSdkLib.clientsRamMod.RAMNs.AcceptResourceShareInvitationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.AcceptResourceShareInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts an invitation to a resource share from another AWS account.
     */
  def acceptResourceShareInvitation(
    params: awsDashSdkLib.clientsRamMod.RAMNs.AcceptResourceShareInvitationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.AcceptResourceShareInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.AcceptResourceShareInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates the specified resource share with the specified principals and resources.
     */
  def associateResourceShare(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.AssociateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates the specified resource share with the specified principals and resources.
     */
  def associateResourceShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.AssociateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.AssociateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates the specified resource share with the specified principals and resources.
     */
  def associateResourceShare(params: awsDashSdkLib.clientsRamMod.RAMNs.AssociateResourceShareRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.AssociateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates the specified resource share with the specified principals and resources.
     */
  def associateResourceShare(
    params: awsDashSdkLib.clientsRamMod.RAMNs.AssociateResourceShareRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.AssociateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.AssociateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a resource share.
     */
  def createResourceShare(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.CreateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a resource share.
     */
  def createResourceShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.CreateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.CreateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a resource share.
     */
  def createResourceShare(params: awsDashSdkLib.clientsRamMod.RAMNs.CreateResourceShareRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.CreateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a resource share.
     */
  def createResourceShare(
    params: awsDashSdkLib.clientsRamMod.RAMNs.CreateResourceShareRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.CreateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.CreateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified resource share.
     */
  def deleteResourceShare(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.DeleteResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified resource share.
     */
  def deleteResourceShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.DeleteResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.DeleteResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified resource share.
     */
  def deleteResourceShare(params: awsDashSdkLib.clientsRamMod.RAMNs.DeleteResourceShareRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.DeleteResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified resource share.
     */
  def deleteResourceShare(
    params: awsDashSdkLib.clientsRamMod.RAMNs.DeleteResourceShareRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.DeleteResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.DeleteResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified principals or resources from the specified resource share.
     */
  def disassociateResourceShare(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.DisassociateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified principals or resources from the specified resource share.
     */
  def disassociateResourceShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.DisassociateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.DisassociateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified principals or resources from the specified resource share.
     */
  def disassociateResourceShare(params: awsDashSdkLib.clientsRamMod.RAMNs.DisassociateResourceShareRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.DisassociateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the specified principals or resources from the specified resource share.
     */
  def disassociateResourceShare(
    params: awsDashSdkLib.clientsRamMod.RAMNs.DisassociateResourceShareRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.DisassociateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.DisassociateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enables resource sharing within your organization.
     */
  def enableSharingWithAwsOrganization(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.EnableSharingWithAwsOrganizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enables resource sharing within your organization.
     */
  def enableSharingWithAwsOrganization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.EnableSharingWithAwsOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.EnableSharingWithAwsOrganizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enables resource sharing within your organization.
     */
  def enableSharingWithAwsOrganization(params: awsDashSdkLib.clientsRamMod.RAMNs.EnableSharingWithAwsOrganizationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.EnableSharingWithAwsOrganizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enables resource sharing within your organization.
     */
  def enableSharingWithAwsOrganization(
    params: awsDashSdkLib.clientsRamMod.RAMNs.EnableSharingWithAwsOrganizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.EnableSharingWithAwsOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.EnableSharingWithAwsOrganizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the policies for the specifies resources.
     */
  def getResourcePolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourcePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the policies for the specifies resources.
     */
  def getResourcePolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.GetResourcePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourcePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the policies for the specifies resources.
     */
  def getResourcePolicies(params: awsDashSdkLib.clientsRamMod.RAMNs.GetResourcePoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourcePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the policies for the specifies resources.
     */
  def getResourcePolicies(
    params: awsDashSdkLib.clientsRamMod.RAMNs.GetResourcePoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.GetResourcePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourcePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the associations for the specified resource share.
     */
  def getResourceShareAssociations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareAssociationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the associations for the specified resource share.
     */
  def getResourceShareAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareAssociationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareAssociationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the associations for the specified resource share.
     */
  def getResourceShareAssociations(params: awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareAssociationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareAssociationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the associations for the specified resource share.
     */
  def getResourceShareAssociations(
    params: awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareAssociationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareAssociationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the specified invitations for resource sharing.
     */
  def getResourceShareInvitations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the specified invitations for resource sharing.
     */
  def getResourceShareInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the specified invitations for resource sharing.
     */
  def getResourceShareInvitations(params: awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareInvitationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the specified invitations for resource sharing.
     */
  def getResourceShareInvitations(
    params: awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourceShareInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the specified resource shares or all of your resource shares.
     */
  def getResourceShares(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourceSharesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the specified resource shares or all of your resource shares.
     */
  def getResourceShares(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.GetResourceSharesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourceSharesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the specified resource shares or all of your resource shares.
     */
  def getResourceShares(params: awsDashSdkLib.clientsRamMod.RAMNs.GetResourceSharesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourceSharesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the specified resource shares or all of your resource shares.
     */
  def getResourceShares(
    params: awsDashSdkLib.clientsRamMod.RAMNs.GetResourceSharesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.GetResourceSharesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.GetResourceSharesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the principals with access to the specified resource.
     */
  def listPrincipals(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.ListPrincipalsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the principals with access to the specified resource.
     */
  def listPrincipals(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.ListPrincipalsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.ListPrincipalsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the principals with access to the specified resource.
     */
  def listPrincipals(params: awsDashSdkLib.clientsRamMod.RAMNs.ListPrincipalsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.ListPrincipalsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the principals with access to the specified resource.
     */
  def listPrincipals(
    params: awsDashSdkLib.clientsRamMod.RAMNs.ListPrincipalsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.ListPrincipalsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.ListPrincipalsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resources that the specified principal can access.
     */
  def listResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.ListResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resources that the specified principal can access.
     */
  def listResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.ListResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.ListResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resources that the specified principal can access.
     */
  def listResources(params: awsDashSdkLib.clientsRamMod.RAMNs.ListResourcesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.ListResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resources that the specified principal can access.
     */
  def listResources(
    params: awsDashSdkLib.clientsRamMod.RAMNs.ListResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.ListResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.ListResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rejects an invitation to a resource share from another AWS account.
     */
  def rejectResourceShareInvitation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.RejectResourceShareInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rejects an invitation to a resource share from another AWS account.
     */
  def rejectResourceShareInvitation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.RejectResourceShareInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.RejectResourceShareInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rejects an invitation to a resource share from another AWS account.
     */
  def rejectResourceShareInvitation(params: awsDashSdkLib.clientsRamMod.RAMNs.RejectResourceShareInvitationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.RejectResourceShareInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rejects an invitation to a resource share from another AWS account.
     */
  def rejectResourceShareInvitation(
    params: awsDashSdkLib.clientsRamMod.RAMNs.RejectResourceShareInvitationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.RejectResourceShareInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.RejectResourceShareInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified tags to the specified resource share.
     */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified tags to the specified resource share.
     */
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified tags to the specified resource share.
     */
  def tagResource(params: awsDashSdkLib.clientsRamMod.RAMNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified tags to the specified resource share.
     */
  def tagResource(
    params: awsDashSdkLib.clientsRamMod.RAMNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified tags from the specified resource share.
     */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified tags from the specified resource share.
     */
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified tags from the specified resource share.
     */
  def untagResource(params: awsDashSdkLib.clientsRamMod.RAMNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified tags from the specified resource share.
     */
  def untagResource(
    params: awsDashSdkLib.clientsRamMod.RAMNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified resource share.
     */
  def updateResourceShare(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.UpdateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified resource share.
     */
  def updateResourceShare(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.UpdateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.UpdateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified resource share.
     */
  def updateResourceShare(params: awsDashSdkLib.clientsRamMod.RAMNs.UpdateResourceShareRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.UpdateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified resource share.
     */
  def updateResourceShare(
    params: awsDashSdkLib.clientsRamMod.RAMNs.UpdateResourceShareRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRamMod.RAMNs.UpdateResourceShareResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRamMod.RAMNs.UpdateResourceShareResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

