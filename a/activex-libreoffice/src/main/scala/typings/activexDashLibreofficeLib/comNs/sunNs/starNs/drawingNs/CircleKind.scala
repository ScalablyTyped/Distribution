package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CircleKind extends js.Object

/** This enumeration defines a circle. */
@JSGlobal("com.sun.star.drawing.CircleKind")
@js.native
object CircleKind extends js.Object {
  /** a circle with an open cut */
  @js.native
  sealed trait ARC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CircleKind
  
  /** a circle with a cut connected by two lines */
  @js.native
  sealed trait CUT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CircleKind
  
  /** a full circle */
  @js.native
  sealed trait FULL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CircleKind
  
  /** a circle with a cut connected by a line */
  @js.native
  sealed trait SECTION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CircleKind
  
  /* 3 */ val ARC: ARC with scala.Double = js.native
  /* 2 */ val CUT: CUT with scala.Double = js.native
  /* 0 */ val FULL: FULL with scala.Double = js.native
  /* 1 */ val SECTION: SECTION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CircleKind with scala.Double
  ] = js.native
}

