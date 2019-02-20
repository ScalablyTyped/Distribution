package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.KNumberFormatTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.i18n.KNumberFormatType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait LONG
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.KNumberFormatTypeNs.Constants
  
  @js.native
  sealed trait MEDIUM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.KNumberFormatTypeNs.Constants
  
  @js.native
  sealed trait SHORT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.KNumberFormatTypeNs.Constants
  
  /* 3 */ val LONG: LONG with scala.Double = js.native
  /* 2 */ val MEDIUM: MEDIUM with scala.Double = js.native
  /* 1 */ val SHORT: SHORT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.KNumberFormatTypeNs.Constants with scala.Double
  ] = js.native
}

