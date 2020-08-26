package typings.apolloServerExpress.apolloServerMod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.subscriptionsTransportWs.serverMod.ExecutionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressContext extends js.Object {
  var connection: js.UndefOr[ExecutionParams[_]] = js.native
  var req: Request_[ParamsDictionary, _, _, Query] = js.native
  var res: Response_[_] = js.native
}

object ExpressContext {
  @scala.inline
  def apply(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): ExpressContext = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressContext]
  }
  @scala.inline
  implicit class ExpressContextOps[Self <: ExpressContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReq(value: Request_[ParamsDictionary, _, _, Query]): Self = this.set("req", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: Response_[_]): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnection(value: ExecutionParams[_]): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
  }
  
}

