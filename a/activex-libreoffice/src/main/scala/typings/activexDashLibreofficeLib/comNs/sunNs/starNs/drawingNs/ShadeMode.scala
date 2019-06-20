package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ShadeMode determines the quality of displaying the object. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
*/
trait ShadeMode extends js.Object

object ShadeMode {
  /** DRAFT is a special mode which uses a BSP tree and triangle subdivision for displaying. */
  @scala.inline
  def DRAFT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * forces one normal per flat part.
    *
    * With FLAT shading, the faces of the object are rendered in a solid color.
    */
  @scala.inline
  def FLAT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** With PHONG shading, the normal itself is interpolated to get more realistic colors and light reflections. */
  @scala.inline
  def PHONG: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * the point is smooth, the first derivation from the curve discussion view.
    *
    * With SMOOTH shading, the colors of the lit vertices is interpolated.
    */
  @scala.inline
  def SMOOTH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

