package typings.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oauthconfigMod {
  type AuthorizationCodeGrantConfig = typings.authmosphere.oauthconfigMod.CredentialsConfig with typings.authmosphere.oauthconfigMod.GrantConfigBase with typings.authmosphere.anon.Code
  type ClientCredentialsGrantConfig = typings.authmosphere.oauthconfigMod.CredentialsConfig with typings.authmosphere.oauthconfigMod.GrantConfigBase
  type CredentialsPasswordConfig = typings.authmosphere.oauthconfigMod.CredentialsDirConfig | typings.authmosphere.oauthconfigMod.CredentialsUserClientConfig
  type CredentialsUserClientConfig = typings.authmosphere.oauthconfigMod.CredentialsClientConfig with typings.authmosphere.oauthconfigMod.CredentialsUserConfig
  type OAuthConfig = typings.authmosphere.oauthconfigMod.ClientCredentialsGrantConfig | typings.authmosphere.oauthconfigMod.AuthorizationCodeGrantConfig | typings.authmosphere.oauthconfigMod.PasswordCredentialsGrantConfig | typings.authmosphere.oauthconfigMod.RefreshGrantConfig
  type PasswordCredentialsGrantConfig = typings.authmosphere.oauthconfigMod.CredentialsPasswordConfig with typings.authmosphere.oauthconfigMod.GrantConfigBase
  type RefreshGrantConfig = typings.authmosphere.oauthconfigMod.CredentialsConfig with typings.authmosphere.oauthconfigMod.GrantConfigBase with typings.authmosphere.anon.RefreshToken
  type TokenCacheOAuthConfig = (typings.authmosphere.oauthconfigMod.ClientCredentialsGrantConfig | typings.authmosphere.oauthconfigMod.PasswordCredentialsGrantConfig) with typings.authmosphere.anon.TokenInfoEndpoint
}
