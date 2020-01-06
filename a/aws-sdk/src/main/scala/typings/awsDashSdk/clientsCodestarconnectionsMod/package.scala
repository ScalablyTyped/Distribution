package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodestarconnectionsMod {
  import typings.awsDashSdk.awsDashSdkStrings.Bitbucket_
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type AccountId = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConnectionArn = String
  type ConnectionList = js.Array[Connection]
  type ConnectionName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type ConnectionStatus = _ConnectionStatus | String
  type MaxResults = Double
  type NextToken = String
  type ProviderType = Bitbucket_ | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-12-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
