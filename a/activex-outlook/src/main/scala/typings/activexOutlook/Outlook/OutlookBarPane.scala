package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlookBarPane extends js.Object {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Contents: OutlookBarStorage = js.native
  
  var CurrentGroup: OutlookBarGroup = js.native
  
  val Name: String = js.native
  
  @JSName("Outlook.OutlookBarPane_typekey")
  var OutlookDotOutlookBarPane_typekey: OutlookBarPane = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  var Visible: Boolean = js.native
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
  implicit class OutlookBarPaneOps[Self <: OutlookBarPane] (val x: Self) extends AnyVal {
    
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
    def setContents(value: OutlookBarStorage): Self = this.set("Contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentGroup(value: OutlookBarGroup): Self = this.set("CurrentGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOutlookBarPane_typekey(value: OutlookBarPane): Self = this.set("Outlook.OutlookBarPane_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
}
