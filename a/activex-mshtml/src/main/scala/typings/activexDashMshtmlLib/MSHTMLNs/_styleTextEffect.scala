package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleTextEffect extends js.Object

@JSGlobal("MSHTML._styleTextEffect")
@js.native
object _styleTextEffect extends js.Object {
  @js.native
  sealed trait styleTextEffectEmboss
    extends activexDashMshtmlLib.MSHTMLNs._styleTextEffect
  
  @js.native
  sealed trait styleTextEffectEngrave
    extends activexDashMshtmlLib.MSHTMLNs._styleTextEffect
  
  @js.native
  sealed trait styleTextEffectNone
    extends activexDashMshtmlLib.MSHTMLNs._styleTextEffect
  
  @js.native
  sealed trait styleTextEffectOutline
    extends activexDashMshtmlLib.MSHTMLNs._styleTextEffect
  
  @js.native
  sealed trait styleTextEffect_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleTextEffect
  
  /* 1 */ val styleTextEffectEmboss: styleTextEffectEmboss with scala.Double = js.native
  /* 2 */ val styleTextEffectEngrave: styleTextEffectEngrave with scala.Double = js.native
  /* 0 */ val styleTextEffectNone: styleTextEffectNone with scala.Double = js.native
  /* 3 */ val styleTextEffectOutline: styleTextEffectOutline with scala.Double = js.native
  /* 2147483647 */ val styleTextEffect_Max: styleTextEffect_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleTextEffect with scala.Double] = js.native
}

