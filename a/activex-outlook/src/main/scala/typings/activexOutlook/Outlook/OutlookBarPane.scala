package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlookBarPane extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Contents: OutlookBarStorage
  
  var CurrentGroup: OutlookBarGroup
  
  val Name: String
  
  @JSName("Outlook.OutlookBarPane_typekey")
  var OutlookDotOutlookBarPane_typekey: OutlookBarPane
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  var Visible: Boolean
}
object OutlookBarPane {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Contents: OutlookBarStorage,
    CurrentGroup: OutlookBarGroup,
    Name: String,
    OutlookDotOutlookBarPane_typekey: OutlookBarPane,
    Parent: js.Any,
    Session: NameSpace,
    Visible: Boolean
  ): OutlookBarPane = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Contents = Contents.asInstanceOf[js.Any], CurrentGroup = CurrentGroup.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarPane_typekey")(OutlookDotOutlookBarPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarPane]
  }
  
  @scala.inline
  implicit class OutlookBarPaneMutableBuilder[Self <: OutlookBarPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContents(value: OutlookBarStorage): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentGroup(value: OutlookBarGroup): Self = StObject.set(x, "CurrentGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOutlookBarPane_typekey(value: OutlookBarPane): Self = StObject.set(x, "Outlook.OutlookBarPane_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
