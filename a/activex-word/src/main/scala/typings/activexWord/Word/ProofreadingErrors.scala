package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProofreadingErrors extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Range = js.native
  
  val Parent: js.Any = js.native
  
  val Type: WdProofreadingErrorType = js.native
  
  @JSName("Word.ProofreadingErrors_typekey")
  var WordDotProofreadingErrors_typekey: ProofreadingErrors = js.native
}
object ProofreadingErrors {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Range,
    Parent: js.Any,
    Type: WdProofreadingErrorType,
    WordDotProofreadingErrors_typekey: ProofreadingErrors
  ): ProofreadingErrors = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ProofreadingErrors_typekey")(WordDotProofreadingErrors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofreadingErrors]
  }
  
  @scala.inline
  implicit class ProofreadingErrorsMutableBuilder[Self <: ProofreadingErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Range): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdProofreadingErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotProofreadingErrors_typekey(value: ProofreadingErrors): Self = StObject.set(x, "Word.ProofreadingErrors_typekey", value.asInstanceOf[js.Any])
  }
}
