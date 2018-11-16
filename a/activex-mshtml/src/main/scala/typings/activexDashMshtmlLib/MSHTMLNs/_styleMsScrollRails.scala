package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleMsScrollRails extends js.Object

@JSGlobal("MSHTML._styleMsScrollRails")
@js.native
object _styleMsScrollRails extends js.Object {
  @js.native
  sealed trait styleMsScrollRailsNone
    extends activexDashMshtmlLib.MSHTMLNs._styleMsScrollRails
  
  @js.native
  sealed trait styleMsScrollRailsNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleMsScrollRails
  
  @js.native
  sealed trait styleMsScrollRailsRailed
    extends activexDashMshtmlLib.MSHTMLNs._styleMsScrollRails
  
  @js.native
  sealed trait styleMsScrollRails_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleMsScrollRails
  
  /* 1 */ val styleMsScrollRailsNone: styleMsScrollRailsNone with scala.Double = js.native
  /* 0 */ val styleMsScrollRailsNotSet: styleMsScrollRailsNotSet with scala.Double = js.native
  /* 2 */ val styleMsScrollRailsRailed: styleMsScrollRailsRailed with scala.Double = js.native
  /* 2147483647 */ val styleMsScrollRails_Max: styleMsScrollRails_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleMsScrollRails with scala.Double] = js.native
}

