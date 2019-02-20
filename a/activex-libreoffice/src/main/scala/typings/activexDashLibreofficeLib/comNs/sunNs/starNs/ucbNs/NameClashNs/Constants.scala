package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.NameClashNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.ucb.NameClash.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ASK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.NameClashNs.Constants
  
  @js.native
  sealed trait ERROR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.NameClashNs.Constants
  
  @js.native
  sealed trait KEEP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.NameClashNs.Constants
  
  @js.native
  sealed trait OVERWRITE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.NameClashNs.Constants
  
  @js.native
  sealed trait RENAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.NameClashNs.Constants
  
  /* 4 */ val ASK: ASK with scala.Double = js.native
  /* 0 */ val ERROR: ERROR with scala.Double = js.native
  /* 3 */ val KEEP: KEEP with scala.Double = js.native
  /* 1 */ val OVERWRITE: OVERWRITE with scala.Double = js.native
  /* 2 */ val RENAME: RENAME with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.NameClashNs.Constants with scala.Double
  ] = js.native
}

