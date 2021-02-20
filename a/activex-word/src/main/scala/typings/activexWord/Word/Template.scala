package typings.activexWord.Word

import typings.activexOffice.Office.DocumentProperties
import typings.activexOffice.Office.DocumentProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Template extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val AutoTextEntries: typings.activexWord.Word.AutoTextEntries = js.native
  
  val BuildingBlockEntries: typings.activexWord.Word.BuildingBlockEntries = js.native
  
  val BuildingBlockTypes: typings.activexWord.Word.BuildingBlockTypes = js.native
  
  def BuiltInDocumentProperties(index: String): DocumentProperty[typings.activexWord.Word.Application] = js.native
  def BuiltInDocumentProperties(index: Double): DocumentProperty[typings.activexWord.Word.Application] = js.native
  @JSName("BuiltInDocumentProperties")
  val BuiltInDocumentProperties_Original: DocumentProperties[typings.activexWord.Word.Application] = js.native
  
  val Creator: Double = js.native
  
  def CustomDocumentProperties(index: String): DocumentProperty[typings.activexWord.Word.Application] = js.native
  def CustomDocumentProperties(index: Double): DocumentProperty[typings.activexWord.Word.Application] = js.native
  @JSName("CustomDocumentProperties")
  val CustomDocumentProperties_Original: DocumentProperties[typings.activexWord.Word.Application] = js.native
  
  var FarEastLineBreakLanguage: WdFarEastLineBreakLanguageID = js.native
  
  var FarEastLineBreakLevel: WdFarEastLineBreakLevel = js.native
  
  val FullName: String = js.native
  
  var JustificationMode: WdJustificationMode = js.native
  
  var KerningByAlgorithm: Boolean = js.native
  
  var LanguageID: WdLanguageID = js.native
  
  var LanguageIDFarEast: WdLanguageID = js.native
  
  val ListTemplates: typings.activexWord.Word.ListTemplates = js.native
  
  val Name: String = js.native
  
  var NoLineBreakAfter: String = js.native
  
  var NoLineBreakBefore: String = js.native
  
  var NoProofing: Double = js.native
  
  def OpenAsDocument(): Document = js.native
  
  val Parent: js.Any = js.native
  
  val Path: String = js.native
  
  def Save(): Unit = js.native
  
  var Saved: Boolean = js.native
  
  val Type: WdTemplateType = js.native
  
  val VBProject: typings.activexVbide.VBIDE.VBProject = js.native
  
  @JSName("Word.Template_typekey")
  var WordDotTemplate_typekey: Template = js.native
}
