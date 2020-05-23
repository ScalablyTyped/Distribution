package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.SyncObject")
@js.native
class SyncObject protected ()
  extends typings.activexOutlook.Outlook.SyncObject {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.SyncObject_typekey")
  override var OutlookDotSyncObject_typekey: typings.activexOutlook.Outlook.SyncObject = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Start(): Unit = js.native
  /* CompleteClass */
  override def Stop(): Unit = js.native
}

