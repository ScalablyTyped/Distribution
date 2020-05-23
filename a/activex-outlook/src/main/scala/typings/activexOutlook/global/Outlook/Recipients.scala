package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Recipients")
@js.native
class Recipients protected ()
  extends typings.activexOutlook.Outlook.Recipients {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.Recipients_typekey")
  override var OutlookDotRecipients_typekey: typings.activexOutlook.Outlook.Recipients = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(Name: String): typings.activexOutlook.Outlook.Recipient = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.Recipient = js.native
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
  /* CompleteClass */
  override def ResolveAll(): Boolean = js.native
}

