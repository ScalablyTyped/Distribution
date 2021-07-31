package typings.authmosphere

import typings.authmosphere.authenticationMiddlewareOptionsMod.AuthenticationMiddlewareOptions
import typings.authmosphere.scopeMiddlewareOptionsMod.ScopeMiddlewareOptions
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressToolingMod {
  
  @JSImport("authmosphere/lib/src/express-tooling", "authenticationMiddleware")
  @js.native
  val authenticationMiddleware: typings.authmosphere.expressToolingMod.authenticationMiddleware = js.native
  /**
    * Returns a function (middleware) to extract and validate an access token from a request.
    * Furthermore, it attaches the scopes granted by the token to the request for further usage.
    *
    * If the token is not valid the onNotAuthenticatedHandler is called.
    *
    * The options object can have the following properties:
    *  - publicEndpoints string[]
    *  - tokenInfoEndpoint string
    *  - optional logger
    *  - optional getTokenInfo
    *  - onNotAuthenticatedHandler - a customer handler method that
    *                                is executed if callee is not authorized,
    *                                If not provided, `response.sendStatus(401)` is called.
    *
    * Usage:
    * app.use(handleOAuthRequestMiddleware(options))
    *
    * @param options: AuthenticationMiddlewareOptions
    * @returns express middleware
    */
  type authenticationMiddleware = js.Function1[
    /* options */ AuthenticationMiddlewareOptions, 
    RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  ]
  
  @JSImport("authmosphere/lib/src/express-tooling", "requireScopesMiddleware")
  @js.native
  val requireScopesMiddleware: typings.authmosphere.expressToolingMod.requireScopesMiddleware = js.native
  /**
    * A factory that returns a middleware that compares scopes attached to `express.Request` object
    * with a given list (`scopes` parameter).
    * If all required scopes are matched, the middleware calls `next`.
    * Otherwise, it rejects the request with _403 FORBIDDEN_.
    *
    * * ⚠️&nbsp;&nbsp;This middleware requires scope information to be attached to the `Express.request` object.
    * The `authenticationMiddleware` can do this job.
    * Otherwise `request.$$tokeninfo.scope: string[]` has to be set manually.
    *
    * There may apply cases where another type of authorization should be used.
    * For that cases `options.precedenceFunction` has to be set.
    * If the `precedence` function returns with anything else than resolved state normal
    * scope validation is applied afterwards.
    *
    * Detailed middleware authorization flow:
    *
    * ```
    * +-----------------------------------+
    * |   is precedenceFunction defined?  |
    * +-----------------------------------+
    *         |             |
    *         |             | yes
    *         |             v
    *         |    +----------------------+    resolve   +--------+       +---------------+
    *      no |    | precedenceFunction() |------------->| next() | ----->| call endpoint |
    *         |    +----------------------+              +--------+       +---------------+
    *         |             |
    *         |             | reject
    *         v             v
    * +-----------------------------------+      yes     +--------+       +---------------+
    * | scopes match with requiredScopes? |------------->| next() |------>| call endpoint |
    * +-----------------------------------+              +--------+       +---------------+
    *         |
    *     no/ |
    *   throw v
    * +----------------------------------+       yes     +--------------------------------+
    * | is onAuthorizationFailedHandler  |-------------->| onAuthorizationFailedHandler() |
    * | configured?                      |               +--------------------------------+
    * +----------------------------------+
    *         |
    *         |               no                         +--------------------------------+
    *         +----------------------------------------->|    response.sendStatus(403)    |
    *                                                    +--------------------------------+
    * ```
    *
    * The options object can have the following properties:
    * - optional logger
    * - onAuthorizationFailedHandler - a customer handler method that
    *                                  is executed if callee is not authorized,
    *                                  If not provided, `response.sendStatus(403)` is called.
    * - precedenceOptions - Let consumers define a handler to overrule scope checking.
    *                       ⚠️ If precedence function throws or return `false`,
    *                        the standard scope validation is applied afterwards.
    *
    *
    * Usage:
    *  app.get('/path', requireScopesMiddleware(['scopeA', 'scopeB']), (req, res) => { // handle request })
    *
    * @param scopes - array of scopes that are needed to access the endpoint
    * @param options: ScopeMiddlewareOptions
    *
    * @returns { function(any, any, any): undefined }
    */
  type requireScopesMiddleware = js.Function2[
    /* scopes */ js.Array[String], 
    /* options */ js.UndefOr[ScopeMiddlewareOptions], 
    RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  ]
}
