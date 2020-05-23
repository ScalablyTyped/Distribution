package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncObject extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Name: String
  @JSName("Outlook.SyncObject_typekey")
  var OutlookDotSyncObject_typekey: SyncObject
  val Parent: js.Any
  val Session: NameSpace
  def Start(): Unit
  def Stop(): Unit
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
}

