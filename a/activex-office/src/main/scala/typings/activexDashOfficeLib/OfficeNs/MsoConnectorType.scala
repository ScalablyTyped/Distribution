package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoConnectorType extends js.Object

@JSGlobal("Office.MsoConnectorType")
@js.native
object MsoConnectorType extends js.Object {
  @js.native
  sealed trait msoConnectorCurve
    extends activexDashOfficeLib.OfficeNs.MsoConnectorType
  
  @js.native
  sealed trait msoConnectorElbow
    extends activexDashOfficeLib.OfficeNs.MsoConnectorType
  
  @js.native
  sealed trait msoConnectorStraight
    extends activexDashOfficeLib.OfficeNs.MsoConnectorType
  
  @js.native
  sealed trait msoConnectorTypeMixed
    extends activexDashOfficeLib.OfficeNs.MsoConnectorType
  
  /* 3 */ val msoConnectorCurve: msoConnectorCurve with scala.Double = js.native
  /* 2 */ val msoConnectorElbow: msoConnectorElbow with scala.Double = js.native
  /* 1 */ val msoConnectorStraight: msoConnectorStraight with scala.Double = js.native
  /* -2 */ val msoConnectorTypeMixed: msoConnectorTypeMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoConnectorType with scala.Double] = js.native
}

