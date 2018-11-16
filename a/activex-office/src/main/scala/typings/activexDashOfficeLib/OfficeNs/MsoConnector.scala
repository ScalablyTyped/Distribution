package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoConnector extends js.Object

@JSGlobal("Office.MsoConnector")
@js.native
object MsoConnector extends js.Object {
  @js.native
  sealed trait msoConnectorAnd
    extends activexDashOfficeLib.OfficeNs.MsoConnector
  
  @js.native
  sealed trait msoConnectorOr
    extends activexDashOfficeLib.OfficeNs.MsoConnector
  
  /* 1 */ val msoConnectorAnd: msoConnectorAnd with scala.Double = js.native
  /* 2 */ val msoConnectorOr: msoConnectorOr with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoConnector with scala.Double] = js.native
}

