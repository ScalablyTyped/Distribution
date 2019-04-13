package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsQuicksightMod {
  type Arn = java.lang.String
  type AwsAccountId = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EmbeddingUrl = java.lang.String
  type GroupDescription = java.lang.String
  type GroupList = js.Array[Group]
  type GroupMemberList = js.Array[GroupMember]
  type GroupMemberName = java.lang.String
  type GroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IAM
    - awsDashSdkLib.awsDashSdkLibStrings.QUICKSIGHT
    - java.lang.String
  */
  type IdentityType = _IdentityType | java.lang.String
  type MaxResults = scala.Double
  type Namespace = java.lang.String
  type RoleSessionName = java.lang.String
  type SessionLifetimeInMinutes = scala.Double
  type StatusCode = scala.Double
  type String = java.lang.String
  type UserList = js.Array[User]
  type UserName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ADMIN
    - awsDashSdkLib.awsDashSdkLibStrings.AUTHOR
    - awsDashSdkLib.awsDashSdkLibStrings.READER
    - awsDashSdkLib.awsDashSdkLibStrings.RESTRICTED_AUTHOR
    - awsDashSdkLib.awsDashSdkLibStrings.RESTRICTED_READER
    - java.lang.String
  */
  type UserRole = _UserRole | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-04-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
