package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/ram", "RAM")
@js.native
object RAMNs extends js.Object {
  trait AcceptResourceShareInvitationRequest extends js.Object {
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the invitation.
      */
    var resourceShareInvitationArn: String
  }
  
  trait AcceptResourceShareInvitationResponse extends js.Object {
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the invitation.
      */
    var resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.undefined
  }
  
  trait AssociateResourceShareRequest extends js.Object {
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The principals.
      */
    var principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined
    /**
      * The Amazon Resource Names (ARN) of the resources.
      */
    var resourceArns: js.UndefOr[ResourceArnList] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    var resourceShareArn: String
  }
  
  trait AssociateResourceShareResponse extends js.Object {
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the associations.
      */
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateResourceShareRequest extends js.Object {
    /**
      * Indicates whether principals outside your organization can be associated with a resource share.
      */
    var allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the resource share.
      */
    var name: String
    /**
      * The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN of an OU or organization from AWS Organizations.
      */
    var principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined
    /**
      * The Amazon Resource Names (ARN) of the resources to associate with the resource share.
      */
    var resourceArns: js.UndefOr[ResourceArnList] = js.undefined
    /**
      * One or more tags.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateResourceShareResponse extends js.Object {
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the resource share.
      */
    var resourceShare: js.UndefOr[ResourceShare] = js.undefined
  }
  
  trait DeleteResourceShareRequest extends js.Object {
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    var resourceShareArn: String
  }
  
  trait DeleteResourceShareResponse extends js.Object {
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * Indicates whether the request succeeded.
      */
    var returnValue: js.UndefOr[Boolean] = js.undefined
  }
  
  trait DisassociateResourceShareRequest extends js.Object {
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The principals.
      */
    var principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined
    /**
      * The Amazon Resource Names (ARN) of the resources.
      */
    var resourceArns: js.UndefOr[ResourceArnList] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    var resourceShareArn: String
  }
  
  trait DisassociateResourceShareResponse extends js.Object {
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the associations.
      */
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
  }
  
  trait EnableSharingWithAwsOrganizationRequest extends js.Object
  
  trait EnableSharingWithAwsOrganizationResponse extends js.Object {
    /**
      * Indicates whether the request succeeded.
      */
    var returnValue: js.UndefOr[Boolean] = js.undefined
  }
  
  trait GetResourcePoliciesRequest extends js.Object {
    /**
      * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next page of results.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * The principal.
      */
    var principal: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Names (ARN) of the resources.
      */
    var resourceArns: ResourceArnList
  }
  
  trait GetResourcePoliciesResponse extends js.Object {
    /**
      * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * A key policy document, in JSON format.
      */
    var policies: js.UndefOr[PolicyList] = js.undefined
  }
  
  trait GetResourceShareAssociationsRequest extends js.Object {
    /**
      * The status of the association.
      */
    var associationStatus: js.UndefOr[ResourceShareAssociationStatus] = js.undefined
    /**
      * The association type.
      */
    var associationType: ResourceShareAssociationType
    /**
      * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next page of results.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * The principal.
      */
    var principal: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource.
      */
    var resourceArn: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Names (ARN) of the resource shares.
      */
    var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
  }
  
  trait GetResourceShareAssociationsResponse extends js.Object {
    /**
      * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the association.
      */
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
  }
  
  trait GetResourceShareInvitationsRequest extends js.Object {
    /**
      * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next page of results.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Names (ARN) of the resource shares.
      */
    var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
    /**
      * The Amazon Resource Names (ARN) of the invitations.
      */
    var resourceShareInvitationArns: js.UndefOr[ResourceShareInvitationArnList] = js.undefined
  }
  
  trait GetResourceShareInvitationsResponse extends js.Object {
    /**
      * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the invitations.
      */
    var resourceShareInvitations: js.UndefOr[ResourceShareInvitationList] = js.undefined
  }
  
  trait GetResourceSharesRequest extends js.Object {
    /**
      * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The name of the resource share.
      */
    var name: js.UndefOr[String] = js.undefined
    /**
      * The token for the next page of results.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * The type of owner.
      */
    var resourceOwner: ResourceOwner
    /**
      * The Amazon Resource Names (ARN) of the resource shares.
      */
    var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
    /**
      * The status of the resource share.
      */
    var resourceShareStatus: js.UndefOr[ResourceShareStatus] = js.undefined
    /**
      * One or more tag filters.
      */
    var tagFilters: js.UndefOr[TagFilters] = js.undefined
  }
  
  trait GetResourceSharesResponse extends js.Object {
    /**
      * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the resource shares.
      */
    var resourceShares: js.UndefOr[ResourceShareList] = js.undefined
  }
  
  trait ListPrincipalsRequest extends js.Object {
    /**
      * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next page of results.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * The principals.
      */
    var principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource.
      */
    var resourceArn: js.UndefOr[String] = js.undefined
    /**
      * The type of owner.
      */
    var resourceOwner: ResourceOwner
    /**
      * The Amazon Resource Names (ARN) of the resource shares.
      */
    var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
    /**
      * The resource type.
      */
    var resourceType: js.UndefOr[String] = js.undefined
  }
  
  trait ListPrincipalsResponse extends js.Object {
    /**
      * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * The principals.
      */
    var principals: js.UndefOr[PrincipalList] = js.undefined
  }
  
  trait ListResourcesRequest extends js.Object {
    /**
      * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next page of results.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * The principal.
      */
    var principal: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Names (ARN) of the resources.
      */
    var resourceArns: js.UndefOr[ResourceArnList] = js.undefined
    /**
      * The type of owner.
      */
    var resourceOwner: ResourceOwner
    /**
      * The Amazon Resource Names (ARN) of the resource shares.
      */
    var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
    /**
      * The resource type.
      */
    var resourceType: js.UndefOr[String] = js.undefined
  }
  
  trait ListResourcesResponse extends js.Object {
    /**
      * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the resources.
      */
    var resources: js.UndefOr[ResourceList] = js.undefined
  }
  
  trait Principal extends js.Object {
    /**
      * The time when the principal was associated with the resource share.
      */
    var creationTime: js.UndefOr[DateTime] = js.undefined
    /**
      * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
      */
    var external: js.UndefOr[Boolean] = js.undefined
    /**
      * The ID of the principal.
      */
    var id: js.UndefOr[String] = js.undefined
    /**
      * The time when the association was last updated.
      */
    var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    var resourceShareArn: js.UndefOr[String] = js.undefined
  }
  
  trait RejectResourceShareInvitationRequest extends js.Object {
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the invitation.
      */
    var resourceShareInvitationArn: String
  }
  
  trait RejectResourceShareInvitationResponse extends js.Object {
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the invitation.
      */
    var resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.undefined
  }
  
  trait Resource extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource.
      */
    var arn: js.UndefOr[String] = js.undefined
    /**
      * The time when the resource was associated with the resource share.
      */
    var creationTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The time when the association was last updated.
      */
    var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    var resourceShareArn: js.UndefOr[String] = js.undefined
    /**
      * The status of the resource.
      */
    var status: js.UndefOr[ResourceStatus] = js.undefined
    /**
      * A message about the status of the resource.
      */
    var statusMessage: js.UndefOr[String] = js.undefined
    /**
      * The resource type.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  
  trait ResourceShare extends js.Object {
    /**
      * Indicates whether principals outside your organization can be associated with a resource share.
      */
    var allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined
    /**
      * The time when the resource share was created.
      */
    var creationTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The time when the resource share was last updated.
      */
    var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The name of the resource share.
      */
    var name: js.UndefOr[String] = js.undefined
    /**
      * The ID of the AWS account that owns the resource share.
      */
    var owningAccountId: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    var resourceShareArn: js.UndefOr[String] = js.undefined
    /**
      * The status of the resource share.
      */
    var status: js.UndefOr[ResourceShareStatus] = js.undefined
    /**
      * A message about the status of the resource share.
      */
    var statusMessage: js.UndefOr[String] = js.undefined
    /**
      * The tags for the resource share.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait ResourceShareAssociation extends js.Object {
    /**
      * The associated entity. For resource associations, this is the ARN of the resource. For principal associations, this is the ID of an AWS account or the ARN of an OU or organization from AWS Organizations.
      */
    var associatedEntity: js.UndefOr[String] = js.undefined
    /**
      * The association type.
      */
    var associationType: js.UndefOr[ResourceShareAssociationType] = js.undefined
    /**
      * The time when the association was created.
      */
    var creationTime: js.UndefOr[DateTime] = js.undefined
    /**
      * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
      */
    var external: js.UndefOr[Boolean] = js.undefined
    /**
      * The time when the association was last updated.
      */
    var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    var resourceShareArn: js.UndefOr[String] = js.undefined
    /**
      * The status of the association.
      */
    var status: js.UndefOr[ResourceShareAssociationStatus] = js.undefined
    /**
      * A message about the status of the association.
      */
    var statusMessage: js.UndefOr[String] = js.undefined
  }
  
  trait ResourceShareInvitation extends js.Object {
    /**
      * The date and time when the invitation was sent.
      */
    var invitationTimestamp: js.UndefOr[DateTime] = js.undefined
    /**
      * The ID of the AWS account that received the invitation.
      */
    var receiverAccountId: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    var resourceShareArn: js.UndefOr[String] = js.undefined
    /**
      * The resources associated with the resource share.
      */
    var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the invitation.
      */
    var resourceShareInvitationArn: js.UndefOr[String] = js.undefined
    /**
      * The name of the resource share.
      */
    var resourceShareName: js.UndefOr[String] = js.undefined
    /**
      * The ID of the AWS account that sent the invitation.
      */
    var senderAccountId: js.UndefOr[String] = js.undefined
    /**
      * The status of the invitation.
      */
    var status: js.UndefOr[ResourceShareInvitationStatus] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The key of the tag.
      */
    var key: js.UndefOr[TagKey] = js.undefined
    /**
      * The value of the tag.
      */
    var value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TagFilter extends js.Object {
    /**
      * The tag key.
      */
    var tagKey: js.UndefOr[TagKey] = js.undefined
    /**
      * The tag values.
      */
    var tagValues: js.UndefOr[TagValueList] = js.undefined
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    var resourceShareArn: String
    /**
      * One or more tags.
      */
    var tags: TagList
  }
  
  trait TagResourceResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    var resourceShareArn: String
    /**
      * The tag keys of the tags to remove.
      */
    var tagKeys: TagKeyList
  }
  
  trait UntagResourceResponse extends js.Object
  
  trait UpdateResourceShareRequest extends js.Object {
    /**
      * Indicates whether principals outside your organization can be associated with a resource share.
      */
    var allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the resource share.
      */
    var name: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    var resourceShareArn: String
  }
  
  trait UpdateResourceShareResponse extends js.Object {
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the resource share.
      */
    var resourceShare: js.UndefOr[ResourceShare] = js.undefined
  }
  
  trait _ResourceOwner extends js.Object
  
  trait _ResourceShareAssociationStatus extends js.Object
  
  trait _ResourceShareAssociationType extends js.Object
  
  trait _ResourceShareInvitationStatus extends js.Object
  
  trait _ResourceShareStatus extends js.Object
  
  trait _ResourceStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DateTime = stdLib.Date
  type MaxResults = scala.Double
  type Policy = java.lang.String
  type PolicyList = js.Array[Policy]
  type PrincipalArnOrIdList = js.Array[String]
  type PrincipalList = js.Array[Principal]
  type ResourceArnList = js.Array[String]
  type ResourceList = js.Array[Resource]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SELF
    - awsDashSdkLib.awsDashSdkLibStrings.`OTHER-ACCOUNTS`
    - java.lang.String
  */
  type ResourceOwner = _ResourceOwner | java.lang.String
  type ResourceShareArnList = js.Array[String]
  type ResourceShareAssociationList = js.Array[ResourceShareAssociation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASSOCIATING
    - awsDashSdkLib.awsDashSdkLibStrings.ASSOCIATED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DISASSOCIATING
    - awsDashSdkLib.awsDashSdkLibStrings.DISASSOCIATED
    - java.lang.String
  */
  type ResourceShareAssociationStatus = _ResourceShareAssociationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PRINCIPAL
    - awsDashSdkLib.awsDashSdkLibStrings.RESOURCE
    - java.lang.String
  */
  type ResourceShareAssociationType = _ResourceShareAssociationType | java.lang.String
  type ResourceShareInvitationArnList = js.Array[String]
  type ResourceShareInvitationList = js.Array[ResourceShareInvitation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.ACCEPTED
    - awsDashSdkLib.awsDashSdkLibStrings.REJECTED
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - java.lang.String
  */
  type ResourceShareInvitationStatus = _ResourceShareInvitationStatus | java.lang.String
  type ResourceShareList = js.Array[ResourceShare]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type ResourceShareStatus = _ResourceShareStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.ZONAL_RESOURCE_INACCESSIBLE
    - awsDashSdkLib.awsDashSdkLibStrings.LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.UNAVAILABLE
    - java.lang.String
  */
  type ResourceStatus = _ResourceStatus | java.lang.String
  type String = java.lang.String
  type TagFilters = js.Array[TagFilter]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TagValueList = js.Array[TagValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-01-04`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

