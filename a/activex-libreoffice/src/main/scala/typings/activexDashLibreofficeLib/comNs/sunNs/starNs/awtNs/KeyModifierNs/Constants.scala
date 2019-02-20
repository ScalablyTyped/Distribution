package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyModifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.awt.KeyModifier.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait MOD1
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyModifierNs.Constants
  
  @js.native
  sealed trait MOD2
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyModifierNs.Constants
  
  @js.native
  sealed trait MOD3
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyModifierNs.Constants
  
  @js.native
  sealed trait SHIFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyModifierNs.Constants
  
  /* 2 */ val MOD1: MOD1 with scala.Double = js.native
  /* 4 */ val MOD2: MOD2 with scala.Double = js.native
  /* 8 */ val MOD3: MOD3 with scala.Double = js.native
  /* 1 */ val SHIFT: SHIFT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyModifierNs.Constants with scala.Double
  ] = js.native
}

