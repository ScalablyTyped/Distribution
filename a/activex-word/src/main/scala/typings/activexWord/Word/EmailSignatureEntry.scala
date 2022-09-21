package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailSignatureEntry extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Index: Double
  
  var Name: String
  
  val Parent: Any
  
  /* private */ @JSName("Word.EmailSignatureEntry_typekey")
  var WordDotEmailSignatureEntry_typekey: EmailSignatureEntry
}
object EmailSignatureEntry {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Parent: Any,
    WordDotEmailSignatureEntry_typekey: EmailSignatureEntry
  ): EmailSignatureEntry = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EmailSignatureEntry_typekey")(WordDotEmailSignatureEntry_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailSignatureEntry]
  }
  
  extension [Self <: EmailSignatureEntry](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotEmailSignatureEntry_typekey(value: EmailSignatureEntry): Self = StObject.set(x, "Word.EmailSignatureEntry_typekey", value.asInstanceOf[js.Any])
  }
}
