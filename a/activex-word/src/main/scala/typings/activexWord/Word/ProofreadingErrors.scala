package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProofreadingErrors extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): Range
  
  val Parent: Any
  
  val Type: WdProofreadingErrorType
  
  /* private */ @JSName("Word.ProofreadingErrors_typekey")
  var WordDotProofreadingErrors_typekey: ProofreadingErrors
}
object ProofreadingErrors {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Range,
    Parent: Any,
    Type: WdProofreadingErrorType,
    WordDotProofreadingErrors_typekey: ProofreadingErrors
  ): ProofreadingErrors = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ProofreadingErrors_typekey")(WordDotProofreadingErrors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofreadingErrors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProofreadingErrors] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => Range): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdProofreadingErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWordDotProofreadingErrors_typekey(value: ProofreadingErrors): Self = StObject.set(x, "Word.ProofreadingErrors_typekey", value.asInstanceOf[js.Any])
  }
}
