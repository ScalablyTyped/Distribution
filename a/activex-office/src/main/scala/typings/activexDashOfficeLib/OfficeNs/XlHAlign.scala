package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlHAlign extends js.Object

@JSGlobal("Office.XlHAlign")
@js.native
object XlHAlign extends js.Object {
  @js.native
  sealed trait xlHAlignCenter
    extends activexDashOfficeLib.OfficeNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignCenterAcrossSelection
    extends activexDashOfficeLib.OfficeNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignDistributed
    extends activexDashOfficeLib.OfficeNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignFill
    extends activexDashOfficeLib.OfficeNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignGeneral
    extends activexDashOfficeLib.OfficeNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignJustify
    extends activexDashOfficeLib.OfficeNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignLeft
    extends activexDashOfficeLib.OfficeNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignRight
    extends activexDashOfficeLib.OfficeNs.XlHAlign
  
  /* -4108 */ val xlHAlignCenter: xlHAlignCenter with scala.Double = js.native
  /* 7 */ val xlHAlignCenterAcrossSelection: xlHAlignCenterAcrossSelection with scala.Double = js.native
  /* -4117 */ val xlHAlignDistributed: xlHAlignDistributed with scala.Double = js.native
  /* 5 */ val xlHAlignFill: xlHAlignFill with scala.Double = js.native
  /* 1 */ val xlHAlignGeneral: xlHAlignGeneral with scala.Double = js.native
  /* -4130 */ val xlHAlignJustify: xlHAlignJustify with scala.Double = js.native
  /* -4131 */ val xlHAlignLeft: xlHAlignLeft with scala.Double = js.native
  /* -4152 */ val xlHAlignRight: xlHAlignRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlHAlign with scala.Double] = js.native
}

