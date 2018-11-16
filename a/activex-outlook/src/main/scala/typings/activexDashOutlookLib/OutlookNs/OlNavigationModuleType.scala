package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlNavigationModuleType extends js.Object

@JSGlobal("Outlook.OlNavigationModuleType")
@js.native
object OlNavigationModuleType extends js.Object {
  @js.native
  sealed trait olModuleCalendar
    extends activexDashOutlookLib.OutlookNs.OlNavigationModuleType
  
  @js.native
  sealed trait olModuleContacts
    extends activexDashOutlookLib.OutlookNs.OlNavigationModuleType
  
  @js.native
  sealed trait olModuleFolderList
    extends activexDashOutlookLib.OutlookNs.OlNavigationModuleType
  
  @js.native
  sealed trait olModuleJournal
    extends activexDashOutlookLib.OutlookNs.OlNavigationModuleType
  
  @js.native
  sealed trait olModuleMail
    extends activexDashOutlookLib.OutlookNs.OlNavigationModuleType
  
  @js.native
  sealed trait olModuleNotes
    extends activexDashOutlookLib.OutlookNs.OlNavigationModuleType
  
  @js.native
  sealed trait olModuleShortcuts
    extends activexDashOutlookLib.OutlookNs.OlNavigationModuleType
  
  @js.native
  sealed trait olModuleSolutions
    extends activexDashOutlookLib.OutlookNs.OlNavigationModuleType
  
  @js.native
  sealed trait olModuleTasks
    extends activexDashOutlookLib.OutlookNs.OlNavigationModuleType
  
  /* 1 */ val olModuleCalendar: olModuleCalendar with scala.Double = js.native
  /* 2 */ val olModuleContacts: olModuleContacts with scala.Double = js.native
  /* 6 */ val olModuleFolderList: olModuleFolderList with scala.Double = js.native
  /* 4 */ val olModuleJournal: olModuleJournal with scala.Double = js.native
  /* 0 */ val olModuleMail: olModuleMail with scala.Double = js.native
  /* 5 */ val olModuleNotes: olModuleNotes with scala.Double = js.native
  /* 7 */ val olModuleShortcuts: olModuleShortcuts with scala.Double = js.native
  /* 8 */ val olModuleSolutions: olModuleSolutions with scala.Double = js.native
  /* 3 */ val olModuleTasks: olModuleTasks with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlNavigationModuleType with scala.Double] = js.native
}

