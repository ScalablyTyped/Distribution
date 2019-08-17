package typings.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesOAuthConfigMod {
  import typings.authmosphere.Anon_Code
  import typings.authmosphere.Anon_RefreshToken
  import typings.authmosphere.Anon_TokenInfoEndpoint

  type AuthorizationCodeGrantConfig = CredentialsConfig with GrantConfigBase with Anon_Code
  type ClientCredentialsGrantConfig = CredentialsConfig with GrantConfigBase
  type CredentialsPasswordConfig = CredentialsDirConfig | CredentialsUserClientConfig
  type CredentialsUserClientConfig = CredentialsClientConfig with CredentialsUserConfig
  type OAuthConfig = ClientCredentialsGrantConfig | AuthorizationCodeGrantConfig | PasswordCredentialsGrantConfig | RefreshGrantConfig
  type PasswordCredentialsGrantConfig = CredentialsPasswordConfig with GrantConfigBase
  type RefreshGrantConfig = CredentialsConfig with GrantConfigBase with Anon_RefreshToken
  type TokenCacheOAuthConfig = (ClientCredentialsGrantConfig | PasswordCredentialsGrantConfig) with Anon_TokenInfoEndpoint
}
