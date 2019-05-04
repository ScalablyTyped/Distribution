package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsWorkmailMod {
  type Aliases = js.Array[EmailAddress]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EmailAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type EntityState = _EntityState | java.lang.String
  type GroupName = java.lang.String
  type Groups = js.Array[Group]
  type MailboxQuota = scala.Double
  type MailboxSize = scala.Double
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GROUP
    - awsDashSdkLib.awsDashSdkLibStrings.USER
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
    - awsDashSdkLib.awsDashSdkLibStrings.FULL_ACCESS
    - awsDashSdkLib.awsDashSdkLibStrings.SEND_AS
    - awsDashSdkLib.awsDashSdkLibStrings.SEND_ON_BEHALF
    - java.lang.String
  */
  type PermissionType = _PermissionType | java.lang.String
  type PermissionValues = js.Array[PermissionType]
  type Permissions = js.Array[Permission]
  type ResourceDelegates = js.Array[Delegate]
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ROOM
    - awsDashSdkLib.awsDashSdkLibStrings.EQUIPMENT
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type Resources = js.Array[Resource]
  type String = java.lang.String
  type Timestamp = stdLib.Date
  type UserName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USER
    - awsDashSdkLib.awsDashSdkLibStrings.RESOURCE
    - awsDashSdkLib.awsDashSdkLibStrings.SYSTEM_USER
    - java.lang.String
  */
  type UserRole = _UserRole | java.lang.String
  type Users = js.Array[User]
  type WorkMailIdentifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-10-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
