package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdBrowseTarget extends js.Object

@JSGlobal("Word.WdBrowseTarget")
@js.native
object WdBrowseTarget extends js.Object {
  @js.native
  sealed trait wdBrowseComment
    extends activexDashWordLib.WordNs.WdBrowseTarget
  
  @js.native
  sealed trait wdBrowseEdit
    extends activexDashWordLib.WordNs.WdBrowseTarget
  
  @js.native
  sealed trait wdBrowseEndnote
    extends activexDashWordLib.WordNs.WdBrowseTarget
  
  @js.native
  sealed trait wdBrowseField
    extends activexDashWordLib.WordNs.WdBrowseTarget
  
  @js.native
  sealed trait wdBrowseFind
    extends activexDashWordLib.WordNs.WdBrowseTarget
  
  @js.native
  sealed trait wdBrowseFootnote
    extends activexDashWordLib.WordNs.WdBrowseTarget
  
  @js.native
  sealed trait wdBrowseGoTo
    extends activexDashWordLib.WordNs.WdBrowseTarget
  
  @js.native
  sealed trait wdBrowseGraphic
    extends activexDashWordLib.WordNs.WdBrowseTarget
  
  @js.native
  sealed trait wdBrowseHeading
    extends activexDashWordLib.WordNs.WdBrowseTarget
  
  @js.native
  sealed trait wdBrowsePage
    extends activexDashWordLib.WordNs.WdBrowseTarget
  
  @js.native
  sealed trait wdBrowseSection
    extends activexDashWordLib.WordNs.WdBrowseTarget
  
  @js.native
  sealed trait wdBrowseTable
    extends activexDashWordLib.WordNs.WdBrowseTarget
  
  /* 3 */ val wdBrowseComment: wdBrowseComment with scala.Double = js.native
  /* 10 */ val wdBrowseEdit: wdBrowseEdit with scala.Double = js.native
  /* 5 */ val wdBrowseEndnote: wdBrowseEndnote with scala.Double = js.native
  /* 6 */ val wdBrowseField: wdBrowseField with scala.Double = js.native
  /* 11 */ val wdBrowseFind: wdBrowseFind with scala.Double = js.native
  /* 4 */ val wdBrowseFootnote: wdBrowseFootnote with scala.Double = js.native
  /* 12 */ val wdBrowseGoTo: wdBrowseGoTo with scala.Double = js.native
  /* 8 */ val wdBrowseGraphic: wdBrowseGraphic with scala.Double = js.native
  /* 9 */ val wdBrowseHeading: wdBrowseHeading with scala.Double = js.native
  /* 1 */ val wdBrowsePage: wdBrowsePage with scala.Double = js.native
  /* 2 */ val wdBrowseSection: wdBrowseSection with scala.Double = js.native
  /* 7 */ val wdBrowseTable: wdBrowseTable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdBrowseTarget with scala.Double] = js.native
}

