package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsWorkdocsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.ACTIVE
  import typings.awsDashSdk.awsDashSdkStrings.ALL
  import typings.awsDashSdk.awsDashSdkStrings.HTTPS
  import typings.awsDashSdk.awsDashSdkStrings.SHARED_WITH_ME
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ActivityNamesFilterType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_CHECKED_IN
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_CHECKED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_RENAMED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_VERSION_UPLOADED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_VERSION_DELETED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_VERSION_VIEWED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_VERSION_DOWNLOADED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_RECYCLED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_RESTORED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_REVERTED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_SHARED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_UNSHARED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_SHARE_PERMISSION_CHANGED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_SHAREABLE_LINK_CREATED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_SHAREABLE_LINK_REMOVED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_MOVED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_COMMENT_ADDED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_COMMENT_DELETED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_ANNOTATION_ADDED
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_ANNOTATION_DELETED
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER_CREATED
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER_DELETED
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER_RENAMED
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER_RECYCLED
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER_RESTORED
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER_SHARED
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER_UNSHARED
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER_SHARE_PERMISSION_CHANGED
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER_SHAREABLE_LINK_CREATED
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER_SHAREABLE_LINK_REMOVED
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER_MOVED
    - java.lang.String
  */
  type ActivityType = _ActivityType | String
  type AuthenticationHeaderType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TRUE
    - typings.awsDashSdk.awsDashSdkStrings.FALSE
    - java.lang.String
  */
  type BooleanEnumType = _BooleanEnumType | String
  type BooleanType = Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CommentIdType = String
  type CommentList = js.Array[Comment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DRAFT
    - typings.awsDashSdk.awsDashSdkStrings.PUBLISHED
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type CommentStatusType = _CommentStatusType | String
  type CommentTextType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PUBLIC
    - typings.awsDashSdk.awsDashSdkStrings.PRIVATE
    - java.lang.String
  */
  type CommentVisibilityType = _CommentVisibilityType | String
  type CustomMetadataKeyList = js.Array[CustomMetadataKeyType]
  type CustomMetadataKeyType = String
  type CustomMetadataMap = StringDictionary[CustomMetadataValueType]
  type CustomMetadataValueType = String
  type DocumentContentType = String
  type DocumentMetadataList = js.Array[DocumentMetadata]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ORIGINAL
    - typings.awsDashSdk.awsDashSdkStrings.WITH_COMMENTS
    - java.lang.String
  */
  type DocumentSourceType = _DocumentSourceType | String
  type DocumentSourceUrlMap = StringDictionary[UrlType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INITIALIZED
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - java.lang.String
  */
  type DocumentStatusType = _DocumentStatusType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SMALL
    - typings.awsDashSdk.awsDashSdkStrings.SMALL_HQ
    - typings.awsDashSdk.awsDashSdkStrings.LARGE
    - java.lang.String
  */
  type DocumentThumbnailType = _DocumentThumbnailType | String
  type DocumentThumbnailUrlMap = StringDictionary[UrlType]
  type DocumentVersionIdType = String
  type DocumentVersionMetadataList = js.Array[DocumentVersionMetadata]
  type DocumentVersionStatus = ACTIVE | String
  type EmailAddressType = String
  type FieldNamesType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER
    - java.lang.String
  */
  type FolderContentType = _FolderContentType | String
  type FolderMetadataList = js.Array[FolderMetadata]
  type GroupMetadataList = js.Array[GroupMetadata]
  type GroupNameType = String
  type HashType = String
  type HeaderNameType = String
  type HeaderValueType = String
  type IdType = String
  type LimitType = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.en
    - typings.awsDashSdk.awsDashSdkStrings.fr_
    - typings.awsDashSdk.awsDashSdkStrings.ko
    - typings.awsDashSdk.awsDashSdkStrings.de_
    - typings.awsDashSdk.awsDashSdkStrings.es_
    - typings.awsDashSdk.awsDashSdkStrings.ja
    - typings.awsDashSdk.awsDashSdkStrings.ru_
    - typings.awsDashSdk.awsDashSdkStrings.zh_CN
    - typings.awsDashSdk.awsDashSdkStrings.zh_TW
    - typings.awsDashSdk.awsDashSdkStrings.pt_BR
    - typings.awsDashSdk.awsDashSdkStrings.default_
    - java.lang.String
  */
  type LocaleType = _LocaleType | String
  type MarkerType = String
  type MessageType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASCENDING
    - typings.awsDashSdk.awsDashSdkStrings.DESCENDING
    - java.lang.String
  */
  type OrderType = _OrderType | String
  type OrganizationUserList = js.Array[User]
  type PageMarkerType = String
  type PasswordType = String
  type PermissionInfoList = js.Array[PermissionInfo]
  type PositiveIntegerType = Double
  type PositiveSizeType = Double
  type PrincipalList = js.Array[Principal]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USER
    - typings.awsDashSdk.awsDashSdkStrings.GROUP
    - typings.awsDashSdk.awsDashSdkStrings.INVITE
    - typings.awsDashSdk.awsDashSdkStrings.ANONYMOUS
    - typings.awsDashSdk.awsDashSdkStrings.ORGANIZATION
    - java.lang.String
  */
  type PrincipalType = _PrincipalType | String
  type ResourceCollectionType = SHARED_WITH_ME | String
  type ResourceIdType = String
  type ResourceNameType = String
  type ResourcePathComponentList = js.Array[ResourcePathComponent]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DATE
    - typings.awsDashSdk.awsDashSdkStrings.NAME
    - java.lang.String
  */
  type ResourceSortType = _ResourceSortType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.RESTORING
    - typings.awsDashSdk.awsDashSdkStrings.RECYCLING
    - typings.awsDashSdk.awsDashSdkStrings.RECYCLED
    - java.lang.String
  */
  type ResourceStateType = _ResourceStateType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT
    - java.lang.String
  */
  type ResourceType = _ResourceType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DIRECT
    - typings.awsDashSdk.awsDashSdkStrings.INHERITED
    - java.lang.String
  */
  type RolePermissionType = _RolePermissionType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VIEWER
    - typings.awsDashSdk.awsDashSdkStrings.CONTRIBUTOR
    - typings.awsDashSdk.awsDashSdkStrings.OWNER
    - typings.awsDashSdk.awsDashSdkStrings.COOWNER
    - java.lang.String
  */
  type RoleType = _RoleType | String
  type SearchQueryType = String
  type SharePrincipalList = js.Array[SharePrincipal]
  type ShareResultsList = js.Array[ShareResult]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILURE
    - java.lang.String
  */
  type ShareStatusType = _ShareStatusType | String
  type SharedLabel = String
  type SharedLabels = js.Array[SharedLabel]
  type SignedHeaderMap = StringDictionary[HeaderValueType]
  type SizeType = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNLIMITED
    - typings.awsDashSdk.awsDashSdkStrings.QUOTA
    - java.lang.String
  */
  type StorageType = _StorageType | String
  type SubscriptionEndPointType = String
  type SubscriptionList = js.Array[Subscription]
  type SubscriptionProtocolType = HTTPS | String
  type SubscriptionType = ALL | String
  type TimeZoneIdType = String
  type TimestampType = Date
  type UrlType = String
  type UserActivities = js.Array[Activity]
  type UserAttributeValueType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE_PENDING
    - java.lang.String
  */
  type UserFilterType = _UserFilterType | String
  type UserIdsType = String
  type UserMetadataList = js.Array[UserMetadata]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USER_NAME
    - typings.awsDashSdk.awsDashSdkStrings.FULL_NAME
    - typings.awsDashSdk.awsDashSdkStrings.STORAGE_LIMIT
    - typings.awsDashSdk.awsDashSdkStrings.USER_STATUS
    - typings.awsDashSdk.awsDashSdkStrings.STORAGE_USED
    - java.lang.String
  */
  type UserSortType = _UserSortType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - java.lang.String
  */
  type UserStatusType = _UserStatusType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USER
    - typings.awsDashSdk.awsDashSdkStrings.ADMIN
    - typings.awsDashSdk.awsDashSdkStrings.POWERUSER
    - typings.awsDashSdk.awsDashSdkStrings.MINIMALUSER
    - typings.awsDashSdk.awsDashSdkStrings.WORKSPACESUSER
    - java.lang.String
  */
  type UserType = _UserType | String
  type UsernameType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-05-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
