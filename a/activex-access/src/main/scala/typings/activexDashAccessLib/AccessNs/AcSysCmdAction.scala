package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcSysCmdAction extends js.Object

@JSGlobal("Access.AcSysCmdAction")
@js.native
object AcSysCmdAction extends js.Object {
  @js.native
  sealed trait acSysCmdAccessDir
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  @js.native
  sealed trait acSysCmdAccessVer
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  @js.native
  sealed trait acSysCmdClearHelpTopic
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  @js.native
  sealed trait acSysCmdClearStatus
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  @js.native
  sealed trait acSysCmdGetObjectState
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  @js.native
  sealed trait acSysCmdGetWorkgroupFile
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  @js.native
  sealed trait acSysCmdIniFile
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  @js.native
  sealed trait acSysCmdInitMeter
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  @js.native
  sealed trait acSysCmdProfile
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  @js.native
  sealed trait acSysCmdRemoveMeter
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  @js.native
  sealed trait acSysCmdRuntime
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  @js.native
  sealed trait acSysCmdSetStatus
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  @js.native
  sealed trait acSysCmdUpdateMeter
    extends activexDashAccessLib.AccessNs.AcSysCmdAction
  
  /* 9 */ val acSysCmdAccessDir: acSysCmdAccessDir with scala.Double = js.native
  /* 7 */ val acSysCmdAccessVer: acSysCmdAccessVer with scala.Double = js.native
  /* 11 */ val acSysCmdClearHelpTopic: acSysCmdClearHelpTopic with scala.Double = js.native
  /* 5 */ val acSysCmdClearStatus: acSysCmdClearStatus with scala.Double = js.native
  /* 10 */ val acSysCmdGetObjectState: acSysCmdGetObjectState with scala.Double = js.native
  /* 13 */ val acSysCmdGetWorkgroupFile: acSysCmdGetWorkgroupFile with scala.Double = js.native
  /* 8 */ val acSysCmdIniFile: acSysCmdIniFile with scala.Double = js.native
  /* 1 */ val acSysCmdInitMeter: acSysCmdInitMeter with scala.Double = js.native
  /* 12 */ val acSysCmdProfile: acSysCmdProfile with scala.Double = js.native
  /* 3 */ val acSysCmdRemoveMeter: acSysCmdRemoveMeter with scala.Double = js.native
  /* 6 */ val acSysCmdRuntime: acSysCmdRuntime with scala.Double = js.native
  /* 4 */ val acSysCmdSetStatus: acSysCmdSetStatus with scala.Double = js.native
  /* 2 */ val acSysCmdUpdateMeter: acSysCmdUpdateMeter with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcSysCmdAction with scala.Double] = js.native
}

