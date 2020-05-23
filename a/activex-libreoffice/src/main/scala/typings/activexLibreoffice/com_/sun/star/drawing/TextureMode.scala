package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The TextureMode defines in which way the texture color data replaces the object color data. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait TextureMode extends js.Object

object TextureMode {
  /** This mixes both data sources in a fixed ratio. */
  @scala.inline
  def BLEND: `2` = 2.asInstanceOf[`2`]
  /** This mixes up colors in a way defined by the texture bitmap. */
  @scala.inline
  def MODULATE: `1` = 1.asInstanceOf[`1`]
  /** This is the standard mode. */
  @scala.inline
  def REPLACE: `0` = 0.asInstanceOf[`0`]
}

