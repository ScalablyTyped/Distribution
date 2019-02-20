package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageStyleLayout extends js.Object

/** specifies the pages for which a page layout is valid. */
@JSGlobal("com.sun.star.style.PageStyleLayout")
@js.native
object PageStyleLayout extends js.Object {
  /** The page style is identically used for left and right pages. */
  @js.native
  sealed trait ALL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.PageStyleLayout
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.PageStyleLayout
  
  /** The page style is used unchanged for left pages and mirrored for right pages. */
  @js.native
  sealed trait MIRRORED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.PageStyleLayout
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.PageStyleLayout
  
  /* 0 */ val ALL: ALL with scala.Double = js.native
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  /* 3 */ val MIRRORED: MIRRORED with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.PageStyleLayout with scala.Double
  ] = js.native
}

