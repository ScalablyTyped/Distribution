package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlSelectType extends js.Object

@JSGlobal("MSHTML._htmlSelectType")
@js.native
object _htmlSelectType extends js.Object {
  @js.native
  sealed trait htmlSelectTypeSelectMultiple
    extends activexDashMshtmlLib.MSHTMLNs._htmlSelectType
  
  @js.native
  sealed trait htmlSelectTypeSelectOne
    extends activexDashMshtmlLib.MSHTMLNs._htmlSelectType
  
  @js.native
  sealed trait htmlSelectType_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlSelectType
  
  /* 2 */ val htmlSelectTypeSelectMultiple: htmlSelectTypeSelectMultiple with scala.Double = js.native
  /* 1 */ val htmlSelectTypeSelectOne: htmlSelectTypeSelectOne with scala.Double = js.native
  /* 2147483647 */ val htmlSelectType_Max: htmlSelectType_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlSelectType with scala.Double] = js.native
}

