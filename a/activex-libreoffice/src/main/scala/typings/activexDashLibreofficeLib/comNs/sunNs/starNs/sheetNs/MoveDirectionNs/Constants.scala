package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MoveDirectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.MoveDirection.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MoveDirectionNs.Constants
  
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MoveDirectionNs.Constants
  
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MoveDirectionNs.Constants
  
  @js.native
  sealed trait UP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MoveDirectionNs.Constants
  
  /* 0 */ val DOWN: DOWN with scala.Double = js.native
  /* 3 */ val LEFT: LEFT with scala.Double = js.native
  /* 1 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 2 */ val UP: UP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MoveDirectionNs.Constants with scala.Double
  ] = js.native
}

