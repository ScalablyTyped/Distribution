package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.AmPmValueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.i18n.AmPmValue.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait AM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.AmPmValueNs.Constants
  
  @js.native
  sealed trait PM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.AmPmValueNs.Constants
  
  /* 0 */ val AM: AM with scala.Double = js.native
  /* 1 */ val PM: PM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.AmPmValueNs.Constants with scala.Double
  ] = js.native
}

