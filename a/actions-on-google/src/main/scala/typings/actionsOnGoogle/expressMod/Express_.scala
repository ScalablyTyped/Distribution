package typings.actionsOnGoogle.expressMod

import typings.actionsOnGoogle.frameworkFrameworkMod.Framework
import typings.actionsOnGoogle.frameworkFrameworkMod.StandardHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/framework/express", "Express")
@js.native
class Express_ () extends Framework[ExpressHandler] {
  /** @public */
  /* CompleteClass */
  override def check(args: js.Any*): Boolean = js.native
  def check(first: js.Object, second: js.Object): Boolean = js.native
  /** @public */
  /* CompleteClass */
  override def handle(base: StandardHandler): ExpressHandler = js.native
  def isRequest(first: js.Object): /* is express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary> */ Boolean = js.native
  def isResponse(second: js.Object): /* is express.express.Response */ Boolean = js.native
}

