package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlookBarStorage extends js.Object {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Groups: OutlookBarGroups = js.native
  
  @JSName("Outlook.OutlookBarStorage_typekey")
  var OutlookDotOutlookBarStorage_typekey: OutlookBarStorage = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object OutlookBarStorage {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Groups: OutlookBarGroups,
    OutlookDotOutlookBarStorage_typekey: OutlookBarStorage,
    Parent: js.Any,
    Session: NameSpace
  ): OutlookBarStorage = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarStorage_typekey")(OutlookDotOutlookBarStorage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarStorage]
  }
  
  @scala.inline
  implicit class OutlookBarStorageOps[Self <: OutlookBarStorage] (val x: Self) extends AnyVal {
    
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
    def setGroups(value: OutlookBarGroups): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOutlookBarStorage_typekey(value: OutlookBarStorage): Self = this.set("Outlook.OutlookBarStorage_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
}
