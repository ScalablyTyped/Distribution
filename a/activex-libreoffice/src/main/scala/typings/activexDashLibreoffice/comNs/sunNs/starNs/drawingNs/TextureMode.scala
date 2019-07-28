package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The TextureMode defines in which way the texture color data replaces the object color data. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait TextureMode extends js.Object

object TextureMode {
  /** This mixes both data sources in a fixed ratio. */
  @scala.inline
  def BLEND: `2` = this.cast(2)
  /** This mixes up colors in a way defined by the texture bitmap. */
  @scala.inline
  def MODULATE: `1` = this.cast(1)
  /** This is the standard mode. */
  @scala.inline
  def REPLACE: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

