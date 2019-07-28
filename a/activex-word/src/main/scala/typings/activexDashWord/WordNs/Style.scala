package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Style")
@js.native
class Style protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  var AutomaticallyUpdate: Boolean = js.native
  var BaseStyle: js.Any = js.native
  var Borders: typings.activexDashWord.WordNs.Borders = js.native
  val BuiltIn: Boolean = js.native
  val Creator: Double = js.native
  val Description: String = js.native
  var Font: typings.activexDashWord.WordNs.Font = js.native
  val Frame: typings.activexDashWord.WordNs.Frame = js.native
  var Hidden: Boolean = js.native
  val InUse: Boolean = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  var LinkStyle: js.Any = js.native
  val Linked: Boolean = js.native
  val ListLevelNumber: Double = js.native
  val ListTemplate: typings.activexDashWord.WordNs.ListTemplate = js.native
  var Locked: Boolean = js.native
  var NameLocal: String = js.native
  var NextParagraphStyle: js.Any = js.native
  var NoProofing: Double = js.native
  var NoSpaceBetweenParagraphsOfSameStyle: Boolean = js.native
  var ParagraphFormat: typings.activexDashWord.WordNs.ParagraphFormat = js.native
  val Parent: js.Any = js.native
  var Priority: Double = js.native
  var QuickStyle: Boolean = js.native
  val Shading: typings.activexDashWord.WordNs.Shading = js.native
  val Table: TableStyle = js.native
  val Type: WdStyleType = js.native
  var UnhideWhenUsed: Boolean = js.native
  var Visibility: Boolean = js.native
  var `Word.Style_typekey`: Style = js.native
  def Delete(): Unit = js.native
  def LinkToListTemplate(ListTemplate: typings.activexDashWord.WordNs.ListTemplate): Unit = js.native
  def LinkToListTemplate(ListTemplate: typings.activexDashWord.WordNs.ListTemplate, ListLevelNumber: js.Any): Unit = js.native
}

