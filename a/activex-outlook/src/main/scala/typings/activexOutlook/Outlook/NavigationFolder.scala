package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationFolder extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val DisplayName: String
  
  val Folder: typings.activexOutlook.Outlook.Folder
  
  val IsRemovable: Boolean
  
  var IsSelected: Boolean
  
  var IsSideBySide: Boolean
  
  @JSName("Outlook.NavigationFolder_typekey")
  var OutlookDotNavigationFolder_typekey: NavigationFolder
  
  val Parent: js.Any
  
  var Position: Double
  
  val Session: NameSpace
}
object NavigationFolder {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    DisplayName: String,
    Folder: Folder,
    IsRemovable: Boolean,
    IsSelected: Boolean,
    IsSideBySide: Boolean,
    OutlookDotNavigationFolder_typekey: NavigationFolder,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace
  ): NavigationFolder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Folder = Folder.asInstanceOf[js.Any], IsRemovable = IsRemovable.asInstanceOf[js.Any], IsSelected = IsSelected.asInstanceOf[js.Any], IsSideBySide = IsSideBySide.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationFolder_typekey")(OutlookDotNavigationFolder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFolder]
  }
  
  @scala.inline
  implicit class NavigationFolderMutableBuilder[Self <: NavigationFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolder(value: Folder): Self = StObject.set(x, "Folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRemovable(value: Boolean): Self = StObject.set(x, "IsRemovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "IsSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSideBySide(value: Boolean): Self = StObject.set(x, "IsSideBySide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotNavigationFolder_typekey(value: NavigationFolder): Self = StObject.set(x, "Outlook.NavigationFolder_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
