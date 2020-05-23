package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlViewSaveOption
import typings.activexOutlook.Outlook.OlViewType
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.CardView")
@js.native
class CardView protected ()
  extends typings.activexOutlook.Outlook.CardView {
  /* CompleteClass */
  override var AllowInCellEditing: Boolean = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules = js.native
  /* CompleteClass */
  override val BodyFont: typings.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var Filter: String = js.native
  /* CompleteClass */
  override val HeadingsFont: typings.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override var Language: String = js.native
  /* CompleteClass */
  override var LockUserChanges: Boolean = js.native
  /* CompleteClass */
  override var MultiLineFieldHeight: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.CardView_typekey")
  override var OutlookDotCardView_typekey: typings.activexOutlook.Outlook.CardView = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val SaveOption: OlViewSaveOption = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var ShowEmptyFields: Boolean = js.native
  /* CompleteClass */
  override val SortFields: typings.activexOutlook.Outlook.OrderFields = js.native
  /* CompleteClass */
  override val Standard: Boolean = js.native
  /* CompleteClass */
  override val ViewFields: typings.activexOutlook.Outlook.ViewFields = js.native
  /* CompleteClass */
  override val ViewType: OlViewType = js.native
  /* CompleteClass */
  override var Width: Double = js.native
  /* CompleteClass */
  override var XML: String = js.native
  /* CompleteClass */
  override def Apply(): Unit = js.native
  /* CompleteClass */
  override def Copy(Name: String, SaveOption: OlViewSaveOption): typings.activexOutlook.Outlook.View = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def GoToDate(Date: VarDate): Unit = js.native
  /* CompleteClass */
  override def Reset(): Unit = js.native
  /* CompleteClass */
  override def Save(): Unit = js.native
}

