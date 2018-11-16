package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcOpenDataMode extends js.Object

@JSGlobal("Access.AcOpenDataMode")
@js.native
object AcOpenDataMode extends js.Object {
  @js.native
  sealed trait acAdd
    extends activexDashAccessLib.AccessNs.AcOpenDataMode
  
  @js.native
  sealed trait acEdit
    extends activexDashAccessLib.AccessNs.AcOpenDataMode
  
  @js.native
  sealed trait acReadOnly
    extends activexDashAccessLib.AccessNs.AcOpenDataMode
  
  /* 0 */ val acAdd: acAdd with scala.Double = js.native
  /* 1 */ val acEdit: acEdit with scala.Double = js.native
  /* 2 */ val acReadOnly: acReadOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcOpenDataMode with scala.Double] = js.native
}

