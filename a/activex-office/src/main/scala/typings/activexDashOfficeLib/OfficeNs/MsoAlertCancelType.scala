package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAlertCancelType extends js.Object

@JSGlobal("Office.MsoAlertCancelType")
@js.native
object MsoAlertCancelType extends js.Object {
  @js.native
  sealed trait msoAlertCancelDefault
    extends activexDashOfficeLib.OfficeNs.MsoAlertCancelType
  
  @js.native
  sealed trait msoAlertCancelFifth
    extends activexDashOfficeLib.OfficeNs.MsoAlertCancelType
  
  @js.native
  sealed trait msoAlertCancelFirst
    extends activexDashOfficeLib.OfficeNs.MsoAlertCancelType
  
  @js.native
  sealed trait msoAlertCancelFourth
    extends activexDashOfficeLib.OfficeNs.MsoAlertCancelType
  
  @js.native
  sealed trait msoAlertCancelSecond
    extends activexDashOfficeLib.OfficeNs.MsoAlertCancelType
  
  @js.native
  sealed trait msoAlertCancelThird
    extends activexDashOfficeLib.OfficeNs.MsoAlertCancelType
  
  /* -1 */ val msoAlertCancelDefault: msoAlertCancelDefault with scala.Double = js.native
  /* 4 */ val msoAlertCancelFifth: msoAlertCancelFifth with scala.Double = js.native
  /* 0 */ val msoAlertCancelFirst: msoAlertCancelFirst with scala.Double = js.native
  /* 3 */ val msoAlertCancelFourth: msoAlertCancelFourth with scala.Double = js.native
  /* 1 */ val msoAlertCancelSecond: msoAlertCancelSecond with scala.Double = js.native
  /* 2 */ val msoAlertCancelThird: msoAlertCancelThird with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoAlertCancelType with scala.Double] = js.native
}

