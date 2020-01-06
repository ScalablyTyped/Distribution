package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsWorkmailMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Aliases = js.Array[EmailAddress]
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type EmailAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type EntityState = _EntityState | java.lang.String
  type GroupName = java.lang.String
  type Groups = js.Array[Group]
  type MailboxQuota = Double
  type MailboxSize = Double
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GROUP
    - typings.awsDashSdk.awsDashSdkStrings.USER
    - java.lang.String
  */
  type MemberType = _MemberType | java.lang.String
  type Members = js.Array[Member]
  type NextToken = java.lang.String
  type OrganizationId = java.lang.String
  type OrganizationName = java.lang.String
  type OrganizationSummaries = js.Array[OrganizationSummary]
  type Password = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FULL_ACCESS
    - typings.awsDashSdk.awsDashSdkStrings.SEND_AS
    - typings.awsDashSdk.awsDashSdkStrings.SEND_ON_BEHALF
    - java.lang.String
  */
  type PermissionType = _PermissionType | java.lang.String
  type PermissionValues = js.Array[PermissionType]
  type Permissions = js.Array[Permission]
  type ResourceDelegates = js.Array[Delegate]
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ROOM
    - typings.awsDashSdk.awsDashSdkStrings.EQUIPMENT
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type Resources = js.Array[Resource]
  type String = java.lang.String
  type Timestamp = Date
  type UserName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USER
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE
    - typings.awsDashSdk.awsDashSdkStrings.SYSTEM_USER
    - java.lang.String
  */
  type UserRole = _UserRole | java.lang.String
  type Users = js.Array[User]
  type WorkMailIdentifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-10-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
