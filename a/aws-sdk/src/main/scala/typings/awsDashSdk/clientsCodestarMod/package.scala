package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodestarMod {
  type BucketKey = String
  type BucketName = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = String
  type CreatedTimestamp = Date
  type DeleteStack = Boolean
  type Email = String
  type GitHubPersonalToken = String
  type LastModifiedTimestamp = Date
  type MaxResults = Double
  type PaginationToken = String
  type ProjectArn = String
  type ProjectDescription = String
  type ProjectId = String
  type ProjectName = String
  type ProjectTemplateId = String
  type ProjectsList = js.Array[ProjectSummary]
  type Reason = String
  type RemoteAccessAllowed = Boolean
  type RepositoryDescription = String
  type RepositoryEnableIssues = Boolean
  type RepositoryIsPrivate = Boolean
  type RepositoryName = String
  type RepositoryOwner = String
  type RepositoryType = String
  type ResourceId = String
  type ResourcesResult = js.Array[Resource]
  type Role = String
  type RoleArn = String
  type SourceCode = js.Array[Code]
  type SshPublicKey = String
  type StackId = String
  type State = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = StringDictionary[TagValue]
  type TeamMemberResult = js.Array[TeamMember]
  type TemplateParameterKey = String
  type TemplateParameterMap = StringDictionary[TemplateParameterValue]
  type TemplateParameterValue = String
  type UserArn = String
  type UserProfileDisplayName = String
  type UserProfilesList = js.Array[UserProfileSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-04-19`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
