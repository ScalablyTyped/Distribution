package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdExportCreateBookmarks extends js.Object

@JSGlobal("Word.WdExportCreateBookmarks")
@js.native
object WdExportCreateBookmarks extends js.Object {
  @js.native
  sealed trait wdExportCreateHeadingBookmarks
    extends activexDashWordLib.WordNs.WdExportCreateBookmarks
  
  @js.native
  sealed trait wdExportCreateNoBookmarks
    extends activexDashWordLib.WordNs.WdExportCreateBookmarks
  
  @js.native
  sealed trait wdExportCreateWordBookmarks
    extends activexDashWordLib.WordNs.WdExportCreateBookmarks
  
  /* 1 */ val wdExportCreateHeadingBookmarks: wdExportCreateHeadingBookmarks with scala.Double = js.native
  /* 0 */ val wdExportCreateNoBookmarks: wdExportCreateNoBookmarks with scala.Double = js.native
  /* 2 */ val wdExportCreateWordBookmarks: wdExportCreateWordBookmarks with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdExportCreateBookmarks with scala.Double] = js.native
}

