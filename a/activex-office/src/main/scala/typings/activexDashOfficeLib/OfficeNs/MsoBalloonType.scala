package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoBalloonType extends js.Object

@JSGlobal("Office.MsoBalloonType")
@js.native
object MsoBalloonType extends js.Object {
  @js.native
  sealed trait msoBalloonTypeBullets
    extends activexDashOfficeLib.OfficeNs.MsoBalloonType
  
  @js.native
  sealed trait msoBalloonTypeButtons
    extends activexDashOfficeLib.OfficeNs.MsoBalloonType
  
  @js.native
  sealed trait msoBalloonTypeNumbers
    extends activexDashOfficeLib.OfficeNs.MsoBalloonType
  
  /* 1 */ val msoBalloonTypeBullets: msoBalloonTypeBullets with scala.Double = js.native
  /* 0 */ val msoBalloonTypeButtons: msoBalloonTypeButtons with scala.Double = js.native
  /* 2 */ val msoBalloonTypeNumbers: msoBalloonTypeNumbers with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoBalloonType with scala.Double] = js.native
}

