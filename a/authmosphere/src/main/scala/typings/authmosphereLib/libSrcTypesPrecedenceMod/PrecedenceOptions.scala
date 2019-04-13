package typings
package authmosphereLib.libSrcTypesPrecedenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrecedenceOptions extends js.Object {
  @JSName("precedenceFunction")
  var precedenceFunction_Original: PrecedenceFunction = js.native
  def precedenceFunction(
    req: expressLib.expressMod.Request,
    res: expressLib.expressMod.Response,
    next: expressLib.expressMod.NextFunction
  ): js.Promise[scala.Boolean] = js.native
}

