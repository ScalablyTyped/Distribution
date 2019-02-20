package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderType extends js.Object

/** See {@link XPaneBorderPainter} and its addBorder() and removeBorder() methods for an explanation of the border type and its values. */
@JSGlobal("com.sun.star.drawing.framework.BorderType")
@js.native
object BorderType extends js.Object {
  @js.native
  sealed trait INNER_BORDER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.BorderType
  
  @js.native
  sealed trait OUTER_BORDER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.BorderType
  
  @js.native
  sealed trait TOTAL_BORDER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.BorderType
  
  /* 0 */ val INNER_BORDER: INNER_BORDER with scala.Double = js.native
  /* 1 */ val OUTER_BORDER: OUTER_BORDER with scala.Double = js.native
  /* 2 */ val TOTAL_BORDER: TOTAL_BORDER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.BorderType with scala.Double
  ] = js.native
}

