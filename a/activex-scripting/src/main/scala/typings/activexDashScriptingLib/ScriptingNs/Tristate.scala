package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Tristate extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("Scripting.Tristate")
@js.native
object Tristate extends js.Object {
  @js.native
  sealed trait TristateFalse
    extends activexDashScriptingLib.ScriptingNs.Tristate
  
  @js.native
  sealed trait TristateMixed
    extends activexDashScriptingLib.ScriptingNs.Tristate
  
  @js.native
  sealed trait TristateTrue
    extends activexDashScriptingLib.ScriptingNs.Tristate
  
  @js.native
  sealed trait TristateUseDefault
    extends activexDashScriptingLib.ScriptingNs.Tristate
  
  /* 0 */ val TristateFalse: TristateFalse with scala.Double = js.native
  /* -2 */ val TristateMixed: TristateMixed with scala.Double = js.native
  /* -1 */ val TristateTrue: TristateTrue with scala.Double = js.native
  /* -2 */ val TristateUseDefault: TristateUseDefault with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashScriptingLib.ScriptingNs.Tristate with scala.Double] = js.native
}

