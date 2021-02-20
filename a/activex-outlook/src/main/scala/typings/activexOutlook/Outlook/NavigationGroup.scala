package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationGroup extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val GroupType: OlGroupType = js.native
  
  var Name: String = js.native
  
  val NavigationFolders: typings.activexOutlook.Outlook.NavigationFolders = js.native
  
  @JSName("Outlook.NavigationGroup_typekey")
  var OutlookDotNavigationGroup_typekey: NavigationGroup = js.native
  
  val Parent: js.Any = js.native
  
  var Position: Double = js.native
  
  val Session: NameSpace = js.native
}
object NavigationGroup {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    GroupType: OlGroupType,
    Name: String,
    NavigationFolders: NavigationFolders,
    OutlookDotNavigationGroup_typekey: NavigationGroup,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace
  ): NavigationGroup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], GroupType = GroupType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationFolders = NavigationFolders.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationGroup_typekey")(OutlookDotNavigationGroup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationGroup]
  }
  
  @scala.inline
  implicit class NavigationGroupMutableBuilder[Self <: NavigationGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupType(value: OlGroupType): Self = StObject.set(x, "GroupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationFolders(value: NavigationFolders): Self = StObject.set(x, "NavigationFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotNavigationGroup_typekey(value: NavigationGroup): Self = StObject.set(x, "Outlook.NavigationGroup_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
