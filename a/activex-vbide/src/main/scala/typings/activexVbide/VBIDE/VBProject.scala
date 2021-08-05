package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VBProject extends StObject {
  
  val Application: typings.activexVbide.VBIDE.Application
  
  var BuildFileName: String
  
  def Collection(index: js.Any): VBProject
  @JSName("Collection")
  val Collection_Original: VBProjects
  
  var Description: String
  
  val FileName: String
  
  var HelpContextID: Double
  
  var HelpFile: String
  
  def MakeCompiledFile(): Unit
  
  val Mode: vbextVBAMode
  
  var Name: String
  
  val Parent: typings.activexVbide.VBIDE.Application
  
  val Protection: vbextProjectProtection
  
  def References(index: js.Any): Reference
  @JSName("References")
  val References_Original: References
  
  def SaveAs(FileName: String): Unit
  
  val Saved: Boolean
  
  val Type: vbextProjectType
  
  def VBComponents(index: js.Any): VBComponent
  @JSName("VBComponents")
  val VBComponents_Original: VBComponents
  
  val VBE: typings.activexVbide.VBIDE.VBE
  
  /* private */ @JSName("VBIDE.VBProject_typekey")
  var VBIDEDotVBProject_typekey: VBProject
}
object VBProject {
  
  inline def apply(
    Application: Application,
    BuildFileName: String,
    Collection: VBProjects,
    Description: String,
    FileName: String,
    HelpContextID: Double,
    HelpFile: String,
    MakeCompiledFile: () => Unit,
    Mode: vbextVBAMode,
    Name: String,
    Parent: Application,
    Protection: vbextProjectProtection,
    References: References,
    SaveAs: String => Unit,
    Saved: Boolean,
    Type: vbextProjectType,
    VBComponents: VBComponents,
    VBE: VBE,
    VBIDEDotVBProject_typekey: VBProject
  ): VBProject = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuildFileName = BuildFileName.asInstanceOf[js.Any], Collection = Collection.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], HelpContextID = HelpContextID.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], MakeCompiledFile = js.Any.fromFunction0(MakeCompiledFile), Mode = Mode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Protection = Protection.asInstanceOf[js.Any], References = References.asInstanceOf[js.Any], SaveAs = js.Any.fromFunction1(SaveAs), Saved = Saved.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], VBComponents = VBComponents.asInstanceOf[js.Any], VBE = VBE.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.VBProject_typekey")(VBIDEDotVBProject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VBProject]
  }
  
  extension [Self <: VBProject](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBuildFileName(value: String): Self = StObject.set(x, "BuildFileName", value.asInstanceOf[js.Any])
    
    inline def setCollection(value: VBProjects): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    inline def setHelpContextID(value: Double): Self = StObject.set(x, "HelpContextID", value.asInstanceOf[js.Any])
    
    inline def setHelpFile(value: String): Self = StObject.set(x, "HelpFile", value.asInstanceOf[js.Any])
    
    inline def setMakeCompiledFile(value: () => Unit): Self = StObject.set(x, "MakeCompiledFile", js.Any.fromFunction0(value))
    
    inline def setMode(value: vbextVBAMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Application): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setProtection(value: vbextProjectProtection): Self = StObject.set(x, "Protection", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: References): Self = StObject.set(x, "References", value.asInstanceOf[js.Any])
    
    inline def setSaveAs(value: String => Unit): Self = StObject.set(x, "SaveAs", js.Any.fromFunction1(value))
    
    inline def setSaved(value: Boolean): Self = StObject.set(x, "Saved", value.asInstanceOf[js.Any])
    
    inline def setType(value: vbextProjectType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVBComponents(value: VBComponents): Self = StObject.set(x, "VBComponents", value.asInstanceOf[js.Any])
    
    inline def setVBE(value: VBE): Self = StObject.set(x, "VBE", value.asInstanceOf[js.Any])
    
    inline def setVBIDEDotVBProject_typekey(value: VBProject): Self = StObject.set(x, "VBIDE.VBProject_typekey", value.asInstanceOf[js.Any])
  }
}
