package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureMode extends js.Object

/** The TextureMode defines in which way the texture color data replaces the object color data. */
@JSGlobal("com.sun.star.drawing.TextureMode")
@js.native
object TextureMode extends js.Object {
  /** This mixes both data sources in a fixed ratio. */
  @js.native
  sealed trait BLEND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextureMode
  
  /** This mixes up colors in a way defined by the texture bitmap. */
  @js.native
  sealed trait MODULATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextureMode
  
  /** This is the standard mode. */
  @js.native
  sealed trait REPLACE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextureMode
  
  /* 2 */ val BLEND: BLEND with scala.Double = js.native
  /* 1 */ val MODULATE: MODULATE with scala.Double = js.native
  /* 0 */ val REPLACE: REPLACE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextureMode with scala.Double
  ] = js.native
}

