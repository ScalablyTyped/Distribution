package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsQuicksightMod {
  type Arn = java.lang.String
  type AwsAccountId = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type EmbeddingUrl = java.lang.String
  type GroupDescription = java.lang.String
  type GroupList = js.Array[Group]
  type GroupMemberList = js.Array[GroupMember]
  type GroupMemberName = java.lang.String
  type GroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IAM
    - typings.awsDashSdk.awsDashSdkStrings.QUICKSIGHT
    - java.lang.String
  */
  type IdentityType = _IdentityType | java.lang.String
  type MaxResults = Double
  type Namespace = java.lang.String
  type RoleSessionName = java.lang.String
  type SessionLifetimeInMinutes = Double
  type StatusCode = Double
  type String = java.lang.String
  type UserList = js.Array[User]
  type UserName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ADMIN
    - typings.awsDashSdk.awsDashSdkStrings.AUTHOR
    - typings.awsDashSdk.awsDashSdkStrings.READER
    - typings.awsDashSdk.awsDashSdkStrings.RESTRICTED_AUTHOR
    - typings.awsDashSdk.awsDashSdkStrings.RESTRICTED_READER
    - java.lang.String
  */
  type UserRole = _UserRole | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-04-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
