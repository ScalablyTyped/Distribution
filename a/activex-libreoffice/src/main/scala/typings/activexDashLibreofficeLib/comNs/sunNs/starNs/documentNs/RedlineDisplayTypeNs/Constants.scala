package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.RedlineDisplayTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.document.RedlineDisplayType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait INSERTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.RedlineDisplayTypeNs.Constants
  
  @js.native
  sealed trait INSERTED_AND_REMOVED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.RedlineDisplayTypeNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.RedlineDisplayTypeNs.Constants
  
  @js.native
  sealed trait REMOVED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.RedlineDisplayTypeNs.Constants
  
  /* 1 */ val INSERTED: INSERTED with scala.Double = js.native
  /* 2 */ val INSERTED_AND_REMOVED: INSERTED_AND_REMOVED with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 3 */ val REMOVED: REMOVED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.RedlineDisplayTypeNs.Constants with scala.Double
  ] = js.native
}

