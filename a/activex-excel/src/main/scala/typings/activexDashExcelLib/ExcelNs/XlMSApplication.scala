package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlMSApplication extends js.Object

@JSGlobal("Excel.XlMSApplication")
@js.native
object XlMSApplication extends js.Object {
  @js.native
  sealed trait xlMicrosoftAccess
    extends activexDashExcelLib.ExcelNs.XlMSApplication
  
  @js.native
  sealed trait xlMicrosoftFoxPro
    extends activexDashExcelLib.ExcelNs.XlMSApplication
  
  @js.native
  sealed trait xlMicrosoftMail
    extends activexDashExcelLib.ExcelNs.XlMSApplication
  
  @js.native
  sealed trait xlMicrosoftPowerPoint
    extends activexDashExcelLib.ExcelNs.XlMSApplication
  
  @js.native
  sealed trait xlMicrosoftProject
    extends activexDashExcelLib.ExcelNs.XlMSApplication
  
  @js.native
  sealed trait xlMicrosoftSchedulePlus
    extends activexDashExcelLib.ExcelNs.XlMSApplication
  
  @js.native
  sealed trait xlMicrosoftWord
    extends activexDashExcelLib.ExcelNs.XlMSApplication
  
  /* 4 */ val xlMicrosoftAccess: xlMicrosoftAccess with scala.Double = js.native
  /* 5 */ val xlMicrosoftFoxPro: xlMicrosoftFoxPro with scala.Double = js.native
  /* 3 */ val xlMicrosoftMail: xlMicrosoftMail with scala.Double = js.native
  /* 2 */ val xlMicrosoftPowerPoint: xlMicrosoftPowerPoint with scala.Double = js.native
  /* 6 */ val xlMicrosoftProject: xlMicrosoftProject with scala.Double = js.native
  /* 7 */ val xlMicrosoftSchedulePlus: xlMicrosoftSchedulePlus with scala.Double = js.native
  /* 1 */ val xlMicrosoftWord: xlMicrosoftWord with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlMSApplication with scala.Double] = js.native
}

