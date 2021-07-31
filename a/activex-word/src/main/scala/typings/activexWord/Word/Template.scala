package typings.activexWord.Word

import typings.activexOffice.Office.DocumentProperties
import typings.activexOffice.Office.DocumentProperty
import typings.activexVbide.VBIDE.VBProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Template extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val AutoTextEntries: typings.activexWord.Word.AutoTextEntries
  
  val BuildingBlockEntries: typings.activexWord.Word.BuildingBlockEntries
  
  val BuildingBlockTypes: typings.activexWord.Word.BuildingBlockTypes
  
  def BuiltInDocumentProperties(index: String): DocumentProperty[typings.activexWord.Word.Application]
  def BuiltInDocumentProperties(index: Double): DocumentProperty[typings.activexWord.Word.Application]
  @JSName("BuiltInDocumentProperties")
  val BuiltInDocumentProperties_Original: DocumentProperties[typings.activexWord.Word.Application]
  
  val Creator: Double
  
  def CustomDocumentProperties(index: String): DocumentProperty[typings.activexWord.Word.Application]
  def CustomDocumentProperties(index: Double): DocumentProperty[typings.activexWord.Word.Application]
  @JSName("CustomDocumentProperties")
  val CustomDocumentProperties_Original: DocumentProperties[typings.activexWord.Word.Application]
  
  var FarEastLineBreakLanguage: WdFarEastLineBreakLanguageID
  
  var FarEastLineBreakLevel: WdFarEastLineBreakLevel
  
  val FullName: String
  
  var JustificationMode: WdJustificationMode
  
  var KerningByAlgorithm: Boolean
  
  var LanguageID: WdLanguageID
  
  var LanguageIDFarEast: WdLanguageID
  
  val ListTemplates: typings.activexWord.Word.ListTemplates
  
  val Name: String
  
  var NoLineBreakAfter: String
  
  var NoLineBreakBefore: String
  
  var NoProofing: Double
  
  def OpenAsDocument(): Document
  
  val Parent: js.Any
  
  val Path: String
  
  def Save(): Unit
  
  var Saved: Boolean
  
  val Type: WdTemplateType
  
  val VBProject: typings.activexVbide.VBIDE.VBProject
  
  @JSName("Word.Template_typekey")
  var WordDotTemplate_typekey: Template
}
object Template {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoTextEntries: AutoTextEntries,
    BuildingBlockEntries: BuildingBlockEntries,
    BuildingBlockTypes: BuildingBlockTypes,
    BuiltInDocumentProperties: DocumentProperties[Application],
    Creator: Double,
    CustomDocumentProperties: DocumentProperties[Application],
    FarEastLineBreakLanguage: WdFarEastLineBreakLanguageID,
    FarEastLineBreakLevel: WdFarEastLineBreakLevel,
    FullName: String,
    JustificationMode: WdJustificationMode,
    KerningByAlgorithm: Boolean,
    LanguageID: WdLanguageID,
    LanguageIDFarEast: WdLanguageID,
    ListTemplates: ListTemplates,
    Name: String,
    NoLineBreakAfter: String,
    NoLineBreakBefore: String,
    NoProofing: Double,
    OpenAsDocument: () => Document,
    Parent: js.Any,
    Path: String,
    Save: () => Unit,
    Saved: Boolean,
    Type: WdTemplateType,
    VBProject: VBProject,
    WordDotTemplate_typekey: Template
  ): Template = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoTextEntries = AutoTextEntries.asInstanceOf[js.Any], BuildingBlockEntries = BuildingBlockEntries.asInstanceOf[js.Any], BuildingBlockTypes = BuildingBlockTypes.asInstanceOf[js.Any], BuiltInDocumentProperties = BuiltInDocumentProperties.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CustomDocumentProperties = CustomDocumentProperties.asInstanceOf[js.Any], FarEastLineBreakLanguage = FarEastLineBreakLanguage.asInstanceOf[js.Any], FarEastLineBreakLevel = FarEastLineBreakLevel.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], JustificationMode = JustificationMode.asInstanceOf[js.Any], KerningByAlgorithm = KerningByAlgorithm.asInstanceOf[js.Any], LanguageID = LanguageID.asInstanceOf[js.Any], LanguageIDFarEast = LanguageIDFarEast.asInstanceOf[js.Any], ListTemplates = ListTemplates.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NoLineBreakAfter = NoLineBreakAfter.asInstanceOf[js.Any], NoLineBreakBefore = NoLineBreakBefore.asInstanceOf[js.Any], NoProofing = NoProofing.asInstanceOf[js.Any], OpenAsDocument = js.Any.fromFunction0(OpenAsDocument), Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), Saved = Saved.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], VBProject = VBProject.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Template_typekey")(WordDotTemplate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  
  @scala.inline
  implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTextEntries(value: AutoTextEntries): Self = StObject.set(x, "AutoTextEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildingBlockEntries(value: BuildingBlockEntries): Self = StObject.set(x, "BuildingBlockEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildingBlockTypes(value: BuildingBlockTypes): Self = StObject.set(x, "BuildingBlockTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInDocumentProperties(value: DocumentProperties[Application]): Self = StObject.set(x, "BuiltInDocumentProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDocumentProperties(value: DocumentProperties[Application]): Self = StObject.set(x, "CustomDocumentProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarEastLineBreakLanguage(value: WdFarEastLineBreakLanguageID): Self = StObject.set(x, "FarEastLineBreakLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarEastLineBreakLevel(value: WdFarEastLineBreakLevel): Self = StObject.set(x, "FarEastLineBreakLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustificationMode(value: WdJustificationMode): Self = StObject.set(x, "JustificationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerningByAlgorithm(value: Boolean): Self = StObject.set(x, "KerningByAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageID(value: WdLanguageID): Self = StObject.set(x, "LanguageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageIDFarEast(value: WdLanguageID): Self = StObject.set(x, "LanguageIDFarEast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTemplates(value: ListTemplates): Self = StObject.set(x, "ListTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLineBreakAfter(value: String): Self = StObject.set(x, "NoLineBreakAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLineBreakBefore(value: String): Self = StObject.set(x, "NoLineBreakBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoProofing(value: Double): Self = StObject.set(x, "NoProofing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenAsDocument(value: () => Document): Self = StObject.set(x, "OpenAsDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaved(value: Boolean): Self = StObject.set(x, "Saved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdTemplateType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVBProject(value: VBProject): Self = StObject.set(x, "VBProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTemplate_typekey(value: Template): Self = StObject.set(x, "Word.Template_typekey", value.asInstanceOf[js.Any])
  }
}
