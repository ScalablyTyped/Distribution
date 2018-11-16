package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcQuitOption extends js.Object

@JSGlobal("Access.AcQuitOption")
@js.native
object AcQuitOption extends js.Object {
  @js.native
  sealed trait acQuitPrompt
    extends activexDashAccessLib.AccessNs.AcQuitOption
  
  @js.native
  sealed trait acQuitSaveAll
    extends activexDashAccessLib.AccessNs.AcQuitOption
  
  @js.native
  sealed trait acQuitSaveNone
    extends activexDashAccessLib.AccessNs.AcQuitOption
  
  /* 0 */ val acQuitPrompt: acQuitPrompt with scala.Double = js.native
  /* 1 */ val acQuitSaveAll: acQuitSaveAll with scala.Double = js.native
  /* 2 */ val acQuitSaveNone: acQuitSaveNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcQuitOption with scala.Double] = js.native
}

