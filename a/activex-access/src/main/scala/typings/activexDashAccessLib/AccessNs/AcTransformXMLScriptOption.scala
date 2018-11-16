package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcTransformXMLScriptOption extends js.Object

@JSGlobal("Access.AcTransformXMLScriptOption")
@js.native
object AcTransformXMLScriptOption extends js.Object {
  @js.native
  sealed trait acDisableScript
    extends activexDashAccessLib.AccessNs.AcTransformXMLScriptOption
  
  @js.native
  sealed trait acEnableScript
    extends activexDashAccessLib.AccessNs.AcTransformXMLScriptOption
  
  @js.native
  sealed trait acPromptScript
    extends activexDashAccessLib.AccessNs.AcTransformXMLScriptOption
  
  /* 2 */ val acDisableScript: acDisableScript with scala.Double = js.native
  /* 0 */ val acEnableScript: acEnableScript with scala.Double = js.native
  /* 1 */ val acPromptScript: acPromptScript with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcTransformXMLScriptOption with scala.Double] = js.native
}

