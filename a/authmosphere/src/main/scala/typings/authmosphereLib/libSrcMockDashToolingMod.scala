package typings
package authmosphereLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/mock-tooling", JSImport.Namespace)
@js.native
object libSrcMockDashToolingMod extends js.Object {
  /**
   * Removes generated tokens and mocked endpoints.
   */
  val cleanMock: js.Function0[scala.Unit] = js.native
  /**
   * Creates a __very basic__ mock of token endpoint as defined in [RFC 6749](https://tools.ietf.org/html/rfc6749).
   *
   * @param options
   * @returns {nock.Scope}
   *
   * @throws on parse error of options.url
   */
  val mockAccessTokenEndpoint: js.Function1[
    /* options */ authmosphereLib.libSrcTypesMockOptionsMod.MockOptions, 
    nockLib.nockMod.nockNs.Scope
  ] = js.native
  val mockAccessTokenEndpointWithErrorResponse: js.Function3[
    /* options */ authmosphereLib.libSrcTypesMockOptionsMod.MockOptions, 
    /* httpStatus */ scala.Double, 
    /* responseBody */ js.UndefOr[js.Object], 
    nockLib.nockMod.nockNs.Scope
  ] = js.native
  /**
   * Creates a __very basic__ mock of a token validation endpoint.
   *
   * @param options
   * @returns {nock.Scope}
   *
   * @throws on parse error of options.url
   */
  val mockTokeninfoEndpoint: js.Function2[
    /* options */ authmosphereLib.libSrcTypesMockOptionsMod.MockOptions, 
    /* tokens */ js.UndefOr[js.Array[authmosphereLib.Anon_Accesstoken]], 
    nockLib.nockMod.nockNs.Scope
  ] = js.native
  val mockTokeninfoEndpointWithErrorResponse: js.Function3[
    /* options */ authmosphereLib.libSrcTypesMockOptionsMod.MockOptions, 
    /* httpStatus */ scala.Double, 
    /* responseBody */ js.UndefOr[js.Object], 
    nockLib.nockMod.nockNs.Scope
  ] = js.native
}

