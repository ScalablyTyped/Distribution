package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdViewType extends js.Object

@JSGlobal("Word.WdViewType")
@js.native
object WdViewType extends js.Object {
  @js.native
  sealed trait wdConflictView
    extends activexDashWordLib.WordNs.WdViewType
  
  @js.native
  sealed trait wdMasterView
    extends activexDashWordLib.WordNs.WdViewType
  
  @js.native
  sealed trait wdNormalView
    extends activexDashWordLib.WordNs.WdViewType
  
  @js.native
  sealed trait wdOutlineView
    extends activexDashWordLib.WordNs.WdViewType
  
  @js.native
  sealed trait wdPrintPreview
    extends activexDashWordLib.WordNs.WdViewType
  
  @js.native
  sealed trait wdPrintView
    extends activexDashWordLib.WordNs.WdViewType
  
  @js.native
  sealed trait wdReadingView
    extends activexDashWordLib.WordNs.WdViewType
  
  @js.native
  sealed trait wdWebView
    extends activexDashWordLib.WordNs.WdViewType
  
  /* 8 */ val wdConflictView: wdConflictView with scala.Double = js.native
  /* 5 */ val wdMasterView: wdMasterView with scala.Double = js.native
  /* 1 */ val wdNormalView: wdNormalView with scala.Double = js.native
  /* 2 */ val wdOutlineView: wdOutlineView with scala.Double = js.native
  /* 4 */ val wdPrintPreview: wdPrintPreview with scala.Double = js.native
  /* 3 */ val wdPrintView: wdPrintView with scala.Double = js.native
  /* 7 */ val wdReadingView: wdReadingView with scala.Double = js.native
  /* 6 */ val wdWebView: wdWebView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdViewType with scala.Double] = js.native
}

