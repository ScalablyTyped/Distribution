package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlOLEType extends js.Object

@JSGlobal("Excel.XlOLEType")
@js.native
object XlOLEType extends js.Object {
  @js.native
  sealed trait xlOLEControl
    extends activexDashExcelLib.ExcelNs.XlOLEType
  
  @js.native
  sealed trait xlOLEEmbed
    extends activexDashExcelLib.ExcelNs.XlOLEType
  
  @js.native
  sealed trait xlOLELink
    extends activexDashExcelLib.ExcelNs.XlOLEType
  
  /* 2 */ val xlOLEControl: xlOLEControl with scala.Double = js.native
  /* 1 */ val xlOLEEmbed: xlOLEEmbed with scala.Double = js.native
  /* 0 */ val xlOLELink: xlOLELink with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlOLEType with scala.Double] = js.native
}

