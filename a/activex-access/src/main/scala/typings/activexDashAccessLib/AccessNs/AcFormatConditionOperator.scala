package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcFormatConditionOperator extends js.Object

@JSGlobal("Access.AcFormatConditionOperator")
@js.native
object AcFormatConditionOperator extends js.Object {
  @js.native
  sealed trait acBetween
    extends activexDashAccessLib.AccessNs.AcFormatConditionOperator
  
  @js.native
  sealed trait acEqual
    extends activexDashAccessLib.AccessNs.AcFormatConditionOperator
  
  @js.native
  sealed trait acGreaterThan
    extends activexDashAccessLib.AccessNs.AcFormatConditionOperator
  
  @js.native
  sealed trait acGreaterThanOrEqual
    extends activexDashAccessLib.AccessNs.AcFormatConditionOperator
  
  @js.native
  sealed trait acLessThan
    extends activexDashAccessLib.AccessNs.AcFormatConditionOperator
  
  @js.native
  sealed trait acLessThanOrEqual
    extends activexDashAccessLib.AccessNs.AcFormatConditionOperator
  
  @js.native
  sealed trait acNotBetween
    extends activexDashAccessLib.AccessNs.AcFormatConditionOperator
  
  @js.native
  sealed trait acNotEqual
    extends activexDashAccessLib.AccessNs.AcFormatConditionOperator
  
  /* 0 */ val acBetween: acBetween with scala.Double = js.native
  /* 2 */ val acEqual: acEqual with scala.Double = js.native
  /* 4 */ val acGreaterThan: acGreaterThan with scala.Double = js.native
  /* 6 */ val acGreaterThanOrEqual: acGreaterThanOrEqual with scala.Double = js.native
  /* 5 */ val acLessThan: acLessThan with scala.Double = js.native
  /* 7 */ val acLessThanOrEqual: acLessThanOrEqual with scala.Double = js.native
  /* 1 */ val acNotBetween: acNotBetween with scala.Double = js.native
  /* 3 */ val acNotEqual: acNotEqual with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcFormatConditionOperator with scala.Double] = js.native
}

