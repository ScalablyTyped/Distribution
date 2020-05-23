package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SolutionsModule extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Name: String
  val NavigationModuleType: OlNavigationModuleType
  @JSName("Outlook.SolutionsModule_typekey")
  var OutlookDotSolutionsModule_typekey: SolutionsModule
  val Parent: js.Any
  var Position: Double
  val Session: NameSpace
  var Visible: Boolean
  def AddSolution(Solution: Folder, Scope: OlSolutionScope): Unit
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
}

