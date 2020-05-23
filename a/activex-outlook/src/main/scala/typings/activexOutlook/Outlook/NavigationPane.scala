package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPane extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var CurrentModule: NavigationModule
  var DisplayedModuleCount: Double
  var IsCollapsed: Boolean
  val Modules: NavigationModules
  @JSName("Outlook.NavigationPane_typekey")
  var OutlookDotNavigationPane_typekey: NavigationPane
  val Parent: js.Any
  val Session: NameSpace
}

object NavigationPane {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    CurrentModule: NavigationModule,
    DisplayedModuleCount: Double,
    IsCollapsed: Boolean,
    Modules: NavigationModules,
    OutlookDotNavigationPane_typekey: NavigationPane,
    Parent: js.Any,
    Session: NameSpace
  ): NavigationPane = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], CurrentModule = CurrentModule.asInstanceOf[js.Any], DisplayedModuleCount = DisplayedModuleCount.asInstanceOf[js.Any], IsCollapsed = IsCollapsed.asInstanceOf[js.Any], Modules = Modules.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationPane_typekey")(OutlookDotNavigationPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPane]
  }
}

