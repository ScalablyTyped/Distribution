package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableContinuationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdb.application.CopyTableContinuation.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait AskUser
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableContinuationNs.Constants
  
  @js.native
  sealed trait CallNextHandler
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableContinuationNs.Constants
  
  @js.native
  sealed trait Cancel
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableContinuationNs.Constants
  
  @js.native
  sealed trait Proceed
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableContinuationNs.Constants
  
  /* 3 */ val AskUser: AskUser with scala.Double = js.native
  /* 1 */ val CallNextHandler: CallNextHandler with scala.Double = js.native
  /* 2 */ val Cancel: Cancel with scala.Double = js.native
  /* 0 */ val Proceed: Proceed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableContinuationNs.Constants with scala.Double
  ] = js.native
}

