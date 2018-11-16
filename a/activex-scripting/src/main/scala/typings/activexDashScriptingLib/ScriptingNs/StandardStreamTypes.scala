package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StandardStreamTypes extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("Scripting.StandardStreamTypes")
@js.native
object StandardStreamTypes extends js.Object {
  @js.native
  sealed trait StdErr
    extends activexDashScriptingLib.ScriptingNs.StandardStreamTypes
  
  @js.native
  sealed trait StdIn
    extends activexDashScriptingLib.ScriptingNs.StandardStreamTypes
  
  @js.native
  sealed trait StdOut
    extends activexDashScriptingLib.ScriptingNs.StandardStreamTypes
  
  /* 2 */ val StdErr: StdErr with scala.Double = js.native
  /* 0 */ val StdIn: StdIn with scala.Double = js.native
  /* 1 */ val StdOut: StdOut with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashScriptingLib.ScriptingNs.StandardStreamTypes with scala.Double] = js.native
}

