package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlTableContents extends js.Object

@JSGlobal("Outlook.OlTableContents")
@js.native
object OlTableContents extends js.Object {
  @js.native
  sealed trait olHiddenItems
    extends activexDashOutlookLib.OutlookNs.OlTableContents
  
  @js.native
  sealed trait olUserItems
    extends activexDashOutlookLib.OutlookNs.OlTableContents
  
  /* 1 */ val olHiddenItems: olHiddenItems with scala.Double = js.native
  /* 0 */ val olUserItems: olUserItems with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlTableContents with scala.Double] = js.native
}

