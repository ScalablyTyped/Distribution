package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSsoMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type AccessKeyType = String
  type AccessTokenType = String
  type AccountIdType = String
  type AccountListType = js.Array[AccountInfo]
  type AccountNameType = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type EmailAddressType = String
  type ExpirationTimestampType = Double
  type MaxResultType = Double
  type NextTokenType = String
  type RoleListType = js.Array[RoleInfo]
  type RoleNameType = String
  type SecretAccessKeyType = String
  type SessionTokenType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-06-10`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
