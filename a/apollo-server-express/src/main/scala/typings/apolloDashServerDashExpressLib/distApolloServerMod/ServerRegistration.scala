package typings
package apolloDashServerDashExpressLib.distApolloServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerRegistration extends js.Object {
  var app: expressLib.expressMod.eNs.Application
  var bodyParserConfig: js.UndefOr[bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsJson | scala.Boolean] = js.undefined
  var cors: js.UndefOr[corsLib.corsMod.eNs.CorsOptions | scala.Boolean] = js.undefined
  var disableHealthCheck: js.UndefOr[scala.Boolean] = js.undefined
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, stdLib.Promise[_]]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

