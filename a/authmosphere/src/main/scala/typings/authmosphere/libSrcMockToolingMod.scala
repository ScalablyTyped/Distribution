package typings.authmosphere

import typings.authmosphere.libSrcTypesMockOptionsMod.MockOptions
import typings.authmosphere.libSrcTypesTokenMod.Token
import typings.nock.mod.Scope
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcMockToolingMod {
  
  @JSImport("authmosphere/lib/src/mock-tooling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Removes generated tokens and mocked endpoints.
    */
  inline def cleanMock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanMock")().asInstanceOf[Unit]
  
  /**
    * Creates a __very basic__ mock of token endpoint as defined in [RFC 6749](https://tools.ietf.org/html/rfc6749).
    *
    * @param options
    * @returns {nock.Scope}
    *
    * @throws on parse error of options.url
    */
  inline def mockAccessTokenEndpoint(options: MockOptions): Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("mockAccessTokenEndpoint")(options.asInstanceOf[js.Any]).asInstanceOf[Scope]
  
  inline def mockAccessTokenEndpointWithErrorResponse(options: MockOptions, httpStatus: Double): Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("mockAccessTokenEndpointWithErrorResponse")(options.asInstanceOf[js.Any], httpStatus.asInstanceOf[js.Any])).asInstanceOf[Scope]
  inline def mockAccessTokenEndpointWithErrorResponse(options: MockOptions, httpStatus: Double, responseBody: Record[String | Double | js.Symbol, Any]): Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("mockAccessTokenEndpointWithErrorResponse")(options.asInstanceOf[js.Any], httpStatus.asInstanceOf[js.Any], responseBody.asInstanceOf[js.Any])).asInstanceOf[Scope]
  
  /**
    * Creates a __very basic__ mock of a token validation endpoint.
    *
    * @param options
    * @returns {nock.Scope}
    *
    * @throws on parse error of options.url
    */
  inline def mockTokeninfoEndpoint(options: MockOptions): Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("mockTokeninfoEndpoint")(options.asInstanceOf[js.Any]).asInstanceOf[Scope]
  inline def mockTokeninfoEndpoint(options: MockOptions, tokens: js.Array[Token[Record[String | Double | js.Symbol, Any]]]): Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("mockTokeninfoEndpoint")(options.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[Scope]
  
  inline def mockTokeninfoEndpointWithErrorResponse(options: MockOptions, httpStatus: Double): Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("mockTokeninfoEndpointWithErrorResponse")(options.asInstanceOf[js.Any], httpStatus.asInstanceOf[js.Any])).asInstanceOf[Scope]
  inline def mockTokeninfoEndpointWithErrorResponse(options: MockOptions, httpStatus: Double, responseBody: Record[String | Double | js.Symbol, Any]): Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("mockTokeninfoEndpointWithErrorResponse")(options.asInstanceOf[js.Any], httpStatus.asInstanceOf[js.Any], responseBody.asInstanceOf[js.Any])).asInstanceOf[Scope]
}
