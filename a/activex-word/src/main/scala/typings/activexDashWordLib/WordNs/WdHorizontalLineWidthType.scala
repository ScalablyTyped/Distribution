package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdHorizontalLineWidthType extends js.Object

@JSGlobal("Word.WdHorizontalLineWidthType")
@js.native
object WdHorizontalLineWidthType extends js.Object {
  @js.native
  sealed trait wdHorizontalLineFixedWidth
    extends activexDashWordLib.WordNs.WdHorizontalLineWidthType
  
  @js.native
  sealed trait wdHorizontalLinePercentWidth
    extends activexDashWordLib.WordNs.WdHorizontalLineWidthType
  
  /* -2 */ val wdHorizontalLineFixedWidth: wdHorizontalLineFixedWidth with scala.Double = js.native
  /* -1 */ val wdHorizontalLinePercentWidth: wdHorizontalLinePercentWidth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdHorizontalLineWidthType with scala.Double] = js.native
}

