package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlOutlookBarViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OutlookBarGroup")
@js.native
class OutlookBarGroup protected ()
  extends typings.activexOutlook.Outlook.OutlookBarGroup {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.OutlookBarGroup_typekey")
  override var OutlookDotOutlookBarGroup_typekey: typings.activexOutlook.Outlook.OutlookBarGroup = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override val Shortcuts: typings.activexOutlook.Outlook.OutlookBarShortcuts = js.native
  /* CompleteClass */
  override var ViewType: OlOutlookBarViewType = js.native
}

