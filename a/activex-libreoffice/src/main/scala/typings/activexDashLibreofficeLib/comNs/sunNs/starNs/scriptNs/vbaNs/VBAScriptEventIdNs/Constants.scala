package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBAScriptEventIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.script.vba.VBAScriptEventId.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait INITIALIZE_USERFORM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBAScriptEventIdNs.Constants
  
  @js.native
  sealed trait SCRIPT_STARTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBAScriptEventIdNs.Constants
  
  @js.native
  sealed trait SCRIPT_STOPPED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBAScriptEventIdNs.Constants
  
  /* 2 */ val INITIALIZE_USERFORM: INITIALIZE_USERFORM with scala.Double = js.native
  /* 0 */ val SCRIPT_STARTED: SCRIPT_STARTED with scala.Double = js.native
  /* 1 */ val SCRIPT_STOPPED: SCRIPT_STOPPED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBAScriptEventIdNs.Constants with scala.Double
  ] = js.native
}

