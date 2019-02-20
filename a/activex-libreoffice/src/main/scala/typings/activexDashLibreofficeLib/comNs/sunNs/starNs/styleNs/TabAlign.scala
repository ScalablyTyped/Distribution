package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabAlign extends js.Object

/** These enumeration values are used to specify the alignment of the text range delimited by a tabulator. */
@JSGlobal("com.sun.star.style.TabAlign")
@js.native
object TabAlign extends js.Object {
  /**
    * set the horizontal alignment to the center between the margins from the container object
    *
    * adjusted to the center
    *
    * The text range is centered between the previous tabulator (or the left border, if none) and this tabulator.
    */
  @js.native
  sealed trait CENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.TabAlign
  
  /** The decimal point of the text range to the left of this tabulator is aligned to the position of this tabulator. */
  @js.native
  sealed trait DECIMAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.TabAlign
  
  /** The default alignment for tabulators is applied. */
  @js.native
  sealed trait DEFAULT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.TabAlign
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.TabAlign
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.TabAlign
  
  /* 1 */ val CENTER: CENTER with scala.Double = js.native
  /* 3 */ val DECIMAL: DECIMAL with scala.Double = js.native
  /* 4 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.TabAlign with scala.Double] = js.native
}

