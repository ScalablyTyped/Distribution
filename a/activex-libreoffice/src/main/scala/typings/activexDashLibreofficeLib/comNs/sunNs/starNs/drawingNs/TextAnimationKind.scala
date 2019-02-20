package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAnimationKind extends js.Object

/** This enumeration specifies the type of animation for a text. */
@JSGlobal("com.sun.star.drawing.TextAnimationKind")
@js.native
object TextAnimationKind extends js.Object {
  /** Scroll the text from one side to the other and back. */
  @js.native
  sealed trait ALTERNATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAnimationKind
  
  /** Let this text switch its state from visible to invisible continuously. */
  @js.native
  sealed trait BLINK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAnimationKind
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAnimationKind
  
  /** Let this text scroll. */
  @js.native
  sealed trait SCROLL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAnimationKind
  
  /** Scroll the text from one side to the final position and stop there. */
  @js.native
  sealed trait SLIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAnimationKind
  
  /* 3 */ val ALTERNATE: ALTERNATE with scala.Double = js.native
  /* 1 */ val BLINK: BLINK with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val SCROLL: SCROLL with scala.Double = js.native
  /* 4 */ val SLIDE: SLIDE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAnimationKind with scala.Double
  ] = js.native
}

