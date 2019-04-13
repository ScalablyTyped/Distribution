package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsWorkdocsMod {
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
  type CustomMetadataMap = org.scalablytyped.runtime.StringDictionary[CustomMetadataValueType]
  type CustomMetadataValueType = java.lang.String
  type DocumentContentType = java.lang.String
  type DocumentMetadataList = js.Array[DocumentMetadata]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ORIGINAL
    - awsDashSdkLib.awsDashSdkLibStrings.WITH_COMMENTS
    - java.lang.String
  */
  type DocumentSourceType = _DocumentSourceType | java.lang.String
  type DocumentSourceUrlMap = org.scalablytyped.runtime.StringDictionary[UrlType]
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
  type DocumentThumbnailUrlMap = org.scalablytyped.runtime.StringDictionary[UrlType]
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
  type SignedHeaderMap = org.scalablytyped.runtime.StringDictionary[HeaderValueType]
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
