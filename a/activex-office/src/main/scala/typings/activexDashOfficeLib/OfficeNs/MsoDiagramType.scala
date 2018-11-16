package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoDiagramType extends js.Object

@JSGlobal("Office.MsoDiagramType")
@js.native
object MsoDiagramType extends js.Object {
  @js.native
  sealed trait msoDiagramCycle
    extends activexDashOfficeLib.OfficeNs.MsoDiagramType
  
  @js.native
  sealed trait msoDiagramMixed
    extends activexDashOfficeLib.OfficeNs.MsoDiagramType
  
  @js.native
  sealed trait msoDiagramOrgChart
    extends activexDashOfficeLib.OfficeNs.MsoDiagramType
  
  @js.native
  sealed trait msoDiagramPyramid
    extends activexDashOfficeLib.OfficeNs.MsoDiagramType
  
  @js.native
  sealed trait msoDiagramRadial
    extends activexDashOfficeLib.OfficeNs.MsoDiagramType
  
  @js.native
  sealed trait msoDiagramTarget
    extends activexDashOfficeLib.OfficeNs.MsoDiagramType
  
  @js.native
  sealed trait msoDiagramVenn
    extends activexDashOfficeLib.OfficeNs.MsoDiagramType
  
  /* 2 */ val msoDiagramCycle: msoDiagramCycle with scala.Double = js.native
  /* -2 */ val msoDiagramMixed: msoDiagramMixed with scala.Double = js.native
  /* 1 */ val msoDiagramOrgChart: msoDiagramOrgChart with scala.Double = js.native
  /* 4 */ val msoDiagramPyramid: msoDiagramPyramid with scala.Double = js.native
  /* 3 */ val msoDiagramRadial: msoDiagramRadial with scala.Double = js.native
  /* 6 */ val msoDiagramTarget: msoDiagramTarget with scala.Double = js.native
  /* 5 */ val msoDiagramVenn: msoDiagramVenn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoDiagramType with scala.Double] = js.native
}

