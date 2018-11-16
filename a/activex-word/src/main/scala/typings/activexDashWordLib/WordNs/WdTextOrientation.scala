package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTextOrientation extends js.Object

@JSGlobal("Word.WdTextOrientation")
@js.native
object WdTextOrientation extends js.Object {
  @js.native
  sealed trait wdTextOrientationDownward
    extends activexDashWordLib.WordNs.WdTextOrientation
  
  @js.native
  sealed trait wdTextOrientationHorizontal
    extends activexDashWordLib.WordNs.WdTextOrientation
  
  @js.native
  sealed trait wdTextOrientationHorizontalRotatedFarEast
    extends activexDashWordLib.WordNs.WdTextOrientation
  
  @js.native
  sealed trait wdTextOrientationUpward
    extends activexDashWordLib.WordNs.WdTextOrientation
  
  @js.native
  sealed trait wdTextOrientationVertical
    extends activexDashWordLib.WordNs.WdTextOrientation
  
  @js.native
  sealed trait wdTextOrientationVerticalFarEast
    extends activexDashWordLib.WordNs.WdTextOrientation
  
  /* 3 */ val wdTextOrientationDownward: wdTextOrientationDownward with scala.Double = js.native
  /* 0 */ val wdTextOrientationHorizontal: wdTextOrientationHorizontal with scala.Double = js.native
  /* 4 */ val wdTextOrientationHorizontalRotatedFarEast: wdTextOrientationHorizontalRotatedFarEast with scala.Double = js.native
  /* 2 */ val wdTextOrientationUpward: wdTextOrientationUpward with scala.Double = js.native
  /* 5 */ val wdTextOrientationVertical: wdTextOrientationVertical with scala.Double = js.native
  /* 1 */ val wdTextOrientationVerticalFarEast: wdTextOrientationVerticalFarEast with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTextOrientation with scala.Double] = js.native
}

