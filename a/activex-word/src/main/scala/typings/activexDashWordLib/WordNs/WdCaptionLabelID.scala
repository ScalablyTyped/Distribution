package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCaptionLabelID extends js.Object

@JSGlobal("Word.WdCaptionLabelID")
@js.native
object WdCaptionLabelID extends js.Object {
  @js.native
  sealed trait wdCaptionEquation
    extends activexDashWordLib.WordNs.WdCaptionLabelID
  
  @js.native
  sealed trait wdCaptionFigure
    extends activexDashWordLib.WordNs.WdCaptionLabelID
  
  @js.native
  sealed trait wdCaptionTable
    extends activexDashWordLib.WordNs.WdCaptionLabelID
  
  /* -3 */ val wdCaptionEquation: wdCaptionEquation with scala.Double = js.native
  /* -1 */ val wdCaptionFigure: wdCaptionFigure with scala.Double = js.native
  /* -2 */ val wdCaptionTable: wdCaptionTable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCaptionLabelID with scala.Double] = js.native
}

