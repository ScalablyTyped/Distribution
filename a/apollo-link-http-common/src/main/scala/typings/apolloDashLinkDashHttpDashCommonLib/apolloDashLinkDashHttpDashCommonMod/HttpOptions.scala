package typings
package apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOptions extends js.Object {
  /**
    * The credentials policy you want to use for the fetch call.
    */
  var credentials: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A `fetch`-compatible API to use when making requests.
    */
  var fetch: js.UndefOr[
    (js.Function1[/* input */ stdLib.RequestInfo, js.Promise[stdLib.Response]]) | (js.Function2[
      /* input */ stdLib.RequestInfo, 
      /* init */ stdLib.RequestInit, 
      js.Promise[stdLib.Response]
    ])
  ] = js.undefined
  /**
    * Any overrides of the fetch options argument to pass to the fetch call.
    */
  var fetchOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * An object representing values to be sent as headers on the request.
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
    * Passes the extensions field to your graphql server.
    *
    * Defaults to false.
    */
  var includeExtensions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The URI to use when fetching operations.
    *
    * Defaults to '/graphql'.
    */
  var uri: js.UndefOr[java.lang.String | UriFunction] = js.undefined
}

