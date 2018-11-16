package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlStdColorScale extends js.Object

@JSGlobal("Excel.XlStdColorScale")
@js.native
object XlStdColorScale extends js.Object {
  @js.native
  sealed trait xlColorScaleBlackWhite
    extends activexDashExcelLib.ExcelNs.XlStdColorScale
  
  @js.native
  sealed trait xlColorScaleGYR
    extends activexDashExcelLib.ExcelNs.XlStdColorScale
  
  @js.native
  sealed trait xlColorScaleRYG
    extends activexDashExcelLib.ExcelNs.XlStdColorScale
  
  @js.native
  sealed trait xlColorScaleWhiteBlack
    extends activexDashExcelLib.ExcelNs.XlStdColorScale
  
  /* 3 */ val xlColorScaleBlackWhite: xlColorScaleBlackWhite with scala.Double = js.native
  /* 2 */ val xlColorScaleGYR: xlColorScaleGYR with scala.Double = js.native
  /* 1 */ val xlColorScaleRYG: xlColorScaleRYG with scala.Double = js.native
  /* 4 */ val xlColorScaleWhiteBlack: xlColorScaleWhiteBlack with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlStdColorScale with scala.Double] = js.native
}

