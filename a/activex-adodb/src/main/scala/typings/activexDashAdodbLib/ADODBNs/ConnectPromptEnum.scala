package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectPromptEnum extends js.Object

@JSGlobal("ADODB.ConnectPromptEnum")
@js.native
object ConnectPromptEnum extends js.Object {
  @js.native
  sealed trait adPromptAlways
    extends activexDashAdodbLib.ADODBNs.ConnectPromptEnum
  
  @js.native
  sealed trait adPromptComplete
    extends activexDashAdodbLib.ADODBNs.ConnectPromptEnum
  
  @js.native
  sealed trait adPromptCompleteRequired
    extends activexDashAdodbLib.ADODBNs.ConnectPromptEnum
  
  @js.native
  sealed trait adPromptNever
    extends activexDashAdodbLib.ADODBNs.ConnectPromptEnum
  
  /* 1 */ val adPromptAlways: adPromptAlways with scala.Double = js.native
  /* 2 */ val adPromptComplete: adPromptComplete with scala.Double = js.native
  /* 3 */ val adPromptCompleteRequired: adPromptCompleteRequired with scala.Double = js.native
  /* 4 */ val adPromptNever: adPromptNever with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.ConnectPromptEnum with scala.Double] = js.native
}

