package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlImportance extends js.Object

@JSGlobal("Outlook.OlImportance")
@js.native
object OlImportance extends js.Object {
  @js.native
  sealed trait olImportanceHigh
    extends activexDashOutlookLib.OutlookNs.OlImportance
  
  @js.native
  sealed trait olImportanceLow
    extends activexDashOutlookLib.OutlookNs.OlImportance
  
  @js.native
  sealed trait olImportanceNormal
    extends activexDashOutlookLib.OutlookNs.OlImportance
  
  /* 2 */ val olImportanceHigh: olImportanceHigh with scala.Double = js.native
  /* 0 */ val olImportanceLow: olImportanceLow with scala.Double = js.native
  /* 1 */ val olImportanceNormal: olImportanceNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlImportance with scala.Double] = js.native
}

