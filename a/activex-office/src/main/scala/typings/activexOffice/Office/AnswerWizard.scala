package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerWizard extends StObject {
  
  val Application: Any
  
  def ClearFileList(): Unit
  
  val Creator: Double
  
  def Files(Index: Double): String
  @JSName("Files")
  val Files_Original: AnswerWizardFiles
  
  /* private */ @JSName("Office.AnswerWizard_typekey")
  var OfficeDotAnswerWizard_typekey: AnswerWizard
  
  val Parent: Any
  
  def ResetFileList(): Unit
}
object AnswerWizard {
  
  inline def apply(
    Application: Any,
    ClearFileList: () => Unit,
    Creator: Double,
    Files: AnswerWizardFiles,
    OfficeDotAnswerWizard_typekey: AnswerWizard,
    Parent: Any,
    ResetFileList: () => Unit
  ): AnswerWizard = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearFileList = js.Any.fromFunction0(ClearFileList), Creator = Creator.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ResetFileList = js.Any.fromFunction0(ResetFileList))
    __obj.updateDynamic("Office.AnswerWizard_typekey")(OfficeDotAnswerWizard_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnswerWizard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnswerWizard] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClearFileList(value: () => Unit): Self = StObject.set(x, "ClearFileList", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: AnswerWizardFiles): Self = StObject.set(x, "Files", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotAnswerWizard_typekey(value: AnswerWizard): Self = StObject.set(x, "Office.AnswerWizard_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setResetFileList(value: () => Unit): Self = StObject.set(x, "ResetFileList", js.Any.fromFunction0(value))
  }
}
