package typings
package authmosphereLib.libSrcTokenDashCacheMod

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
@JSImport("authmosphere/lib/src/token-cache", "TokenCache")
@js.native
class TokenCache protected () extends js.Object {
  /**
    * @param tokenConfig
    * @param oauthConfig
    */
  def this(tokenConfig: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]], oauthConfig: authmosphereLib.libSrcTypesOAuthConfigMod.TokenCacheOAuthConfig) = this()
  def this(tokenConfig: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]], oauthConfig: authmosphereLib.libSrcTypesOAuthConfigMod.TokenCacheOAuthConfig, options: authmosphereLib.libSrcTypesTokenCacheConfigMod.TokenCacheOptions) = this()
  var _tokens: js.Any = js.native
  var cacheConfig: js.Any = js.native
  /**
    * Checks whether a valid token for the given name is present.
    * Resolves with that token if that is the case.
    * Rejects otherwise.
    *
    * @param tokenName
    * @returns {Promise<Token>}
    */
  var getCachedToken: js.Any = js.native
  var isTokenConfigured: js.Any = js.native
  var logger: js.Any = js.native
  var oauthConfig: js.Any = js.native
  var tokenConfig: js.Any = js.native
  /**
    * Resolves with either a cached token for the given name or with a newly requested one (which is then cached).
    * Rejects if there is no token present and is not able to request a new one.
    *
    * @param tokenName
    * @returns {Promise<Token>}
    */
  def get(tokenName: java.lang.String): js.Promise[authmosphereLib.libSrcTypesTokenMod.Token[js.Object]] = js.native
  /**
    * Forces the cache to delete present tokens and request new ones.
    * Will resolve with an hashmap of the newly requested tokens if the request was successful.
    * Otherwise, rejects.
    *
    * @returns {Promise<Token>}
    */
  def refreshAllTokens(): js.Promise[TokenMap] = js.native
  /**
    * Forces the cache to delete present token for the given name.
    * Will resolve the newly requested token if the request was successful.
    * Otherwise, rejects.
    *
    * @param tokenName
    * @returns {Promise<Token>}
    */
  def refreshToken(tokenName: java.lang.String): js.Promise[authmosphereLib.libSrcTypesTokenMod.Token[js.Object]] = js.native
  /**
    * The resolveAccessTokenFactory function, creates a function,
    * which resolves a specific access_token.
    *
    * @param {string} The key configured on the tokenCache instance
    * @return {Promise<string>} the resolved access_token
    */
  def resolveAccessTokenFactory(key: java.lang.String): js.Function0[js.Promise[java.lang.String]] = js.native
}

