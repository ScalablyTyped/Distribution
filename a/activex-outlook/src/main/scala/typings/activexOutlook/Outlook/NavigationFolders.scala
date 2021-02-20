package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationFolders extends StObject {
  
  def Add(Folder: Folder): NavigationFolder = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): NavigationFolder = js.native
  
  @JSName("Outlook.NavigationFolders_typekey")
  var OutlookDotNavigationFolders_typekey: NavigationFolders = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(RemovableFolder: NavigationFolder): Unit = js.native
  
  val Session: NameSpace = js.native
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
  implicit class NavigationFoldersMutableBuilder[Self <: NavigationFolders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Folder => NavigationFolder): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => NavigationFolder): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotNavigationFolders_typekey(value: NavigationFolders): Self = StObject.set(x, "Outlook.NavigationFolders_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: NavigationFolder => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
