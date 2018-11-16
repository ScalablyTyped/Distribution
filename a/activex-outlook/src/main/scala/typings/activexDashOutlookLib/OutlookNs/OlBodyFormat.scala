package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlBodyFormat extends js.Object

@JSGlobal("Outlook.OlBodyFormat")
@js.native
object OlBodyFormat extends js.Object {
  @js.native
  sealed trait olFormatHTML
    extends activexDashOutlookLib.OutlookNs.OlBodyFormat
  
  @js.native
  sealed trait olFormatPlain
    extends activexDashOutlookLib.OutlookNs.OlBodyFormat
  
  @js.native
  sealed trait olFormatRichText
    extends activexDashOutlookLib.OutlookNs.OlBodyFormat
  
  @js.native
  sealed trait olFormatUnspecified
    extends activexDashOutlookLib.OutlookNs.OlBodyFormat
  
  /* 2 */ val olFormatHTML: olFormatHTML with scala.Double = js.native
  /* 1 */ val olFormatPlain: olFormatPlain with scala.Double = js.native
  /* 3 */ val olFormatRichText: olFormatRichText with scala.Double = js.native
  /* 0 */ val olFormatUnspecified: olFormatUnspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlBodyFormat with scala.Double] = js.native
}

