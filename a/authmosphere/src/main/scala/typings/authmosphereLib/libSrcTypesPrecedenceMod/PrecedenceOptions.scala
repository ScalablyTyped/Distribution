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
    req: expressLib.expressMod.eNs.Request,
    res: expressLib.expressMod.eNs.Response,
    next: expressLib.expressMod.eNs.NextFunction
  ): js.Promise[scala.Boolean] = js.native
}

