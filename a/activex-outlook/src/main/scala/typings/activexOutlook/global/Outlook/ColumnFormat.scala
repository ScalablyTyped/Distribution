package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlAlign
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlUserPropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ColumnFormat")
@js.native
class ColumnFormat protected ()
  extends typings.activexOutlook.Outlook.ColumnFormat {
  /* CompleteClass */
  override var Align: OlAlign = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var FieldFormat: Double = js.native
  /* CompleteClass */
  override val FieldType: OlUserPropertyType = js.native
  /* CompleteClass */
  override var Label: String = js.native
  /* CompleteClass */
  @JSName("Outlook.ColumnFormat_typekey")
  override var OutlookDotColumnFormat_typekey: typings.activexOutlook.Outlook.ColumnFormat = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var Width: Double = js.native
}

