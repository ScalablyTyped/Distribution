package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationModules")
@js.native
class NavigationModules protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.NavigationModules_typekey`: NavigationModules = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def GetNavigationModule(ModuleType: OlNavigationModuleType): NavigationModule = js.native
  def Item(Index: js.Any): NavigationModule = js.native
}

