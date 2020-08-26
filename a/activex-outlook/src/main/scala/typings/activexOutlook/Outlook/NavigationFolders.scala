package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationFolders extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.NavigationFolders_typekey")
  var OutlookDotNavigationFolders_typekey: NavigationFolders = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Folder: Folder): NavigationFolder = js.native
  def Item(Index: js.Any): NavigationFolder = js.native
  def Remove(RemovableFolder: NavigationFolder): Unit = js.native
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
  @scala.inline
  implicit class NavigationFoldersOps[Self <: NavigationFolders] (val x: Self) extends AnyVal {
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
    def setAdd(value: Folder => NavigationFolder): Self = this.set("Add", js.Any.fromFunction1(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => NavigationFolder): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setOutlookDotNavigationFolders_typekey(value: NavigationFolders): Self = this.set("Outlook.NavigationFolders_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: NavigationFolder => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

