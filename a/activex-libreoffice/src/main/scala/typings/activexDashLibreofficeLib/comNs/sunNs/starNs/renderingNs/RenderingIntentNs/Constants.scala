package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.RenderingIntentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.rendering.RenderingIntent.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ABSOLUTE_COLORIMETRIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.RenderingIntentNs.Constants
  
  @js.native
  sealed trait PERCEPTUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.RenderingIntentNs.Constants
  
  @js.native
  sealed trait RELATIVE_COLORIMETRIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.RenderingIntentNs.Constants
  
  @js.native
  sealed trait SATURATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.RenderingIntentNs.Constants
  
  /* 3 */ val ABSOLUTE_COLORIMETRIC: ABSOLUTE_COLORIMETRIC with scala.Double = js.native
  /* 0 */ val PERCEPTUAL: PERCEPTUAL with scala.Double = js.native
  /* 2 */ val RELATIVE_COLORIMETRIC: RELATIVE_COLORIMETRIC with scala.Double = js.native
  /* 1 */ val SATURATION: SATURATION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.RenderingIntentNs.Constants with scala.Double
  ] = js.native
}

