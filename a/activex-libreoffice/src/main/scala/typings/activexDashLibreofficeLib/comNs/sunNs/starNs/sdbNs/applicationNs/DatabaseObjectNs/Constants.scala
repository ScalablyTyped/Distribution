package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.DatabaseObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdb.application.DatabaseObject.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait FORM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.DatabaseObjectNs.Constants
  
  @js.native
  sealed trait REPORT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.DatabaseObjectNs.Constants
  
  /* 2 */ val FORM: FORM with scala.Double = js.native
  /* 3 */ val REPORT: REPORT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.DatabaseObjectNs.Constants with scala.Double
  ] = js.native
}

