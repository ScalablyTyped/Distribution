package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.InputSequenceCheckModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.i18n.InputSequenceCheckMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait BASIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.InputSequenceCheckModeNs.Constants
  
  @js.native
  sealed trait PASSTHROUGH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.InputSequenceCheckModeNs.Constants
  
  @js.native
  sealed trait STRICT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.InputSequenceCheckModeNs.Constants
  
  /* 1 */ val BASIC: BASIC with scala.Double = js.native
  /* 0 */ val PASSTHROUGH: PASSTHROUGH with scala.Double = js.native
  /* 2 */ val STRICT: STRICT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.InputSequenceCheckModeNs.Constants with scala.Double
  ] = js.native
}

