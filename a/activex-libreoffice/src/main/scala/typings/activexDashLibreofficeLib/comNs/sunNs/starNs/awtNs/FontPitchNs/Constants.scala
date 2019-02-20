package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontPitchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.awt.FontPitch.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DONTKNOW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontPitchNs.Constants
  
  @js.native
  sealed trait FIXED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontPitchNs.Constants
  
  @js.native
  sealed trait VARIABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontPitchNs.Constants
  
  /* 0 */ val DONTKNOW: DONTKNOW with scala.Double = js.native
  /* 1 */ val FIXED: FIXED with scala.Double = js.native
  /* 2 */ val VARIABLE: VARIABLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontPitchNs.Constants with scala.Double
  ] = js.native
}

