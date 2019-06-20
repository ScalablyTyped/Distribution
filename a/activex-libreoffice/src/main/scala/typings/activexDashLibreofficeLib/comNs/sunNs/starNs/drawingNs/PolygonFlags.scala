package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines how a Bezier curve goes through a point. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
*/
trait PolygonFlags extends js.Object

object PolygonFlags {
  /** the point is a control point, to control the curve from the user interface. */
  @scala.inline
  def CONTROL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * the text is drawn along the path without scaling.
    *
    * the point is normal, from the curve discussion view.
    */
  @scala.inline
  def NORMAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /**
    * the point is smooth, the first derivation from the curve discussion view.
    *
    * With SMOOTH shading, the colors of the lit vertices is interpolated.
    */
  @scala.inline
  def SMOOTH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** the point is symmetric, the second derivation from the curve discussion view. */
  @scala.inline
  def SYMMETRIC: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

