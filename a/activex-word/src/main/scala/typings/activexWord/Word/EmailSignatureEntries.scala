package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailSignatureEntries extends StObject {
  
  def Add(Name: String, Range: Range): EmailSignatureEntry
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): EmailSignatureEntry
  
  val Parent: Any
  
  /* private */ @JSName("Word.EmailSignatureEntries_typekey")
  var WordDotEmailSignatureEntries_typekey: EmailSignatureEntries
}
object EmailSignatureEntries {
  
  inline def apply(
    Add: (String, Range) => EmailSignatureEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => EmailSignatureEntry,
    Parent: Any,
    WordDotEmailSignatureEntries_typekey: EmailSignatureEntries
  ): EmailSignatureEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EmailSignatureEntries_typekey")(WordDotEmailSignatureEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailSignatureEntries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailSignatureEntries] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (String, Range) => EmailSignatureEntry): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => EmailSignatureEntry): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotEmailSignatureEntries_typekey(value: EmailSignatureEntries): Self = StObject.set(x, "Word.EmailSignatureEntries_typekey", value.asInstanceOf[js.Any])
  }
}
