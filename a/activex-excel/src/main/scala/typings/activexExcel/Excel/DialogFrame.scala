package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.DialogFrame")
@js.native
class DialogFrame protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var Caption: String = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.DialogFrame_typekey")
  var ExcelDotDialogFrame_typekey: DialogFrame = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  var Locked: Boolean = js.native
  var LockedText: Boolean = js.native
  var Name: String = js.native
  var OnAction: String = js.native
  val Parent: js.Any = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  var Text: String = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  def Characters(): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: js.Any): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: js.Any, Length: js.Any): typings.activexExcel.Excel.Characters = js.native
  def CheckSpelling(): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any, AlwaysSuggest: js.Any): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any, AlwaysSuggest: js.Any, SpellLang: js.Any): js.Any = js.native
  /**
    * @param Appearance [Appearance=2]
    * @param Format [Format=-4147]
    */
  def CopyPicture(): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): js.Any = js.native
  def Select(): js.Any = js.native
  def Select(Replace: js.Any): js.Any = js.native
  def ShapeRange(Index: String): Shape = js.native
  def ShapeRange(Index: Double): Shape = js.native
}

