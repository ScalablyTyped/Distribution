package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.SolutionsModule")
@js.native
class SolutionsModule protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Name: String = js.native
  val NavigationModuleType: OlNavigationModuleType = js.native
  var `Outlook.SolutionsModule_typekey`: SolutionsModule = js.native
  val Parent: js.Any = js.native
  var Position: Double = js.native
  val Session: NameSpace = js.native
  var Visible: Boolean = js.native
  def AddSolution(Solution: Folder, Scope: OlSolutionScope): Unit = js.native
}

