package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawViewMode extends js.Object

/**
  * This enumeration specifies the view mode of a view in a presentation document.
  * @deprecated Deprecated
  */
@JSGlobal("com.sun.star.drawing.DrawViewMode")
@js.native
object DrawViewMode extends js.Object {
  /** The view shows the drawing pages. */
  @js.native
  sealed trait DRAW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawViewMode
  
  /** The view shows the handout pages, */
  @js.native
  sealed trait HANDOUT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawViewMode
  
  /** The view shows the notes pages. */
  @js.native
  sealed trait NOTES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawViewMode
  
  /* 0 */ val DRAW: DRAW with scala.Double = js.native
  /* 2 */ val HANDOUT: HANDOUT with scala.Double = js.native
  /* 1 */ val NOTES: NOTES with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawViewMode with scala.Double
  ] = js.native
}

