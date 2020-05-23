package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ViewFields")
@js.native
class ViewFields protected ()
  extends typings.activexOutlook.Outlook.ViewFields {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.ViewFields_typekey")
  override var OutlookDotViewFields_typekey: typings.activexOutlook.Outlook.ViewFields = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(PropertyName: String): typings.activexOutlook.Outlook.ViewField = js.native
  /* CompleteClass */
  override def Insert(PropertyName: String, Index: js.Any): typings.activexOutlook.Outlook.ViewField = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.ViewField = js.native
  /* CompleteClass */
  override def Remove(Index: js.Any): Unit = js.native
}

