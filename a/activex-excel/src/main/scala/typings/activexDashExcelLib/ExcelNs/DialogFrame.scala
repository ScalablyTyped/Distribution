package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.DialogFrame")
@js.native
class DialogFrame protected () extends js.Object {
  val Application: Application = js.native
  var Caption: java.lang.String = js.native
  val Creator: XlCreator = js.native
  var `Excel.DialogFrame_typekey`: DialogFrame = js.native
  var Height: scala.Double = js.native
  var Left: scala.Double = js.native
  var Locked: scala.Boolean = js.native
  var LockedText: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  var OnAction: java.lang.String = js.native
  val Parent: js.Any = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  var Text: java.lang.String = js.native
  var Top: scala.Double = js.native
  var Width: scala.Double = js.native
  def Characters(): Characters = js.native
  def Characters(Start: js.Any): Characters = js.native
  def Characters(Start: js.Any, Length: js.Any): Characters = js.native
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
  def ShapeRange(Index: java.lang.String): Shape = js.native
  def ShapeRange(Index: scala.Double): Shape = js.native
}

