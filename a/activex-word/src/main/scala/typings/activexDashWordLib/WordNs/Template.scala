package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Template")
@js.native
class Template protected () extends js.Object {
  val Application: Application = js.native
  val AutoTextEntries: AutoTextEntries = js.native
  val BuildingBlockEntries: BuildingBlockEntries = js.native
  val BuildingBlockTypes: BuildingBlockTypes = js.native
  @JSName("BuiltInDocumentProperties")
  val BuiltInDocumentProperties_Original: activexDashOfficeLib.OfficeNs.DocumentProperties[Application] = js.native
  val Creator: scala.Double = js.native
  @JSName("CustomDocumentProperties")
  val CustomDocumentProperties_Original: activexDashOfficeLib.OfficeNs.DocumentProperties[Application] = js.native
  var FarEastLineBreakLanguage: WdFarEastLineBreakLanguageID = js.native
  var FarEastLineBreakLevel: WdFarEastLineBreakLevel = js.native
  val FullName: java.lang.String = js.native
  var JustificationMode: WdJustificationMode = js.native
  var KerningByAlgorithm: scala.Boolean = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  val ListTemplates: ListTemplates = js.native
  val Name: java.lang.String = js.native
  var NoLineBreakAfter: java.lang.String = js.native
  var NoLineBreakBefore: java.lang.String = js.native
  var NoProofing: scala.Double = js.native
  val Parent: js.Any = js.native
  val Path: java.lang.String = js.native
  var Saved: scala.Boolean = js.native
  val Type: WdTemplateType = js.native
  val VBProject: activexDashVbideLib.VBIDENs.VBProject = js.native
  var `Word.Template_typekey`: Template = js.native
  def BuiltInDocumentProperties(index: java.lang.String): activexDashOfficeLib.OfficeNs.DocumentProperty[Application] = js.native
  def BuiltInDocumentProperties(index: scala.Double): activexDashOfficeLib.OfficeNs.DocumentProperty[Application] = js.native
  def CustomDocumentProperties(index: java.lang.String): activexDashOfficeLib.OfficeNs.DocumentProperty[Application] = js.native
  def CustomDocumentProperties(index: scala.Double): activexDashOfficeLib.OfficeNs.DocumentProperty[Application] = js.native
  def OpenAsDocument(): Document = js.native
  def Save(): scala.Unit = js.native
}

