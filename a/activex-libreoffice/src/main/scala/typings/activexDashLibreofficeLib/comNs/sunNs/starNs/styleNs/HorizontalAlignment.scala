package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

/** values specify the horizontal alignment of an object within a container object. */
@JSGlobal("com.sun.star.style.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  /**
    * set the horizontal alignment to the center between the margins from the container object
    *
    * adjusted to the center
    *
    * The text range is centered between the previous tabulator (or the left border, if none) and this tabulator.
    */
  @js.native
  sealed trait CENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.HorizontalAlignment
  
  /**
    * set the horizontal alignment to the left margin from the container object
    *
    * The page style is only used for left pages.
    *
    * adjusted to the left border
    *
    * The text range is left-aligned between the previous tabulator (or the left border, if none) and this tabulator.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.HorizontalAlignment
  
  /**
    * set the horizontal alignment to the right margin from the container object
    *
    * The page style is only used for right pages.
    *
    * adjusted to the right border
    *
    * The text range is right-aligned between the previous tabulator (or the left border, if none) and this tabulator.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.HorizontalAlignment
  
  /* 1 */ val CENTER: CENTER with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.HorizontalAlignment with scala.Double
  ] = js.native
}

