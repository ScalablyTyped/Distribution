package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpParagraphAlignment extends js.Object

@JSGlobal("PowerPoint.PpParagraphAlignment")
@js.native
object PpParagraphAlignment extends js.Object {
  @js.native
  sealed trait ppAlignCenter
    extends activexDashPowerpointLib.PowerPointNs.PpParagraphAlignment
  
  @js.native
  sealed trait ppAlignDistribute
    extends activexDashPowerpointLib.PowerPointNs.PpParagraphAlignment
  
  @js.native
  sealed trait ppAlignJustify
    extends activexDashPowerpointLib.PowerPointNs.PpParagraphAlignment
  
  @js.native
  sealed trait ppAlignJustifyLow
    extends activexDashPowerpointLib.PowerPointNs.PpParagraphAlignment
  
  @js.native
  sealed trait ppAlignLeft
    extends activexDashPowerpointLib.PowerPointNs.PpParagraphAlignment
  
  @js.native
  sealed trait ppAlignRight
    extends activexDashPowerpointLib.PowerPointNs.PpParagraphAlignment
  
  @js.native
  sealed trait ppAlignThaiDistribute
    extends activexDashPowerpointLib.PowerPointNs.PpParagraphAlignment
  
  @js.native
  sealed trait ppAlignmentMixed
    extends activexDashPowerpointLib.PowerPointNs.PpParagraphAlignment
  
  /* 2 */ val ppAlignCenter: ppAlignCenter with scala.Double = js.native
  /* 5 */ val ppAlignDistribute: ppAlignDistribute with scala.Double = js.native
  /* 4 */ val ppAlignJustify: ppAlignJustify with scala.Double = js.native
  /* 7 */ val ppAlignJustifyLow: ppAlignJustifyLow with scala.Double = js.native
  /* 1 */ val ppAlignLeft: ppAlignLeft with scala.Double = js.native
  /* 3 */ val ppAlignRight: ppAlignRight with scala.Double = js.native
  /* 6 */ val ppAlignThaiDistribute: ppAlignThaiDistribute with scala.Double = js.native
  /* -2 */ val ppAlignmentMixed: ppAlignmentMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpParagraphAlignment with scala.Double] = js.native
}

