package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var AutomaticallyUpdate: Boolean = js.native
  
  var BaseStyle: Any = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  val BuiltIn: Boolean = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Description: String = js.native
  
  var Font: typings.activexWord.Word.Font = js.native
  
  val Frame: typings.activexWord.Word.Frame = js.native
  
  var Hidden: Boolean = js.native
  
  val InUse: Boolean = js.native
  
  var LanguageID: WdLanguageID = js.native
  
  var LanguageIDFarEast: WdLanguageID = js.native
  
  var LinkStyle: Any = js.native
  
  def LinkToListTemplate(ListTemplate: typings.activexWord.Word.ListTemplate): Unit = js.native
  def LinkToListTemplate(ListTemplate: typings.activexWord.Word.ListTemplate, ListLevelNumber: Any): Unit = js.native
  
  val Linked: Boolean = js.native
  
  val ListLevelNumber: Double = js.native
  
  val ListTemplate: typings.activexWord.Word.ListTemplate = js.native
  
  var Locked: Boolean = js.native
  
  var NameLocal: String = js.native
  
  var NextParagraphStyle: Any = js.native
  
  var NoProofing: Double = js.native
  
  var NoSpaceBetweenParagraphsOfSameStyle: Boolean = js.native
  
  var ParagraphFormat: typings.activexWord.Word.ParagraphFormat = js.native
  
  val Parent: Any = js.native
  
  var Priority: Double = js.native
  
  var QuickStyle: Boolean = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  val Table: TableStyle = js.native
  
  val Type: WdStyleType = js.native
  
  var UnhideWhenUsed: Boolean = js.native
  
  var Visibility: Boolean = js.native
  
  /* private */ @JSName("Word.Style_typekey")
  var WordDotStyle_typekey: Style = js.native
}
