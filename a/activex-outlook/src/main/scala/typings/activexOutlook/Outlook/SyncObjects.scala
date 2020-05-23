package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncObjects extends js.Object {
  val AppFolders: SyncObject
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.SyncObjects_typekey")
  var OutlookDotSyncObjects_typekey: SyncObjects
  val Parent: js.Any
  val Session: NameSpace
  def Item(Index: js.Any): SyncObject
}

object SyncObjects {
  @scala.inline
  def apply(
    AppFolders: SyncObject,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => SyncObject,
    OutlookDotSyncObjects_typekey: SyncObjects,
    Parent: js.Any,
    Session: NameSpace
  ): SyncObjects = {
    val __obj = js.Dynamic.literal(AppFolders = AppFolders.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SyncObjects_typekey")(OutlookDotSyncObjects_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncObjects]
  }
}

