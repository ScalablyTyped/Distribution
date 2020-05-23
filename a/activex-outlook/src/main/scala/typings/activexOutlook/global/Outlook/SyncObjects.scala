package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.SyncObjects")
@js.native
class SyncObjects protected ()
  extends typings.activexOutlook.Outlook.SyncObjects {
  /* CompleteClass */
  override val AppFolders: typings.activexOutlook.Outlook.SyncObject = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.SyncObjects_typekey")
  override var OutlookDotSyncObjects_typekey: typings.activexOutlook.Outlook.SyncObjects = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.SyncObject = js.native
}

