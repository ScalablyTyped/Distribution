package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolutionsModule extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Name: String = js.native
  val NavigationModuleType: OlNavigationModuleType = js.native
  @JSName("Outlook.SolutionsModule_typekey")
  var OutlookDotSolutionsModule_typekey: SolutionsModule = js.native
  val Parent: js.Any = js.native
  var Position: Double = js.native
  val Session: NameSpace = js.native
  var Visible: Boolean = js.native
  def AddSolution(Solution: Folder, Scope: OlSolutionScope): Unit = js.native
}

object SolutionsModule {
  @scala.inline
  def apply(
    AddSolution: (Folder, OlSolutionScope) => Unit,
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    NavigationModuleType: OlNavigationModuleType,
    OutlookDotSolutionsModule_typekey: SolutionsModule,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace,
    Visible: Boolean
  ): SolutionsModule = {
    val __obj = js.Dynamic.literal(AddSolution = js.Any.fromFunction2(AddSolution), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationModuleType = NavigationModuleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SolutionsModule_typekey")(OutlookDotSolutionsModule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolutionsModule]
  }
  @scala.inline
  implicit class SolutionsModuleOps[Self <: SolutionsModule] (val x: Self) extends AnyVal {
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
    def setAddSolution(value: (Folder, OlSolutionScope) => Unit): Self = this.set("AddSolution", js.Any.fromFunction2(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationModuleType(value: OlNavigationModuleType): Self = this.set("NavigationModuleType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotSolutionsModule_typekey(value: SolutionsModule): Self = this.set("Outlook.SolutionsModule_typekey", value.asInstanceOf[js.Any])
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

