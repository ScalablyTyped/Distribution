package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterAttributesEnum extends js.Object

@JSGlobal("ADODB.ParameterAttributesEnum")
@js.native
object ParameterAttributesEnum extends js.Object {
  @js.native
  sealed trait adParamLong
    extends activexDashAdodbLib.ADODBNs.ParameterAttributesEnum
  
  @js.native
  sealed trait adParamNullable
    extends activexDashAdodbLib.ADODBNs.ParameterAttributesEnum
  
  @js.native
  sealed trait adParamSigned
    extends activexDashAdodbLib.ADODBNs.ParameterAttributesEnum
  
  /* 128 */ val adParamLong: adParamLong with scala.Double = js.native
  /* 64 */ val adParamNullable: adParamNullable with scala.Double = js.native
  /* 16 */ val adParamSigned: adParamSigned with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.ParameterAttributesEnum with scala.Double] = js.native
}

