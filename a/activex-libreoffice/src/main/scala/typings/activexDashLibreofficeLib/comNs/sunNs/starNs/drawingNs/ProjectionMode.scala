package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines whether the 3D objects are to be drawn in perspective or parallel projection. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait ProjectionMode extends js.Object

object ProjectionMode {
  /**
    * the 3D objects are drawn in the parallel projection.
    *
    * This value specifies a flat parallel projection in the specified degree of freedom (X or Y).
    */
  @scala.inline
  def PARALLEL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** the 3D objects are drawn in the perspective projection. */
  @scala.inline
  def PERSPECTIVE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

