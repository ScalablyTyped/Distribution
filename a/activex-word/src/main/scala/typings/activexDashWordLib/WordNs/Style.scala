package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Style")
@js.native
class Style protected () extends js.Object {
  val Application: Application = js.native
  var AutomaticallyUpdate: scala.Boolean = js.native
  var BaseStyle: js.Any = js.native
  var Borders: Borders = js.native
  val BuiltIn: scala.Boolean = js.native
  val Creator: scala.Double = js.native
  val Description: java.lang.String = js.native
  var Font: Font = js.native
  val Frame: Frame = js.native
  var Hidden: scala.Boolean = js.native
  val InUse: scala.Boolean = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  var LinkStyle: js.Any = js.native
  val Linked: scala.Boolean = js.native
  val ListLevelNumber: scala.Double = js.native
  val ListTemplate: ListTemplate = js.native
  var Locked: scala.Boolean = js.native
  var NameLocal: java.lang.String = js.native
  var NextParagraphStyle: js.Any = js.native
  var NoProofing: scala.Double = js.native
  var NoSpaceBetweenParagraphsOfSameStyle: scala.Boolean = js.native
  var ParagraphFormat: ParagraphFormat = js.native
  val Parent: js.Any = js.native
  var Priority: scala.Double = js.native
  var QuickStyle: scala.Boolean = js.native
  val Shading: Shading = js.native
  val Table: TableStyle = js.native
  val Type: WdStyleType = js.native
  var UnhideWhenUsed: scala.Boolean = js.native
  var Visibility: scala.Boolean = js.native
  var `Word.Style_typekey`: Style = js.native
  def Delete(): scala.Unit = js.native
  def LinkToListTemplate(ListTemplate: ListTemplate): scala.Unit = js.native
  def LinkToListTemplate(ListTemplate: ListTemplate, ListLevelNumber: js.Any): scala.Unit = js.native
}

