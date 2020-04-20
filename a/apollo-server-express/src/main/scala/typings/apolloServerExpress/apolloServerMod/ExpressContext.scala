package typings.apolloServerExpress.apolloServerMod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.subscriptionsTransportWs.serverMod.ExecutionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressContext extends js.Object {
  var connection: js.UndefOr[ExecutionParams[_]] = js.undefined
  var req: Request_[ParamsDictionary, _, _, Query]
  var res: Response_[_]
}

object ExpressContext {
  @scala.inline
  def apply(
    req: Request_[ParamsDictionary, _, _, Query],
    res: Response_[_],
    connection: ExecutionParams[_] = null
  ): ExpressContext = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressContext]
  }
}

