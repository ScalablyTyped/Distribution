package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlSelectExFlag extends js.Object

@JSGlobal("MSHTML._htmlSelectExFlag")
@js.native
object _htmlSelectExFlag extends js.Object {
  @js.native
  sealed trait htmlSelectExFlagHideSelectionInDesign
    extends activexDashMshtmlLib.MSHTMLNs._htmlSelectExFlag
  
  @js.native
  sealed trait htmlSelectExFlagNone
    extends activexDashMshtmlLib.MSHTMLNs._htmlSelectExFlag
  
  @js.native
  sealed trait htmlSelectExFlag_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlSelectExFlag
  
  /* 1 */ val htmlSelectExFlagHideSelectionInDesign: htmlSelectExFlagHideSelectionInDesign with scala.Double = js.native
  /* 0 */ val htmlSelectExFlagNone: htmlSelectExFlagNone with scala.Double = js.native
  /* 2147483647 */ val htmlSelectExFlag_Max: htmlSelectExFlag_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlSelectExFlag with scala.Double] = js.native
}

