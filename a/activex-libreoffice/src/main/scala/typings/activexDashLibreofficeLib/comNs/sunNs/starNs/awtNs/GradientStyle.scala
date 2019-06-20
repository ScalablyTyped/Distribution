package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specify the style of color dispersion. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
*/
trait GradientStyle extends js.Object

object GradientStyle {
  /** specifies an axial gradient. */
  @scala.inline
  def AXIAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** specifies an elliptical gradient. */
  @scala.inline
  def ELLIPTICAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** specifies a linear gradient. */
  @scala.inline
  def LINEAR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** specifies a radial gradient. */
  @scala.inline
  def RADIAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** specifies a gradient in the shape of a rectangle. */
  @scala.inline
  def RECT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** specifies a gradient in the shape of a square. */
  @scala.inline
  def SQUARE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

