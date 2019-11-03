package typings.actionsDashOnDashGoogle.distFrameworkExpressMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressMetadata extends js.Object {
  /** @public */
  var request: Request[ParamsDictionary]
  /** @public */
  var response: Response
}

object ExpressMetadata {
  @scala.inline
  def apply(request: Request[ParamsDictionary], response: Response): ExpressMetadata = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[ExpressMetadata]
  }
}

