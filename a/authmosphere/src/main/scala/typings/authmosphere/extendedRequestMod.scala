package typings.authmosphere

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types/ExtendedRequest", JSImport.Namespace)
@js.native
object extendedRequestMod extends js.Object {
  @js.native
  trait ExtendedRequest
    extends Request[ParamsDictionary, js.Any, js.Any, Query] {
    @JSName("$$tokeninfo")
    var DollarDollartokeninfo: js.UndefOr[AnonScope] = js.native
  }
  
}

