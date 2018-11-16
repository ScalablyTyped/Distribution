package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlSearchScope extends js.Object

@JSGlobal("Outlook.OlSearchScope")
@js.native
object OlSearchScope extends js.Object {
  @js.native
  sealed trait olSearchScopeAllFolders
    extends activexDashOutlookLib.OutlookNs.OlSearchScope
  
  @js.native
  sealed trait olSearchScopeAllOutlookItems
    extends activexDashOutlookLib.OutlookNs.OlSearchScope
  
  @js.native
  sealed trait olSearchScopeCurrentFolder
    extends activexDashOutlookLib.OutlookNs.OlSearchScope
  
  @js.native
  sealed trait olSearchScopeSubfolders
    extends activexDashOutlookLib.OutlookNs.OlSearchScope
  
  /* 1 */ val olSearchScopeAllFolders: olSearchScopeAllFolders with scala.Double = js.native
  /* 2 */ val olSearchScopeAllOutlookItems: olSearchScopeAllOutlookItems with scala.Double = js.native
  /* 0 */ val olSearchScopeCurrentFolder: olSearchScopeCurrentFolder with scala.Double = js.native
  /* 3 */ val olSearchScopeSubfolders: olSearchScopeSubfolders with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlSearchScope with scala.Double] = js.native
}

