package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationModule extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Name: String
  val NavigationModuleType: OlNavigationModuleType
  @JSName("Outlook.NavigationModule_typekey")
  var OutlookDotNavigationModule_typekey: NavigationModule
  val Parent: js.Any
  var Position: Double
  val Session: NameSpace
  var Visible: Boolean
}

object NavigationModule {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    NavigationModuleType: OlNavigationModuleType,
    OutlookDotNavigationModule_typekey: NavigationModule,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace,
    Visible: Boolean
  ): NavigationModule = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationModuleType = NavigationModuleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationModule_typekey")(OutlookDotNavigationModule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationModule]
  }
}

