package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlGlyphMode extends js.Object

@JSGlobal("MSHTML._htmlGlyphMode")
@js.native
object _htmlGlyphMode extends js.Object {
  @js.native
  sealed trait htmlGlyphModeBegin
    extends activexDashMshtmlLib.MSHTMLNs._htmlGlyphMode
  
  @js.native
  sealed trait htmlGlyphModeBoth
    extends activexDashMshtmlLib.MSHTMLNs._htmlGlyphMode
  
  @js.native
  sealed trait htmlGlyphModeEnd
    extends activexDashMshtmlLib.MSHTMLNs._htmlGlyphMode
  
  @js.native
  sealed trait htmlGlyphModeNone
    extends activexDashMshtmlLib.MSHTMLNs._htmlGlyphMode
  
  @js.native
  sealed trait htmlGlyphMode_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlGlyphMode
  
  /* 1 */ val htmlGlyphModeBegin: htmlGlyphModeBegin with scala.Double = js.native
  /* 3 */ val htmlGlyphModeBoth: htmlGlyphModeBoth with scala.Double = js.native
  /* 2 */ val htmlGlyphModeEnd: htmlGlyphModeEnd with scala.Double = js.native
  /* 0 */ val htmlGlyphModeNone: htmlGlyphModeNone with scala.Double = js.native
  /* 2147483647 */ val htmlGlyphMode_Max: htmlGlyphMode_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlGlyphMode with scala.Double] = js.native
}

