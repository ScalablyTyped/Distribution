package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcFindField extends js.Object

@JSGlobal("Access.AcFindField")
@js.native
object AcFindField extends js.Object {
  @js.native
  sealed trait acAll
    extends activexDashAccessLib.AccessNs.AcFindField
  
  @js.native
  sealed trait acCurrent
    extends activexDashAccessLib.AccessNs.AcFindField
  
  /* 0 */ val acAll: acAll with scala.Double = js.native
  /* -1 */ val acCurrent: acCurrent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcFindField with scala.Double] = js.native
}

