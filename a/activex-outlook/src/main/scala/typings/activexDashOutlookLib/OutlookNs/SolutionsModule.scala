package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.SolutionsModule")
@js.native
class SolutionsModule protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Name: java.lang.String = js.native
  val NavigationModuleType: OlNavigationModuleType = js.native
  var `Outlook.SolutionsModule_typekey`: SolutionsModule = js.native
  val Parent: js.Any = js.native
  var Position: scala.Double = js.native
  val Session: NameSpace = js.native
  var Visible: scala.Boolean = js.native
  def AddSolution(Solution: Folder, Scope: OlSolutionScope): scala.Unit = js.native
}

