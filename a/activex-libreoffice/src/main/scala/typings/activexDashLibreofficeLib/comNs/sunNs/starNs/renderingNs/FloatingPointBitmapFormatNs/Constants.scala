package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.FloatingPointBitmapFormatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.rendering.FloatingPointBitmapFormat.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DOUBLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.FloatingPointBitmapFormatNs.Constants
  
  @js.native
  sealed trait FLOAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.FloatingPointBitmapFormatNs.Constants
  
  @js.native
  sealed trait HALFFLOAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.FloatingPointBitmapFormatNs.Constants
  
  /* 2 */ val DOUBLE: DOUBLE with scala.Double = js.native
  /* 1 */ val FLOAT: FLOAT with scala.Double = js.native
  /* 0 */ val HALFFLOAT: HALFFLOAT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.FloatingPointBitmapFormatNs.Constants with scala.Double
  ] = js.native
}

