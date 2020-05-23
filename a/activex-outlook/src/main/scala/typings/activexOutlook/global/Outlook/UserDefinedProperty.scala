package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlUserPropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.UserDefinedProperty")
@js.native
class UserDefinedProperty protected ()
  extends typings.activexOutlook.Outlook.UserDefinedProperty {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val DisplayFormat: Double = js.native
  /* CompleteClass */
  override val Formula: String = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.UserDefinedProperty_typekey")
  override var OutlookDotUserDefinedProperty_typekey: typings.activexOutlook.Outlook.UserDefinedProperty = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override val Type: OlUserPropertyType = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

