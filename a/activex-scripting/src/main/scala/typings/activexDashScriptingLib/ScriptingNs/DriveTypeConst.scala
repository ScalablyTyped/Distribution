package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DriveTypeConst extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("Scripting.DriveTypeConst")
@js.native
object DriveTypeConst extends js.Object {
  @js.native
  sealed trait CDRom
    extends activexDashScriptingLib.ScriptingNs.DriveTypeConst
  
  @js.native
  sealed trait Fixed
    extends activexDashScriptingLib.ScriptingNs.DriveTypeConst
  
  @js.native
  sealed trait RamDisk
    extends activexDashScriptingLib.ScriptingNs.DriveTypeConst
  
  @js.native
  sealed trait Remote
    extends activexDashScriptingLib.ScriptingNs.DriveTypeConst
  
  @js.native
  sealed trait Removable
    extends activexDashScriptingLib.ScriptingNs.DriveTypeConst
  
  @js.native
  sealed trait UnknownType
    extends activexDashScriptingLib.ScriptingNs.DriveTypeConst
  
  /* 4 */ val CDRom: CDRom with scala.Double = js.native
  /* 2 */ val Fixed: Fixed with scala.Double = js.native
  /* 5 */ val RamDisk: RamDisk with scala.Double = js.native
  /* 3 */ val Remote: Remote with scala.Double = js.native
  /* 1 */ val Removable: Removable with scala.Double = js.native
  /* 0 */ val UnknownType: UnknownType with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashScriptingLib.ScriptingNs.DriveTypeConst with scala.Double] = js.native
}

