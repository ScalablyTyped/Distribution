package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectTemplate extends StObject {
  
  val Application: typings.activexVbide.VBIDE.Application
  
  val Parent: typings.activexVbide.VBIDE.Application
  
  /* private */ @JSName("VBIDE.ProjectTemplate_typekey")
  var VBIDEDotProjectTemplate_typekey: ProjectTemplate
}
object ProjectTemplate {
  
  inline def apply(Application: Application, Parent: Application, VBIDEDotProjectTemplate_typekey: ProjectTemplate): ProjectTemplate = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.ProjectTemplate_typekey")(VBIDEDotProjectTemplate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectTemplate] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Application): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setVBIDEDotProjectTemplate_typekey(value: ProjectTemplate): Self = StObject.set(x, "VBIDE.ProjectTemplate_typekey", value.asInstanceOf[js.Any])
  }
}
