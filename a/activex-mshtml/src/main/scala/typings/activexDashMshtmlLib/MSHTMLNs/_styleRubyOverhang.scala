package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleRubyOverhang extends js.Object

@JSGlobal("MSHTML._styleRubyOverhang")
@js.native
object _styleRubyOverhang extends js.Object {
  @js.native
  sealed trait styleRubyOverhangAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleRubyOverhang
  
  @js.native
  sealed trait styleRubyOverhangNone
    extends activexDashMshtmlLib.MSHTMLNs._styleRubyOverhang
  
  @js.native
  sealed trait styleRubyOverhangNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleRubyOverhang
  
  @js.native
  sealed trait styleRubyOverhangWhitespace
    extends activexDashMshtmlLib.MSHTMLNs._styleRubyOverhang
  
  @js.native
  sealed trait styleRubyOverhang_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleRubyOverhang
  
  /* 1 */ val styleRubyOverhangAuto: styleRubyOverhangAuto with scala.Double = js.native
  /* 3 */ val styleRubyOverhangNone: styleRubyOverhangNone with scala.Double = js.native
  /* 0 */ val styleRubyOverhangNotSet: styleRubyOverhangNotSet with scala.Double = js.native
  /* 2 */ val styleRubyOverhangWhitespace: styleRubyOverhangWhitespace with scala.Double = js.native
  /* 2147483647 */ val styleRubyOverhang_Max: styleRubyOverhang_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleRubyOverhang with scala.Double] = js.native
}

