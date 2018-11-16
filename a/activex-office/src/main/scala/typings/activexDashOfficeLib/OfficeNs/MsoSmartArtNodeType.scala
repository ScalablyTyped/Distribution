package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSmartArtNodeType extends js.Object

@JSGlobal("Office.MsoSmartArtNodeType")
@js.native
object MsoSmartArtNodeType extends js.Object {
  @js.native
  sealed trait msoSmartArtNodeTypeAssistant
    extends activexDashOfficeLib.OfficeNs.MsoSmartArtNodeType
  
  @js.native
  sealed trait msoSmartArtNodeTypeDefault
    extends activexDashOfficeLib.OfficeNs.MsoSmartArtNodeType
  
  /* 2 */ val msoSmartArtNodeTypeAssistant: msoSmartArtNodeTypeAssistant with scala.Double = js.native
  /* 1 */ val msoSmartArtNodeTypeDefault: msoSmartArtNodeTypeDefault with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSmartArtNodeType with scala.Double] = js.native
}

