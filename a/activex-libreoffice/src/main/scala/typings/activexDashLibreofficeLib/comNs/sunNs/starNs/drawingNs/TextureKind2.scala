package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureKind2 extends js.Object

/** These enumeration values specify how the texture is applied. */
@JSGlobal("com.sun.star.drawing.TextureKind2")
@js.native
object TextureKind2 extends js.Object {
  /**
    * With this mode the lighting is ignored and only the texture color information is used.
    *
    * With this mode, the lighting is ignored and only the texture color information is used.
    */
  @js.native
  sealed trait COLOR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextureKind2
  
  /** With TextureKind INTENSITY, each texture pixel is used as an intensity value. */
  @js.native
  sealed trait INTENSITY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextureKind2
  
  /** With TextureKind LUMINANCE, the texture and the lighting information are mixed to produce the image, so a lit, textured object is achieved. */
  @js.native
  sealed trait LUMINANCE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextureKind2
  
  /* 2 */ val COLOR: COLOR with scala.Double = js.native
  /* 1 */ val INTENSITY: INTENSITY with scala.Double = js.native
  /* 0 */ val LUMINANCE: LUMINANCE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextureKind2 with scala.Double
  ] = js.native
}

