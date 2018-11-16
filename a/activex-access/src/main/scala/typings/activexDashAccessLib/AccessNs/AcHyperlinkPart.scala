package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcHyperlinkPart extends js.Object

@JSGlobal("Access.AcHyperlinkPart")
@js.native
object AcHyperlinkPart extends js.Object {
  @js.native
  sealed trait acAddress
    extends activexDashAccessLib.AccessNs.AcHyperlinkPart
  
  @js.native
  sealed trait acDisplayText
    extends activexDashAccessLib.AccessNs.AcHyperlinkPart
  
  @js.native
  sealed trait acDisplayedValue
    extends activexDashAccessLib.AccessNs.AcHyperlinkPart
  
  @js.native
  sealed trait acFullAddress
    extends activexDashAccessLib.AccessNs.AcHyperlinkPart
  
  @js.native
  sealed trait acScreenTip
    extends activexDashAccessLib.AccessNs.AcHyperlinkPart
  
  @js.native
  sealed trait acSubAddress
    extends activexDashAccessLib.AccessNs.AcHyperlinkPart
  
  /* 2 */ val acAddress: acAddress with scala.Double = js.native
  /* 1 */ val acDisplayText: acDisplayText with scala.Double = js.native
  /* 0 */ val acDisplayedValue: acDisplayedValue with scala.Double = js.native
  /* 5 */ val acFullAddress: acFullAddress with scala.Double = js.native
  /* 4 */ val acScreenTip: acScreenTip with scala.Double = js.native
  /* 3 */ val acSubAddress: acSubAddress with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcHyperlinkPart with scala.Double] = js.native
}

