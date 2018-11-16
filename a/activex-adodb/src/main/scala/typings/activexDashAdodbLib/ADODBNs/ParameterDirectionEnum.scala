package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterDirectionEnum extends js.Object

@JSGlobal("ADODB.ParameterDirectionEnum")
@js.native
object ParameterDirectionEnum extends js.Object {
  @js.native
  sealed trait adParamInput
    extends activexDashAdodbLib.ADODBNs.ParameterDirectionEnum
  
  @js.native
  sealed trait adParamInputOutput
    extends activexDashAdodbLib.ADODBNs.ParameterDirectionEnum
  
  @js.native
  sealed trait adParamOutput
    extends activexDashAdodbLib.ADODBNs.ParameterDirectionEnum
  
  @js.native
  sealed trait adParamReturnValue
    extends activexDashAdodbLib.ADODBNs.ParameterDirectionEnum
  
  @js.native
  sealed trait adParamUnknown
    extends activexDashAdodbLib.ADODBNs.ParameterDirectionEnum
  
  /* 1 */ val adParamInput: adParamInput with scala.Double = js.native
  /* 3 */ val adParamInputOutput: adParamInputOutput with scala.Double = js.native
  /* 2 */ val adParamOutput: adParamOutput with scala.Double = js.native
  /* 4 */ val adParamReturnValue: adParamReturnValue with scala.Double = js.native
  /* 0 */ val adParamUnknown: adParamUnknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.ParameterDirectionEnum with scala.Double] = js.native
}

