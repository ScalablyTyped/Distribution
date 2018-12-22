package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Inspector")
@js.native
class Inspector protected () extends js.Object {
  val Application: Application = js.native
  val AttachmentSelection: AttachmentSelection = js.native
  val Caption: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  val CommandBars: js.Any = js.native
  val CurrentItem: js.Any = js.native
  val EditorType: OlEditorType = js.native
  val HTMLEditor: js.Any = js.native
  var Height: scala.Double = js.native
  var Left: scala.Double = js.native
  val ModifiedFormPages: js.Any = js.native
  var `Outlook.Inspector_typekey`: Inspector = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  var Top: scala.Double = js.native
  var Width: scala.Double = js.native
  var WindowState: OlWindowState = js.native
  val WordEditor: js.Any = js.native
  def Activate(): scala.Unit = js.native
  def Close(SaveMode: OlInspectorClose): scala.Unit = js.native
  def Display(): scala.Unit = js.native
  def Display(Modal: js.Any): scala.Unit = js.native
  def HideFormPage(PageName: java.lang.String): scala.Unit = js.native
  def IsWordMail(): scala.Boolean = js.native
  def NewFormRegion(): js.Any = js.native
  def OpenFormRegion(Path: java.lang.String): js.Any = js.native
  def SaveFormRegion(Page: js.Any, FileName: java.lang.String): scala.Unit = js.native
  def SetControlItemProperty(Control: js.Any, PropertyName: java.lang.String): scala.Unit = js.native
  def SetCurrentFormPage(PageName: java.lang.String): scala.Unit = js.native
  def SetSchedulingStartTime(Start: activexDashInteropLib.VarDate): scala.Unit = js.native
  def ShowFormPage(PageName: java.lang.String): scala.Unit = js.native
}

