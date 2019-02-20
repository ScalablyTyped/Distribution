package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAdjust extends js.Object

/** enumeration values define the horizontal adjustments of objects. */
@JSGlobal("com.sun.star.text.HorizontalAdjust")
@js.native
object HorizontalAdjust extends js.Object {
  /**
    * the object is adjusted to the center.
    *
    * centric adjusted.
    */
  @js.native
  sealed trait CENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.HorizontalAdjust
  
  /**
    * the object is left adjusted.
    *
    * adjusted to the left.
    *
    * text flows to the left side of the object.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.HorizontalAdjust
  
  /**
    * the object is right adjusted.
    *
    * adjusted to the right.
    *
    * text flows to the right side of the object.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.HorizontalAdjust
  
  /* 1 */ val CENTER: CENTER with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.HorizontalAdjust with scala.Double
  ] = js.native
}

