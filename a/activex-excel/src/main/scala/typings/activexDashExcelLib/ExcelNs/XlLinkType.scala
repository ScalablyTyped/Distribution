package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLinkType extends js.Object

@JSGlobal("Excel.XlLinkType")
@js.native
object XlLinkType extends js.Object {
  @js.native
  sealed trait xlLinkTypeExcelLinks
    extends activexDashExcelLib.ExcelNs.XlLinkType
  
  @js.native
  sealed trait xlLinkTypeOLELinks
    extends activexDashExcelLib.ExcelNs.XlLinkType
  
  /* 1 */ val xlLinkTypeExcelLinks: xlLinkTypeExcelLinks with scala.Double = js.native
  /* 2 */ val xlLinkTypeOLELinks: xlLinkTypeOLELinks with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlLinkType with scala.Double] = js.native
}

