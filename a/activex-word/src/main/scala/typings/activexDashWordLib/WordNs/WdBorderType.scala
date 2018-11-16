package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdBorderType extends js.Object

@JSGlobal("Word.WdBorderType")
@js.native
object WdBorderType extends js.Object {
  @js.native
  sealed trait wdBorderBottom
    extends activexDashWordLib.WordNs.WdBorderType
  
  @js.native
  sealed trait wdBorderDiagonalDown
    extends activexDashWordLib.WordNs.WdBorderType
  
  @js.native
  sealed trait wdBorderDiagonalUp
    extends activexDashWordLib.WordNs.WdBorderType
  
  @js.native
  sealed trait wdBorderHorizontal
    extends activexDashWordLib.WordNs.WdBorderType
  
  @js.native
  sealed trait wdBorderLeft
    extends activexDashWordLib.WordNs.WdBorderType
  
  @js.native
  sealed trait wdBorderRight
    extends activexDashWordLib.WordNs.WdBorderType
  
  @js.native
  sealed trait wdBorderTop
    extends activexDashWordLib.WordNs.WdBorderType
  
  @js.native
  sealed trait wdBorderVertical
    extends activexDashWordLib.WordNs.WdBorderType
  
  /* -3 */ val wdBorderBottom: wdBorderBottom with scala.Double = js.native
  /* -7 */ val wdBorderDiagonalDown: wdBorderDiagonalDown with scala.Double = js.native
  /* -8 */ val wdBorderDiagonalUp: wdBorderDiagonalUp with scala.Double = js.native
  /* -5 */ val wdBorderHorizontal: wdBorderHorizontal with scala.Double = js.native
  /* -2 */ val wdBorderLeft: wdBorderLeft with scala.Double = js.native
  /* -4 */ val wdBorderRight: wdBorderRight with scala.Double = js.native
  /* -1 */ val wdBorderTop: wdBorderTop with scala.Double = js.native
  /* -6 */ val wdBorderVertical: wdBorderVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdBorderType with scala.Double] = js.native
}

