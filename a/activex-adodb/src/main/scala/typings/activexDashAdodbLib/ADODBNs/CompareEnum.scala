package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompareEnum extends js.Object

@JSGlobal("ADODB.CompareEnum")
@js.native
object CompareEnum extends js.Object {
  @js.native
  sealed trait adCompareEqual
    extends activexDashAdodbLib.ADODBNs.CompareEnum
  
  @js.native
  sealed trait adCompareGreaterThan
    extends activexDashAdodbLib.ADODBNs.CompareEnum
  
  @js.native
  sealed trait adCompareLessThan
    extends activexDashAdodbLib.ADODBNs.CompareEnum
  
  @js.native
  sealed trait adCompareNotComparable
    extends activexDashAdodbLib.ADODBNs.CompareEnum
  
  @js.native
  sealed trait adCompareNotEqual
    extends activexDashAdodbLib.ADODBNs.CompareEnum
  
  /* 1 */ val adCompareEqual: adCompareEqual with scala.Double = js.native
  /* 2 */ val adCompareGreaterThan: adCompareGreaterThan with scala.Double = js.native
  /* 0 */ val adCompareLessThan: adCompareLessThan with scala.Double = js.native
  /* 4 */ val adCompareNotComparable: adCompareNotComparable with scala.Double = js.native
  /* 3 */ val adCompareNotEqual: adCompareNotEqual with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.CompareEnum with scala.Double] = js.native
}

