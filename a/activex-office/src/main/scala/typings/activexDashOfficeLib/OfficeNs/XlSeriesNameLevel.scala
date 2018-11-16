package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSeriesNameLevel extends js.Object

@JSGlobal("Office.XlSeriesNameLevel")
@js.native
object XlSeriesNameLevel extends js.Object {
  @js.native
  sealed trait xlSeriesNameLevelAll
    extends activexDashOfficeLib.OfficeNs.XlSeriesNameLevel
  
  @js.native
  sealed trait xlSeriesNameLevelCustom
    extends activexDashOfficeLib.OfficeNs.XlSeriesNameLevel
  
  @js.native
  sealed trait xlSeriesNameLevelNone
    extends activexDashOfficeLib.OfficeNs.XlSeriesNameLevel
  
  /* -1 */ val xlSeriesNameLevelAll: xlSeriesNameLevelAll with scala.Double = js.native
  /* -2 */ val xlSeriesNameLevelCustom: xlSeriesNameLevelCustom with scala.Double = js.native
  /* -3 */ val xlSeriesNameLevelNone: xlSeriesNameLevelNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlSeriesNameLevel with scala.Double] = js.native
}

