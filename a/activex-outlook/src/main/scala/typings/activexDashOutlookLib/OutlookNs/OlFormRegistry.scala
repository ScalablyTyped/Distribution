package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormRegistry extends js.Object

@JSGlobal("Outlook.OlFormRegistry")
@js.native
object OlFormRegistry extends js.Object {
  @js.native
  sealed trait olDefaultRegistry
    extends activexDashOutlookLib.OutlookNs.OlFormRegistry
  
  @js.native
  sealed trait olFolderRegistry
    extends activexDashOutlookLib.OutlookNs.OlFormRegistry
  
  @js.native
  sealed trait olOrganizationRegistry
    extends activexDashOutlookLib.OutlookNs.OlFormRegistry
  
  @js.native
  sealed trait olPersonalRegistry
    extends activexDashOutlookLib.OutlookNs.OlFormRegistry
  
  /* 0 */ val olDefaultRegistry: olDefaultRegistry with scala.Double = js.native
  /* 3 */ val olFolderRegistry: olFolderRegistry with scala.Double = js.native
  /* 4 */ val olOrganizationRegistry: olOrganizationRegistry with scala.Double = js.native
  /* 2 */ val olPersonalRegistry: olPersonalRegistry with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormRegistry with scala.Double] = js.native
}

