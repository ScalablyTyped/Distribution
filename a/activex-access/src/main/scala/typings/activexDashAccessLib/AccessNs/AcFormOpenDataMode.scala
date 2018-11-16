package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcFormOpenDataMode extends js.Object

@JSGlobal("Access.AcFormOpenDataMode")
@js.native
object AcFormOpenDataMode extends js.Object {
  @js.native
  sealed trait acFormAdd
    extends activexDashAccessLib.AccessNs.AcFormOpenDataMode
  
  @js.native
  sealed trait acFormEdit
    extends activexDashAccessLib.AccessNs.AcFormOpenDataMode
  
  @js.native
  sealed trait acFormPropertySettings
    extends activexDashAccessLib.AccessNs.AcFormOpenDataMode
  
  @js.native
  sealed trait acFormReadOnly
    extends activexDashAccessLib.AccessNs.AcFormOpenDataMode
  
  /* 0 */ val acFormAdd: acFormAdd with scala.Double = js.native
  /* 1 */ val acFormEdit: acFormEdit with scala.Double = js.native
  /* -1 */ val acFormPropertySettings: acFormPropertySettings with scala.Double = js.native
  /* 2 */ val acFormReadOnly: acFormReadOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcFormOpenDataMode with scala.Double] = js.native
}

