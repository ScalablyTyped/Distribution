package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompareMethod extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("Scripting.CompareMethod")
@js.native
object CompareMethod extends js.Object {
  @js.native
  sealed trait BinaryCompare
    extends activexDashScriptingLib.ScriptingNs.CompareMethod
  
  @js.native
  sealed trait DatabaseCompare
    extends activexDashScriptingLib.ScriptingNs.CompareMethod
  
  @js.native
  sealed trait TextCompare
    extends activexDashScriptingLib.ScriptingNs.CompareMethod
  
  /* 0 */ val BinaryCompare: BinaryCompare with scala.Double = js.native
  /* 2 */ val DatabaseCompare: DatabaseCompare with scala.Double = js.native
  /* 1 */ val TextCompare: TextCompare with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashScriptingLib.ScriptingNs.CompareMethod with scala.Double] = js.native
}

