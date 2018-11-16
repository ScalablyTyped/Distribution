package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormRegionSize extends js.Object

@JSGlobal("Outlook.OlFormRegionSize")
@js.native
object OlFormRegionSize extends js.Object {
  @js.native
  sealed trait olFormRegionTypeAdjoining
    extends activexDashOutlookLib.OutlookNs.OlFormRegionSize
  
  @js.native
  sealed trait olFormRegionTypeSeparate
    extends activexDashOutlookLib.OutlookNs.OlFormRegionSize
  
  /* 1 */ val olFormRegionTypeAdjoining: olFormRegionTypeAdjoining with scala.Double = js.native
  /* 0 */ val olFormRegionTypeSeparate: olFormRegionTypeSeparate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormRegionSize with scala.Double] = js.native
}

