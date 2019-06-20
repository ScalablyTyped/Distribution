package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These enumeration values specify how the texture is applied.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait TextureKind extends js.Object

object TextureKind {
  /**
    * With this mode the lighting is ignored and only the texture color information is used.
    *
    * With this mode, the lighting is ignored and only the texture color information is used.
    */
  @scala.inline
  def COLOR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** With TextureKind LUMINANCE, the texture and the lighting information are mixed to produce the image, so a lit, textured object is achieved. */
  @scala.inline
  def LUMINANCE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

