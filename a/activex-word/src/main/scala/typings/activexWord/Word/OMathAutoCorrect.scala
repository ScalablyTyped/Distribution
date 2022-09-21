package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathAutoCorrect extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val Entries: OMathAutoCorrectEntries
  
  val Functions: OMathRecognizedFunctions
  
  val Parent: Any
  
  var ReplaceText: Boolean
  
  var UseOutsideOMath: Boolean
  
  /* private */ @JSName("Word.OMathAutoCorrect_typekey")
  var WordDotOMathAutoCorrect_typekey: OMathAutoCorrect
}
object OMathAutoCorrect {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Entries: OMathAutoCorrectEntries,
    Functions: OMathRecognizedFunctions,
    Parent: Any,
    ReplaceText: Boolean,
    UseOutsideOMath: Boolean,
    WordDotOMathAutoCorrect_typekey: OMathAutoCorrect
  ): OMathAutoCorrect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Functions = Functions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReplaceText = ReplaceText.asInstanceOf[js.Any], UseOutsideOMath = UseOutsideOMath.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathAutoCorrect_typekey")(WordDotOMathAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathAutoCorrect]
  }
  
  extension [Self <: OMathAutoCorrect](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: OMathAutoCorrectEntries): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setFunctions(value: OMathRecognizedFunctions): Self = StObject.set(x, "Functions", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReplaceText(value: Boolean): Self = StObject.set(x, "ReplaceText", value.asInstanceOf[js.Any])
    
    inline def setUseOutsideOMath(value: Boolean): Self = StObject.set(x, "UseOutsideOMath", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathAutoCorrect_typekey(value: OMathAutoCorrect): Self = StObject.set(x, "Word.OMathAutoCorrect_typekey", value.asInstanceOf[js.Any])
  }
}
