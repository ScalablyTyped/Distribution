package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlXmlLoadOption extends js.Object

@JSGlobal("Excel.XlXmlLoadOption")
@js.native
object XlXmlLoadOption extends js.Object {
  @js.native
  sealed trait xlXmlLoadImportToList
    extends activexDashExcelLib.ExcelNs.XlXmlLoadOption
  
  @js.native
  sealed trait xlXmlLoadMapXml
    extends activexDashExcelLib.ExcelNs.XlXmlLoadOption
  
  @js.native
  sealed trait xlXmlLoadOpenXml
    extends activexDashExcelLib.ExcelNs.XlXmlLoadOption
  
  @js.native
  sealed trait xlXmlLoadPromptUser
    extends activexDashExcelLib.ExcelNs.XlXmlLoadOption
  
  /* 2 */ val xlXmlLoadImportToList: xlXmlLoadImportToList with scala.Double = js.native
  /* 3 */ val xlXmlLoadMapXml: xlXmlLoadMapXml with scala.Double = js.native
  /* 1 */ val xlXmlLoadOpenXml: xlXmlLoadOpenXml with scala.Double = js.native
  /* 0 */ val xlXmlLoadPromptUser: xlXmlLoadPromptUser with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlXmlLoadOption with scala.Double] = js.native
}

