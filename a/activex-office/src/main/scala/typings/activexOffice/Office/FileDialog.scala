package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileDialog extends js.Object {
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
  @JSName("Office.FileDialog_typekey")
  var OfficeDotFileDialog_typekey: FileDialog = js.native
  val Parent: js.Any = js.native
  @JSName("SelectedItems")
  val SelectedItems_Original: FileDialogSelectedItems = js.native
  var Title: String = js.native
  def Execute(): Unit = js.native
  def Filters(Index: Double): FileDialogFilter = js.native
  def SelectedItems(Index: Double): String = js.native
  def Show(): Double = js.native
}

