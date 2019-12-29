package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.FormRegion")
@js.native
class FormRegion protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Detail: String = js.native
  val DisplayName: String = js.native
  var EnableAutoLayout: Boolean = js.native
  val Form: js.Any = js.native
  val FormRegionMode: OlFormRegionMode = js.native
  val Inspector: typings.activexDashOutlook.Outlook.Inspector = js.native
  val InternalName: String = js.native
  val IsExpanded: Boolean = js.native
  val Item: js.Any = js.native
  val Language: Double = js.native
  @JSName("Outlook.FormRegion_typekey")
  var OutlookDotFormRegion_typekey: FormRegion = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  var SuppressControlReplacement: Boolean = js.native
  var Visible: Boolean = js.native
  def Reflow(): Unit = js.native
  def Select(): Unit = js.native
  def SetControlItemProperty(Control: js.Any, PropertyName: String): Unit = js.native
}

