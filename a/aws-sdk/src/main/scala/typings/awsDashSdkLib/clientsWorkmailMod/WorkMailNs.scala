package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/workmail", "WorkMail")
@js.native
object WorkMailNs extends js.Object {
  
  trait AssociateDelegateToResourceRequest extends js.Object {
    /**
         * The member (user or group) to associate to the resource.
         */
    var EntityId: WorkMailIdentifier
    /**
         * The organization under which the resource exists.
         */
    var OrganizationId: OrganizationId
    /**
         * The resource for which members are associated.
         */
    var ResourceId: ResourceId
  }
  
  
  trait AssociateDelegateToResourceResponse extends js.Object
  
  
  trait AssociateMemberToGroupRequest extends js.Object {
    /**
         * The group for which the member is associated.
         */
    var GroupId: WorkMailIdentifier
    /**
         * The member to associate to the group.
         */
    var MemberId: WorkMailIdentifier
    /**
         * The organization under which the group exists.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait AssociateMemberToGroupResponse extends js.Object
  
  
  trait BookingOptions extends js.Object {
    /**
         * The resource's ability to automatically reply to requests. If disabled, delegates must be associated to the resource.
         */
    var AutoAcceptRequests: js.UndefOr[Boolean] = js.undefined
    /**
         * The resource's ability to automatically decline any conflicting requests.
         */
    var AutoDeclineConflictingRequests: js.UndefOr[Boolean] = js.undefined
    /**
         * The resource's ability to automatically decline any recurring requests.
         */
    var AutoDeclineRecurringRequests: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateAliasRequest extends js.Object {
    /**
         * The alias to add to the user.
         */
    var Alias: EmailAddress
    /**
         * The alias is added to this Amazon WorkMail entity.
         */
    var EntityId: WorkMailIdentifier
    /**
         * The organization under which the member exists.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait CreateAliasResponse extends js.Object
  
  
  trait CreateGroupRequest extends js.Object {
    /**
         * The name of the group.
         */
    var Name: GroupName
    /**
         * The organization under which the group is to be created.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait CreateGroupResponse extends js.Object {
    /**
         * The ID of the group.
         */
    var GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined
  }
  
  
  trait CreateResourceRequest extends js.Object {
    /**
         * The name of the created resource.
         */
    var Name: ResourceName
    /**
         * The identifier associated with the organization for which the resource is created.
         */
    var OrganizationId: OrganizationId
    /**
         * The type of the created resource.
         */
    var Type: ResourceType
  }
  
  
  trait CreateResourceResponse extends js.Object {
    /**
         * The identifier of the created resource.
         */
    var ResourceId: js.UndefOr[ResourceId] = js.undefined
  }
  
  
  trait CreateUserRequest extends js.Object {
    /**
         * The display name for the user to be created.
         */
    var DisplayName: String
    /**
         * The name for the user to be created.
         */
    var Name: UserName
    /**
         * The identifier of the organization for which the user is created.
         */
    var OrganizationId: OrganizationId
    /**
         * The password for the user to be created.
         */
    var Password: Password
  }
  
  
  trait CreateUserResponse extends js.Object {
    /**
         * The information regarding the newly created user.
         */
    var UserId: js.UndefOr[WorkMailIdentifier] = js.undefined
  }
  
  
  trait Delegate extends js.Object {
    /**
         * The identifier for the user or group is associated as the resource's delegate.
         */
    var Id: String
    /**
         * The type of the delegate: user or group.
         */
    var Type: MemberType
  }
  
  
  trait DeleteAliasRequest extends js.Object {
    /**
         * The aliases to be removed from the user's set of aliases. Duplicate entries in the list are collapsed into single entries (the list is transformed into a set).
         */
    var Alias: EmailAddress
    /**
         * The identifier for the Amazon WorkMail entity to have the aliases removed.
         */
    var EntityId: WorkMailIdentifier
    /**
         * The identifier for the organization under which the user exists.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait DeleteAliasResponse extends js.Object
  
  
  trait DeleteGroupRequest extends js.Object {
    /**
         * The identifier of the group to be deleted.
         */
    var GroupId: WorkMailIdentifier
    /**
         * The organization that contains the group.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait DeleteGroupResponse extends js.Object
  
  
  trait DeleteMailboxPermissionsRequest extends js.Object {
    /**
         * The identifier of the entity (user or group) for which to delete mailbox permissions.
         */
    var EntityId: WorkMailIdentifier
    /**
         * The identifier of the entity (user or group) for which to delete granted permissions.
         */
    var GranteeId: WorkMailIdentifier
    /**
         * The identifier of the organization under which the entity (user or group) exists.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait DeleteMailboxPermissionsResponse extends js.Object
  
  
  trait DeleteResourceRequest extends js.Object {
    /**
         * The identifier associated with the organization for which the resource is deleted.
         */
    var OrganizationId: OrganizationId
    /**
         * The identifier of the resource to be deleted.
         */
    var ResourceId: ResourceId
  }
  
  
  trait DeleteResourceResponse extends js.Object
  
  
  trait DeleteUserRequest extends js.Object {
    /**
         * The organization that contains the user.
         */
    var OrganizationId: OrganizationId
    /**
         * The identifier of the user to be deleted.
         */
    var UserId: WorkMailIdentifier
  }
  
  
  trait DeleteUserResponse extends js.Object
  
  
  trait DeregisterFromWorkMailRequest extends js.Object {
    /**
         * The identifier for the entity to be updated.
         */
    var EntityId: WorkMailIdentifier
    /**
         * The identifier for the organization under which the Amazon WorkMail entity exists.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait DeregisterFromWorkMailResponse extends js.Object
  
  
  trait DescribeGroupRequest extends js.Object {
    /**
         * The identifier for the group to be described.
         */
    var GroupId: WorkMailIdentifier
    /**
         * The identifier for the organization under which the group exists.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait DescribeGroupResponse extends js.Object {
    /**
         * The date and time when a user was deregistered from Amazon WorkMail, in UNIX epoch time format.
         */
    var DisabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The email of the described group.
         */
    var Email: js.UndefOr[EmailAddress] = js.undefined
    /**
         * The date and time when a user was registered to Amazon WorkMail, in UNIX epoch time format.
         */
    var EnabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The identifier of the described group.
         */
    var GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined
    /**
         * The name of the described group.
         */
    var Name: js.UndefOr[GroupName] = js.undefined
    /**
         * The state of the user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to Amazon WorkMail).
         */
    var State: js.UndefOr[EntityState] = js.undefined
  }
  
  
  trait DescribeOrganizationRequest extends js.Object {
    /**
         * The identifier for the organization to be described.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait DescribeOrganizationResponse extends js.Object {
    /**
         * The alias for an organization.
         */
    var Alias: js.UndefOr[OrganizationName] = js.undefined
    /**
         * The date at which the organization became usable in the Amazon WorkMail context, in UNIX epoch time format.
         */
    var CompletedDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The default mail domain associated with the organization.
         */
    var DefaultMailDomain: js.UndefOr[String] = js.undefined
    /**
         * The identifier for the directory associated with an Amazon WorkMail organization.
         */
    var DirectoryId: js.UndefOr[String] = js.undefined
    /**
         * The type of directory associated with the Amazon WorkMail organization.
         */
    var DirectoryType: js.UndefOr[String] = js.undefined
    /**
         * The (optional) error message indicating if unexpected behavior was encountered with regards to the organization.
         */
    var ErrorMessage: js.UndefOr[String] = js.undefined
    /**
         * The identifier of an organization.
         */
    var OrganizationId: js.UndefOr[OrganizationId] = js.undefined
    /**
         * The state of an organization.
         */
    var State: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeResourceRequest extends js.Object {
    /**
         * The identifier associated with the organization for which the resource is described.
         */
    var OrganizationId: OrganizationId
    /**
         * The identifier of the resource to be described.
         */
    var ResourceId: ResourceId
  }
  
  
  trait DescribeResourceResponse extends js.Object {
    /**
         * The booking options for the described resource.
         */
    var BookingOptions: js.UndefOr[BookingOptions] = js.undefined
    /**
         * The date and time when a resource was registered from Amazon WorkMail, in UNIX epoch time format.
         */
    var DisabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The email of the described resource.
         */
    var Email: js.UndefOr[EmailAddress] = js.undefined
    /**
         * The date and time when a resource was registered to Amazon WorkMail, in UNIX epoch time format.
         */
    var EnabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name of the described resource.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * The identifier of the described resource.
         */
    var ResourceId: js.UndefOr[ResourceId] = js.undefined
    /**
         * The state of the resource: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to Amazon WorkMail).
         */
    var State: js.UndefOr[EntityState] = js.undefined
    /**
         * The type of the described resource.
         */
    var Type: js.UndefOr[ResourceType] = js.undefined
  }
  
  
  trait DescribeUserRequest extends js.Object {
    /**
         * The identifier for the organization under which the user exists.
         */
    var OrganizationId: OrganizationId
    /**
         * The identifier for the user to be described.
         */
    var UserId: WorkMailIdentifier
  }
  
  
  trait DescribeUserResponse extends js.Object {
    /**
         * The date and time at which the user was disabled for Amazon WorkMail usage, in UNIX epoch time format.
         */
    var DisabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The display name of the user.
         */
    var DisplayName: js.UndefOr[String] = js.undefined
    /**
         * The email of the user.
         */
    var Email: js.UndefOr[EmailAddress] = js.undefined
    /**
         * The date and time at which the user was enabled for Amazon WorkMail usage, in UNIX epoch time format.
         */
    var EnabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name for the user.
         */
    var Name: js.UndefOr[UserName] = js.undefined
    /**
         * The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to Amazon WorkMail).
         */
    var State: js.UndefOr[EntityState] = js.undefined
    /**
         * The identifier for the described user.
         */
    var UserId: js.UndefOr[WorkMailIdentifier] = js.undefined
    /**
         * In certain cases other entities are modeled as users. If interoperability is enabled, resources are imported into Amazon WorkMail as users. Because different Amazon WorkMail organizations rely on different directory types, administrators can distinguish between a user that is not registered to Amazon WorkMail (is disabled and has a user role) and the administrative users of the directory. The values are USER, RESOURCE, and SYSTEM_USER.
         */
    var UserRole: js.UndefOr[UserRole] = js.undefined
  }
  
  
  trait DisassociateDelegateFromResourceRequest extends js.Object {
    /**
         * The identifier for the member (user, group) to be removed from the resource's delegates.
         */
    var EntityId: WorkMailIdentifier
    /**
         * The identifier for the organization under which the resource exists.
         */
    var OrganizationId: OrganizationId
    /**
         * The identifier of the resource from which delegates' set members are removed. 
         */
    var ResourceId: ResourceId
  }
  
  
  trait DisassociateDelegateFromResourceResponse extends js.Object
  
  
  trait DisassociateMemberFromGroupRequest extends js.Object {
    /**
         * The identifier for the group from which members are removed.
         */
    var GroupId: WorkMailIdentifier
    /**
         * The identifier for the member to be removed to the group.
         */
    var MemberId: WorkMailIdentifier
    /**
         * The identifier for the organization under which the group exists.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait DisassociateMemberFromGroupResponse extends js.Object
  
  
  trait Group extends js.Object {
    /**
         * The date indicating when the group was disabled from Amazon WorkMail use.
         */
    var DisabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The email of the group.
         */
    var Email: js.UndefOr[EmailAddress] = js.undefined
    /**
         * The date indicating when the group was enabled for Amazon WorkMail use.
         */
    var EnabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The identifier of the group.
         */
    var Id: js.UndefOr[WorkMailIdentifier] = js.undefined
    /**
         * The name of the group.
         */
    var Name: js.UndefOr[GroupName] = js.undefined
    /**
         * The state of the group, which can be ENABLED, DISABLED, or DELETED.
         */
    var State: js.UndefOr[EntityState] = js.undefined
  }
  
  
  trait ListAliasesRequest extends js.Object {
    /**
         * The identifier for the entity for which to list the aliases.
         */
    var EntityId: WorkMailIdentifier
    /**
         * The maximum number of results to return in a single call.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token to use to retrieve the next page of results. The first call does not contain any tokens.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The identifier for the organization under which the entity exists.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait ListAliasesResponse extends js.Object {
    /**
         * The entity's paginated aliases.
         */
    var Aliases: js.UndefOr[Aliases] = js.undefined
    /**
         * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListGroupMembersRequest extends js.Object {
    /**
         * The identifier for the group to which the members are associated.
         */
    var GroupId: WorkMailIdentifier
    /**
         * The maximum number of results to return in a single call.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         *  The token to use to retrieve the next page of results. The first call does not contain any tokens.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The identifier for the organization under which the group exists.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait ListGroupMembersResponse extends js.Object {
    /**
         * The members associated to the group.
         */
    var Members: js.UndefOr[Members] = js.undefined
    /**
         * The token to use to retrieve the next page of results. The first call does not contain any tokens.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListGroupsRequest extends js.Object {
    /**
         * The maximum number of results to return in a single call.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token to use to retrieve the next page of results. The first call does not contain any tokens.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The identifier for the organization under which the groups exist.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait ListGroupsResponse extends js.Object {
    /**
         * The overview of groups for an organization.
         */
    var Groups: js.UndefOr[Groups] = js.undefined
    /**
         * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListMailboxPermissionsRequest extends js.Object {
    /**
         * The identifier of the entity (user or group) for which to list mailbox permissions.
         */
    var EntityId: WorkMailIdentifier
    /**
         * The maximum number of results to return in a single call.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token to use to retrieve the next page of results. The first call does not contain any tokens.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The identifier of the organization under which the entity (user or group) exists.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait ListMailboxPermissionsResponse extends js.Object {
    /**
         * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * One page of the entity's mailbox permissions.
         */
    var Permissions: js.UndefOr[Permissions] = js.undefined
  }
  
  
  trait ListOrganizationsRequest extends js.Object {
    /**
         * The maximum number of results to return in a single call.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token to use to retrieve the next page of results. The first call does not contain any tokens.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListOrganizationsResponse extends js.Object {
    /**
         * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The overview of owned organizations presented as a list of organization summaries.
         */
    var OrganizationSummaries: js.UndefOr[OrganizationSummaries] = js.undefined
  }
  
  
  trait ListResourceDelegatesRequest extends js.Object {
    /**
         * The number of maximum results in a page.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token used to paginate through the delegates associated with a resource.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The identifier for the organization that contains the resource for which delegates are listed.
         */
    var OrganizationId: OrganizationId
    /**
         * The identifier for the resource whose delegates are listed.
         */
    var ResourceId: WorkMailIdentifier
  }
  
  
  trait ListResourceDelegatesResponse extends js.Object {
    /**
         * One page of the resource's delegates.
         */
    var Delegates: js.UndefOr[ResourceDelegates] = js.undefined
    /**
         * The token used to paginate through the delegates associated with a resource. While results are still available, it has an associated value. When the last page is reached, the token is empty. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListResourcesRequest extends js.Object {
    /**
         * The maximum number of results to return in a single call.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token to use to retrieve the next page of results. The first call does not contain any tokens.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The identifier for the organization under which the resources exist.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait ListResourcesResponse extends js.Object {
    /**
         *  The token used to paginate through all the organization's resources. While results are still available, it has an associated value. When the last page is reached, the token is empty.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * One page of the organization's resource representation.
         */
    var Resources: js.UndefOr[Resources] = js.undefined
  }
  
  
  trait ListUsersRequest extends js.Object {
    /**
         * The maximum number of results to return in a single call.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * TBD
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The identifier for the organization under which the users exist.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait ListUsersResponse extends js.Object {
    /**
         *  The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The overview of users for an organization.
         */
    var Users: js.UndefOr[Users] = js.undefined
  }
  
  
  trait Member extends js.Object {
    /**
         * The date indicating when the member was disabled from Amazon WorkMail use.
         */
    var DisabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The date indicating when the member was enabled for Amazon WorkMail use.
         */
    var EnabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The identifier of the member.
         */
    var Id: js.UndefOr[String] = js.undefined
    /**
         * The name of the member.
         */
    var Name: js.UndefOr[String] = js.undefined
    /**
         * The state of the member, which can be ENABLED, DISABLED, or DELETED.
         */
    var State: js.UndefOr[EntityState] = js.undefined
    /**
         * A member can be a user or group.
         */
    var Type: js.UndefOr[MemberType] = js.undefined
  }
  
  
  trait OrganizationSummary extends js.Object {
    /**
         * The alias associated with the organization.
         */
    var Alias: js.UndefOr[OrganizationName] = js.undefined
    /**
         * The error message associated with the organization. It is only present if unexpected behavior has occurred with regards to the organization. It provides insight or solutions regarding unexpected behavior.
         */
    var ErrorMessage: js.UndefOr[String] = js.undefined
    /**
         * The identifier associated with the organization.
         */
    var OrganizationId: js.UndefOr[OrganizationId] = js.undefined
    /**
         * The state associated with the organization.
         */
    var State: js.UndefOr[String] = js.undefined
  }
  
  
  trait Permission extends js.Object {
    /**
         * The identifier of the entity (user or group) to which the permissions are granted.
         */
    var GranteeId: WorkMailIdentifier
    /**
         * The type of entity (user, group) of the entity referred to in GranteeId.
         */
    var GranteeType: MemberType
    /**
         * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
         */
    var PermissionValues: PermissionValues
  }
  
  
  trait PutMailboxPermissionsRequest extends js.Object {
    /**
         * The identifier of the entity (user or group) for which to update mailbox permissions.
         */
    var EntityId: WorkMailIdentifier
    /**
         * The identifier of the entity (user or group) to which to grant the permissions.
         */
    var GranteeId: WorkMailIdentifier
    /**
         * The identifier of the organization under which the entity (user or group) exists.
         */
    var OrganizationId: OrganizationId
    /**
         * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
         */
    var PermissionValues: PermissionValues
  }
  
  
  trait PutMailboxPermissionsResponse extends js.Object
  
  
  trait RegisterToWorkMailRequest extends js.Object {
    /**
         * The email for the entity to be updated.
         */
    var Email: EmailAddress
    /**
         * The identifier for the entity to be updated.
         */
    var EntityId: WorkMailIdentifier
    /**
         * The identifier for the organization under which the Amazon WorkMail entity exists.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait RegisterToWorkMailResponse extends js.Object
  
  
  trait ResetPasswordRequest extends js.Object {
    /**
         * The identifier of the organization that contains the user for which the password is reset.
         */
    var OrganizationId: OrganizationId
    /**
         * The new password for the user.
         */
    var Password: Password
    /**
         * The identifier of the user for whom the password is reset.
         */
    var UserId: WorkMailIdentifier
  }
  
  
  trait ResetPasswordResponse extends js.Object
  
  
  trait Resource extends js.Object {
    /**
         * The date indicating when the resource was disabled from Amazon WorkMail use.
         */
    var DisabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The email of the resource.
         */
    var Email: js.UndefOr[EmailAddress] = js.undefined
    /**
         * The date indicating when the resource was enabled for Amazon WorkMail use.
         */
    var EnabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The identifier of the resource.
         */
    var Id: js.UndefOr[WorkMailIdentifier] = js.undefined
    /**
         * The name of the resource.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * The state of the resource, which can be ENABLED, DISABLED, or DELETED.
         */
    var State: js.UndefOr[EntityState] = js.undefined
    /**
         * The type of the resource: equipment or room.
         */
    var Type: js.UndefOr[ResourceType] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Adds a member to the resource's set of delegates.
       */
    def associateDelegateToResource(): awsDashSdkLib.libRequestMod.Request[AssociateDelegateToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a member to the resource's set of delegates.
       */
    def associateDelegateToResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateDelegateToResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateDelegateToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a member to the resource's set of delegates.
       */
    def associateDelegateToResource(params: AssociateDelegateToResourceRequest): awsDashSdkLib.libRequestMod.Request[AssociateDelegateToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a member to the resource's set of delegates.
       */
    def associateDelegateToResource(
      params: AssociateDelegateToResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateDelegateToResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateDelegateToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a member to the group's set.
       */
    def associateMemberToGroup(): awsDashSdkLib.libRequestMod.Request[AssociateMemberToGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a member to the group's set.
       */
    def associateMemberToGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateMemberToGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateMemberToGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a member to the group's set.
       */
    def associateMemberToGroup(params: AssociateMemberToGroupRequest): awsDashSdkLib.libRequestMod.Request[AssociateMemberToGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a member to the group's set.
       */
    def associateMemberToGroup(
      params: AssociateMemberToGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateMemberToGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateMemberToGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an alias to the set of a given member of Amazon WorkMail.
       */
    def createAlias(): awsDashSdkLib.libRequestMod.Request[CreateAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an alias to the set of a given member of Amazon WorkMail.
       */
    def createAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an alias to the set of a given member of Amazon WorkMail.
       */
    def createAlias(params: CreateAliasRequest): awsDashSdkLib.libRequestMod.Request[CreateAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an alias to the set of a given member of Amazon WorkMail.
       */
    def createAlias(
      params: CreateAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
       */
    def createGroup(): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
       */
    def createGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
       */
    def createGroup(params: CreateGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
       */
    def createGroup(
      params: CreateGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Amazon WorkMail resource. The available types are equipment and room.
       */
    def createResource(): awsDashSdkLib.libRequestMod.Request[CreateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Amazon WorkMail resource. The available types are equipment and room.
       */
    def createResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Amazon WorkMail resource. The available types are equipment and room.
       */
    def createResource(params: CreateResourceRequest): awsDashSdkLib.libRequestMod.Request[CreateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Amazon WorkMail resource. The available types are equipment and room.
       */
    def createResource(
      params: CreateResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
       */
    def createUser(): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
       */
    def createUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
       */
    def createUser(params: CreateUserRequest): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
       */
    def createUser(
      params: CreateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Remove the alias from a set of aliases for a given user.
       */
    def deleteAlias(): awsDashSdkLib.libRequestMod.Request[DeleteAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Remove the alias from a set of aliases for a given user.
       */
    def deleteAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Remove the alias from a set of aliases for a given user.
       */
    def deleteAlias(params: DeleteAliasRequest): awsDashSdkLib.libRequestMod.Request[DeleteAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Remove the alias from a set of aliases for a given user.
       */
    def deleteAlias(
      params: DeleteAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a group from Amazon WorkMail.
       */
    def deleteGroup(): awsDashSdkLib.libRequestMod.Request[DeleteGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a group from Amazon WorkMail.
       */
    def deleteGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a group from Amazon WorkMail.
       */
    def deleteGroup(params: DeleteGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a group from Amazon WorkMail.
       */
    def deleteGroup(
      params: DeleteGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes permissions granted to a user or group.
       */
    def deleteMailboxPermissions(): awsDashSdkLib.libRequestMod.Request[DeleteMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes permissions granted to a user or group.
       */
    def deleteMailboxPermissions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMailboxPermissionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes permissions granted to a user or group.
       */
    def deleteMailboxPermissions(params: DeleteMailboxPermissionsRequest): awsDashSdkLib.libRequestMod.Request[DeleteMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes permissions granted to a user or group.
       */
    def deleteMailboxPermissions(
      params: DeleteMailboxPermissionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMailboxPermissionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified resource. 
       */
    def deleteResource(): awsDashSdkLib.libRequestMod.Request[DeleteResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified resource. 
       */
    def deleteResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified resource. 
       */
    def deleteResource(params: DeleteResourceRequest): awsDashSdkLib.libRequestMod.Request[DeleteResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified resource. 
       */
    def deleteResource(
      params: DeleteResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a user from Amazon WorkMail and all subsequent systems. The action can't be undone. The mailbox is kept as-is for a minimum of 30 days, without any means to restore it. 
       */
    def deleteUser(): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a user from Amazon WorkMail and all subsequent systems. The action can't be undone. The mailbox is kept as-is for a minimum of 30 days, without any means to restore it. 
       */
    def deleteUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a user from Amazon WorkMail and all subsequent systems. The action can't be undone. The mailbox is kept as-is for a minimum of 30 days, without any means to restore it. 
       */
    def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a user from Amazon WorkMail and all subsequent systems. The action can't be undone. The mailbox is kept as-is for a minimum of 30 days, without any means to restore it. 
       */
    def deleteUser(
      params: DeleteUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and schedules it for clean-up. Amazon WorkMail keeps mailboxes for 30 days before they are permanently removed. The functionality in the console is Disable.
       */
    def deregisterFromWorkMail(): awsDashSdkLib.libRequestMod.Request[DeregisterFromWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and schedules it for clean-up. Amazon WorkMail keeps mailboxes for 30 days before they are permanently removed. The functionality in the console is Disable.
       */
    def deregisterFromWorkMail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterFromWorkMailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterFromWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and schedules it for clean-up. Amazon WorkMail keeps mailboxes for 30 days before they are permanently removed. The functionality in the console is Disable.
       */
    def deregisterFromWorkMail(params: DeregisterFromWorkMailRequest): awsDashSdkLib.libRequestMod.Request[DeregisterFromWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and schedules it for clean-up. Amazon WorkMail keeps mailboxes for 30 days before they are permanently removed. The functionality in the console is Disable.
       */
    def deregisterFromWorkMail(
      params: DeregisterFromWorkMailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterFromWorkMailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterFromWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the data available for the group.
       */
    def describeGroup(): awsDashSdkLib.libRequestMod.Request[DescribeGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the data available for the group.
       */
    def describeGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the data available for the group.
       */
    def describeGroup(params: DescribeGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the data available for the group.
       */
    def describeGroup(
      params: DescribeGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides more information regarding a given organization based on its identifier.
       */
    def describeOrganization(): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides more information regarding a given organization based on its identifier.
       */
    def describeOrganization(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeOrganizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides more information regarding a given organization based on its identifier.
       */
    def describeOrganization(params: DescribeOrganizationRequest): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides more information regarding a given organization based on its identifier.
       */
    def describeOrganization(
      params: DescribeOrganizationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeOrganizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the data available for the resource.
       */
    def describeResource(): awsDashSdkLib.libRequestMod.Request[DescribeResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the data available for the resource.
       */
    def describeResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the data available for the resource.
       */
    def describeResource(params: DescribeResourceRequest): awsDashSdkLib.libRequestMod.Request[DescribeResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the data available for the resource.
       */
    def describeResource(
      params: DescribeResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides information regarding the user.
       */
    def describeUser(): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides information regarding the user.
       */
    def describeUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides information regarding the user.
       */
    def describeUser(params: DescribeUserRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides information regarding the user.
       */
    def describeUser(
      params: DescribeUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a member from the resource's set of delegates.
       */
    def disassociateDelegateFromResource(): awsDashSdkLib.libRequestMod.Request[DisassociateDelegateFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a member from the resource's set of delegates.
       */
    def disassociateDelegateFromResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateDelegateFromResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateDelegateFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a member from the resource's set of delegates.
       */
    def disassociateDelegateFromResource(params: DisassociateDelegateFromResourceRequest): awsDashSdkLib.libRequestMod.Request[DisassociateDelegateFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a member from the resource's set of delegates.
       */
    def disassociateDelegateFromResource(
      params: DisassociateDelegateFromResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateDelegateFromResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateDelegateFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a member from a group.
       */
    def disassociateMemberFromGroup(): awsDashSdkLib.libRequestMod.Request[DisassociateMemberFromGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a member from a group.
       */
    def disassociateMemberFromGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateMemberFromGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateMemberFromGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a member from a group.
       */
    def disassociateMemberFromGroup(params: DisassociateMemberFromGroupRequest): awsDashSdkLib.libRequestMod.Request[DisassociateMemberFromGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a member from a group.
       */
    def disassociateMemberFromGroup(
      params: DisassociateMemberFromGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateMemberFromGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateMemberFromGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a paginated call to list the aliases associated with a given entity.
       */
    def listAliases(): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a paginated call to list the aliases associated with a given entity.
       */
    def listAliases(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a paginated call to list the aliases associated with a given entity.
       */
    def listAliases(params: ListAliasesRequest): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a paginated call to list the aliases associated with a given entity.
       */
    def listAliases(
      params: ListAliasesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an overview of the members of a group.
       */
    def listGroupMembers(): awsDashSdkLib.libRequestMod.Request[ListGroupMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an overview of the members of a group.
       */
    def listGroupMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGroupMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGroupMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an overview of the members of a group.
       */
    def listGroupMembers(params: ListGroupMembersRequest): awsDashSdkLib.libRequestMod.Request[ListGroupMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an overview of the members of a group.
       */
    def listGroupMembers(
      params: ListGroupMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGroupMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGroupMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the organization's groups.
       */
    def listGroups(): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the organization's groups.
       */
    def listGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the organization's groups.
       */
    def listGroups(params: ListGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the organization's groups.
       */
    def listGroups(
      params: ListGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the mailbox permissions associated with a mailbox.
       */
    def listMailboxPermissions(): awsDashSdkLib.libRequestMod.Request[ListMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the mailbox permissions associated with a mailbox.
       */
    def listMailboxPermissions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMailboxPermissionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the mailbox permissions associated with a mailbox.
       */
    def listMailboxPermissions(params: ListMailboxPermissionsRequest): awsDashSdkLib.libRequestMod.Request[ListMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the mailbox permissions associated with a mailbox.
       */
    def listMailboxPermissions(
      params: ListMailboxPermissionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMailboxPermissionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the customer's non-deleted organizations.
       */
    def listOrganizations(): awsDashSdkLib.libRequestMod.Request[ListOrganizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the customer's non-deleted organizations.
       */
    def listOrganizations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOrganizationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOrganizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the customer's non-deleted organizations.
       */
    def listOrganizations(params: ListOrganizationsRequest): awsDashSdkLib.libRequestMod.Request[ListOrganizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the customer's non-deleted organizations.
       */
    def listOrganizations(
      params: ListOrganizationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOrganizationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOrganizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on behalf of the resource.
       */
    def listResourceDelegates(): awsDashSdkLib.libRequestMod.Request[ListResourceDelegatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on behalf of the resource.
       */
    def listResourceDelegates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourceDelegatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourceDelegatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on behalf of the resource.
       */
    def listResourceDelegates(params: ListResourceDelegatesRequest): awsDashSdkLib.libRequestMod.Request[ListResourceDelegatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on behalf of the resource.
       */
    def listResourceDelegates(
      params: ListResourceDelegatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourceDelegatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourceDelegatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the organization's resources.
       */
    def listResources(): awsDashSdkLib.libRequestMod.Request[ListResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the organization's resources.
       */
    def listResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the organization's resources.
       */
    def listResources(params: ListResourcesRequest): awsDashSdkLib.libRequestMod.Request[ListResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the organization's resources.
       */
    def listResources(
      params: ListResourcesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the organization's users.
       */
    def listUsers(): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the organization's users.
       */
    def listUsers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the organization's users.
       */
    def listUsers(params: ListUsersRequest): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns summaries of the organization's users.
       */
    def listUsers(
      params: ListUsersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets permissions for a user or group. This replaces any pre-existing permissions set for the entity.
       */
    def putMailboxPermissions(): awsDashSdkLib.libRequestMod.Request[PutMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets permissions for a user or group. This replaces any pre-existing permissions set for the entity.
       */
    def putMailboxPermissions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutMailboxPermissionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets permissions for a user or group. This replaces any pre-existing permissions set for the entity.
       */
    def putMailboxPermissions(params: PutMailboxPermissionsRequest): awsDashSdkLib.libRequestMod.Request[PutMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets permissions for a user or group. This replaces any pre-existing permissions set for the entity.
       */
    def putMailboxPermissions(
      params: PutMailboxPermissionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutMailboxPermissionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers an existing and disabled user, group, or resource/entity for Amazon WorkMail use by associating a mailbox and calendaring capabilities. It performs no change if the entity is enabled and fails if the entity is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this operation is Enable. Users can either be created by calling the CreateUser API or they can be synchronized from your directory. For more information, see DeregisterFromWorkMail.
       */
    def registerToWorkMail(): awsDashSdkLib.libRequestMod.Request[RegisterToWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers an existing and disabled user, group, or resource/entity for Amazon WorkMail use by associating a mailbox and calendaring capabilities. It performs no change if the entity is enabled and fails if the entity is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this operation is Enable. Users can either be created by calling the CreateUser API or they can be synchronized from your directory. For more information, see DeregisterFromWorkMail.
       */
    def registerToWorkMail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterToWorkMailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterToWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers an existing and disabled user, group, or resource/entity for Amazon WorkMail use by associating a mailbox and calendaring capabilities. It performs no change if the entity is enabled and fails if the entity is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this operation is Enable. Users can either be created by calling the CreateUser API or they can be synchronized from your directory. For more information, see DeregisterFromWorkMail.
       */
    def registerToWorkMail(params: RegisterToWorkMailRequest): awsDashSdkLib.libRequestMod.Request[RegisterToWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers an existing and disabled user, group, or resource/entity for Amazon WorkMail use by associating a mailbox and calendaring capabilities. It performs no change if the entity is enabled and fails if the entity is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this operation is Enable. Users can either be created by calling the CreateUser API or they can be synchronized from your directory. For more information, see DeregisterFromWorkMail.
       */
    def registerToWorkMail(
      params: RegisterToWorkMailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterToWorkMailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterToWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows the administrator to reset the password for a user.
       */
    def resetPassword(): awsDashSdkLib.libRequestMod.Request[ResetPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows the administrator to reset the password for a user.
       */
    def resetPassword(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResetPasswordResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResetPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows the administrator to reset the password for a user.
       */
    def resetPassword(params: ResetPasswordRequest): awsDashSdkLib.libRequestMod.Request[ResetPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows the administrator to reset the password for a user.
       */
    def resetPassword(
      params: ResetPasswordRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResetPasswordResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResetPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the primary email for an entity. The current email is moved into the list of aliases (or swapped between an existing alias and the current primary email) and the email provided in the input is promoted as the primary.
       */
    def updatePrimaryEmailAddress(): awsDashSdkLib.libRequestMod.Request[UpdatePrimaryEmailAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the primary email for an entity. The current email is moved into the list of aliases (or swapped between an existing alias and the current primary email) and the email provided in the input is promoted as the primary.
       */
    def updatePrimaryEmailAddress(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePrimaryEmailAddressResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePrimaryEmailAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the primary email for an entity. The current email is moved into the list of aliases (or swapped between an existing alias and the current primary email) and the email provided in the input is promoted as the primary.
       */
    def updatePrimaryEmailAddress(params: UpdatePrimaryEmailAddressRequest): awsDashSdkLib.libRequestMod.Request[UpdatePrimaryEmailAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the primary email for an entity. The current email is moved into the list of aliases (or swapped between an existing alias and the current primary email) and the email provided in the input is promoted as the primary.
       */
    def updatePrimaryEmailAddress(
      params: UpdatePrimaryEmailAddressRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePrimaryEmailAddressResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePrimaryEmailAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates data for the resource. It must be preceded by a describe call in order to have the latest information. The dataset in the request should be the one expected when performing another describe call.
       */
    def updateResource(): awsDashSdkLib.libRequestMod.Request[UpdateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates data for the resource. It must be preceded by a describe call in order to have the latest information. The dataset in the request should be the one expected when performing another describe call.
       */
    def updateResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates data for the resource. It must be preceded by a describe call in order to have the latest information. The dataset in the request should be the one expected when performing another describe call.
       */
    def updateResource(params: UpdateResourceRequest): awsDashSdkLib.libRequestMod.Request[UpdateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates data for the resource. It must be preceded by a describe call in order to have the latest information. The dataset in the request should be the one expected when performing another describe call.
       */
    def updateResource(
      params: UpdateResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdatePrimaryEmailAddressRequest extends js.Object {
    /**
         * The value of the email to be updated as primary.
         */
    var Email: EmailAddress
    /**
         * The entity to update (user, group, or resource).
         */
    var EntityId: WorkMailIdentifier
    /**
         * The organization that contains the entity to update.
         */
    var OrganizationId: OrganizationId
  }
  
  
  trait UpdatePrimaryEmailAddressResponse extends js.Object
  
  
  trait UpdateResourceRequest extends js.Object {
    /**
         * The resource's booking options to be updated.
         */
    var BookingOptions: js.UndefOr[BookingOptions] = js.undefined
    /**
         * The name of the resource to be updated.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * The identifier associated with the organization for which the resource is updated.
         */
    var OrganizationId: OrganizationId
    /**
         * The identifier of the resource to be updated.
         */
    var ResourceId: ResourceId
  }
  
  
  trait UpdateResourceResponse extends js.Object
  
  
  trait User extends js.Object {
    /**
         * The date indicating when the user was disabled from Amazon WorkMail use.
         */
    var DisabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The display name of the user.
         */
    var DisplayName: js.UndefOr[String] = js.undefined
    /**
         * The email of the user.
         */
    var Email: js.UndefOr[EmailAddress] = js.undefined
    /**
         * The date indicating when the user was enabled for Amazon WorkMail use.
         */
    var EnabledDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The identifier of the user.
         */
    var Id: js.UndefOr[WorkMailIdentifier] = js.undefined
    /**
         * The name of the user.
         */
    var Name: js.UndefOr[UserName] = js.undefined
    /**
         * The state of the user, which can be ENABLED, DISABLED, or DELETED.
         */
    var State: js.UndefOr[EntityState] = js.undefined
    /**
         * The role of the user.
         */
    var UserRole: js.UndefOr[UserRole] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Aliases = js.Array[EmailAddress]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EmailAddress = java.lang.String
  type EntityState = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.DELETED | java.lang.String
  type GroupName = java.lang.String
  type Groups = js.Array[Group]
  type MaxResults = scala.Double
  type MemberType = awsDashSdkLib.awsDashSdkLibStrings.GROUP | awsDashSdkLib.awsDashSdkLibStrings.USER | java.lang.String
  type Members = js.Array[Member]
  type NextToken = java.lang.String
  type OrganizationId = java.lang.String
  type OrganizationName = java.lang.String
  type OrganizationSummaries = js.Array[OrganizationSummary]
  type Password = java.lang.String
  type PermissionType = awsDashSdkLib.awsDashSdkLibStrings.FULL_ACCESS | awsDashSdkLib.awsDashSdkLibStrings.SEND_AS | awsDashSdkLib.awsDashSdkLibStrings.SEND_ON_BEHALF | java.lang.String
  type PermissionValues = js.Array[PermissionType]
  type Permissions = js.Array[Permission]
  type ResourceDelegates = js.Array[Delegate]
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type ResourceType = awsDashSdkLib.awsDashSdkLibStrings.ROOM | awsDashSdkLib.awsDashSdkLibStrings.EQUIPMENT | java.lang.String
  type Resources = js.Array[Resource]
  type String = java.lang.String
  type Timestamp = stdLib.Date
  type UserName = java.lang.String
  type UserRole = awsDashSdkLib.awsDashSdkLibStrings.USER | awsDashSdkLib.awsDashSdkLibStrings.RESOURCE | awsDashSdkLib.awsDashSdkLibStrings.SYSTEM_USER | java.lang.String
  type Users = js.Array[User]
  type WorkMailIdentifier = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-10-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

