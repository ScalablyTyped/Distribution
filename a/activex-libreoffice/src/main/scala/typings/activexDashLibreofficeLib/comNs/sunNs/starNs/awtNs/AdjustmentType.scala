package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AdjustmentType extends js.Object

/** specifies the adjustment type. */
@JSGlobal("com.sun.star.awt.AdjustmentType")
@js.native
object AdjustmentType extends js.Object {
  /** adjustment is originated by dragging the thumb. */
  @js.native
  sealed trait ADJUST_ABS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AdjustmentType
  
  /**
    * adjustment is originated by a line jump. <p>A line jump can, for example, be caused by a click on
    *
    * one of the pointer buttons.</p>
    */
  @js.native
  sealed trait ADJUST_LINE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AdjustmentType
  
  /**
    * adjustment is originated by a page jump. <p>A page jump can, for example, be caused by a click in the
    *
    * background area of the scrollbar (neither one of the pointer
    *
    * buttons, nor the thumb).</p>
    */
  @js.native
  sealed trait ADJUST_PAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AdjustmentType
  
  /* 2 */ val ADJUST_ABS: ADJUST_ABS with scala.Double = js.native
  /* 0 */ val ADJUST_LINE: ADJUST_LINE with scala.Double = js.native
  /* 1 */ val ADJUST_PAGE: ADJUST_PAGE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AdjustmentType with scala.Double
  ] = js.native
}

