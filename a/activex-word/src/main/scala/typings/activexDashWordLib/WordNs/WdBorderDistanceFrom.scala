package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdBorderDistanceFrom extends js.Object

@JSGlobal("Word.WdBorderDistanceFrom")
@js.native
object WdBorderDistanceFrom extends js.Object {
  @js.native
  sealed trait wdBorderDistanceFromPageEdge
    extends activexDashWordLib.WordNs.WdBorderDistanceFrom
  
  @js.native
  sealed trait wdBorderDistanceFromText
    extends activexDashWordLib.WordNs.WdBorderDistanceFrom
  
  /* 1 */ val wdBorderDistanceFromPageEdge: wdBorderDistanceFromPageEdge with scala.Double = js.native
  /* 0 */ val wdBorderDistanceFromText: wdBorderDistanceFromText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdBorderDistanceFrom with scala.Double] = js.native
}

