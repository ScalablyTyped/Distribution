package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlViewSaveOption
import typings.activexOutlook.Outlook.OlViewType
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.CardView")
@js.native
/* private */ class CardView ()
  extends StObject
     with typings.activexOutlook.Outlook.CardView {
  
  /* CompleteClass */
  var AllowInCellEditing: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override def Apply(): Unit = js.native
  
  /* CompleteClass */
  override val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules = js.native
  
  /* CompleteClass */
  override val BodyFont: typings.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def Copy(Name: String, SaveOption: OlViewSaveOption): typings.activexOutlook.Outlook.View = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Filter: String = js.native
  
  /* CompleteClass */
  override def GoToDate(Date: VarDate): Unit = js.native
  
  /* CompleteClass */
  override val HeadingsFont: typings.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  var Language: String = js.native
  
  /* CompleteClass */
  var LockUserChanges: Boolean = js.native
  
  /* CompleteClass */
  var MultiLineFieldHeight: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.CardView_typekey")
  var OutlookDotCardView_typekey: typings.activexOutlook.Outlook.CardView = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Reset(): Unit = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  override val SaveOption: OlViewSaveOption = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var ShowEmptyFields: Boolean = js.native
  
  /* CompleteClass */
  override val SortFields: typings.activexOutlook.Outlook.OrderFields = js.native
  
  /* CompleteClass */
  override val Standard: Boolean = js.native
  
  /* CompleteClass */
  override val ViewFields: typings.activexOutlook.Outlook.ViewFields = js.native
  
  /* CompleteClass */
  override val ViewType: OlViewType = js.native
  
  /* CompleteClass */
  var Width: Double = js.native
  
  /* CompleteClass */
  var XML: String = js.native
}
