package typings
package authmosphereLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesGetTokenInfoMod {
  type GetTokenInfo[T] = js.Function3[
    /* tokenInfoUrl */ java.lang.String, 
    /* accessToken */ java.lang.String, 
    /* logger */ js.UndefOr[authmosphereLib.libSrcTypesLoggerMod.Logger], 
    stdLib.Promise[authmosphereLib.libSrcTypesTokenMod.Token[T]]
  ]
}
