package typings.actionsOnGoogle.expressMod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressMetadata extends js.Object {
  /** @public */
  var request: Request_[ParamsDictionary, _, _, Query]
  /** @public */
  var response: Response_[_]
}

object ExpressMetadata {
  @scala.inline
  def apply(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): ExpressMetadata = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressMetadata]
  }
}

