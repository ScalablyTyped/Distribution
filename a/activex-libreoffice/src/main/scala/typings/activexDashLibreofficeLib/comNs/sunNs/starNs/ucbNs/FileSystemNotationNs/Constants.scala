package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FileSystemNotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.ucb.FileSystemNotation.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DOS_NOTATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FileSystemNotationNs.Constants
  
  @js.native
  sealed trait MAC_NOTATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FileSystemNotationNs.Constants
  
  @js.native
  sealed trait UNIX_NOTATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FileSystemNotationNs.Constants
  
  @js.native
  sealed trait UNKNOWN_NOTATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FileSystemNotationNs.Constants
  
  /* 2 */ val DOS_NOTATION: DOS_NOTATION with scala.Double = js.native
  /* 3 */ val MAC_NOTATION: MAC_NOTATION with scala.Double = js.native
  /* 1 */ val UNIX_NOTATION: UNIX_NOTATION with scala.Double = js.native
  /* 0 */ val UNKNOWN_NOTATION: UNKNOWN_NOTATION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FileSystemNotationNs.Constants with scala.Double
  ] = js.native
}

