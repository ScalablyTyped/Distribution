package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.awt.FontType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DEVICE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontTypeNs.Constants
  
  @js.native
  sealed trait DONTKNOW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontTypeNs.Constants
  
  @js.native
  sealed trait RASTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontTypeNs.Constants
  
  @js.native
  sealed trait SCALABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontTypeNs.Constants
  
  /* 2 */ val DEVICE: DEVICE with scala.Double = js.native
  /* 0 */ val DONTKNOW: DONTKNOW with scala.Double = js.native
  /* 1 */ val RASTER: RASTER with scala.Double = js.native
  /* 4 */ val SCALABLE: SCALABLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontTypeNs.Constants with scala.Double
  ] = js.native
}

