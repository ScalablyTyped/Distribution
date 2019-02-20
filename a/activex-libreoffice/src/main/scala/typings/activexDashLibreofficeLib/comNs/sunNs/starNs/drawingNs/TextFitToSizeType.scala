package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextFitToSizeType extends js.Object

/** This enumeration specifies how the text within a shape relates to the size of the shape. */
@JSGlobal("com.sun.star.drawing.TextFitToSizeType")
@js.native
object TextFitToSizeType extends js.Object {
  /** like `PROPORTIONAL` , but the width of each text row is also scaled proportional. */
  @js.native
  sealed trait ALLLINES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextFitToSizeType
  
  /** if the shape is scaled, the font is scaled isotropically to fit the available space. Auto line-breaks will keep working */
  @js.native
  sealed trait AUTOFIT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextFitToSizeType
  
  /**
    * the area is not filled.
    *
    * the line has no special end.
    *
    * the joint between lines will not be connected
    *
    * the line is hidden.
    *
    * Don't animate this text.
    *
    * the text size is only defined by the font properties
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextFitToSizeType
  
  /** if the shape is scaled, the text character size is scaled proportional */
  @js.native
  sealed trait PROPORTIONAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextFitToSizeType
  
  /* 2 */ val ALLLINES: ALLLINES with scala.Double = js.native
  /* 3 */ val AUTOFIT: AUTOFIT with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val PROPORTIONAL: PROPORTIONAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextFitToSizeType with scala.Double
  ] = js.native
}

