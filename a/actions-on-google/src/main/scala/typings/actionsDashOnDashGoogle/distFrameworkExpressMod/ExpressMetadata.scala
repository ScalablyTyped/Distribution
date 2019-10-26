package typings.actionsDashOnDashGoogle.distFrameworkExpressMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressMetadata extends js.Object {
  /** @public */
  var request: Request
  /** @public */
  var response: Response
}

object ExpressMetadata {
  @scala.inline
  def apply(request: Request, response: Response): ExpressMetadata = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[ExpressMetadata]
  }
}

