package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPhoneticAlignment extends js.Object

@JSGlobal("Excel.XlPhoneticAlignment")
@js.native
object XlPhoneticAlignment extends js.Object {
  @js.native
  sealed trait xlPhoneticAlignCenter
    extends activexDashExcelLib.ExcelNs.XlPhoneticAlignment
  
  @js.native
  sealed trait xlPhoneticAlignDistributed
    extends activexDashExcelLib.ExcelNs.XlPhoneticAlignment
  
  @js.native
  sealed trait xlPhoneticAlignLeft
    extends activexDashExcelLib.ExcelNs.XlPhoneticAlignment
  
  @js.native
  sealed trait xlPhoneticAlignNoControl
    extends activexDashExcelLib.ExcelNs.XlPhoneticAlignment
  
  /* 2 */ val xlPhoneticAlignCenter: xlPhoneticAlignCenter with scala.Double = js.native
  /* 3 */ val xlPhoneticAlignDistributed: xlPhoneticAlignDistributed with scala.Double = js.native
  /* 1 */ val xlPhoneticAlignLeft: xlPhoneticAlignLeft with scala.Double = js.native
  /* 0 */ val xlPhoneticAlignNoControl: xlPhoneticAlignNoControl with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPhoneticAlignment with scala.Double] = js.native
}

