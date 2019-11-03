package typings.apolloDashServerDashExpress.distApolloServerMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.subscriptionsDashTransportDashWs.distServerMod.ExecutionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressContext extends js.Object {
  var connection: js.UndefOr[ExecutionParams[_]] = js.undefined
  var req: Request[ParamsDictionary]
  var res: Response
}

object ExpressContext {
  @scala.inline
  def apply(req: Request[ParamsDictionary], res: Response, connection: ExecutionParams[_] = null): ExpressContext = {
    val __obj = js.Dynamic.literal(req = req, res = res)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    __obj.asInstanceOf[ExpressContext]
  }
}

