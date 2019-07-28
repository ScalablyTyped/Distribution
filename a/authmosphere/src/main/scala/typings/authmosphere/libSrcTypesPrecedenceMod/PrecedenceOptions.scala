package typings.authmosphere.libSrcTypesPrecedenceMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrecedenceOptions extends js.Object {
  @JSName("precedenceFunction")
  var precedenceFunction_Original: PrecedenceFunction = js.native
  def precedenceFunction(req: Request, res: Response, next: NextFunction): js.Promise[Boolean] = js.native
}

