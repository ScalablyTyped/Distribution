package typings
package apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOptions extends js.Object {
  var credentials: js.UndefOr[java.lang.String] = js.undefined
  var fetch: js.UndefOr[
    (js.Function1[/* input */ stdLib.RequestInfo, js.Promise[stdLib.Response]]) | (js.Function2[
      /* input */ stdLib.RequestInfo, 
      /* init */ stdLib.RequestInit, 
      js.Promise[stdLib.Response]
    ])
  ] = js.undefined
  var fetchOptions: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var includeExtensions: js.UndefOr[scala.Boolean] = js.undefined
  var uri: js.UndefOr[java.lang.String | UriFunction] = js.undefined
}

