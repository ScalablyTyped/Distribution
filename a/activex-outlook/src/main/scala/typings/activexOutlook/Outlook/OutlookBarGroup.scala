package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlookBarGroup extends js.Object {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var Name: String = js.native
  
  @JSName("Outlook.OutlookBarGroup_typekey")
  var OutlookDotOutlookBarGroup_typekey: OutlookBarGroup = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  val Shortcuts: OutlookBarShortcuts = js.native
  
  var ViewType: OlOutlookBarViewType = js.native
}
object OutlookBarGroup {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    OutlookDotOutlookBarGroup_typekey: OutlookBarGroup,
    Parent: js.Any,
    Session: NameSpace,
    Shortcuts: OutlookBarShortcuts,
    ViewType: OlOutlookBarViewType
  ): OutlookBarGroup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Shortcuts = Shortcuts.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarGroup_typekey")(OutlookDotOutlookBarGroup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarGroup]
  }
  
  @scala.inline
  implicit class OutlookBarGroupOps[Self <: OutlookBarGroup] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOutlookBarGroup_typekey(value: OutlookBarGroup): Self = this.set("Outlook.OutlookBarGroup_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcuts(value: OutlookBarShortcuts): Self = this.set("Shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: OlOutlookBarViewType): Self = this.set("ViewType", value.asInstanceOf[js.Any])
  }
}
