package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationModules extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.NavigationModules_typekey")
  var OutlookDotNavigationModules_typekey: NavigationModules
  val Parent: js.Any
  val Session: NameSpace
  def GetNavigationModule(ModuleType: OlNavigationModuleType): NavigationModule
  def Item(Index: js.Any): NavigationModule
}

object NavigationModules {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    GetNavigationModule: OlNavigationModuleType => NavigationModule,
    Item: js.Any => NavigationModule,
    OutlookDotNavigationModules_typekey: NavigationModules,
    Parent: js.Any,
    Session: NameSpace
  ): NavigationModules = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], GetNavigationModule = js.Any.fromFunction1(GetNavigationModule), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationModules_typekey")(OutlookDotNavigationModules_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationModules]
  }
}

