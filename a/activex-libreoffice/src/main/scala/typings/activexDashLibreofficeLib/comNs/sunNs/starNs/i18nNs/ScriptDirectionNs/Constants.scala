package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ScriptDirectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.i18n.ScriptDirection.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait LEFT_TO_RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ScriptDirectionNs.Constants
  
  @js.native
  sealed trait NEUTRAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ScriptDirectionNs.Constants
  
  @js.native
  sealed trait RIGHT_TO_LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ScriptDirectionNs.Constants
  
  /* 1 */ val LEFT_TO_RIGHT: LEFT_TO_RIGHT with scala.Double = js.native
  /* 0 */ val NEUTRAL: NEUTRAL with scala.Double = js.native
  /* 2 */ val RIGHT_TO_LEFT: RIGHT_TO_LEFT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ScriptDirectionNs.Constants with scala.Double
  ] = js.native
}

