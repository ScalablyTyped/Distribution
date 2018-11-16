package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommandTypeEnum extends js.Object

@JSGlobal("ADODB.CommandTypeEnum")
@js.native
object CommandTypeEnum extends js.Object {
  @js.native
  sealed trait adCmdFile
    extends activexDashAdodbLib.ADODBNs.CommandTypeEnum
  
  @js.native
  sealed trait adCmdStoredProc
    extends activexDashAdodbLib.ADODBNs.CommandTypeEnum
  
  @js.native
  sealed trait adCmdTable
    extends activexDashAdodbLib.ADODBNs.CommandTypeEnum
  
  @js.native
  sealed trait adCmdTableDirect
    extends activexDashAdodbLib.ADODBNs.CommandTypeEnum
  
  @js.native
  sealed trait adCmdText
    extends activexDashAdodbLib.ADODBNs.CommandTypeEnum
  
  @js.native
  sealed trait adCmdUnknown
    extends activexDashAdodbLib.ADODBNs.CommandTypeEnum
  
  @js.native
  sealed trait adCmdUnspecified
    extends activexDashAdodbLib.ADODBNs.CommandTypeEnum
  
  /* 256 */ val adCmdFile: adCmdFile with scala.Double = js.native
  /* 4 */ val adCmdStoredProc: adCmdStoredProc with scala.Double = js.native
  /* 2 */ val adCmdTable: adCmdTable with scala.Double = js.native
  /* 512 */ val adCmdTableDirect: adCmdTableDirect with scala.Double = js.native
  /* 1 */ val adCmdText: adCmdText with scala.Double = js.native
  /* 8 */ val adCmdUnknown: adCmdUnknown with scala.Double = js.native
  /* -1 */ val adCmdUnspecified: adCmdUnspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.CommandTypeEnum with scala.Double] = js.native
}

