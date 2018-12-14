package typings
package authmosphereLib.authmosphereMod

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
  extends authmosphereLib.libSrcTokenDashCacheMod.TokenCache {
  /**
       * @param tokenConfig
       * @param oauthConfig
       */
  def this(tokenConfig: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]], oauthConfig: authmosphereLib.libSrcTypesOAuthConfigMod.TokenCacheOAuthConfig) = this()
  /**
       * @param tokenConfig
       * @param oauthConfig
       */
  def this(tokenConfig: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]], oauthConfig: authmosphereLib.libSrcTypesOAuthConfigMod.TokenCacheOAuthConfig, options: authmosphereLib.libSrcTypesTokenCacheConfigMod.TokenCacheOptions) = this()
}

