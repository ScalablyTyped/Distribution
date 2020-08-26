package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncObject extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Name: String = js.native
  @JSName("Outlook.SyncObject_typekey")
  var OutlookDotSyncObject_typekey: SyncObject = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Start(): Unit = js.native
  def Stop(): Unit = js.native
}

object SyncObject {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    OutlookDotSyncObject_typekey: SyncObject,
    Parent: js.Any,
    Session: NameSpace,
    Start: () => Unit,
    Stop: () => Unit
  ): SyncObject = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Start = js.Any.fromFunction0(Start), Stop = js.Any.fromFunction0(Stop))
    __obj.updateDynamic("Outlook.SyncObject_typekey")(OutlookDotSyncObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncObject]
  }
  @scala.inline
  implicit class SyncObjectOps[Self <: SyncObject] (val x: Self) extends AnyVal {
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
    def setOutlookDotSyncObject_typekey(value: SyncObject): Self = this.set("Outlook.SyncObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("Start", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("Stop", js.Any.fromFunction0(value))
  }
  
}

