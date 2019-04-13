package typings
package apolloDashServerDashExpressLib.distApolloServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressContext extends js.Object {
  var req: expressLib.expressMod.Request
  var res: expressLib.expressMod.Response
}

object ExpressContext {
  @scala.inline
  def apply(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): ExpressContext = {
    val __obj = js.Dynamic.literal(req = req, res = res)
  
    __obj.asInstanceOf[ExpressContext]
  }
}

