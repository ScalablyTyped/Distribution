package typings
package apolloDashServerDashExpressLib.distApolloServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressContext extends js.Object {
  var req: expressLib.expressMod.eNs.Request
  var res: expressLib.expressMod.eNs.Response
}

object ExpressContext {
  @scala.inline
  def apply(req: expressLib.expressMod.eNs.Request, res: expressLib.expressMod.eNs.Response): ExpressContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("req")(req)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[ExpressContext]
  }
}

