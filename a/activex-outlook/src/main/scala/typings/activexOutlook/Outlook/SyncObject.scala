package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.SyncObject")
@js.native
class SyncObject protected () extends js.Object {
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

