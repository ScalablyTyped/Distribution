package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodestarMod {
  type BucketKey = java.lang.String
  type BucketName = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CreatedTimestamp = stdLib.Date
  type DeleteStack = scala.Boolean
  type Email = java.lang.String
  type GitHubPersonalToken = java.lang.String
  type LastModifiedTimestamp = stdLib.Date
  type MaxResults = scala.Double
  type PaginationToken = java.lang.String
  type ProjectArn = java.lang.String
  type ProjectDescription = java.lang.String
  type ProjectId = java.lang.String
  type ProjectName = java.lang.String
  type ProjectTemplateId = java.lang.String
  type ProjectsList = js.Array[ProjectSummary]
  type Reason = java.lang.String
  type RemoteAccessAllowed = scala.Boolean
  type RepositoryDescription = java.lang.String
  type RepositoryEnableIssues = scala.Boolean
  type RepositoryIsPrivate = scala.Boolean
  type RepositoryName = java.lang.String
  type RepositoryOwner = java.lang.String
  type RepositoryType = java.lang.String
  type ResourceId = java.lang.String
  type ResourcesResult = js.Array[Resource]
  type Role = java.lang.String
  type RoleArn = java.lang.String
  type SourceCode = js.Array[Code]
  type SshPublicKey = java.lang.String
  type StackId = java.lang.String
  type State = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TeamMemberResult = js.Array[TeamMember]
  type TemplateParameterKey = java.lang.String
  type TemplateParameterMap = org.scalablytyped.runtime.StringDictionary[TemplateParameterValue]
  type TemplateParameterValue = java.lang.String
  type UserArn = java.lang.String
  type UserProfileDisplayName = java.lang.String
  type UserProfilesList = js.Array[UserProfileSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-04-19`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
