package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcCloseSave extends js.Object

@JSGlobal("Access.AcCloseSave")
@js.native
object AcCloseSave extends js.Object {
  @js.native
  sealed trait acSaveNo
    extends activexDashAccessLib.AccessNs.AcCloseSave
  
  @js.native
  sealed trait acSavePrompt
    extends activexDashAccessLib.AccessNs.AcCloseSave
  
  @js.native
  sealed trait acSaveYes
    extends activexDashAccessLib.AccessNs.AcCloseSave
  
  /* 2 */ val acSaveNo: acSaveNo with scala.Double = js.native
  /* 0 */ val acSavePrompt: acSavePrompt with scala.Double = js.native
  /* 1 */ val acSaveYes: acSaveYes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcCloseSave with scala.Double] = js.native
}

