package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterDirectionEnum extends js.Object

@JSGlobal("DAO.ParameterDirectionEnum")
@js.native
object ParameterDirectionEnum extends js.Object {
  @js.native
  sealed trait dbParamInput
    extends activexDashDaoLib.DAONs.ParameterDirectionEnum
  
  @js.native
  sealed trait dbParamInputOutput
    extends activexDashDaoLib.DAONs.ParameterDirectionEnum
  
  @js.native
  sealed trait dbParamOutput
    extends activexDashDaoLib.DAONs.ParameterDirectionEnum
  
  @js.native
  sealed trait dbParamReturnValue
    extends activexDashDaoLib.DAONs.ParameterDirectionEnum
  
  /* 1 */ val dbParamInput: dbParamInput with scala.Double = js.native
  /* 3 */ val dbParamInputOutput: dbParamInputOutput with scala.Double = js.native
  /* 2 */ val dbParamOutput: dbParamOutput with scala.Double = js.native
  /* 4 */ val dbParamReturnValue: dbParamReturnValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.ParameterDirectionEnum with scala.Double] = js.native
}

