package typings.authmosphere

import typings.authmosphere.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types/GetTokenInfo", JSImport.Namespace)
@js.native
object getTokenInfoMod extends js.Object {
  type GetTokenInfo[T] = js.Function3[
    /* tokenInfoUrl */ String, 
    /* accessToken */ String, 
    /* logger */ js.UndefOr[Logger], 
    js.Promise[typings.authmosphere.tokenMod.Token[T]]
  ]
}

