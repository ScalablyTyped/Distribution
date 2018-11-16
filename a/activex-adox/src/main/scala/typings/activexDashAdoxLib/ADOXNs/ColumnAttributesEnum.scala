package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnAttributesEnum extends js.Object

@JSGlobal("ADOX.ColumnAttributesEnum")
@js.native
object ColumnAttributesEnum extends js.Object {
  @js.native
  sealed trait adColFixed
    extends activexDashAdoxLib.ADOXNs.ColumnAttributesEnum
  
  @js.native
  sealed trait adColNullable
    extends activexDashAdoxLib.ADOXNs.ColumnAttributesEnum
  
  /* 1 */ val adColFixed: adColFixed with scala.Double = js.native
  /* 2 */ val adColNullable: adColNullable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdoxLib.ADOXNs.ColumnAttributesEnum with scala.Double] = js.native
}

