package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ADCPROP_UPDATECRITERIA_ENUM extends js.Object

@JSGlobal("ADODB.ADCPROP_UPDATECRITERIA_ENUM")
@js.native
object ADCPROP_UPDATECRITERIA_ENUM extends js.Object {
  @js.native
  sealed trait adCriteriaAllCols
    extends activexDashAdodbLib.ADODBNs.ADCPROP_UPDATECRITERIA_ENUM
  
  @js.native
  sealed trait adCriteriaKey
    extends activexDashAdodbLib.ADODBNs.ADCPROP_UPDATECRITERIA_ENUM
  
  @js.native
  sealed trait adCriteriaTimeStamp
    extends activexDashAdodbLib.ADODBNs.ADCPROP_UPDATECRITERIA_ENUM
  
  @js.native
  sealed trait adCriteriaUpdCols
    extends activexDashAdodbLib.ADODBNs.ADCPROP_UPDATECRITERIA_ENUM
  
  /* 1 */ val adCriteriaAllCols: adCriteriaAllCols with scala.Double = js.native
  /* 0 */ val adCriteriaKey: adCriteriaKey with scala.Double = js.native
  /* 3 */ val adCriteriaTimeStamp: adCriteriaTimeStamp with scala.Double = js.native
  /* 2 */ val adCriteriaUpdCols: adCriteriaUpdCols with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.ADCPROP_UPDATECRITERIA_ENUM with scala.Double] = js.native
}

