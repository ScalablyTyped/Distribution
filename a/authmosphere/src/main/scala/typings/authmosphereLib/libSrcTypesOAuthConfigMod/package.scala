package typings
package authmosphereLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesOAuthConfigMod {
  type AuthorizationCodeGrantConfig = CredentialsConfig with GrantConfigBase with authmosphereLib.Anon_Code
  type ClientCredentialsGrantConfig = CredentialsConfig with GrantConfigBase
  type CredentialsConfig = CredentialsDirConfig | CredentialsClientConfig
  type CredentialsPasswordConfig = CredentialsDirConfig | CredentialsUserClientConfig
  type CredentialsUserClientConfig = CredentialsClientConfig with CredentialsUserConfig
  type OAuthConfig = ClientCredentialsGrantConfig | AuthorizationCodeGrantConfig | PasswordCredentialsGrantConfig | RefreshGrantConfig
  type PasswordCredentialsGrantConfig = CredentialsPasswordConfig with GrantConfigBase
  type RefreshGrantConfig = CredentialsConfig with GrantConfigBase with authmosphereLib.Anon_RefreshToken
  type TokenCacheOAuthConfig = (ClientCredentialsGrantConfig | PasswordCredentialsGrantConfig) with authmosphereLib.Anon_TokenInfoEndpoint
}
