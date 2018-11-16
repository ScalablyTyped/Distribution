package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCalculatedMemberType extends js.Object

@JSGlobal("Excel.XlCalculatedMemberType")
@js.native
object XlCalculatedMemberType extends js.Object {
  @js.native
  sealed trait xlCalculatedMember
    extends activexDashExcelLib.ExcelNs.XlCalculatedMemberType
  
  @js.native
  sealed trait xlCalculatedSet
    extends activexDashExcelLib.ExcelNs.XlCalculatedMemberType
  
  /* 0 */ val xlCalculatedMember: xlCalculatedMember with scala.Double = js.native
  /* 1 */ val xlCalculatedSet: xlCalculatedSet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCalculatedMemberType with scala.Double] = js.native
}

