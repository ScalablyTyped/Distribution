package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSsooidcMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type AccessToken = String
  type AuthCode = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientId = String
  type ClientName = String
  type ClientSecret = String
  type ClientType = String
  type DeviceCode = String
  type ExpirationInSeconds = Double
  type GrantType = String
  type IdToken = String
  type IntervalInSeconds = Double
  type LongTimeStampType = Double
  type RefreshToken = String
  type Scope = String
  type Scopes = js.Array[Scope]
  type TokenType = String
  type URI = String
  type UserCode = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-06-10`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
