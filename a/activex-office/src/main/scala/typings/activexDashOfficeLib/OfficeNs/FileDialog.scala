package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.FileDialog")
@js.native
class FileDialog protected () extends js.Object {
  var AllowMultiSelect: scala.Boolean = js.native
  val Application: js.Any = js.native
  var ButtonName: java.lang.String = js.native
  val Creator: scala.Double = js.native
  val DialogType: MsoFileDialogType = js.native
  var FilterIndex: scala.Double = js.native
  @JSName("Filters")
  val Filters_Original: FileDialogFilters = js.native
  var InitialFileName: java.lang.String = js.native
  var InitialView: MsoFileDialogView = js.native
  val Item: java.lang.String = js.native
  var `Office.FileDialog_typekey`: FileDialog = js.native
  val Parent: js.Any = js.native
  @JSName("SelectedItems")
  val SelectedItems_Original: FileDialogSelectedItems = js.native
  var Title: java.lang.String = js.native
  def Execute(): scala.Unit = js.native
  def Filters(Index: scala.Double): FileDialogFilter = js.native
  def SelectedItems(Index: scala.Double): java.lang.String = js.native
  def Show(): scala.Double = js.native
}

