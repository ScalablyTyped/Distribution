package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The TextureMode defines in which way the texture color data replaces the object color data. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait TextureMode extends js.Object

object TextureMode {
  /** This mixes both data sources in a fixed ratio. */
  @scala.inline
  def BLEND: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** This mixes up colors in a way defined by the texture bitmap. */
  @scala.inline
  def MODULATE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** This is the standard mode. */
  @scala.inline
  def REPLACE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

