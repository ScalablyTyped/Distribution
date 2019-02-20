package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.LineNumberPositionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.style.LineNumberPosition.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait INSIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.LineNumberPositionNs.Constants
  
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.LineNumberPositionNs.Constants
  
  @js.native
  sealed trait OUTSIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.LineNumberPositionNs.Constants
  
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.LineNumberPositionNs.Constants
  
  /* 2 */ val INSIDE: INSIDE with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 3 */ val OUTSIDE: OUTSIDE with scala.Double = js.native
  /* 1 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.LineNumberPositionNs.Constants with scala.Double
  ] = js.native
}

