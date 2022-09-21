package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogFrame extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var Caption: String = js.native
  
  def Characters(): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Any): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Any, Length: Any): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Unit, Length: Any): typings.activexExcel.Excel.Characters = js.native
  
  def CheckSpelling(): Any = js.native
  def CheckSpelling(CustomDictionary: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Any, AlwaysSuggest: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Any, AlwaysSuggest: Any, SpellLang: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Any, AlwaysSuggest: Unit, SpellLang: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Unit, AlwaysSuggest: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Unit, AlwaysSuggest: Any, SpellLang: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Unit, AlwaysSuggest: Unit, SpellLang: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Any, AlwaysSuggest: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Any, AlwaysSuggest: Any, SpellLang: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Any, AlwaysSuggest: Unit, SpellLang: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Any, SpellLang: Any): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Unit, SpellLang: Any): Any = js.native
  
  /**
    * @param Appearance [Appearance=2]
    * @param Format [Format=-4147]
    */
  def CopyPicture(): Any = js.native
  def CopyPicture(Appearance: Unit, Format: XlCopyPictureFormat): Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance): Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): Any = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.DialogFrame_typekey")
  var ExcelDotDialogFrame_typekey: DialogFrame = js.native
  
  var Height: Double = js.native
  
  var Left: Double = js.native
  
  var Locked: Boolean = js.native
  
  var LockedText: Boolean = js.native
  
  var Name: String = js.native
  
  var OnAction: String = js.native
  
  val Parent: Any = js.native
  
  def Select(): Any = js.native
  def Select(Replace: Any): Any = js.native
  
  def ShapeRange(Index: String): Shape = js.native
  def ShapeRange(Index: Double): Shape = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  
  var Text: String = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
}
