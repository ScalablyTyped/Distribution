package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.UserFieldFormatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.text.UserFieldFormat.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait NUM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.UserFieldFormatNs.Constants
  
  @js.native
  sealed trait SYSTEM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.UserFieldFormatNs.Constants
  
  @js.native
  sealed trait TEXT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.UserFieldFormatNs.Constants
  
  /* 2 */ val NUM: NUM with scala.Double = js.native
  /* 0 */ val SYSTEM: SYSTEM with scala.Double = js.native
  /* 1 */ val TEXT: TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.UserFieldFormatNs.Constants with scala.Double
  ] = js.native
}

