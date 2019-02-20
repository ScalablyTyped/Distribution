package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.UpdateDocModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.document.UpdateDocMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ACCORDING_TO_CONFIG
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.UpdateDocModeNs.Constants
  
  @js.native
  sealed trait FULL_UPDATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.UpdateDocModeNs.Constants
  
  @js.native
  sealed trait NO_UPDATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.UpdateDocModeNs.Constants
  
  @js.native
  sealed trait QUIET_UPDATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.UpdateDocModeNs.Constants
  
  /* 2 */ val ACCORDING_TO_CONFIG: ACCORDING_TO_CONFIG with scala.Double = js.native
  /* 3 */ val FULL_UPDATE: FULL_UPDATE with scala.Double = js.native
  /* 0 */ val NO_UPDATE: NO_UPDATE with scala.Double = js.native
  /* 1 */ val QUIET_UPDATE: QUIET_UPDATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.UpdateDocModeNs.Constants with scala.Double
  ] = js.native
}

