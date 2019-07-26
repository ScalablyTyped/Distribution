package typings
package apolloDashServerDashExpressLib.distApolloServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressContext extends js.Object {
  var connection: js.UndefOr[subscriptionsDashTransportDashWsLib.distServerMod.ExecutionParams[_]] = js.undefined
  var req: expressLib.expressMod.Request
  var res: expressLib.expressMod.Response
}

object ExpressContext {
  @scala.inline
  def apply(
    req: expressLib.expressMod.Request,
    res: expressLib.expressMod.Response,
    connection: subscriptionsDashTransportDashWsLib.distServerMod.ExecutionParams[_] = null
  ): ExpressContext = {
    val __obj = js.Dynamic.literal(req = req, res = res)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    __obj.asInstanceOf[ExpressContext]
  }
}

