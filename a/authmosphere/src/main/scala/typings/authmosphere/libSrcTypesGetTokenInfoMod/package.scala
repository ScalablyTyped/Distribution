package typings.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesGetTokenInfoMod {
  import typings.authmosphere.libSrcTypesLoggerMod.Logger
  import typings.authmosphere.libSrcTypesTokenMod.Token

  type GetTokenInfo[T] = js.Function3[
    /* tokenInfoUrl */ String, 
    /* accessToken */ String, 
    /* logger */ js.UndefOr[Logger], 
    js.Promise[Token[T]]
  ]
}
