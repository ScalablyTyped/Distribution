package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentInspector extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  val Description: String
  
  def Fix(Status: MsoDocInspectorStatus, Results: String): Unit
  
  def Inspect(Status: MsoDocInspectorStatus, Results: String): Unit
  
  val Name: String
  
  /* private */ @JSName("Office.DocumentInspector_typekey")
  var OfficeDotDocumentInspector_typekey: DocumentInspector
  
  val Parent: Any
}
object DocumentInspector {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Description: String,
    Fix: (MsoDocInspectorStatus, String) => Unit,
    Inspect: (MsoDocInspectorStatus, String) => Unit,
    Name: String,
    OfficeDotDocumentInspector_typekey: DocumentInspector,
    Parent: Any
  ): DocumentInspector = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Fix = js.Any.fromFunction2(Fix), Inspect = js.Any.fromFunction2(Inspect), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.DocumentInspector_typekey")(OfficeDotDocumentInspector_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentInspector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentInspector] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setFix(value: (MsoDocInspectorStatus, String) => Unit): Self = StObject.set(x, "Fix", js.Any.fromFunction2(value))
    
    inline def setInspect(value: (MsoDocInspectorStatus, String) => Unit): Self = StObject.set(x, "Inspect", js.Any.fromFunction2(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotDocumentInspector_typekey(value: DocumentInspector): Self = StObject.set(x, "Office.DocumentInspector_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
