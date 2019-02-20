package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ItemTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.ui.ItemType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ItemTypeNs.Constants
  
  @js.native
  sealed trait SEPARATOR_LINE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ItemTypeNs.Constants
  
  @js.native
  sealed trait SEPARATOR_LINEBREAK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ItemTypeNs.Constants
  
  @js.native
  sealed trait SEPARATOR_SPACE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ItemTypeNs.Constants
  
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 1 */ val SEPARATOR_LINE: SEPARATOR_LINE with scala.Double = js.native
  /* 3 */ val SEPARATOR_LINEBREAK: SEPARATOR_LINEBREAK with scala.Double = js.native
  /* 2 */ val SEPARATOR_SPACE: SEPARATOR_SPACE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ItemTypeNs.Constants with scala.Double
  ] = js.native
}

