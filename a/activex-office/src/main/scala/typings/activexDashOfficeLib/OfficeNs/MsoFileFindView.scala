package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFileFindView extends js.Object

@JSGlobal("Office.MsoFileFindView")
@js.native
object MsoFileFindView extends js.Object {
  @js.native
  sealed trait msoViewFileInfo
    extends activexDashOfficeLib.OfficeNs.MsoFileFindView
  
  @js.native
  sealed trait msoViewPreview
    extends activexDashOfficeLib.OfficeNs.MsoFileFindView
  
  @js.native
  sealed trait msoViewSummaryInfo
    extends activexDashOfficeLib.OfficeNs.MsoFileFindView
  
  /* 1 */ val msoViewFileInfo: msoViewFileInfo with scala.Double = js.native
  /* 2 */ val msoViewPreview: msoViewPreview with scala.Double = js.native
  /* 3 */ val msoViewSummaryInfo: msoViewSummaryInfo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFileFindView with scala.Double] = js.native
}

