package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasksModule extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Name: String = js.native
  val NavigationGroups: typings.activexOutlook.Outlook.NavigationGroups = js.native
  val NavigationModuleType: OlNavigationModuleType = js.native
  @JSName("Outlook.TasksModule_typekey")
  var OutlookDotTasksModule_typekey: TasksModule = js.native
  val Parent: js.Any = js.native
  var Position: Double = js.native
  val Session: NameSpace = js.native
  var Visible: Boolean = js.native
}

object TasksModule {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    NavigationGroups: NavigationGroups,
    NavigationModuleType: OlNavigationModuleType,
    OutlookDotTasksModule_typekey: TasksModule,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace,
    Visible: Boolean
  ): TasksModule = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationGroups = NavigationGroups.asInstanceOf[js.Any], NavigationModuleType = NavigationModuleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TasksModule_typekey")(OutlookDotTasksModule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TasksModule]
  }
  @scala.inline
  implicit class TasksModuleOps[Self <: TasksModule] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationGroups(value: NavigationGroups): Self = this.set("NavigationGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationModuleType(value: OlNavigationModuleType): Self = this.set("NavigationModuleType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotTasksModule_typekey(value: TasksModule): Self = this.set("Outlook.TasksModule_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
  
}

