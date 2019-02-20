package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.LinkUpdateModesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.document.LinkUpdateModes.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait AUTO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.LinkUpdateModesNs.Constants
  
  @js.native
  sealed trait GLOBAL_SETTING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.LinkUpdateModesNs.Constants
  
  @js.native
  sealed trait MANUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.LinkUpdateModesNs.Constants
  
  @js.native
  sealed trait NEVER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.LinkUpdateModesNs.Constants
  
  /* 2 */ val AUTO: AUTO with scala.Double = js.native
  /* 3 */ val GLOBAL_SETTING: GLOBAL_SETTING with scala.Double = js.native
  /* 1 */ val MANUAL: MANUAL with scala.Double = js.native
  /* 0 */ val NEVER: NEVER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.LinkUpdateModesNs.Constants with scala.Double
  ] = js.native
}

