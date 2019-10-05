package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.FileDialog")
@js.native
class FileDialog protected () extends js.Object {
  var AllowMultiSelect: Boolean = js.native
  val Application: js.Any = js.native
  var ButtonName: String = js.native
  val Creator: Double = js.native
  val DialogType: MsoFileDialogType = js.native
  var FilterIndex: Double = js.native
  @JSName("Filters")
  val Filters_Original: FileDialogFilters = js.native
  var InitialFileName: String = js.native
  var InitialView: MsoFileDialogView = js.native
  val Item: String = js.native
  var `Office.FileDialog_typekey`: FileDialog = js.native
  val Parent: js.Any = js.native
  @JSName("SelectedItems")
  val SelectedItems_Original: FileDialogSelectedItems = js.native
  var Title: String = js.native
  def Execute(): Unit = js.native
  def Filters(Index: Double): FileDialogFilter = js.native
  def SelectedItems(Index: Double): String = js.native
  def Show(): Double = js.native
}

