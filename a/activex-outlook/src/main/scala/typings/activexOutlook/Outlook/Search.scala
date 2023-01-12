package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Search extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Filter: String
  
  def GetTable(): Table
  
  val IsSynchronous: Boolean
  
  /* private */ @JSName("Outlook.Search_typekey")
  var OutlookDotSearch_typekey: Search
  
  val Parent: Any
  
  val Results: typings.activexOutlook.Outlook.Results
  
  def Save(Name: String): Folder
  
  val Scope: String
  
  val SearchSubFolders: Boolean
  
  val Session: NameSpace
  
  def Stop(): Unit
  
  val Tag: String
}
object Search {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Filter: String,
    GetTable: () => Table,
    IsSynchronous: Boolean,
    OutlookDotSearch_typekey: Search,
    Parent: Any,
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
  implicit open class MutableBuilder[Self <: Search] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGetTable(value: () => Table): Self = StObject.set(x, "GetTable", js.Any.fromFunction0(value))
    
    inline def setIsSynchronous(value: Boolean): Self = StObject.set(x, "IsSynchronous", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotSearch_typekey(value: Search): Self = StObject.set(x, "Outlook.Search_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setResults(value: Results): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setSave(value: String => Folder): Self = StObject.set(x, "Save", js.Any.fromFunction1(value))
    
    inline def setScope(value: String): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setSearchSubFolders(value: Boolean): Self = StObject.set(x, "SearchSubFolders", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "Stop", js.Any.fromFunction0(value))
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
  }
}
