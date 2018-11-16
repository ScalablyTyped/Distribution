package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileAttribute extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("Scripting.FileAttribute")
@js.native
object FileAttribute extends js.Object {
  @js.native
  sealed trait Alias
    extends activexDashScriptingLib.ScriptingNs.FileAttribute
  
  @js.native
  sealed trait Archive
    extends activexDashScriptingLib.ScriptingNs.FileAttribute
  
  @js.native
  sealed trait Compressed
    extends activexDashScriptingLib.ScriptingNs.FileAttribute
  
  @js.native
  sealed trait Directory
    extends activexDashScriptingLib.ScriptingNs.FileAttribute
  
  @js.native
  sealed trait Hidden
    extends activexDashScriptingLib.ScriptingNs.FileAttribute
  
  @js.native
  sealed trait Normal
    extends activexDashScriptingLib.ScriptingNs.FileAttribute
  
  @js.native
  sealed trait ReadOnly
    extends activexDashScriptingLib.ScriptingNs.FileAttribute
  
  @js.native
  sealed trait System
    extends activexDashScriptingLib.ScriptingNs.FileAttribute
  
  @js.native
  sealed trait Volume
    extends activexDashScriptingLib.ScriptingNs.FileAttribute
  
  /* 1024 */ val Alias: Alias with scala.Double = js.native
  /* 32 */ val Archive: Archive with scala.Double = js.native
  /* 2048 */ val Compressed: Compressed with scala.Double = js.native
  /* 16 */ val Directory: Directory with scala.Double = js.native
  /* 2 */ val Hidden: Hidden with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 1 */ val ReadOnly: ReadOnly with scala.Double = js.native
  /* 4 */ val System: System with scala.Double = js.native
  /* 8 */ val Volume: Volume with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashScriptingLib.ScriptingNs.FileAttribute with scala.Double] = js.native
}

