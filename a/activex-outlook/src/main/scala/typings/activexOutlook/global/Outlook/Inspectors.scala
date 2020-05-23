package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Inspectors")
@js.native
class Inspectors protected ()
  extends typings.activexOutlook.Outlook.Inspectors {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.Inspectors_typekey")
  override var OutlookDotInspectors_typekey: typings.activexOutlook.Outlook.Inspectors = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(Item: js.Any): typings.activexOutlook.Outlook.Inspector = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.Inspector = js.native
}

