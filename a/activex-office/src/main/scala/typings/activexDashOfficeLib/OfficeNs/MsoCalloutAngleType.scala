package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoCalloutAngleType extends js.Object

@JSGlobal("Office.MsoCalloutAngleType")
@js.native
object MsoCalloutAngleType extends js.Object {
  @js.native
  sealed trait msoCalloutAngle30
    extends activexDashOfficeLib.OfficeNs.MsoCalloutAngleType
  
  @js.native
  sealed trait msoCalloutAngle45
    extends activexDashOfficeLib.OfficeNs.MsoCalloutAngleType
  
  @js.native
  sealed trait msoCalloutAngle60
    extends activexDashOfficeLib.OfficeNs.MsoCalloutAngleType
  
  @js.native
  sealed trait msoCalloutAngle90
    extends activexDashOfficeLib.OfficeNs.MsoCalloutAngleType
  
  @js.native
  sealed trait msoCalloutAngleAutomatic
    extends activexDashOfficeLib.OfficeNs.MsoCalloutAngleType
  
  @js.native
  sealed trait msoCalloutAngleMixed
    extends activexDashOfficeLib.OfficeNs.MsoCalloutAngleType
  
  /* 2 */ val msoCalloutAngle30: msoCalloutAngle30 with scala.Double = js.native
  /* 3 */ val msoCalloutAngle45: msoCalloutAngle45 with scala.Double = js.native
  /* 4 */ val msoCalloutAngle60: msoCalloutAngle60 with scala.Double = js.native
  /* 5 */ val msoCalloutAngle90: msoCalloutAngle90 with scala.Double = js.native
  /* 1 */ val msoCalloutAngleAutomatic: msoCalloutAngleAutomatic with scala.Double = js.native
  /* -2 */ val msoCalloutAngleMixed: msoCalloutAngleMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoCalloutAngleType with scala.Double] = js.native
}

