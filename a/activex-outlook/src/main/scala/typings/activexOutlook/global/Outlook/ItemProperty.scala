package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlUserPropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ItemProperty")
@js.native
class ItemProperty protected ()
  extends typings.activexOutlook.Outlook.ItemProperty {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var Formula: String = js.native
  /* CompleteClass */
  override val IsUserProperty: Boolean = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.ItemProperty_typekey")
  override var OutlookDotItemProperty_typekey: typings.activexOutlook.Outlook.ItemProperty = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override val Type: OlUserPropertyType = js.native
  /* CompleteClass */
  override var ValidationFormula: String = js.native
  /* CompleteClass */
  override var ValidationText: String = js.native
  /* CompleteClass */
  override var Value: js.Any = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

