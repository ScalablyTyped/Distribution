package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlListObjectSourceType extends js.Object

@JSGlobal("Excel.XlListObjectSourceType")
@js.native
object XlListObjectSourceType extends js.Object {
  @js.native
  sealed trait xlSrcExternal
    extends activexDashExcelLib.ExcelNs.XlListObjectSourceType
  
  @js.native
  sealed trait xlSrcQuery
    extends activexDashExcelLib.ExcelNs.XlListObjectSourceType
  
  @js.native
  sealed trait xlSrcRange
    extends activexDashExcelLib.ExcelNs.XlListObjectSourceType
  
  @js.native
  sealed trait xlSrcXml
    extends activexDashExcelLib.ExcelNs.XlListObjectSourceType
  
  /* 0 */ val xlSrcExternal: xlSrcExternal with scala.Double = js.native
  /* 3 */ val xlSrcQuery: xlSrcQuery with scala.Double = js.native
  /* 1 */ val xlSrcRange: xlSrcRange with scala.Double = js.native
  /* 2 */ val xlSrcXml: xlSrcXml with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlListObjectSourceType with scala.Double] = js.native
}

