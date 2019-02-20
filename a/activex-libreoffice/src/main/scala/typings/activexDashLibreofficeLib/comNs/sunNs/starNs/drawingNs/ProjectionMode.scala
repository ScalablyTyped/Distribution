package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectionMode extends js.Object

/** defines whether the 3D objects are to be drawn in perspective or parallel projection. */
@JSGlobal("com.sun.star.drawing.ProjectionMode")
@js.native
object ProjectionMode extends js.Object {
  /**
    * the 3D objects are drawn in the parallel projection.
    *
    * This value specifies a flat parallel projection in the specified degree of freedom (X or Y).
    */
  @js.native
  sealed trait PARALLEL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ProjectionMode
  
  /** the 3D objects are drawn in the perspective projection. */
  @js.native
  sealed trait PERSPECTIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ProjectionMode
  
  /* 0 */ val PARALLEL: PARALLEL with scala.Double = js.native
  /* 1 */ val PERSPECTIVE: PERSPECTIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ProjectionMode with scala.Double
  ] = js.native
}

