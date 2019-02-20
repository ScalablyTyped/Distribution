package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

/** specify the horizontal alignment of an object within a container object. */
@JSGlobal("com.sun.star.style.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  /** set the vertical alignment to the bottom margin from the container object. */
  @js.native
  sealed trait BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment
  
  /** set the vertical alignment to the top margin from the container object. */
  @js.native
  sealed trait MIDDLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment
  
  /** set the vertical alignment to the center between the top and bottom margins from the container object. */
  @js.native
  sealed trait TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment
  
  /* 2 */ val BOTTOM: BOTTOM with scala.Double = js.native
  /* 1 */ val MIDDLE: MIDDLE with scala.Double = js.native
  /* 0 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment with scala.Double
  ] = js.native
}

