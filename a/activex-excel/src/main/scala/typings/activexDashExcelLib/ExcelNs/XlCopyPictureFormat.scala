package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCopyPictureFormat extends js.Object

@JSGlobal("Excel.XlCopyPictureFormat")
@js.native
object XlCopyPictureFormat extends js.Object {
  @js.native
  sealed trait xlBitmap
    extends activexDashExcelLib.ExcelNs.XlCopyPictureFormat
  
  @js.native
  sealed trait xlPicture
    extends activexDashExcelLib.ExcelNs.XlCopyPictureFormat
  
  /* 2 */ val xlBitmap: xlBitmap with scala.Double = js.native
  /* -4147 */ val xlPicture: xlPicture with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCopyPictureFormat with scala.Double] = js.native
}

