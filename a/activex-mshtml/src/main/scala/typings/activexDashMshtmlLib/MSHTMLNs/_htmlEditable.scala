package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlEditable extends js.Object

@JSGlobal("MSHTML._htmlEditable")
@js.native
object _htmlEditable extends js.Object {
  @js.native
  sealed trait htmlEditableFalse
    extends activexDashMshtmlLib.MSHTMLNs._htmlEditable
  
  @js.native
  sealed trait htmlEditableInherit
    extends activexDashMshtmlLib.MSHTMLNs._htmlEditable
  
  @js.native
  sealed trait htmlEditableTrue
    extends activexDashMshtmlLib.MSHTMLNs._htmlEditable
  
  @js.native
  sealed trait htmlEditable_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlEditable
  
  /* 2 */ val htmlEditableFalse: htmlEditableFalse with scala.Double = js.native
  /* 0 */ val htmlEditableInherit: htmlEditableInherit with scala.Double = js.native
  /* 1 */ val htmlEditableTrue: htmlEditableTrue with scala.Double = js.native
  /* 2147483647 */ val htmlEditable_Max: htmlEditable_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlEditable with scala.Double] = js.native
}

