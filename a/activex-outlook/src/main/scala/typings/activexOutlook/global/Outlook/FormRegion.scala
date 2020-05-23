package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlFormRegionMode
import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.FormRegion")
@js.native
class FormRegion protected ()
  extends typings.activexOutlook.Outlook.FormRegion {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var Detail: String = js.native
  /* CompleteClass */
  override val DisplayName: String = js.native
  /* CompleteClass */
  override var EnableAutoLayout: Boolean = js.native
  /* CompleteClass */
  override val Form: js.Any = js.native
  /* CompleteClass */
  override val FormRegionMode: OlFormRegionMode = js.native
  /* CompleteClass */
  override val Inspector: typings.activexOutlook.Outlook.Inspector = js.native
  /* CompleteClass */
  override val InternalName: String = js.native
  /* CompleteClass */
  override val IsExpanded: Boolean = js.native
  /* CompleteClass */
  override val Item: js.Any = js.native
  /* CompleteClass */
  override val Language: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.FormRegion_typekey")
  override var OutlookDotFormRegion_typekey: typings.activexOutlook.Outlook.FormRegion = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var SuppressControlReplacement: Boolean = js.native
  /* CompleteClass */
  override var Visible: Boolean = js.native
  /* CompleteClass */
  override def Reflow(): Unit = js.native
  /* CompleteClass */
  override def Select(): Unit = js.native
  /* CompleteClass */
  override def SetControlItemProperty(Control: js.Any, PropertyName: String): Unit = js.native
}

