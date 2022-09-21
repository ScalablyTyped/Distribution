package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlDefaultExpandCollapseSetting
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlTimelineViewMode
import typings.activexOutlook.Outlook.OlViewSaveOption
import typings.activexOutlook.Outlook.OlViewType
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.TimelineView")
@js.native
/* private */ open class TimelineView ()
  extends StObject
     with typings.activexOutlook.Outlook.TimelineView {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override def Apply(): Unit = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def Copy(Name: String, SaveOption: OlViewSaveOption): typings.activexOutlook.Outlook.View = js.native
  
  /* CompleteClass */
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var EndField: String = js.native
  
  /* CompleteClass */
  var Filter: String = js.native
  
  /* CompleteClass */
  override def GoToDate(Date: VarDate): Unit = js.native
  
  /* CompleteClass */
  override val GroupByFields: typings.activexOutlook.Outlook.OrderFields = js.native
  
  /* CompleteClass */
  override val ItemFont: typings.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  var Language: String = js.native
  
  /* CompleteClass */
  var LockUserChanges: Boolean = js.native
  
  /* CompleteClass */
  override val LowerScaleFont: typings.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  var MaxLabelWidth: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.TimelineView_typekey")
  var OutlookDotTimelineView_typekey: typings.activexOutlook.Outlook.TimelineView = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Reset(): Unit = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  override val SaveOption: OlViewSaveOption = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var ShowLabelWhenViewingByMonth: Boolean = js.native
  
  /* CompleteClass */
  var ShowWeekNumbers: Boolean = js.native
  
  /* CompleteClass */
  override val Standard: Boolean = js.native
  
  /* CompleteClass */
  var StartField: String = js.native
  
  /* CompleteClass */
  var TimelineViewMode: OlTimelineViewMode = js.native
  
  /* CompleteClass */
  override val UpperScaleFont: typings.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  override val ViewType: OlViewType = js.native
  
  /* CompleteClass */
  var XML: String = js.native
}
