package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.PropertyPages")
@js.native
class PropertyPages protected ()
  extends typings.activexOutlook.Outlook.PropertyPages {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.PropertyPages_typekey")
  override var OutlookDotPropertyPages_typekey: typings.activexOutlook.Outlook.PropertyPages = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(Page: js.Any, Title: String): Unit = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): js.Any = js.native
  /* CompleteClass */
  override def Remove(Index: js.Any): Unit = js.native
}

