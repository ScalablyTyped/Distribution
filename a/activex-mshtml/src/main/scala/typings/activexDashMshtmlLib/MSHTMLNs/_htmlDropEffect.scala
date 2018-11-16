package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlDropEffect extends js.Object

@JSGlobal("MSHTML._htmlDropEffect")
@js.native
object _htmlDropEffect extends js.Object {
  @js.native
  sealed trait htmlDropEffectCopy
    extends activexDashMshtmlLib.MSHTMLNs._htmlDropEffect
  
  @js.native
  sealed trait htmlDropEffectLink
    extends activexDashMshtmlLib.MSHTMLNs._htmlDropEffect
  
  @js.native
  sealed trait htmlDropEffectMove
    extends activexDashMshtmlLib.MSHTMLNs._htmlDropEffect
  
  @js.native
  sealed trait htmlDropEffectNone
    extends activexDashMshtmlLib.MSHTMLNs._htmlDropEffect
  
  @js.native
  sealed trait htmlDropEffect_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlDropEffect
  
  /* 0 */ val htmlDropEffectCopy: htmlDropEffectCopy with scala.Double = js.native
  /* 1 */ val htmlDropEffectLink: htmlDropEffectLink with scala.Double = js.native
  /* 2 */ val htmlDropEffectMove: htmlDropEffectMove with scala.Double = js.native
  /* 3 */ val htmlDropEffectNone: htmlDropEffectNone with scala.Double = js.native
  /* 2147483647 */ val htmlDropEffect_Max: htmlDropEffect_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlDropEffect with scala.Double] = js.native
}

