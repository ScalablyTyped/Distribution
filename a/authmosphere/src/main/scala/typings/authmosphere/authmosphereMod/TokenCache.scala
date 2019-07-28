package typings.authmosphere.authmosphereMod

import org.scalablytyped.runtime.StringDictionary
import typings.authmosphere.libSrcTypesOAuthConfigMod.TokenCacheOAuthConfig
import typings.authmosphere.libSrcTypesTokenCacheConfigMod.TokenCacheOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class to request and cache tokens on client-side.
  *
  * Usage:
  *  const tokenCache = new TokenCache({
  *    'nucleus': ['write.all', 'read.all']
  *  }, oAuthConfig, options);
  *
  *  tokenCache.get('nucleus')
  *  .then((token) => {
  *    console.log(token.access_token);
  *  });
  *
  */
@JSImport("authmosphere", "TokenCache")
@js.native
class TokenCache protected ()
  extends typings.authmosphere.libSrcTokenDashCacheMod.TokenCache {
  /**
    * @param tokenConfig
    * @param oauthConfig
    */
  def this(tokenConfig: StringDictionary[js.Array[String]], oauthConfig: TokenCacheOAuthConfig) = this()
  def this(
    tokenConfig: StringDictionary[js.Array[String]],
    oauthConfig: TokenCacheOAuthConfig,
    options: TokenCacheOptions
  ) = this()
}

