package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoZOrderCmd extends js.Object

@JSGlobal("Office.MsoZOrderCmd")
@js.native
object MsoZOrderCmd extends js.Object {
  @js.native
  sealed trait msoBringForward
    extends activexDashOfficeLib.OfficeNs.MsoZOrderCmd
  
  @js.native
  sealed trait msoBringInFrontOfText
    extends activexDashOfficeLib.OfficeNs.MsoZOrderCmd
  
  @js.native
  sealed trait msoBringToFront
    extends activexDashOfficeLib.OfficeNs.MsoZOrderCmd
  
  @js.native
  sealed trait msoSendBackward
    extends activexDashOfficeLib.OfficeNs.MsoZOrderCmd
  
  @js.native
  sealed trait msoSendBehindText
    extends activexDashOfficeLib.OfficeNs.MsoZOrderCmd
  
  @js.native
  sealed trait msoSendToBack
    extends activexDashOfficeLib.OfficeNs.MsoZOrderCmd
  
  /* 2 */ val msoBringForward: msoBringForward with scala.Double = js.native
  /* 4 */ val msoBringInFrontOfText: msoBringInFrontOfText with scala.Double = js.native
  /* 0 */ val msoBringToFront: msoBringToFront with scala.Double = js.native
  /* 3 */ val msoSendBackward: msoSendBackward with scala.Double = js.native
  /* 5 */ val msoSendBehindText: msoSendBehindText with scala.Double = js.native
  /* 1 */ val msoSendToBack: msoSendToBack with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoZOrderCmd with scala.Double] = js.native
}

