package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlFormControl extends js.Object

@JSGlobal("Excel.XlFormControl")
@js.native
object XlFormControl extends js.Object {
  @js.native
  sealed trait xlButtonControl
    extends activexDashExcelLib.ExcelNs.XlFormControl
  
  @js.native
  sealed trait xlCheckBox
    extends activexDashExcelLib.ExcelNs.XlFormControl
  
  @js.native
  sealed trait xlDropDown
    extends activexDashExcelLib.ExcelNs.XlFormControl
  
  @js.native
  sealed trait xlEditBox
    extends activexDashExcelLib.ExcelNs.XlFormControl
  
  @js.native
  sealed trait xlGroupBox
    extends activexDashExcelLib.ExcelNs.XlFormControl
  
  @js.native
  sealed trait xlLabel
    extends activexDashExcelLib.ExcelNs.XlFormControl
  
  @js.native
  sealed trait xlListBox
    extends activexDashExcelLib.ExcelNs.XlFormControl
  
  @js.native
  sealed trait xlOptionButton
    extends activexDashExcelLib.ExcelNs.XlFormControl
  
  @js.native
  sealed trait xlScrollBar
    extends activexDashExcelLib.ExcelNs.XlFormControl
  
  @js.native
  sealed trait xlSpinner
    extends activexDashExcelLib.ExcelNs.XlFormControl
  
  /* 0 */ val xlButtonControl: xlButtonControl with scala.Double = js.native
  /* 1 */ val xlCheckBox: xlCheckBox with scala.Double = js.native
  /* 2 */ val xlDropDown: xlDropDown with scala.Double = js.native
  /* 3 */ val xlEditBox: xlEditBox with scala.Double = js.native
  /* 4 */ val xlGroupBox: xlGroupBox with scala.Double = js.native
  /* 5 */ val xlLabel: xlLabel with scala.Double = js.native
  /* 6 */ val xlListBox: xlListBox with scala.Double = js.native
  /* 7 */ val xlOptionButton: xlOptionButton with scala.Double = js.native
  /* 8 */ val xlScrollBar: xlScrollBar with scala.Double = js.native
  /* 9 */ val xlSpinner: xlSpinner with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlFormControl with scala.Double] = js.native
}

