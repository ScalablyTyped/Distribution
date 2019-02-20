package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ImageScaleModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.awt.ImageScaleMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ANISOTROPIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ImageScaleModeNs.Constants
  
  @js.native
  sealed trait ISOTROPIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ImageScaleModeNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ImageScaleModeNs.Constants
  
  /* 2 */ val ANISOTROPIC: ANISOTROPIC with scala.Double = js.native
  /* 1 */ val ISOTROPIC: ISOTROPIC with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ImageScaleModeNs.Constants with scala.Double
  ] = js.native
}

