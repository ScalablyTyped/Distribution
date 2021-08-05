package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCorrectEntry extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  def Apply(Range: Range): Unit
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Index: Double
  
  var Name: String
  
  val Parent: js.Any
  
  val RichText: Boolean
  
  var Value: String
  
  /* private */ @JSName("Word.AutoCorrectEntry_typekey")
  var WordDotAutoCorrectEntry_typekey: AutoCorrectEntry
}
object AutoCorrectEntry {
  
  inline def apply(
    Application: Application,
    Apply: Range => Unit,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Parent: js.Any,
    RichText: Boolean,
    Value: String,
    WordDotAutoCorrectEntry_typekey: AutoCorrectEntry
  ): AutoCorrectEntry = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction1(Apply), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RichText = RichText.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCorrectEntry_typekey")(WordDotAutoCorrectEntry_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrectEntry]
  }
  
  extension [Self <: AutoCorrectEntry](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApply(value: Range => Unit): Self = StObject.set(x, "Apply", js.Any.fromFunction1(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRichText(value: Boolean): Self = StObject.set(x, "RichText", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setWordDotAutoCorrectEntry_typekey(value: AutoCorrectEntry): Self = StObject.set(x, "Word.AutoCorrectEntry_typekey", value.asInstanceOf[js.Any])
  }
}
