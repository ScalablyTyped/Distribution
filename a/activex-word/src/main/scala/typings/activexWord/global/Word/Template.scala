package typings.activexWord.global.Word

import typings.activexOffice.Office.DocumentProperties
import typings.activexOffice.Office.DocumentProperty
import typings.activexWord.Word.WdFarEastLineBreakLanguageID
import typings.activexWord.Word.WdFarEastLineBreakLevel
import typings.activexWord.Word.WdJustificationMode
import typings.activexWord.Word.WdLanguageID
import typings.activexWord.Word.WdTemplateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Template")
@js.native
/* private */ class Template ()
  extends StObject
     with typings.activexWord.Word.Template {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val AutoTextEntries: typings.activexWord.Word.AutoTextEntries = js.native
  
  /* CompleteClass */
  override val BuildingBlockEntries: typings.activexWord.Word.BuildingBlockEntries = js.native
  
  /* CompleteClass */
  override val BuildingBlockTypes: typings.activexWord.Word.BuildingBlockTypes = js.native
  
  /* CompleteClass */
  override def BuiltInDocumentProperties(index: String): DocumentProperty[typings.activexWord.Word.Application] = js.native
  /* CompleteClass */
  override def BuiltInDocumentProperties(index: Double): DocumentProperty[typings.activexWord.Word.Application] = js.native
  /* CompleteClass */
  @JSName("BuiltInDocumentProperties")
  override val BuiltInDocumentProperties_Original: DocumentProperties[typings.activexWord.Word.Application] = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def CustomDocumentProperties(index: String): DocumentProperty[typings.activexWord.Word.Application] = js.native
  /* CompleteClass */
  override def CustomDocumentProperties(index: Double): DocumentProperty[typings.activexWord.Word.Application] = js.native
  /* CompleteClass */
  @JSName("CustomDocumentProperties")
  override val CustomDocumentProperties_Original: DocumentProperties[typings.activexWord.Word.Application] = js.native
  
  /* CompleteClass */
  var FarEastLineBreakLanguage: WdFarEastLineBreakLanguageID = js.native
  
  /* CompleteClass */
  var FarEastLineBreakLevel: WdFarEastLineBreakLevel = js.native
  
  /* CompleteClass */
  override val FullName: String = js.native
  
  /* CompleteClass */
  var JustificationMode: WdJustificationMode = js.native
  
  /* CompleteClass */
  var KerningByAlgorithm: Boolean = js.native
  
  /* CompleteClass */
  var LanguageID: WdLanguageID = js.native
  
  /* CompleteClass */
  var LanguageIDFarEast: WdLanguageID = js.native
  
  /* CompleteClass */
  override val ListTemplates: typings.activexWord.Word.ListTemplates = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  var NoLineBreakAfter: String = js.native
  
  /* CompleteClass */
  var NoLineBreakBefore: String = js.native
  
  /* CompleteClass */
  var NoProofing: Double = js.native
  
  /* CompleteClass */
  override def OpenAsDocument(): typings.activexWord.Word.Document = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val Path: String = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  var Saved: Boolean = js.native
  
  /* CompleteClass */
  override val Type: WdTemplateType = js.native
  
  /* CompleteClass */
  override val VBProject: typings.activexVbide.VBIDE.VBProject = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.Template_typekey")
  var WordDotTemplate_typekey: typings.activexWord.Word.Template = js.native
}
