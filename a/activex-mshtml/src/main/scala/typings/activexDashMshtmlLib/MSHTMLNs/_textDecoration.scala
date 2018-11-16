package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _textDecoration extends js.Object

@JSGlobal("MSHTML._textDecoration")
@js.native
object _textDecoration extends js.Object {
  @js.native
  sealed trait textDecorationBlink
    extends activexDashMshtmlLib.MSHTMLNs._textDecoration
  
  @js.native
  sealed trait textDecorationLineThrough
    extends activexDashMshtmlLib.MSHTMLNs._textDecoration
  
  @js.native
  sealed trait textDecorationNone
    extends activexDashMshtmlLib.MSHTMLNs._textDecoration
  
  @js.native
  sealed trait textDecorationOverline
    extends activexDashMshtmlLib.MSHTMLNs._textDecoration
  
  @js.native
  sealed trait textDecorationUnderline
    extends activexDashMshtmlLib.MSHTMLNs._textDecoration
  
  @js.native
  sealed trait textDecoration_Max
    extends activexDashMshtmlLib.MSHTMLNs._textDecoration
  
  /* 4 */ val textDecorationBlink: textDecorationBlink with scala.Double = js.native
  /* 3 */ val textDecorationLineThrough: textDecorationLineThrough with scala.Double = js.native
  /* 0 */ val textDecorationNone: textDecorationNone with scala.Double = js.native
  /* 2 */ val textDecorationOverline: textDecorationOverline with scala.Double = js.native
  /* 1 */ val textDecorationUnderline: textDecorationUnderline with scala.Double = js.native
  /* 2147483647 */ val textDecoration_Max: textDecoration_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._textDecoration with scala.Double] = js.native
}

