package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcFormatConditionType extends js.Object

@JSGlobal("Access.AcFormatConditionType")
@js.native
object AcFormatConditionType extends js.Object {
  @js.native
  sealed trait acDataBar
    extends activexDashAccessLib.AccessNs.AcFormatConditionType
  
  @js.native
  sealed trait acExpression
    extends activexDashAccessLib.AccessNs.AcFormatConditionType
  
  @js.native
  sealed trait acFieldHasFocus
    extends activexDashAccessLib.AccessNs.AcFormatConditionType
  
  @js.native
  sealed trait acFieldValue
    extends activexDashAccessLib.AccessNs.AcFormatConditionType
  
  /* 3 */ val acDataBar: acDataBar with scala.Double = js.native
  /* 1 */ val acExpression: acExpression with scala.Double = js.native
  /* 2 */ val acFieldHasFocus: acFieldHasFocus with scala.Double = js.native
  /* 0 */ val acFieldValue: acFieldValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcFormatConditionType with scala.Double] = js.native
}

