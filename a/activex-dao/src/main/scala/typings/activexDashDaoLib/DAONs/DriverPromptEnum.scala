package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DriverPromptEnum extends js.Object

@JSGlobal("DAO.DriverPromptEnum")
@js.native
object DriverPromptEnum extends js.Object {
  @js.native
  sealed trait dbDriverComplete
    extends activexDashDaoLib.DAONs.DriverPromptEnum
  
  @js.native
  sealed trait dbDriverCompleteRequired
    extends activexDashDaoLib.DAONs.DriverPromptEnum
  
  @js.native
  sealed trait dbDriverNoPrompt
    extends activexDashDaoLib.DAONs.DriverPromptEnum
  
  @js.native
  sealed trait dbDriverPrompt
    extends activexDashDaoLib.DAONs.DriverPromptEnum
  
  /* 0 */ val dbDriverComplete: dbDriverComplete with scala.Double = js.native
  /* 3 */ val dbDriverCompleteRequired: dbDriverCompleteRequired with scala.Double = js.native
  /* 1 */ val dbDriverNoPrompt: dbDriverNoPrompt with scala.Double = js.native
  /* 2 */ val dbDriverPrompt: dbDriverPrompt with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.DriverPromptEnum with scala.Double] = js.native
}

