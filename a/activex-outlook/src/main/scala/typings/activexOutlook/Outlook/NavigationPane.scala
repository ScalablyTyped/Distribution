package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationPane extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var CurrentModule: NavigationModule = js.native
  var DisplayedModuleCount: Double = js.native
  var IsCollapsed: Boolean = js.native
  val Modules: NavigationModules = js.native
  @JSName("Outlook.NavigationPane_typekey")
  var OutlookDotNavigationPane_typekey: NavigationPane = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
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
  @scala.inline
  implicit class NavigationPaneOps[Self <: NavigationPane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentModule(value: NavigationModule): Self = this.set("CurrentModule", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayedModuleCount(value: Double): Self = this.set("DisplayedModuleCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCollapsed(value: Boolean): Self = this.set("IsCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setModules(value: NavigationModules): Self = this.set("Modules", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotNavigationPane_typekey(value: NavigationPane): Self = this.set("Outlook.NavigationPane_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

