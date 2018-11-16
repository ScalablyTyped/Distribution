package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IOMode extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("Scripting.IOMode")
@js.native
object IOMode extends js.Object {
  @js.native
  sealed trait ForAppending
    extends activexDashScriptingLib.ScriptingNs.IOMode
  
  @js.native
  sealed trait ForReading
    extends activexDashScriptingLib.ScriptingNs.IOMode
  
  @js.native
  sealed trait ForWriting
    extends activexDashScriptingLib.ScriptingNs.IOMode
  
  /* 8 */ val ForAppending: ForAppending with scala.Double = js.native
  /* 1 */ val ForReading: ForReading with scala.Double = js.native
  /* 2 */ val ForWriting: ForWriting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashScriptingLib.ScriptingNs.IOMode with scala.Double] = js.native
}

