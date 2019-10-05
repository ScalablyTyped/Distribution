package typings.authmosphere

import typings.authmosphere.libSrcTypesLoggerMod.Logger
import typings.authmosphere.libSrcTypesTokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types/GetTokenInfo", JSImport.Namespace)
@js.native
object libSrcTypesGetTokenInfoMod extends js.Object {
  type GetTokenInfo[T] = js.Function3[
    /* tokenInfoUrl */ String, 
    /* accessToken */ String, 
    /* logger */ js.UndefOr[Logger], 
    js.Promise[Token[T]]
  ]
}

