package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLinkInfoType extends js.Object

@JSGlobal("Excel.XlLinkInfoType")
@js.native
object XlLinkInfoType extends js.Object {
  @js.native
  sealed trait xlLinkInfoOLELinks
    extends activexDashExcelLib.ExcelNs.XlLinkInfoType
  
  @js.native
  sealed trait xlLinkInfoPublishers
    extends activexDashExcelLib.ExcelNs.XlLinkInfoType
  
  @js.native
  sealed trait xlLinkInfoSubscribers
    extends activexDashExcelLib.ExcelNs.XlLinkInfoType
  
  /* 2 */ val xlLinkInfoOLELinks: xlLinkInfoOLELinks with scala.Double = js.native
  /* 5 */ val xlLinkInfoPublishers: xlLinkInfoPublishers with scala.Double = js.native
  /* 6 */ val xlLinkInfoSubscribers: xlLinkInfoSubscribers with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlLinkInfoType with scala.Double] = js.native
}

