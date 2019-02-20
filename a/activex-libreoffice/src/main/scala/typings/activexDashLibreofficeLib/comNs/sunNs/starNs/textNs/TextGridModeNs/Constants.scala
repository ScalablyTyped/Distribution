package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextGridModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.text.TextGridMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait LINES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextGridModeNs.Constants
  
  @js.native
  sealed trait LINES_AND_CHARS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextGridModeNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextGridModeNs.Constants
  
  /* 1 */ val LINES: LINES with scala.Double = js.native
  /* 2 */ val LINES_AND_CHARS: LINES_AND_CHARS with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextGridModeNs.Constants with scala.Double
  ] = js.native
}

