package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowTemplate extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  val Description: String
  
  val DocumentLibraryName: String
  
  val DocumentLibraryURL: String
  
  val Id: String
  
  val Name: String
  
  /* private */ @JSName("Office.WorkflowTemplate_typekey")
  var OfficeDotWorkflowTemplate_typekey: WorkflowTemplate
  
  def Show(): Double
}
object WorkflowTemplate {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Description: String,
    DocumentLibraryName: String,
    DocumentLibraryURL: String,
    Id: String,
    Name: String,
    OfficeDotWorkflowTemplate_typekey: WorkflowTemplate,
    Show: () => Double
  ): WorkflowTemplate = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DocumentLibraryName = DocumentLibraryName.asInstanceOf[js.Any], DocumentLibraryURL = DocumentLibraryURL.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Show = js.Any.fromFunction0(Show))
    __obj.updateDynamic("Office.WorkflowTemplate_typekey")(OfficeDotWorkflowTemplate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowTemplate] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDocumentLibraryName(value: String): Self = StObject.set(x, "DocumentLibraryName", value.asInstanceOf[js.Any])
    
    inline def setDocumentLibraryURL(value: String): Self = StObject.set(x, "DocumentLibraryURL", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotWorkflowTemplate_typekey(value: WorkflowTemplate): Self = StObject.set(x, "Office.WorkflowTemplate_typekey", value.asInstanceOf[js.Any])
    
    inline def setShow(value: () => Double): Self = StObject.set(x, "Show", js.Any.fromFunction0(value))
  }
}
