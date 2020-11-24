package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProofreadingErrors extends js.Object {
  
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
  implicit class ProofreadingErrorsOps[Self <: ProofreadingErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Range): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdProofreadingErrorType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotProofreadingErrors_typekey(value: ProofreadingErrors): Self = this.set("Word.ProofreadingErrors_typekey", value.asInstanceOf[js.Any])
  }
}
