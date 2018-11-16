package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpecialFolderConst extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("Scripting.SpecialFolderConst")
@js.native
object SpecialFolderConst extends js.Object {
  @js.native
  sealed trait SystemFolder
    extends activexDashScriptingLib.ScriptingNs.SpecialFolderConst
  
  @js.native
  sealed trait TemporaryFolder
    extends activexDashScriptingLib.ScriptingNs.SpecialFolderConst
  
  @js.native
  sealed trait WindowsFolder
    extends activexDashScriptingLib.ScriptingNs.SpecialFolderConst
  
  /* 1 */ val SystemFolder: SystemFolder with scala.Double = js.native
  /* 2 */ val TemporaryFolder: TemporaryFolder with scala.Double = js.native
  /* 0 */ val WindowsFolder: WindowsFolder with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashScriptingLib.ScriptingNs.SpecialFolderConst with scala.Double] = js.native
}

