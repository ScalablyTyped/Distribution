package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCategoryLabelLevel extends js.Object

@JSGlobal("Office.XlCategoryLabelLevel")
@js.native
object XlCategoryLabelLevel extends js.Object {
  @js.native
  sealed trait xlCategoryLabelLevelAll
    extends activexDashOfficeLib.OfficeNs.XlCategoryLabelLevel
  
  @js.native
  sealed trait xlCategoryLabelLevelCustom
    extends activexDashOfficeLib.OfficeNs.XlCategoryLabelLevel
  
  @js.native
  sealed trait xlCategoryLabelLevelNone
    extends activexDashOfficeLib.OfficeNs.XlCategoryLabelLevel
  
  /* -1 */ val xlCategoryLabelLevelAll: xlCategoryLabelLevelAll with scala.Double = js.native
  /* -2 */ val xlCategoryLabelLevelCustom: xlCategoryLabelLevelCustom with scala.Double = js.native
  /* -3 */ val xlCategoryLabelLevelNone: xlCategoryLabelLevelNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlCategoryLabelLevel with scala.Double] = js.native
}

