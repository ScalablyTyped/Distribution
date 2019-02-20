package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalLinkTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.ExternalLinkType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalLinkTypeNs.Constants
  
  @js.native
  sealed trait DOCUMENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalLinkTypeNs.Constants
  
  @js.native
  sealed trait SELF
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalLinkTypeNs.Constants
  
  @js.native
  sealed trait SPECIAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalLinkTypeNs.Constants
  
  @js.native
  sealed trait UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalLinkTypeNs.Constants
  
  /* 2 */ val DDE: DDE with scala.Double = js.native
  /* 1 */ val DOCUMENT: DOCUMENT with scala.Double = js.native
  /* 3 */ val SELF: SELF with scala.Double = js.native
  /* 4 */ val SPECIAL: SPECIAL with scala.Double = js.native
  /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalLinkTypeNs.Constants with scala.Double
  ] = js.native
}

