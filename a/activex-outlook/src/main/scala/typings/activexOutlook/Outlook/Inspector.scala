package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Inspector")
@js.native
class Inspector protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val AttachmentSelection: typings.activexOutlook.Outlook.AttachmentSelection = js.native
  val Caption: String = js.native
  val Class: OlObjectClass = js.native
  val CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ js.Any = js.native
  val CurrentItem: js.Any = js.native
  val EditorType: OlEditorType = js.native
  val HTMLEditor: js.Any = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  val ModifiedFormPages: js.Any = js.native
  @JSName("Outlook.Inspector_typekey")
  var OutlookDotInspector_typekey: Inspector = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  var WindowState: OlWindowState = js.native
  val WordEditor: js.Any = js.native
  def Activate(): Unit = js.native
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  def Display(): Unit = js.native
  def Display(Modal: js.Any): Unit = js.native
  def HideFormPage(PageName: String): Unit = js.native
  def IsWordMail(): Boolean = js.native
  def NewFormRegion(): js.Any = js.native
  def OpenFormRegion(Path: String): js.Any = js.native
  def SaveFormRegion(Page: js.Any, FileName: String): Unit = js.native
  def SetControlItemProperty(Control: js.Any, PropertyName: String): Unit = js.native
  def SetCurrentFormPage(PageName: String): Unit = js.native
  def SetSchedulingStartTime(Start: VarDate): Unit = js.native
  def ShowFormPage(PageName: String): Unit = js.native
}

