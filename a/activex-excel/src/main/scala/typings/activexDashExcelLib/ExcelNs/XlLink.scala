package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLink extends js.Object

@JSGlobal("Excel.XlLink")
@js.native
object XlLink extends js.Object {
  @js.native
  sealed trait xlExcelLinks
    extends activexDashExcelLib.ExcelNs.XlLink
  
  @js.native
  sealed trait xlOLELinks
    extends activexDashExcelLib.ExcelNs.XlLink
  
  @js.native
  sealed trait xlPublishers
    extends activexDashExcelLib.ExcelNs.XlLink
  
  @js.native
  sealed trait xlSubscribers
    extends activexDashExcelLib.ExcelNs.XlLink
  
  /* 1 */ val xlExcelLinks: xlExcelLinks with scala.Double = js.native
  /* 2 */ val xlOLELinks: xlOLELinks with scala.Double = js.native
  /* 5 */ val xlPublishers: xlPublishers with scala.Double = js.native
  /* 6 */ val xlSubscribers: xlSubscribers with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlLink with scala.Double] = js.native
}

