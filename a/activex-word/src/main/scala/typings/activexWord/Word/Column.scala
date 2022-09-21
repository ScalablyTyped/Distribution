package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def AutoFit(): Unit = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  val Cells: typings.activexWord.Word.Cells = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Index: Double = js.native
  
  val IsFirst: Boolean = js.native
  
  val IsLast: Boolean = js.native
  
  val NestingLevel: Double = js.native
  
  val Next: Column = js.native
  
  val Parent: Any = js.native
  
  var PreferredWidth: Double = js.native
  
  var PreferredWidthType: WdPreferredWidthType = js.native
  
  val Previous: Column = js.native
  
  def Select(): Unit = js.native
  
  def SetWidth(ColumnWidth: Double, RulerStyle: WdRulerStyle): Unit = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  def Sort(
    ExcludeHeader: js.UndefOr[Any],
    SortFieldType: js.UndefOr[Any],
    SortOrder: js.UndefOr[Any],
    CaseSensitive: js.UndefOr[Any],
    BidiSort: js.UndefOr[Any],
    IgnoreThe: js.UndefOr[Any],
    IgnoreKashida: js.UndefOr[Any],
    IgnoreDiacritics: js.UndefOr[Any],
    IgnoreHe: js.UndefOr[Any],
    LanguageID: js.UndefOr[Any]
  ): Unit = js.native
  
  def SortOld(): Unit = js.native
  def SortOld(ExcludeHeader: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Any, SortOrder: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Any, SortOrder: Any, CaseSensitive: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Any, SortOrder: Any, CaseSensitive: Any, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Any, SortOrder: Any, CaseSensitive: Unit, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Any, SortOrder: Unit, CaseSensitive: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Any, SortOrder: Unit, CaseSensitive: Any, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Any, SortOrder: Unit, CaseSensitive: Unit, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Unit, SortOrder: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Unit, SortOrder: Any, CaseSensitive: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Unit, SortOrder: Any, CaseSensitive: Any, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Unit, SortOrder: Any, CaseSensitive: Unit, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Unit, SortOrder: Unit, CaseSensitive: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Unit, SortOrder: Unit, CaseSensitive: Any, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Any, SortFieldType: Unit, SortOrder: Unit, CaseSensitive: Unit, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Any, SortOrder: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Any, SortOrder: Any, CaseSensitive: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Any, SortOrder: Any, CaseSensitive: Any, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Any, SortOrder: Any, CaseSensitive: Unit, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Any, SortOrder: Unit, CaseSensitive: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Any, SortOrder: Unit, CaseSensitive: Any, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Any, SortOrder: Unit, CaseSensitive: Unit, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Unit, SortOrder: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Unit, SortOrder: Any, CaseSensitive: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Unit, SortOrder: Any, CaseSensitive: Any, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Unit, SortOrder: Any, CaseSensitive: Unit, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Unit, SortOrder: Unit, CaseSensitive: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Unit, SortOrder: Unit, CaseSensitive: Any, LanguageID: Any): Unit = js.native
  def SortOld(ExcludeHeader: Unit, SortFieldType: Unit, SortOrder: Unit, CaseSensitive: Unit, LanguageID: Any): Unit = js.native
  
  var Width: Double = js.native
  
  /* private */ @JSName("Word.Column_typekey")
  var WordDotColumn_typekey: Column = js.native
}
