package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleFontStyle extends js.Object

@JSGlobal("MSHTML._styleFontStyle")
@js.native
object _styleFontStyle extends js.Object {
  @js.native
  sealed trait styleFontStyleItalic
    extends activexDashMshtmlLib.MSHTMLNs._styleFontStyle
  
  @js.native
  sealed trait styleFontStyleNormal
    extends activexDashMshtmlLib.MSHTMLNs._styleFontStyle
  
  @js.native
  sealed trait styleFontStyleNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleFontStyle
  
  @js.native
  sealed trait styleFontStyleOblique
    extends activexDashMshtmlLib.MSHTMLNs._styleFontStyle
  
  @js.native
  sealed trait styleFontStyle_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleFontStyle
  
  /* 1 */ val styleFontStyleItalic: styleFontStyleItalic with scala.Double = js.native
  /* 3 */ val styleFontStyleNormal: styleFontStyleNormal with scala.Double = js.native
  /* 0 */ val styleFontStyleNotSet: styleFontStyleNotSet with scala.Double = js.native
  /* 2 */ val styleFontStyleOblique: styleFontStyleOblique with scala.Double = js.native
  /* 2147483647 */ val styleFontStyle_Max: styleFontStyle_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleFontStyle with scala.Double] = js.native
}

