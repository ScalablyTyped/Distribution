package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JournalModule extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Name: String
  val NavigationGroups: typings.activexOutlook.Outlook.NavigationGroups
  val NavigationModuleType: OlNavigationModuleType
  @JSName("Outlook.JournalModule_typekey")
  var OutlookDotJournalModule_typekey: JournalModule
  val Parent: js.Any
  var Position: Double
  val Session: NameSpace
  var Visible: Boolean
}

object JournalModule {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    NavigationGroups: NavigationGroups,
    NavigationModuleType: OlNavigationModuleType,
    OutlookDotJournalModule_typekey: JournalModule,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace,
    Visible: Boolean
  ): JournalModule = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationGroups = NavigationGroups.asInstanceOf[js.Any], NavigationModuleType = NavigationModuleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.JournalModule_typekey")(OutlookDotJournalModule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[JournalModule]
  }
}

