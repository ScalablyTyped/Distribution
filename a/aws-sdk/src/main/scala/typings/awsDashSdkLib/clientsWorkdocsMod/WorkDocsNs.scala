package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/workdocs", "WorkDocs")
@js.native
object WorkDocsNs extends js.Object {
  trait AbortDocumentVersionUploadRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the document.
      */
    var DocumentId: ResourceIdType
    /**
      * The ID of the version.
      */
    var VersionId: DocumentVersionIdType
  }
  
  trait ActivateUserRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the user.
      */
    var UserId: IdType
  }
  
  trait ActivateUserResponse extends js.Object {
    /**
      * The user information.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait Activity extends js.Object {
    /**
      * Metadata of the commenting activity. This is an optional field and is filled for commenting activities.
      */
    var CommentMetadata: js.UndefOr[CommentMetadata] = js.undefined
    /**
      * The user who performed the action.
      */
    var Initiator: js.UndefOr[UserMetadata] = js.undefined
    /**
      * Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the subfolders and documents within the parent folder (the indirect activity).
      */
    var IsIndirectActivity: js.UndefOr[BooleanType] = js.undefined
    /**
      * The ID of the organization.
      */
    var OrganizationId: js.UndefOr[IdType] = js.undefined
    /**
      * The original parent of the resource. This is an optional field and is filled for move activities.
      */
    var OriginalParent: js.UndefOr[ResourceMetadata] = js.undefined
    /**
      * The list of users or groups impacted by this action. This is an optional field and is filled for the following sharing activities: DOCUMENT_SHARED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, FOLDER_SHARED, FOLDER_UNSHARED.
      */
    var Participants: js.UndefOr[Participants] = js.undefined
    /**
      * The metadata of the resource involved in the user action.
      */
    var ResourceMetadata: js.UndefOr[ResourceMetadata] = js.undefined
    /**
      * The timestamp when the action was performed.
      */
    var TimeStamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The activity type.
      */
    var Type: js.UndefOr[ActivityType] = js.undefined
  }
  
  trait AddResourcePermissionsRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The notification options.
      */
    var NotificationOptions: js.UndefOr[NotificationOptions] = js.undefined
    /**
      * The users, groups, or organization being granted permission.
      */
    var Principals: SharePrincipalList
    /**
      * The ID of the resource.
      */
    var ResourceId: ResourceIdType
  }
  
  trait AddResourcePermissionsResponse extends js.Object {
    /**
      * The share results.
      */
    var ShareResults: js.UndefOr[ShareResultsList] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Comment extends js.Object {
    /**
      * The ID of the comment.
      */
    var CommentId: CommentIdType
    /**
      * The details of the user who made the comment.
      */
    var Contributor: js.UndefOr[User] = js.undefined
    /**
      * The time that the comment was created.
      */
    var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The ID of the parent comment.
      */
    var ParentId: js.UndefOr[CommentIdType] = js.undefined
    /**
      * If the comment is a reply to another user's comment, this field contains the user ID of the user being replied to.
      */
    var RecipientId: js.UndefOr[IdType] = js.undefined
    /**
      * The status of the comment.
      */
    var Status: js.UndefOr[CommentStatusType] = js.undefined
    /**
      * The text of the comment.
      */
    var Text: js.UndefOr[CommentTextType] = js.undefined
    /**
      * The ID of the root comment in the thread.
      */
    var ThreadId: js.UndefOr[CommentIdType] = js.undefined
    /**
      * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners, and contributors.
      */
    var Visibility: js.UndefOr[CommentVisibilityType] = js.undefined
  }
  
  trait CommentMetadata extends js.Object {
    /**
      * The ID of the comment.
      */
    var CommentId: js.UndefOr[CommentIdType] = js.undefined
    /**
      * The status of the comment.
      */
    var CommentStatus: js.UndefOr[CommentStatusType] = js.undefined
    /**
      * The user who made the comment.
      */
    var Contributor: js.UndefOr[User] = js.undefined
    /**
      * The timestamp that the comment was created.
      */
    var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The ID of the user being replied to.
      */
    var RecipientId: js.UndefOr[IdType] = js.undefined
  }
  
  trait CreateCommentRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the document.
      */
    var DocumentId: ResourceIdType
    /**
      * Set this parameter to TRUE to send an email out to the document collaborators after the comment is created.
      */
    var NotifyCollaborators: js.UndefOr[BooleanType] = js.undefined
    /**
      * The ID of the parent comment.
      */
    var ParentId: js.UndefOr[CommentIdType] = js.undefined
    /**
      * The text of the comment.
      */
    var Text: CommentTextType
    /**
      * The ID of the root comment in the thread.
      */
    var ThreadId: js.UndefOr[CommentIdType] = js.undefined
    /**
      * The ID of the document version.
      */
    var VersionId: DocumentVersionIdType
    /**
      * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners, and contributors.
      */
    var Visibility: js.UndefOr[CommentVisibilityType] = js.undefined
  }
  
  trait CreateCommentResponse extends js.Object {
    /**
      * The comment that has been created.
      */
    var Comment: js.UndefOr[Comment] = js.undefined
  }
  
  trait CreateCustomMetadataRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * Custom metadata in the form of name-value pairs.
      */
    var CustomMetadata: CustomMetadataMap
    /**
      * The ID of the resource.
      */
    var ResourceId: ResourceIdType
    /**
      * The ID of the version, if the custom metadata is being added to a document version.
      */
    var VersionId: js.UndefOr[DocumentVersionIdType] = js.undefined
  }
  
  trait CreateCustomMetadataResponse extends js.Object
  
  trait CreateFolderRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The name of the new folder.
      */
    var Name: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * The ID of the parent folder.
      */
    var ParentFolderId: ResourceIdType
  }
  
  trait CreateFolderResponse extends js.Object {
    /**
      * The metadata of the folder.
      */
    var Metadata: js.UndefOr[FolderMetadata] = js.undefined
  }
  
  trait CreateLabelsRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * List of labels to add to the resource.
      */
    var Labels: SharedLabels
    /**
      * The ID of the resource.
      */
    var ResourceId: ResourceIdType
  }
  
  trait CreateLabelsResponse extends js.Object
  
  trait CreateNotificationSubscriptionRequest extends js.Object {
    /**
      * The endpoint to receive the notifications. If the protocol is HTTPS, the endpoint is a URL that begins with https.
      */
    var Endpoint: SubscriptionEndPointType
    /**
      * The ID of the organization.
      */
    var OrganizationId: IdType
    /**
      * The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
      */
    var Protocol: SubscriptionProtocolType
    /**
      * The notification type.
      */
    var SubscriptionType: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.SubscriptionType
  }
  
  trait CreateNotificationSubscriptionResponse extends js.Object {
    /**
      * The subscription.
      */
    var Subscription: js.UndefOr[Subscription] = js.undefined
  }
  
  trait CreateUserRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The email address of the user.
      */
    var EmailAddress: js.UndefOr[EmailAddressType] = js.undefined
    /**
      * The given name of the user.
      */
    var GivenName: UserAttributeValueType
    /**
      * The ID of the organization.
      */
    var OrganizationId: js.UndefOr[IdType] = js.undefined
    /**
      * The password of the user.
      */
    var Password: PasswordType
    /**
      * The amount of storage for the user.
      */
    var StorageRule: js.UndefOr[StorageRuleType] = js.undefined
    /**
      * The surname of the user.
      */
    var Surname: UserAttributeValueType
    /**
      * The time zone ID of the user.
      */
    var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined
    /**
      * The login name of the user.
      */
    var Username: UsernameType
  }
  
  trait CreateUserResponse extends js.Object {
    /**
      * The user information.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait CustomMetadataMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[CustomMetadataValueType]
  
  trait DeactivateUserRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the user.
      */
    var UserId: IdType
  }
  
  trait DeleteCommentRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the comment.
      */
    var CommentId: CommentIdType
    /**
      * The ID of the document.
      */
    var DocumentId: ResourceIdType
    /**
      * The ID of the document version.
      */
    var VersionId: DocumentVersionIdType
  }
  
  trait DeleteCustomMetadataRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * Flag to indicate removal of all custom metadata properties from the specified resource.
      */
    var DeleteAll: js.UndefOr[BooleanType] = js.undefined
    /**
      * List of properties to remove.
      */
    var Keys: js.UndefOr[CustomMetadataKeyList] = js.undefined
    /**
      * The ID of the resource, either a document or folder.
      */
    var ResourceId: ResourceIdType
    /**
      * The ID of the version, if the custom metadata is being deleted from a document version.
      */
    var VersionId: js.UndefOr[DocumentVersionIdType] = js.undefined
  }
  
  trait DeleteCustomMetadataResponse extends js.Object
  
  trait DeleteDocumentRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the document.
      */
    var DocumentId: ResourceIdType
  }
  
  trait DeleteFolderContentsRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the folder.
      */
    var FolderId: ResourceIdType
  }
  
  trait DeleteFolderRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the folder.
      */
    var FolderId: ResourceIdType
  }
  
  trait DeleteLabelsRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * Flag to request removal of all labels from the specified resource.
      */
    var DeleteAll: js.UndefOr[BooleanType] = js.undefined
    /**
      * List of labels to delete from the resource.
      */
    var Labels: js.UndefOr[SharedLabels] = js.undefined
    /**
      * The ID of the resource.
      */
    var ResourceId: ResourceIdType
  }
  
  trait DeleteLabelsResponse extends js.Object
  
  trait DeleteNotificationSubscriptionRequest extends js.Object {
    /**
      * The ID of the organization.
      */
    var OrganizationId: IdType
    /**
      * The ID of the subscription.
      */
    var SubscriptionId: IdType
  }
  
  trait DeleteUserRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the user.
      */
    var UserId: IdType
  }
  
  trait DescribeActivitiesRequest extends js.Object {
    /**
      * Specifies which activity types to include in the response. If this field is left empty, all activity types are returned.
      */
    var ActivityTypes: js.UndefOr[ActivityNamesFilterType] = js.undefined
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The timestamp that determines the end time of the activities. The response includes the activities performed before the specified timestamp.
      */
    var EndTime: js.UndefOr[TimestampType] = js.undefined
    /**
      * Includes indirect activities. An indirect activity results from a direct activity performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the subfolders and documents within the parent folder (the indirect activity).
      */
    var IncludeIndirectActivities: js.UndefOr[BooleanType] = js.undefined
    /**
      * The maximum number of items to return.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * The marker for the next set of results.
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
    /**
      * The ID of the organization. This is a mandatory parameter when using administrative API (SigV4) requests.
      */
    var OrganizationId: js.UndefOr[IdType] = js.undefined
    /**
      * The document or folder ID for which to describe activity types.
      */
    var ResourceId: js.UndefOr[IdType] = js.undefined
    /**
      * The timestamp that determines the starting time of the activities. The response includes the activities performed after the specified timestamp.
      */
    var StartTime: js.UndefOr[TimestampType] = js.undefined
    /**
      * The ID of the user who performed the action. The response includes activities pertaining to this user. This is an optional parameter and is only applicable for administrative API (SigV4) requests.
      */
    var UserId: js.UndefOr[IdType] = js.undefined
  }
  
  trait DescribeActivitiesResponse extends js.Object {
    /**
      * The marker for the next set of results.
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
    /**
      * The list of activities for the specified user and time period.
      */
    var UserActivities: js.UndefOr[UserActivities] = js.undefined
  }
  
  trait DescribeCommentsRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the document.
      */
    var DocumentId: ResourceIdType
    /**
      * The maximum number of items to return.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * The marker for the next set of results. This marker was received from a previous call.
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
    /**
      * The ID of the document version.
      */
    var VersionId: DocumentVersionIdType
  }
  
  trait DescribeCommentsResponse extends js.Object {
    /**
      * The list of comments for the specified document version.
      */
    var Comments: js.UndefOr[CommentList] = js.undefined
    /**
      * The marker for the next set of results. This marker was received from a previous call.
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
  }
  
  trait DescribeDocumentVersionsRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the document.
      */
    var DocumentId: ResourceIdType
    /**
      * Specify "SOURCE" to include initialized versions and a URL for the source document.
      */
    var Fields: js.UndefOr[FieldNamesType] = js.undefined
    /**
      * A comma-separated list of values. Specify "INITIALIZED" to include incomplete versions.
      */
    var Include: js.UndefOr[FieldNamesType] = js.undefined
    /**
      * The maximum number of versions to return with this call.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * The marker for the next set of results. (You received this marker from a previous call.)
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
  }
  
  trait DescribeDocumentVersionsResponse extends js.Object {
    /**
      * The document versions.
      */
    var DocumentVersions: js.UndefOr[DocumentVersionMetadataList] = js.undefined
    /**
      * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
  }
  
  trait DescribeFolderContentsRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the folder.
      */
    var FolderId: ResourceIdType
    /**
      * The contents to include. Specify "INITIALIZED" to include initialized documents.
      */
    var Include: js.UndefOr[FieldNamesType] = js.undefined
    /**
      * The maximum number of items to return with this call.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * The marker for the next set of results. This marker was received from a previous call.
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
    /**
      * The order for the contents of the folder.
      */
    var Order: js.UndefOr[OrderType] = js.undefined
    /**
      * The sorting criteria.
      */
    var Sort: js.UndefOr[ResourceSortType] = js.undefined
    /**
      * The type of items.
      */
    var Type: js.UndefOr[FolderContentType] = js.undefined
  }
  
  trait DescribeFolderContentsResponse extends js.Object {
    /**
      * The documents in the specified folder.
      */
    var Documents: js.UndefOr[DocumentMetadataList] = js.undefined
    /**
      * The subfolders in the specified folder.
      */
    var Folders: js.UndefOr[FolderMetadataList] = js.undefined
    /**
      * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
  }
  
  trait DescribeGroupsRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The maximum number of items to return with this call.
      */
    var Limit: js.UndefOr[PositiveIntegerType] = js.undefined
    /**
      * The marker for the next set of results. (You received this marker from a previous call.)
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
    /**
      * The ID of the organization.
      */
    var OrganizationId: js.UndefOr[IdType] = js.undefined
    /**
      * A query to describe groups by group name.
      */
    var SearchQuery: SearchQueryType
  }
  
  trait DescribeGroupsResponse extends js.Object {
    /**
      * The list of groups.
      */
    var Groups: js.UndefOr[GroupMetadataList] = js.undefined
    /**
      * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
  }
  
  trait DescribeNotificationSubscriptionsRequest extends js.Object {
    /**
      * The maximum number of items to return with this call.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * The marker for the next set of results. (You received this marker from a previous call.)
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
    /**
      * The ID of the organization.
      */
    var OrganizationId: IdType
  }
  
  trait DescribeNotificationSubscriptionsResponse extends js.Object {
    /**
      * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
    /**
      * The subscriptions.
      */
    var Subscriptions: js.UndefOr[SubscriptionList] = js.undefined
  }
  
  trait DescribeResourcePermissionsRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The maximum number of items to return with this call.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * The marker for the next set of results. (You received this marker from a previous call)
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
    /**
      * The ID of the principal to filter permissions by.
      */
    var PrincipalId: js.UndefOr[IdType] = js.undefined
    /**
      * The ID of the resource.
      */
    var ResourceId: ResourceIdType
  }
  
  trait DescribeResourcePermissionsResponse extends js.Object {
    /**
      * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
    /**
      * The principals.
      */
    var Principals: js.UndefOr[PrincipalList] = js.undefined
  }
  
  trait DescribeRootFoldersRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: AuthenticationHeaderType
    /**
      * The maximum number of items to return.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * The marker for the next set of results. (You received this marker from a previous call.)
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
  }
  
  trait DescribeRootFoldersResponse extends js.Object {
    /**
      * The user's special folders.
      */
    var Folders: js.UndefOr[FolderMetadataList] = js.undefined
    /**
      * The marker for the next set of results.
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
  }
  
  trait DescribeUsersRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * A comma-separated list of values. Specify "STORAGE_METADATA" to include the user storage quota and utilization information.
      */
    var Fields: js.UndefOr[FieldNamesType] = js.undefined
    /**
      * The state of the users. Specify "ALL" to include inactive users.
      */
    var Include: js.UndefOr[UserFilterType] = js.undefined
    /**
      * The maximum number of items to return.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * The marker for the next set of results. (You received this marker from a previous call.)
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
    /**
      * The order for the results.
      */
    var Order: js.UndefOr[OrderType] = js.undefined
    /**
      * The ID of the organization.
      */
    var OrganizationId: js.UndefOr[IdType] = js.undefined
    /**
      * A query to filter users by user name.
      */
    var Query: js.UndefOr[SearchQueryType] = js.undefined
    /**
      * The sorting criteria.
      */
    var Sort: js.UndefOr[UserSortType] = js.undefined
    /**
      * The IDs of the users.
      */
    var UserIds: js.UndefOr[UserIdsType] = js.undefined
  }
  
  trait DescribeUsersResponse extends js.Object {
    /**
      * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
    /**
      * The total number of users included in the results.
      */
    var TotalNumberOfUsers: js.UndefOr[SizeType] = js.undefined
    /**
      * The users.
      */
    var Users: js.UndefOr[OrganizationUserList] = js.undefined
  }
  
  trait DocumentMetadata extends js.Object {
    /**
      * The time when the document was created.
      */
    var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The ID of the creator.
      */
    var CreatorId: js.UndefOr[IdType] = js.undefined
    /**
      * The ID of the document.
      */
    var Id: js.UndefOr[ResourceIdType] = js.undefined
    /**
      * List of labels on the document.
      */
    var Labels: js.UndefOr[SharedLabels] = js.undefined
    /**
      * The latest version of the document.
      */
    var LatestVersionMetadata: js.UndefOr[DocumentVersionMetadata] = js.undefined
    /**
      * The time when the document was updated.
      */
    var ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The ID of the parent folder.
      */
    var ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined
    /**
      * The resource state.
      */
    var ResourceState: js.UndefOr[ResourceStateType] = js.undefined
  }
  
  trait DocumentSourceUrlMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[UrlType]
  
  trait DocumentThumbnailUrlMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[UrlType]
  
  trait DocumentVersionMetadata extends js.Object {
    /**
      * The timestamp when the content of the document was originally created.
      */
    var ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The timestamp when the content of the document was modified.
      */
    var ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The content type of the document.
      */
    var ContentType: js.UndefOr[DocumentContentType] = js.undefined
    /**
      * The timestamp when the document was first uploaded.
      */
    var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The ID of the creator.
      */
    var CreatorId: js.UndefOr[IdType] = js.undefined
    /**
      * The ID of the version.
      */
    var Id: js.UndefOr[DocumentVersionIdType] = js.undefined
    /**
      * The timestamp when the document was last uploaded.
      */
    var ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The name of the version.
      */
    var Name: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * The signature of the document.
      */
    var Signature: js.UndefOr[HashType] = js.undefined
    /**
      * The size of the document, in bytes.
      */
    var Size: js.UndefOr[SizeType] = js.undefined
    /**
      * The source of the document.
      */
    var Source: js.UndefOr[DocumentSourceUrlMap] = js.undefined
    /**
      * The status of the document.
      */
    var Status: js.UndefOr[DocumentStatusType] = js.undefined
    /**
      * The thumbnail of the document.
      */
    var Thumbnail: js.UndefOr[DocumentThumbnailUrlMap] = js.undefined
  }
  
  trait FolderMetadata extends js.Object {
    /**
      * The time when the folder was created.
      */
    var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The ID of the creator.
      */
    var CreatorId: js.UndefOr[IdType] = js.undefined
    /**
      * The ID of the folder.
      */
    var Id: js.UndefOr[ResourceIdType] = js.undefined
    /**
      * List of labels on the folder.
      */
    var Labels: js.UndefOr[SharedLabels] = js.undefined
    /**
      * The size of the latest version of the folder metadata.
      */
    var LatestVersionSize: js.UndefOr[SizeType] = js.undefined
    /**
      * The time when the folder was updated.
      */
    var ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The name of the folder.
      */
    var Name: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * The ID of the parent folder.
      */
    var ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined
    /**
      * The resource state of the folder.
      */
    var ResourceState: js.UndefOr[ResourceStateType] = js.undefined
    /**
      * The unique identifier created from the subfolders and documents of the folder.
      */
    var Signature: js.UndefOr[HashType] = js.undefined
    /**
      * The size of the folder metadata.
      */
    var Size: js.UndefOr[SizeType] = js.undefined
  }
  
  trait GetCurrentUserRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: AuthenticationHeaderType
  }
  
  trait GetCurrentUserResponse extends js.Object {
    /**
      * Metadata of the user.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait GetDocumentPathRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the document.
      */
    var DocumentId: IdType
    /**
      * A comma-separated list of values. Specify NAME to include the names of the parent folders.
      */
    var Fields: js.UndefOr[FieldNamesType] = js.undefined
    /**
      * The maximum number of levels in the hierarchy to return.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * This value is not supported.
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
  }
  
  trait GetDocumentPathResponse extends js.Object {
    /**
      * The path information.
      */
    var Path: js.UndefOr[ResourcePath] = js.undefined
  }
  
  trait GetDocumentRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the document.
      */
    var DocumentId: ResourceIdType
    /**
      * Set this to TRUE to include custom metadata in the response.
      */
    var IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait GetDocumentResponse extends js.Object {
    /**
      * The custom metadata on the document.
      */
    var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined
    /**
      * The metadata details of the document.
      */
    var Metadata: js.UndefOr[DocumentMetadata] = js.undefined
  }
  
  trait GetDocumentVersionRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the document.
      */
    var DocumentId: ResourceIdType
    /**
      * A comma-separated list of values. Specify "SOURCE" to include a URL for the source document.
      */
    var Fields: js.UndefOr[FieldNamesType] = js.undefined
    /**
      * Set this to TRUE to include custom metadata in the response.
      */
    var IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined
    /**
      * The version ID of the document.
      */
    var VersionId: DocumentVersionIdType
  }
  
  trait GetDocumentVersionResponse extends js.Object {
    /**
      * The custom metadata on the document version.
      */
    var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined
    /**
      * The version metadata.
      */
    var Metadata: js.UndefOr[DocumentVersionMetadata] = js.undefined
  }
  
  trait GetFolderPathRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * A comma-separated list of values. Specify "NAME" to include the names of the parent folders.
      */
    var Fields: js.UndefOr[FieldNamesType] = js.undefined
    /**
      * The ID of the folder.
      */
    var FolderId: IdType
    /**
      * The maximum number of levels in the hierarchy to return.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * This value is not supported.
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
  }
  
  trait GetFolderPathResponse extends js.Object {
    /**
      * The path information.
      */
    var Path: js.UndefOr[ResourcePath] = js.undefined
  }
  
  trait GetFolderRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the folder.
      */
    var FolderId: ResourceIdType
    /**
      * Set to TRUE to include custom metadata in the response.
      */
    var IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait GetFolderResponse extends js.Object {
    /**
      * The custom metadata on the folder.
      */
    var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined
    /**
      * The metadata of the folder.
      */
    var Metadata: js.UndefOr[FolderMetadata] = js.undefined
  }
  
  trait GetResourcesRequest extends js.Object {
    /**
      * The Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API operation using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The collection type.
      */
    var CollectionType: js.UndefOr[ResourceCollectionType] = js.undefined
    /**
      * The maximum number of resources to return.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * The marker for the next set of results. This marker was received from a previous call.
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
    /**
      * The user ID for the resource collection. This is a required field for accessing the API operation using IAM credentials.
      */
    var UserId: js.UndefOr[IdType] = js.undefined
  }
  
  trait GetResourcesResponse extends js.Object {
    /**
      * The documents in the specified collection.
      */
    var Documents: js.UndefOr[DocumentMetadataList] = js.undefined
    /**
      * The folders in the specified folder.
      */
    var Folders: js.UndefOr[FolderMetadataList] = js.undefined
    /**
      * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
      */
    var Marker: js.UndefOr[PageMarkerType] = js.undefined
  }
  
  trait GroupMetadata extends js.Object {
    /**
      * The ID of the user group.
      */
    var Id: js.UndefOr[IdType] = js.undefined
    /**
      * The name of the group.
      */
    var Name: js.UndefOr[GroupNameType] = js.undefined
  }
  
  trait InitiateDocumentVersionUploadRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The timestamp when the content of the document was originally created.
      */
    var ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The timestamp when the content of the document was modified.
      */
    var ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The content type of the document.
      */
    var ContentType: js.UndefOr[DocumentContentType] = js.undefined
    /**
      * The size of the document, in bytes.
      */
    var DocumentSizeInBytes: js.UndefOr[SizeType] = js.undefined
    /**
      * The ID of the document.
      */
    var Id: js.UndefOr[ResourceIdType] = js.undefined
    /**
      * The name of the document.
      */
    var Name: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * The ID of the parent folder.
      */
    var ParentFolderId: ResourceIdType
  }
  
  trait InitiateDocumentVersionUploadResponse extends js.Object {
    /**
      * The document metadata.
      */
    var Metadata: js.UndefOr[DocumentMetadata] = js.undefined
    /**
      * The upload metadata.
      */
    var UploadMetadata: js.UndefOr[UploadMetadata] = js.undefined
  }
  
  trait NotificationOptions extends js.Object {
    /**
      * Text value to be included in the email body.
      */
    var EmailMessage: js.UndefOr[MessageType] = js.undefined
    /**
      * Boolean value to indicate an email notification should be sent to the receipients.
      */
    var SendEmail: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait Participants extends js.Object {
    /**
      * The list of user groups.
      */
    var Groups: js.UndefOr[GroupMetadataList] = js.undefined
    /**
      * The list of users.
      */
    var Users: js.UndefOr[UserMetadataList] = js.undefined
  }
  
  trait PermissionInfo extends js.Object {
    /**
      * The role of the user.
      */
    var Role: js.UndefOr[RoleType] = js.undefined
    /**
      * The type of permissions.
      */
    var Type: js.UndefOr[RolePermissionType] = js.undefined
  }
  
  trait Principal extends js.Object {
    /**
      * The ID of the resource.
      */
    var Id: js.UndefOr[IdType] = js.undefined
    /**
      * The permission information for the resource.
      */
    var Roles: js.UndefOr[PermissionInfoList] = js.undefined
    /**
      * The type of resource.
      */
    var Type: js.UndefOr[PrincipalType] = js.undefined
  }
  
  trait RemoveAllResourcePermissionsRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the resource.
      */
    var ResourceId: ResourceIdType
  }
  
  trait RemoveResourcePermissionRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The principal ID of the resource.
      */
    var PrincipalId: IdType
    /**
      * The principal type of the resource.
      */
    var PrincipalType: js.UndefOr[PrincipalType] = js.undefined
    /**
      * The ID of the resource.
      */
    var ResourceId: ResourceIdType
  }
  
  trait ResourceMetadata extends js.Object {
    /**
      * The ID of the resource.
      */
    var Id: js.UndefOr[ResourceIdType] = js.undefined
    /**
      * The name of the resource.
      */
    var Name: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * The original name of the resource before a rename operation.
      */
    var OriginalName: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * The owner of the resource.
      */
    var Owner: js.UndefOr[UserMetadata] = js.undefined
    /**
      * The parent ID of the resource before a rename operation.
      */
    var ParentId: js.UndefOr[ResourceIdType] = js.undefined
    /**
      * The type of resource.
      */
    var Type: js.UndefOr[ResourceType] = js.undefined
    /**
      * The version ID of the resource. This is an optional field and is filled for action on document version.
      */
    var VersionId: js.UndefOr[DocumentVersionIdType] = js.undefined
  }
  
  trait ResourcePath extends js.Object {
    /**
      * The components of the resource path.
      */
    var Components: js.UndefOr[ResourcePathComponentList] = js.undefined
  }
  
  trait ResourcePathComponent extends js.Object {
    /**
      * The ID of the resource path.
      */
    var Id: js.UndefOr[IdType] = js.undefined
    /**
      * The name of the resource path.
      */
    var Name: js.UndefOr[ResourceNameType] = js.undefined
  }
  
  trait SharePrincipal extends js.Object {
    /**
      * The ID of the recipient.
      */
    var Id: IdType
    /**
      * The role of the recipient.
      */
    var Role: RoleType
    /**
      * The type of the recipient.
      */
    var Type: PrincipalType
  }
  
  trait ShareResult extends js.Object {
    /**
      * The ID of the invited user.
      */
    var InviteePrincipalId: js.UndefOr[IdType] = js.undefined
    /**
      * The ID of the principal.
      */
    var PrincipalId: js.UndefOr[IdType] = js.undefined
    /**
      * The role.
      */
    var Role: js.UndefOr[RoleType] = js.undefined
    /**
      * The ID of the resource that was shared.
      */
    var ShareId: js.UndefOr[ResourceIdType] = js.undefined
    /**
      * The status.
      */
    var Status: js.UndefOr[ShareStatusType] = js.undefined
    /**
      * The status message.
      */
    var StatusMessage: js.UndefOr[MessageType] = js.undefined
  }
  
  trait SignedHeaderMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[HeaderValueType]
  
  trait StorageRuleType extends js.Object {
    /**
      * The amount of storage allocated, in bytes.
      */
    var StorageAllocatedInBytes: js.UndefOr[PositiveSizeType] = js.undefined
    /**
      * The type of storage.
      */
    var StorageType: js.UndefOr[StorageType] = js.undefined
  }
  
  trait Subscription extends js.Object {
    /**
      * The endpoint of the subscription.
      */
    var EndPoint: js.UndefOr[SubscriptionEndPointType] = js.undefined
    /**
      * The protocol of the subscription.
      */
    var Protocol: js.UndefOr[SubscriptionProtocolType] = js.undefined
    /**
      * The ID of the subscription.
      */
    var SubscriptionId: js.UndefOr[IdType] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Aborts the upload of the specified document version that was previously initiated by InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload the document version, or fails to do so.
      */
    def abortDocumentVersionUpload(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def abortDocumentVersionUpload(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Aborts the upload of the specified document version that was previously initiated by InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload the document version, or fails to do so.
      */
    def abortDocumentVersionUpload(params: AbortDocumentVersionUploadRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def abortDocumentVersionUpload(
      params: AbortDocumentVersionUploadRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Activates the specified user. Only active users can access Amazon WorkDocs.
      */
    def activateUser(): awsDashSdkLib.libRequestMod.Request[ActivateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def activateUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ActivateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ActivateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Activates the specified user. Only active users can access Amazon WorkDocs.
      */
    def activateUser(params: ActivateUserRequest): awsDashSdkLib.libRequestMod.Request[ActivateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def activateUser(
      params: ActivateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ActivateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ActivateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if the principals already have different permissions.
      */
    def addResourcePermissions(): awsDashSdkLib.libRequestMod.Request[AddResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addResourcePermissions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddResourcePermissionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if the principals already have different permissions.
      */
    def addResourcePermissions(params: AddResourcePermissionsRequest): awsDashSdkLib.libRequestMod.Request[AddResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addResourcePermissions(
      params: AddResourcePermissionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddResourcePermissionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a new comment to the specified document version.
      */
    def createComment(): awsDashSdkLib.libRequestMod.Request[CreateCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createComment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCommentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a new comment to the specified document version.
      */
    def createComment(params: CreateCommentRequest): awsDashSdkLib.libRequestMod.Request[CreateCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createComment(
      params: CreateCommentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCommentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more custom properties to the specified resource (a folder, document, or version).
      */
    def createCustomMetadata(): awsDashSdkLib.libRequestMod.Request[CreateCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCustomMetadata(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCustomMetadataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more custom properties to the specified resource (a folder, document, or version).
      */
    def createCustomMetadata(params: CreateCustomMetadataRequest): awsDashSdkLib.libRequestMod.Request[CreateCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCustomMetadata(
      params: CreateCustomMetadataRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCustomMetadataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a folder with the specified name and parent folder.
      */
    def createFolder(): awsDashSdkLib.libRequestMod.Request[CreateFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFolder(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFolderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a folder with the specified name and parent folder.
      */
    def createFolder(params: CreateFolderRequest): awsDashSdkLib.libRequestMod.Request[CreateFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFolder(
      params: CreateFolderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFolderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds the specified list of labels to the given resource (a document or folder)
      */
    def createLabels(): awsDashSdkLib.libRequestMod.Request[CreateLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLabels(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLabelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds the specified list of labels to the given resource (a document or folder)
      */
    def createLabels(params: CreateLabelsRequest): awsDashSdkLib.libRequestMod.Request[CreateLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLabels(
      params: CreateLabelsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLabelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must confirm the subscription. For more information, see Subscribe to Notifications in the Amazon WorkDocs Developer Guide.
      */
    def createNotificationSubscription(): awsDashSdkLib.libRequestMod.Request[CreateNotificationSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createNotificationSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateNotificationSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateNotificationSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must confirm the subscription. For more information, see Subscribe to Notifications in the Amazon WorkDocs Developer Guide.
      */
    def createNotificationSubscription(params: CreateNotificationSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[CreateNotificationSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createNotificationSubscription(
      params: CreateNotificationSubscriptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateNotificationSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateNotificationSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New users can access Amazon WorkDocs.
      */
    def createUser(): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New users can access Amazon WorkDocs.
      */
    def createUser(params: CreateUserRequest): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUser(
      params: CreateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
      */
    def deactivateUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deactivateUser(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
      */
    def deactivateUser(params: DeactivateUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deactivateUser(
      params: DeactivateUserRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified comment from the document version.
      */
    def deleteComment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteComment(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified comment from the document version.
      */
    def deleteComment(params: DeleteCommentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteComment(
      params: DeleteCommentRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes custom metadata from the specified resource.
      */
    def deleteCustomMetadata(): awsDashSdkLib.libRequestMod.Request[DeleteCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCustomMetadata(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCustomMetadataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes custom metadata from the specified resource.
      */
    def deleteCustomMetadata(params: DeleteCustomMetadataRequest): awsDashSdkLib.libRequestMod.Request[DeleteCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCustomMetadata(
      params: DeleteCustomMetadataRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCustomMetadataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Permanently deletes the specified document and its associated metadata.
      */
    def deleteDocument(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDocument(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Permanently deletes the specified document and its associated metadata.
      */
    def deleteDocument(params: DeleteDocumentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDocument(
      params: DeleteDocumentRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Permanently deletes the specified folder and its contents.
      */
    def deleteFolder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFolder(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Permanently deletes the specified folder and its contents.
      */
    def deleteFolder(params: DeleteFolderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFolder(
      params: DeleteFolderRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the contents of the specified folder.
      */
    def deleteFolderContents(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFolderContents(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the contents of the specified folder.
      */
    def deleteFolderContents(params: DeleteFolderContentsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFolderContents(
      params: DeleteFolderContentsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified list of labels from a resource.
      */
    def deleteLabels(): awsDashSdkLib.libRequestMod.Request[DeleteLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLabels(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLabelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified list of labels from a resource.
      */
    def deleteLabels(params: DeleteLabelsRequest): awsDashSdkLib.libRequestMod.Request[DeleteLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLabels(
      params: DeleteLabelsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLabelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified subscription from the specified organization.
      */
    def deleteNotificationSubscription(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteNotificationSubscription(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified subscription from the specified organization.
      */
    def deleteNotificationSubscription(params: DeleteNotificationSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteNotificationSubscription(
      params: DeleteNotificationSubscriptionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified user from a Simple AD or Microsoft AD directory.
      */
    def deleteUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUser(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified user from a Simple AD or Microsoft AD directory.
      */
    def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUser(
      params: DeleteUserRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the user activities in a specified time period.
      */
    def describeActivities(): awsDashSdkLib.libRequestMod.Request[DescribeActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeActivities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeActivitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the user activities in a specified time period.
      */
    def describeActivities(params: DescribeActivitiesRequest): awsDashSdkLib.libRequestMod.Request[DescribeActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeActivities(
      params: DescribeActivitiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeActivitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all the comments for the specified document version.
      */
    def describeComments(): awsDashSdkLib.libRequestMod.Request[DescribeCommentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeComments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCommentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCommentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all the comments for the specified document version.
      */
    def describeComments(params: DescribeCommentsRequest): awsDashSdkLib.libRequestMod.Request[DescribeCommentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeComments(
      params: DescribeCommentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCommentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCommentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the document versions for the specified document. By default, only active versions are returned.
      */
    def describeDocumentVersions(): awsDashSdkLib.libRequestMod.Request[DescribeDocumentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDocumentVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDocumentVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the document versions for the specified document. By default, only active versions are returned.
      */
    def describeDocumentVersions(params: DescribeDocumentVersionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeDocumentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDocumentVersions(
      params: DescribeDocumentVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDocumentVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the contents of the specified folder, including its documents and subfolders. By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more results, the response includes a marker that you can use to request the next set of results. You can also request initialized documents.
      */
    def describeFolderContents(): awsDashSdkLib.libRequestMod.Request[DescribeFolderContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFolderContents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFolderContentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFolderContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the contents of the specified folder, including its documents and subfolders. By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more results, the response includes a marker that you can use to request the next set of results. You can also request initialized documents.
      */
    def describeFolderContents(params: DescribeFolderContentsRequest): awsDashSdkLib.libRequestMod.Request[DescribeFolderContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFolderContents(
      params: DescribeFolderContentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFolderContentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFolderContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
      */
    def describeGroups(): awsDashSdkLib.libRequestMod.Request[DescribeGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
      */
    def describeGroups(params: DescribeGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGroups(
      params: DescribeGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the specified notification subscriptions.
      */
    def describeNotificationSubscriptions(): awsDashSdkLib.libRequestMod.Request[DescribeNotificationSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeNotificationSubscriptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeNotificationSubscriptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeNotificationSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the specified notification subscriptions.
      */
    def describeNotificationSubscriptions(params: DescribeNotificationSubscriptionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeNotificationSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeNotificationSubscriptions(
      params: DescribeNotificationSubscriptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeNotificationSubscriptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeNotificationSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the permissions of a specified resource.
      */
    def describeResourcePermissions(): awsDashSdkLib.libRequestMod.Request[DescribeResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeResourcePermissions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeResourcePermissionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the permissions of a specified resource.
      */
    def describeResourcePermissions(params: DescribeResourcePermissionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeResourcePermissions(
      params: DescribeResourcePermissionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeResourcePermissionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the current user's special folders; the RootFolder and the RecycleBin. RootFolder is the root of user's files and folders and RecycleBin is the root of recycled items. This is not a valid action for SigV4 (administrative API) clients. This action requires an authentication token. To get an authentication token, register an application with Amazon WorkDocs. For more information, see Authentication and Access Control for User Applications in the Amazon WorkDocs Developer Guide.
      */
    def describeRootFolders(): awsDashSdkLib.libRequestMod.Request[DescribeRootFoldersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRootFolders(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRootFoldersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRootFoldersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the current user's special folders; the RootFolder and the RecycleBin. RootFolder is the root of user's files and folders and RecycleBin is the root of recycled items. This is not a valid action for SigV4 (administrative API) clients. This action requires an authentication token. To get an authentication token, register an application with Amazon WorkDocs. For more information, see Authentication and Access Control for User Applications in the Amazon WorkDocs Developer Guide.
      */
    def describeRootFolders(params: DescribeRootFoldersRequest): awsDashSdkLib.libRequestMod.Request[DescribeRootFoldersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRootFolders(
      params: DescribeRootFoldersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRootFoldersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRootFoldersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified users. You can describe all users or filter the results (for example, by status or organization). By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response includes a marker that you can use to request the next set of results.
      */
    def describeUsers(): awsDashSdkLib.libRequestMod.Request[DescribeUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUsers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified users. You can describe all users or filter the results (for example, by status or organization). By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response includes a marker that you can use to request the next set of results.
      */
    def describeUsers(params: DescribeUsersRequest): awsDashSdkLib.libRequestMod.Request[DescribeUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUsers(
      params: DescribeUsersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action for SigV4 (administrative API) clients.
      */
    def getCurrentUser(): awsDashSdkLib.libRequestMod.Request[GetCurrentUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCurrentUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCurrentUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCurrentUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action for SigV4 (administrative API) clients.
      */
    def getCurrentUser(params: GetCurrentUserRequest): awsDashSdkLib.libRequestMod.Request[GetCurrentUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCurrentUser(
      params: GetCurrentUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCurrentUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCurrentUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details of a document.
      */
    def getDocument(): awsDashSdkLib.libRequestMod.Request[GetDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDocument(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDocumentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details of a document.
      */
    def getDocument(params: GetDocumentRequest): awsDashSdkLib.libRequestMod.Request[GetDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDocument(
      params: GetDocumentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDocumentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the path information (the hierarchy from the root folder) for the requested document. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the names of the parent folders.
      */
    def getDocumentPath(): awsDashSdkLib.libRequestMod.Request[GetDocumentPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDocumentPath(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDocumentPathResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDocumentPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the path information (the hierarchy from the root folder) for the requested document. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the names of the parent folders.
      */
    def getDocumentPath(params: GetDocumentPathRequest): awsDashSdkLib.libRequestMod.Request[GetDocumentPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDocumentPath(
      params: GetDocumentPathRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDocumentPathResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDocumentPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves version metadata for the specified document.
      */
    def getDocumentVersion(): awsDashSdkLib.libRequestMod.Request[GetDocumentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDocumentVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDocumentVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDocumentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves version metadata for the specified document.
      */
    def getDocumentVersion(params: GetDocumentVersionRequest): awsDashSdkLib.libRequestMod.Request[GetDocumentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDocumentVersion(
      params: GetDocumentVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDocumentVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDocumentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the metadata of the specified folder.
      */
    def getFolder(): awsDashSdkLib.libRequestMod.Request[GetFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFolder(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFolderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the metadata of the specified folder.
      */
    def getFolder(params: GetFolderRequest): awsDashSdkLib.libRequestMod.Request[GetFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFolder(
      params: GetFolderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFolderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the path information (the hierarchy from the root folder) for the specified folder. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the parent folder names.
      */
    def getFolderPath(): awsDashSdkLib.libRequestMod.Request[GetFolderPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFolderPath(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFolderPathResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFolderPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the path information (the hierarchy from the root folder) for the specified folder. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the parent folder names.
      */
    def getFolderPath(params: GetFolderPathRequest): awsDashSdkLib.libRequestMod.Request[GetFolderPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFolderPath(
      params: GetFolderPathRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFolderPathResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFolderPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a collection of resources, including folders and documents. The only CollectionType supported is SHARED_WITH_ME.
      */
    def getResources(): awsDashSdkLib.libRequestMod.Request[GetResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a collection of resources, including folders and documents. The only CollectionType supported is SHARED_WITH_ME.
      */
    def getResources(params: GetResourcesRequest): awsDashSdkLib.libRequestMod.Request[GetResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getResources(
      params: GetResourcesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new document object and version object. The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when creating a new version of an existing document. This is the first step to upload a document. Next, upload the document to the URL returned from the call, and then call UpdateDocumentVersion. To cancel the document upload, call AbortDocumentVersionUpload.
      */
    def initiateDocumentVersionUpload(): awsDashSdkLib.libRequestMod.Request[InitiateDocumentVersionUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def initiateDocumentVersionUpload(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InitiateDocumentVersionUploadResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InitiateDocumentVersionUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new document object and version object. The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when creating a new version of an existing document. This is the first step to upload a document. Next, upload the document to the URL returned from the call, and then call UpdateDocumentVersion. To cancel the document upload, call AbortDocumentVersionUpload.
      */
    def initiateDocumentVersionUpload(params: InitiateDocumentVersionUploadRequest): awsDashSdkLib.libRequestMod.Request[InitiateDocumentVersionUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def initiateDocumentVersionUpload(
      params: InitiateDocumentVersionUploadRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InitiateDocumentVersionUploadResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InitiateDocumentVersionUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes all the permissions from the specified resource.
      */
    def removeAllResourcePermissions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeAllResourcePermissions(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes all the permissions from the specified resource.
      */
    def removeAllResourcePermissions(params: RemoveAllResourcePermissionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeAllResourcePermissions(
      params: RemoveAllResourcePermissionsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the permission for the specified principal from the specified resource.
      */
    def removeResourcePermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeResourcePermission(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the permission for the specified principal from the specified resource.
      */
    def removeResourcePermission(params: RemoveResourcePermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeResourcePermission(
      params: RemoveResourcePermissionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified attributes of a document. The user must have access to both the document and its parent folder, if applicable.
      */
    def updateDocument(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDocument(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified attributes of a document. The user must have access to both the document and its parent folder, if applicable.
      */
    def updateDocument(params: UpdateDocumentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDocument(
      params: UpdateDocumentRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the status of the document version to ACTIVE.  Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload. 
      */
    def updateDocumentVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDocumentVersion(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the status of the document version to ACTIVE.  Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload. 
      */
    def updateDocumentVersion(params: UpdateDocumentVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDocumentVersion(
      params: UpdateDocumentVersionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified attributes of the specified folder. The user must have access to both the folder and its parent folder, if applicable.
      */
    def updateFolder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFolder(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified attributes of the specified folder. The user must have access to both the folder and its parent folder, if applicable.
      */
    def updateFolder(params: UpdateFolderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFolder(
      params: UpdateFolderRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the Amazon WorkDocs site.
      */
    def updateUser(): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the Amazon WorkDocs site.
      */
    def updateUser(params: UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUser(
      params: UpdateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateDocumentRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the document.
      */
    var DocumentId: ResourceIdType
    /**
      * The name of the document.
      */
    var Name: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * The ID of the parent folder.
      */
    var ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined
    /**
      * The resource state of the document. Only ACTIVE and RECYCLED are supported.
      */
    var ResourceState: js.UndefOr[ResourceStateType] = js.undefined
  }
  
  trait UpdateDocumentVersionRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the document.
      */
    var DocumentId: ResourceIdType
    /**
      * The version ID of the document.
      */
    var VersionId: DocumentVersionIdType
    /**
      * The status of the version.
      */
    var VersionStatus: js.UndefOr[DocumentVersionStatus] = js.undefined
  }
  
  trait UpdateFolderRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The ID of the folder.
      */
    var FolderId: ResourceIdType
    /**
      * The name of the folder.
      */
    var Name: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * The ID of the parent folder.
      */
    var ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined
    /**
      * The resource state of the folder. Only ACTIVE and RECYCLED are accepted values from the API.
      */
    var ResourceState: js.UndefOr[ResourceStateType] = js.undefined
  }
  
  trait UpdateUserRequest extends js.Object {
    /**
      * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
      */
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    /**
      * The given name of the user.
      */
    var GivenName: js.UndefOr[UserAttributeValueType] = js.undefined
    /**
      * Boolean value to determine whether the user is granted Poweruser privileges.
      */
    var GrantPoweruserPrivileges: js.UndefOr[BooleanEnumType] = js.undefined
    /**
      * The locale of the user.
      */
    var Locale: js.UndefOr[LocaleType] = js.undefined
    /**
      * The amount of storage for the user.
      */
    var StorageRule: js.UndefOr[StorageRuleType] = js.undefined
    /**
      * The surname of the user.
      */
    var Surname: js.UndefOr[UserAttributeValueType] = js.undefined
    /**
      * The time zone ID of the user.
      */
    var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined
    /**
      * The type of the user.
      */
    var Type: js.UndefOr[UserType] = js.undefined
    /**
      * The ID of the user.
      */
    var UserId: IdType
  }
  
  trait UpdateUserResponse extends js.Object {
    /**
      * The user information.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait UploadMetadata extends js.Object {
    /**
      * The signed headers.
      */
    var SignedHeaders: js.UndefOr[SignedHeaderMap] = js.undefined
    /**
      * The URL of the upload.
      */
    var UploadUrl: js.UndefOr[UrlType] = js.undefined
  }
  
  trait User extends js.Object {
    /**
      * The time when the user was created.
      */
    var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The email address of the user.
      */
    var EmailAddress: js.UndefOr[EmailAddressType] = js.undefined
    /**
      * The given name of the user.
      */
    var GivenName: js.UndefOr[UserAttributeValueType] = js.undefined
    /**
      * The ID of the user.
      */
    var Id: js.UndefOr[IdType] = js.undefined
    /**
      * The locale of the user.
      */
    var Locale: js.UndefOr[LocaleType] = js.undefined
    /**
      * The time when the user was modified.
      */
    var ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The ID of the organization.
      */
    var OrganizationId: js.UndefOr[IdType] = js.undefined
    /**
      * The ID of the recycle bin folder.
      */
    var RecycleBinFolderId: js.UndefOr[ResourceIdType] = js.undefined
    /**
      * The ID of the root folder.
      */
    var RootFolderId: js.UndefOr[ResourceIdType] = js.undefined
    /**
      * The status of the user.
      */
    var Status: js.UndefOr[UserStatusType] = js.undefined
    /**
      * The storage for the user.
      */
    var Storage: js.UndefOr[UserStorageMetadata] = js.undefined
    /**
      * The surname of the user.
      */
    var Surname: js.UndefOr[UserAttributeValueType] = js.undefined
    /**
      * The time zone ID of the user.
      */
    var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined
    /**
      * The type of user.
      */
    var Type: js.UndefOr[UserType] = js.undefined
    /**
      * The login name of the user.
      */
    var Username: js.UndefOr[UsernameType] = js.undefined
  }
  
  trait UserMetadata extends js.Object {
    /**
      * The email address of the user.
      */
    var EmailAddress: js.UndefOr[EmailAddressType] = js.undefined
    /**
      * The given name of the user before a rename operation.
      */
    var GivenName: js.UndefOr[UserAttributeValueType] = js.undefined
    /**
      * The ID of the user.
      */
    var Id: js.UndefOr[IdType] = js.undefined
    /**
      * The surname of the user.
      */
    var Surname: js.UndefOr[UserAttributeValueType] = js.undefined
    /**
      * The name of the user.
      */
    var Username: js.UndefOr[UsernameType] = js.undefined
  }
  
  trait UserStorageMetadata extends js.Object {
    /**
      * The storage for a user.
      */
    var StorageRule: js.UndefOr[StorageRuleType] = js.undefined
    /**
      * The amount of storage used, in bytes.
      */
    var StorageUtilizedInBytes: js.UndefOr[SizeType] = js.undefined
  }
  
  trait _ActivityType extends js.Object
  
  trait _BooleanEnumType extends js.Object
  
  trait _CommentStatusType extends js.Object
  
  trait _CommentVisibilityType extends js.Object
  
  trait _DocumentSourceType extends js.Object
  
  trait _DocumentStatusType extends js.Object
  
  trait _DocumentThumbnailType extends js.Object
  
  trait _FolderContentType extends js.Object
  
  trait _LocaleType extends js.Object
  
  trait _OrderType extends js.Object
  
  trait _PrincipalType extends js.Object
  
  trait _ResourceSortType extends js.Object
  
  trait _ResourceStateType extends js.Object
  
  trait _ResourceType extends js.Object
  
  trait _RolePermissionType extends js.Object
  
  trait _RoleType extends js.Object
  
  trait _ShareStatusType extends js.Object
  
  trait _StorageType extends js.Object
  
  trait _UserFilterType extends js.Object
  
  trait _UserSortType extends js.Object
  
  trait _UserStatusType extends js.Object
  
  trait _UserType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ActivityNamesFilterType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_CHECKED_IN
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_CHECKED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_RENAMED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_VERSION_UPLOADED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_VERSION_DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_VERSION_VIEWED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_VERSION_DOWNLOADED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_RECYCLED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_RESTORED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_REVERTED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_SHARED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_UNSHARED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_SHARE_PERMISSION_CHANGED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_SHAREABLE_LINK_CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_SHAREABLE_LINK_REMOVED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_MOVED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_COMMENT_ADDED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_COMMENT_DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_ANNOTATION_ADDED
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_ANNOTATION_DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER_CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER_DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER_RENAMED
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER_RECYCLED
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER_RESTORED
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER_SHARED
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER_UNSHARED
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER_SHARE_PERMISSION_CHANGED
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER_SHAREABLE_LINK_CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER_SHAREABLE_LINK_REMOVED
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER_MOVED
    - java.lang.String
  */
  type ActivityType = _ActivityType | java.lang.String
  type AuthenticationHeaderType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TRUE
    - awsDashSdkLib.awsDashSdkLibStrings.FALSE
    - java.lang.String
  */
  type BooleanEnumType = _BooleanEnumType | java.lang.String
  type BooleanType = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CommentIdType = java.lang.String
  type CommentList = js.Array[Comment]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DRAFT
    - awsDashSdkLib.awsDashSdkLibStrings.PUBLISHED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type CommentStatusType = _CommentStatusType | java.lang.String
  type CommentTextType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PUBLIC
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVATE
    - java.lang.String
  */
  type CommentVisibilityType = _CommentVisibilityType | java.lang.String
  type CustomMetadataKeyList = js.Array[CustomMetadataKeyType]
  type CustomMetadataKeyType = java.lang.String
  type CustomMetadataValueType = java.lang.String
  type DocumentContentType = java.lang.String
  type DocumentMetadataList = js.Array[DocumentMetadata]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ORIGINAL
    - awsDashSdkLib.awsDashSdkLibStrings.WITH_COMMENTS
    - java.lang.String
  */
  type DocumentSourceType = _DocumentSourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INITIALIZED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - java.lang.String
  */
  type DocumentStatusType = _DocumentStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SMALL
    - awsDashSdkLib.awsDashSdkLibStrings.SMALL_HQ
    - awsDashSdkLib.awsDashSdkLibStrings.LARGE
    - java.lang.String
  */
  type DocumentThumbnailType = _DocumentThumbnailType | java.lang.String
  type DocumentVersionIdType = java.lang.String
  type DocumentVersionMetadataList = js.Array[DocumentVersionMetadata]
  type DocumentVersionStatus = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | java.lang.String
  type EmailAddressType = java.lang.String
  type FieldNamesType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER
    - java.lang.String
  */
  type FolderContentType = _FolderContentType | java.lang.String
  type FolderMetadataList = js.Array[FolderMetadata]
  type GroupMetadataList = js.Array[GroupMetadata]
  type GroupNameType = java.lang.String
  type HashType = java.lang.String
  type HeaderNameType = java.lang.String
  type HeaderValueType = java.lang.String
  type IdType = java.lang.String
  type LimitType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.en
    - awsDashSdkLib.awsDashSdkLibStrings.fr
    - awsDashSdkLib.awsDashSdkLibStrings.ko
    - awsDashSdkLib.awsDashSdkLibStrings.de
    - awsDashSdkLib.awsDashSdkLibStrings.es
    - awsDashSdkLib.awsDashSdkLibStrings.ja
    - awsDashSdkLib.awsDashSdkLibStrings.ru
    - awsDashSdkLib.awsDashSdkLibStrings.zh_CN
    - awsDashSdkLib.awsDashSdkLibStrings.zh_TW
    - awsDashSdkLib.awsDashSdkLibStrings.pt_BR
    - awsDashSdkLib.awsDashSdkLibStrings.default
    - java.lang.String
  */
  type LocaleType = _LocaleType | java.lang.String
  type MarkerType = java.lang.String
  type MessageType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASCENDING
    - awsDashSdkLib.awsDashSdkLibStrings.DESCENDING
    - java.lang.String
  */
  type OrderType = _OrderType | java.lang.String
  type OrganizationUserList = js.Array[User]
  type PageMarkerType = java.lang.String
  type PasswordType = java.lang.String
  type PermissionInfoList = js.Array[PermissionInfo]
  type PositiveIntegerType = scala.Double
  type PositiveSizeType = scala.Double
  type PrincipalList = js.Array[Principal]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USER
    - awsDashSdkLib.awsDashSdkLibStrings.GROUP
    - awsDashSdkLib.awsDashSdkLibStrings.INVITE
    - awsDashSdkLib.awsDashSdkLibStrings.ANONYMOUS
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION
    - java.lang.String
  */
  type PrincipalType = _PrincipalType | java.lang.String
  type ResourceCollectionType = awsDashSdkLib.awsDashSdkLibStrings.SHARED_WITH_ME | java.lang.String
  type ResourceIdType = java.lang.String
  type ResourceNameType = java.lang.String
  type ResourcePathComponentList = js.Array[ResourcePathComponent]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DATE
    - awsDashSdkLib.awsDashSdkLibStrings.NAME
    - java.lang.String
  */
  type ResourceSortType = _ResourceSortType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.RESTORING
    - awsDashSdkLib.awsDashSdkLibStrings.RECYCLING
    - awsDashSdkLib.awsDashSdkLibStrings.RECYCLED
    - java.lang.String
  */
  type ResourceStateType = _ResourceStateType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DIRECT
    - awsDashSdkLib.awsDashSdkLibStrings.INHERITED
    - java.lang.String
  */
  type RolePermissionType = _RolePermissionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VIEWER
    - awsDashSdkLib.awsDashSdkLibStrings.CONTRIBUTOR
    - awsDashSdkLib.awsDashSdkLibStrings.OWNER
    - awsDashSdkLib.awsDashSdkLibStrings.COOWNER
    - java.lang.String
  */
  type RoleType = _RoleType | java.lang.String
  type SearchQueryType = java.lang.String
  type SharePrincipalList = js.Array[SharePrincipal]
  type ShareResultsList = js.Array[ShareResult]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILURE
    - java.lang.String
  */
  type ShareStatusType = _ShareStatusType | java.lang.String
  type SharedLabel = java.lang.String
  type SharedLabels = js.Array[SharedLabel]
  type SizeType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNLIMITED
    - awsDashSdkLib.awsDashSdkLibStrings.QUOTA
    - java.lang.String
  */
  type StorageType = _StorageType | java.lang.String
  type SubscriptionEndPointType = java.lang.String
  type SubscriptionList = js.Array[Subscription]
  type SubscriptionProtocolType = awsDashSdkLib.awsDashSdkLibStrings.HTTPS | java.lang.String
  type SubscriptionType = awsDashSdkLib.awsDashSdkLibStrings.ALL | java.lang.String
  type TimeZoneIdType = java.lang.String
  type TimestampType = stdLib.Date
  type UrlType = java.lang.String
  type UserActivities = js.Array[Activity]
  type UserAttributeValueType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE_PENDING
    - java.lang.String
  */
  type UserFilterType = _UserFilterType | java.lang.String
  type UserIdsType = java.lang.String
  type UserMetadataList = js.Array[UserMetadata]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USER_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.FULL_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.STORAGE_LIMIT
    - awsDashSdkLib.awsDashSdkLibStrings.USER_STATUS
    - awsDashSdkLib.awsDashSdkLibStrings.STORAGE_USED
    - java.lang.String
  */
  type UserSortType = _UserSortType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - java.lang.String
  */
  type UserStatusType = _UserStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USER
    - awsDashSdkLib.awsDashSdkLibStrings.ADMIN
    - awsDashSdkLib.awsDashSdkLibStrings.POWERUSER
    - awsDashSdkLib.awsDashSdkLibStrings.MINIMALUSER
    - awsDashSdkLib.awsDashSdkLibStrings.WORKSPACESUSER
    - java.lang.String
  */
  type UserType = _UserType | java.lang.String
  type UsernameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-05-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

