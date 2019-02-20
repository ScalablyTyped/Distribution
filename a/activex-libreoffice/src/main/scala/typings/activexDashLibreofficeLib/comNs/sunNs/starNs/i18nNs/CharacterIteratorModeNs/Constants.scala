package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.CharacterIteratorModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.i18n.CharacterIteratorMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait SKIPCELL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.CharacterIteratorModeNs.Constants
  
  @js.native
  sealed trait SKIPCHARACTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.CharacterIteratorModeNs.Constants
  
  @js.native
  sealed trait SKIPCONTROLCHARACTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.CharacterIteratorModeNs.Constants
  
  /* 1 */ val SKIPCELL: SKIPCELL with scala.Double = js.native
  /* 0 */ val SKIPCHARACTER: SKIPCHARACTER with scala.Double = js.native
  /* 2 */ val SKIPCONTROLCHARACTER: SKIPCONTROLCHARACTER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.CharacterIteratorModeNs.Constants with scala.Double
  ] = js.native
}

