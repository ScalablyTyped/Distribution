package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormatKeywords extends js.Object

@JSGlobal("Outlook.OlFormatKeywords")
@js.native
object OlFormatKeywords extends js.Object {
  @js.native
  sealed trait olFormatKeywordsText
    extends activexDashOutlookLib.OutlookNs.OlFormatKeywords
  
  /* 1 */ val olFormatKeywordsText: olFormatKeywordsText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormatKeywords with scala.Double] = js.native
}

