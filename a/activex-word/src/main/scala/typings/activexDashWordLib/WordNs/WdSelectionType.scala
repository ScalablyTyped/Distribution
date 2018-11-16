package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSelectionType extends js.Object

@JSGlobal("Word.WdSelectionType")
@js.native
object WdSelectionType extends js.Object {
  @js.native
  sealed trait wdNoSelection
    extends activexDashWordLib.WordNs.WdSelectionType
  
  @js.native
  sealed trait wdSelectionBlock
    extends activexDashWordLib.WordNs.WdSelectionType
  
  @js.native
  sealed trait wdSelectionColumn
    extends activexDashWordLib.WordNs.WdSelectionType
  
  @js.native
  sealed trait wdSelectionFrame
    extends activexDashWordLib.WordNs.WdSelectionType
  
  @js.native
  sealed trait wdSelectionIP
    extends activexDashWordLib.WordNs.WdSelectionType
  
  @js.native
  sealed trait wdSelectionInlineShape
    extends activexDashWordLib.WordNs.WdSelectionType
  
  @js.native
  sealed trait wdSelectionNormal
    extends activexDashWordLib.WordNs.WdSelectionType
  
  @js.native
  sealed trait wdSelectionRow
    extends activexDashWordLib.WordNs.WdSelectionType
  
  @js.native
  sealed trait wdSelectionShape
    extends activexDashWordLib.WordNs.WdSelectionType
  
  /* 0 */ val wdNoSelection: wdNoSelection with scala.Double = js.native
  /* 6 */ val wdSelectionBlock: wdSelectionBlock with scala.Double = js.native
  /* 4 */ val wdSelectionColumn: wdSelectionColumn with scala.Double = js.native
  /* 3 */ val wdSelectionFrame: wdSelectionFrame with scala.Double = js.native
  /* 1 */ val wdSelectionIP: wdSelectionIP with scala.Double = js.native
  /* 7 */ val wdSelectionInlineShape: wdSelectionInlineShape with scala.Double = js.native
  /* 2 */ val wdSelectionNormal: wdSelectionNormal with scala.Double = js.native
  /* 5 */ val wdSelectionRow: wdSelectionRow with scala.Double = js.native
  /* 8 */ val wdSelectionShape: wdSelectionShape with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSelectionType with scala.Double] = js.native
}

