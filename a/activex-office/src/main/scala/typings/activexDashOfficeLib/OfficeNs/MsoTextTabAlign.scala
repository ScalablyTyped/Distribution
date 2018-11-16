package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTextTabAlign extends js.Object

@JSGlobal("Office.MsoTextTabAlign")
@js.native
object MsoTextTabAlign extends js.Object {
  @js.native
  sealed trait msoTabAlignCenter
    extends activexDashOfficeLib.OfficeNs.MsoTextTabAlign
  
  @js.native
  sealed trait msoTabAlignDecimal
    extends activexDashOfficeLib.OfficeNs.MsoTextTabAlign
  
  @js.native
  sealed trait msoTabAlignLeft
    extends activexDashOfficeLib.OfficeNs.MsoTextTabAlign
  
  @js.native
  sealed trait msoTabAlignMixed
    extends activexDashOfficeLib.OfficeNs.MsoTextTabAlign
  
  @js.native
  sealed trait msoTabAlignRight
    extends activexDashOfficeLib.OfficeNs.MsoTextTabAlign
  
  /* 1 */ val msoTabAlignCenter: msoTabAlignCenter with scala.Double = js.native
  /* 3 */ val msoTabAlignDecimal: msoTabAlignDecimal with scala.Double = js.native
  /* 0 */ val msoTabAlignLeft: msoTabAlignLeft with scala.Double = js.native
  /* -2 */ val msoTabAlignMixed: msoTabAlignMixed with scala.Double = js.native
  /* 2 */ val msoTabAlignRight: msoTabAlignRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTextTabAlign with scala.Double] = js.native
}

