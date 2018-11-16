package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoParagraphAlignment extends js.Object

@JSGlobal("Office.MsoParagraphAlignment")
@js.native
object MsoParagraphAlignment extends js.Object {
  @js.native
  sealed trait msoAlignCenter
    extends activexDashOfficeLib.OfficeNs.MsoParagraphAlignment
  
  @js.native
  sealed trait msoAlignDistribute
    extends activexDashOfficeLib.OfficeNs.MsoParagraphAlignment
  
  @js.native
  sealed trait msoAlignJustify
    extends activexDashOfficeLib.OfficeNs.MsoParagraphAlignment
  
  @js.native
  sealed trait msoAlignJustifyLow
    extends activexDashOfficeLib.OfficeNs.MsoParagraphAlignment
  
  @js.native
  sealed trait msoAlignLeft
    extends activexDashOfficeLib.OfficeNs.MsoParagraphAlignment
  
  @js.native
  sealed trait msoAlignMixed
    extends activexDashOfficeLib.OfficeNs.MsoParagraphAlignment
  
  @js.native
  sealed trait msoAlignRight
    extends activexDashOfficeLib.OfficeNs.MsoParagraphAlignment
  
  @js.native
  sealed trait msoAlignThaiDistribute
    extends activexDashOfficeLib.OfficeNs.MsoParagraphAlignment
  
  /* 2 */ val msoAlignCenter: msoAlignCenter with scala.Double = js.native
  /* 5 */ val msoAlignDistribute: msoAlignDistribute with scala.Double = js.native
  /* 4 */ val msoAlignJustify: msoAlignJustify with scala.Double = js.native
  /* 7 */ val msoAlignJustifyLow: msoAlignJustifyLow with scala.Double = js.native
  /* 1 */ val msoAlignLeft: msoAlignLeft with scala.Double = js.native
  /* -2 */ val msoAlignMixed: msoAlignMixed with scala.Double = js.native
  /* 3 */ val msoAlignRight: msoAlignRight with scala.Double = js.native
  /* 6 */ val msoAlignThaiDistribute: msoAlignThaiDistribute with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoParagraphAlignment with scala.Double] = js.native
}

