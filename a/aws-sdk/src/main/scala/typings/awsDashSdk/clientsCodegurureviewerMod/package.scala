package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodegurureviewerMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Arn = String
  type AssociationId = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = String
  type MaxResults = Double
  type Name = String
  type Names = js.Array[Name]
  type NextToken = String
  type Owner = String
  type Owners = js.Array[Owner]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CodeCommit_
    - typings.awsDashSdk.awsDashSdkStrings.GitHub_
    - java.lang.String
  */
  type ProviderType = _ProviderType | String
  type ProviderTypes = js.Array[ProviderType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Associated_
    - typings.awsDashSdk.awsDashSdkStrings.Associating_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Disassociating_
    - java.lang.String
  */
  type RepositoryAssociationState = _RepositoryAssociationState | String
  type RepositoryAssociationStates = js.Array[RepositoryAssociationState]
  type RepositoryAssociationSummaries = js.Array[RepositoryAssociationSummary]
  type StateReason = String
  type TimeStamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-09-19`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
