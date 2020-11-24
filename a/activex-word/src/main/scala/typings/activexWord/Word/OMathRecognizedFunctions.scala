package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathRecognizedFunctions extends js.Object {
  
  def Add(Name: String): OMathRecognizedFunction = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): OMathRecognizedFunction = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.OMathRecognizedFunctions_typekey")
  var WordDotOMathRecognizedFunctions_typekey: OMathRecognizedFunctions = js.native
}
object OMathRecognizedFunctions {
  
  @scala.inline
  def apply(
    Add: String => OMathRecognizedFunction,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => OMathRecognizedFunction,
    Parent: js.Any,
    WordDotOMathRecognizedFunctions_typekey: OMathRecognizedFunctions
  ): OMathRecognizedFunctions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathRecognizedFunctions_typekey")(WordDotOMathRecognizedFunctions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathRecognizedFunctions]
  }
  
  @scala.inline
  implicit class OMathRecognizedFunctionsOps[Self <: OMathRecognizedFunctions] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: String => OMathRecognizedFunction): Self = this.set("Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => OMathRecognizedFunction): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathRecognizedFunctions_typekey(value: OMathRecognizedFunctions): Self = this.set("Word.OMathRecognizedFunctions_typekey", value.asInstanceOf[js.Any])
  }
}
