package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCaptionPosition extends js.Object

@JSGlobal("Word.WdCaptionPosition")
@js.native
object WdCaptionPosition extends js.Object {
  @js.native
  sealed trait wdCaptionPositionAbove
    extends activexDashWordLib.WordNs.WdCaptionPosition
  
  @js.native
  sealed trait wdCaptionPositionBelow
    extends activexDashWordLib.WordNs.WdCaptionPosition
  
  /* 0 */ val wdCaptionPositionAbove: wdCaptionPositionAbove with scala.Double = js.native
  /* 1 */ val wdCaptionPositionBelow: wdCaptionPositionBelow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCaptionPosition with scala.Double] = js.native
}

