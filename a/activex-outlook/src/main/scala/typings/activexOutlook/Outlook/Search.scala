package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Search extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Filter: String
  val IsSynchronous: Boolean
  @JSName("Outlook.Search_typekey")
  var OutlookDotSearch_typekey: Search
  val Parent: js.Any
  val Results: typings.activexOutlook.Outlook.Results
  val Scope: String
  val SearchSubFolders: Boolean
  val Session: NameSpace
  val Tag: String
  def GetTable(): Table
  def Save(Name: String): Folder
  def Stop(): Unit
}

object Search {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Filter: String,
    GetTable: () => Table,
    IsSynchronous: Boolean,
    OutlookDotSearch_typekey: Search,
    Parent: js.Any,
    Results: Results,
    Save: String => Folder,
    Scope: String,
    SearchSubFolders: Boolean,
    Session: NameSpace,
    Stop: () => Unit,
    Tag: String
  ): Search = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GetTable = js.Any.fromFunction0(GetTable), IsSynchronous = IsSynchronous.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Results = Results.asInstanceOf[js.Any], Save = js.Any.fromFunction1(Save), Scope = Scope.asInstanceOf[js.Any], SearchSubFolders = SearchSubFolders.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Stop = js.Any.fromFunction0(Stop), Tag = Tag.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Search_typekey")(OutlookDotSearch_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Search]
  }
}

