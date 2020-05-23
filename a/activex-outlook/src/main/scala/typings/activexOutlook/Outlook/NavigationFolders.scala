package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationFolders extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.NavigationFolders_typekey")
  var OutlookDotNavigationFolders_typekey: NavigationFolders
  val Parent: js.Any
  val Session: NameSpace
  def Add(Folder: Folder): NavigationFolder
  def Item(Index: js.Any): NavigationFolder
  def Remove(RemovableFolder: NavigationFolder): Unit
}

object NavigationFolders {
  @scala.inline
  def apply(
    Add: Folder => NavigationFolder,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => NavigationFolder,
    OutlookDotNavigationFolders_typekey: NavigationFolders,
    Parent: js.Any,
    Remove: NavigationFolder => Unit,
    Session: NameSpace
  ): NavigationFolders = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationFolders_typekey")(OutlookDotNavigationFolders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFolders]
  }
}

