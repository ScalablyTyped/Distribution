package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcTextFormat extends js.Object

@JSGlobal("Access.AcTextFormat")
@js.native
object AcTextFormat extends js.Object {
  @js.native
  sealed trait acTextFormatHTMLRichText
    extends activexDashAccessLib.AccessNs.AcTextFormat
  
  @js.native
  sealed trait acTextFormatPlain
    extends activexDashAccessLib.AccessNs.AcTextFormat
  
  /* 1 */ val acTextFormatHTMLRichText: acTextFormatHTMLRichText with scala.Double = js.native
  /* 0 */ val acTextFormatPlain: acTextFormatPlain with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcTextFormat with scala.Double] = js.native
}

