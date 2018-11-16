package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoDiagramNodeType extends js.Object

@JSGlobal("Office.MsoDiagramNodeType")
@js.native
object MsoDiagramNodeType extends js.Object {
  @js.native
  sealed trait msoDiagramAssistant
    extends activexDashOfficeLib.OfficeNs.MsoDiagramNodeType
  
  @js.native
  sealed trait msoDiagramNode
    extends activexDashOfficeLib.OfficeNs.MsoDiagramNodeType
  
  /* 2 */ val msoDiagramAssistant: msoDiagramAssistant with scala.Double = js.native
  /* 1 */ val msoDiagramNode: msoDiagramNode with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoDiagramNodeType with scala.Double] = js.native
}

