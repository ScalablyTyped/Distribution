package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineEndType extends js.Object

/**
  * The LineEndType specifies the appearance of the bullet at the end of a line.
  * @deprecated Deprecated
  */
@JSGlobal("com.sun.star.drawing.LineEndType")
@js.native
object LineEndType extends js.Object {
  /** the line uses an arrow for the line end. */
  @js.native
  sealed trait ARROW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineEndType
  
  /** the line uses a circle for the line end. */
  @js.native
  sealed trait CIRCLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineEndType
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineEndType
  
  /**
    * not implemented, yet.
    *
    * deprecated
    */
  @js.native
  sealed trait SPECIAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineEndType
  
  /**
    * the line will get a half square as additional cap
    *
    * the line uses a square for the line end.
    */
  @js.native
  sealed trait SQUARE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineEndType
  
  /* 1 */ val ARROW: ARROW with scala.Double = js.native
  /* 2 */ val CIRCLE: CIRCLE with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 4 */ val SPECIAL: SPECIAL with scala.Double = js.native
  /* 3 */ val SQUARE: SQUARE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineEndType with scala.Double
  ] = js.native
}

