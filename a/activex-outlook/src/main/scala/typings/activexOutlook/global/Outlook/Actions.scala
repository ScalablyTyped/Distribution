package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Actions")
@js.native
class Actions protected ()
  extends typings.activexOutlook.Outlook.Actions {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.Actions_typekey")
  override var OutlookDotActions_typekey: typings.activexOutlook.Outlook.Actions = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(): typings.activexOutlook.Outlook.Action = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.Action = js.native
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}

