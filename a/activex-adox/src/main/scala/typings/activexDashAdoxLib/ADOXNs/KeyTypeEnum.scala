package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyTypeEnum extends js.Object

@JSGlobal("ADOX.KeyTypeEnum")
@js.native
object KeyTypeEnum extends js.Object {
  @js.native
  sealed trait adKeyForeign
    extends activexDashAdoxLib.ADOXNs.KeyTypeEnum
  
  @js.native
  sealed trait adKeyPrimary
    extends activexDashAdoxLib.ADOXNs.KeyTypeEnum
  
  @js.native
  sealed trait adKeyUnique
    extends activexDashAdoxLib.ADOXNs.KeyTypeEnum
  
  /* 2 */ val adKeyForeign: adKeyForeign with scala.Double = js.native
  /* 1 */ val adKeyPrimary: adKeyPrimary with scala.Double = js.native
  /* 3 */ val adKeyUnique: adKeyUnique with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdoxLib.ADOXNs.KeyTypeEnum with scala.Double] = js.native
}

