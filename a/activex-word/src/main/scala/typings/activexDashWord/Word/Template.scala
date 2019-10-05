package typings.activexDashWord.Word

import typings.activexDashOffice.Office.DocumentProperties
import typings.activexDashOffice.Office.DocumentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Template")
@js.native
class Template protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val AutoTextEntries: typings.activexDashWord.Word.AutoTextEntries = js.native
  val BuildingBlockEntries: typings.activexDashWord.Word.BuildingBlockEntries = js.native
  val BuildingBlockTypes: typings.activexDashWord.Word.BuildingBlockTypes = js.native
  @JSName("BuiltInDocumentProperties")
  val BuiltInDocumentProperties_Original: DocumentProperties[typings.activexDashWord.Word.Application] = js.native
  val Creator: Double = js.native
  @JSName("CustomDocumentProperties")
  val CustomDocumentProperties_Original: DocumentProperties[typings.activexDashWord.Word.Application] = js.native
  var FarEastLineBreakLanguage: WdFarEastLineBreakLanguageID = js.native
  var FarEastLineBreakLevel: WdFarEastLineBreakLevel = js.native
  val FullName: String = js.native
  var JustificationMode: WdJustificationMode = js.native
  var KerningByAlgorithm: Boolean = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  val ListTemplates: typings.activexDashWord.Word.ListTemplates = js.native
  val Name: String = js.native
  var NoLineBreakAfter: String = js.native
  var NoLineBreakBefore: String = js.native
  var NoProofing: Double = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  var Saved: Boolean = js.native
  val Type: WdTemplateType = js.native
  val VBProject: typings.activexDashVbide.VBIDE.VBProject = js.native
  var `Word.Template_typekey`: Template = js.native
  def BuiltInDocumentProperties(index: String): DocumentProperty[typings.activexDashWord.Word.Application] = js.native
  def BuiltInDocumentProperties(index: Double): DocumentProperty[typings.activexDashWord.Word.Application] = js.native
  def CustomDocumentProperties(index: String): DocumentProperty[typings.activexDashWord.Word.Application] = js.native
  def CustomDocumentProperties(index: Double): DocumentProperty[typings.activexDashWord.Word.Application] = js.native
  def OpenAsDocument(): Document = js.native
  def Save(): Unit = js.native
}

