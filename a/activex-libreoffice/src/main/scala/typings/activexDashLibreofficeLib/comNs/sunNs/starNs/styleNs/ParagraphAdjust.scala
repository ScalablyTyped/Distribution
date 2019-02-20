package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphAdjust extends js.Object

/** These enumeration values describe the formatting of a text paragraph. */
@JSGlobal("com.sun.star.style.ParagraphAdjust")
@js.native
object ParagraphAdjust extends js.Object {
  /** adjusted to both borders / stretched, except for last line */
  @js.native
  sealed trait BLOCK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphAdjust
  
  /**
    * set the horizontal alignment to the center between the margins from the container object
    *
    * adjusted to the center
    *
    * The text range is centered between the previous tabulator (or the left border, if none) and this tabulator.
    */
  @js.native
  sealed trait CENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphAdjust
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphAdjust
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphAdjust
  
  /** adjusted to both borders / stretched, including last line */
  @js.native
  sealed trait STRETCH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphAdjust
  
  /* 2 */ val BLOCK: BLOCK with scala.Double = js.native
  /* 3 */ val CENTER: CENTER with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 1 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 4 */ val STRETCH: STRETCH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphAdjust with scala.Double
  ] = js.native
}

