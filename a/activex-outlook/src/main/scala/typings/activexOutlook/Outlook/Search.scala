package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search extends js.Object {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Filter: String = js.native
  
  def GetTable(): Table = js.native
  
  val IsSynchronous: Boolean = js.native
  
  @JSName("Outlook.Search_typekey")
  var OutlookDotSearch_typekey: Search = js.native
  
  val Parent: js.Any = js.native
  
  val Results: typings.activexOutlook.Outlook.Results = js.native
  
  def Save(Name: String): Folder = js.native
  
  val Scope: String = js.native
  
  val SearchSubFolders: Boolean = js.native
  
  val Session: NameSpace = js.native
  
  def Stop(): Unit = js.native
  
  val Tag: String = js.native
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
  
  @scala.inline
  implicit class SearchOps[Self <: Search] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: String): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTable(value: () => Table): Self = this.set("GetTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSynchronous(value: Boolean): Self = this.set("IsSynchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotSearch_typekey(value: Search): Self = this.set("Outlook.Search_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: Results): Self = this.set("Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: String => Folder): Self = this.set("Save", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScope(value: String): Self = this.set("Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchSubFolders(value: Boolean): Self = this.set("SearchSubFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("Stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
  }
}
