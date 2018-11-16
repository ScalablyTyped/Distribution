package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlHAlign extends js.Object

@JSGlobal("Word.XlHAlign")
@js.native
object XlHAlign extends js.Object {
  @js.native
  sealed trait xlHAlignCenter
    extends activexDashWordLib.WordNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignCenterAcrossSelection
    extends activexDashWordLib.WordNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignDistributed
    extends activexDashWordLib.WordNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignFill
    extends activexDashWordLib.WordNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignGeneral
    extends activexDashWordLib.WordNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignJustify
    extends activexDashWordLib.WordNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignLeft
    extends activexDashWordLib.WordNs.XlHAlign
  
  @js.native
  sealed trait xlHAlignRight
    extends activexDashWordLib.WordNs.XlHAlign
  
  /* -4108 */ val xlHAlignCenter: xlHAlignCenter with scala.Double = js.native
  /* 7 */ val xlHAlignCenterAcrossSelection: xlHAlignCenterAcrossSelection with scala.Double = js.native
  /* -4117 */ val xlHAlignDistributed: xlHAlignDistributed with scala.Double = js.native
  /* 5 */ val xlHAlignFill: xlHAlignFill with scala.Double = js.native
  /* 1 */ val xlHAlignGeneral: xlHAlignGeneral with scala.Double = js.native
  /* -4130 */ val xlHAlignJustify: xlHAlignJustify with scala.Double = js.native
  /* -4131 */ val xlHAlignLeft: xlHAlignLeft with scala.Double = js.native
  /* -4152 */ val xlHAlignRight: xlHAlignRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlHAlign with scala.Double] = js.native
}

