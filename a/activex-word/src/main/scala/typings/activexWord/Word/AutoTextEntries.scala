package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoTextEntries extends js.Object {
  
  def Add(Name: String, Range: Range): AutoTextEntry = js.native
  
  def AppendToSpike(Range: Range): AutoTextEntry = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): AutoTextEntry = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.AutoTextEntries_typekey")
  var WordDotAutoTextEntries_typekey: AutoTextEntries = js.native
}
object AutoTextEntries {
  
  @scala.inline
  def apply(
    Add: (String, Range) => AutoTextEntry,
    AppendToSpike: Range => AutoTextEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => AutoTextEntry,
    Parent: js.Any,
    WordDotAutoTextEntries_typekey: AutoTextEntries
  ): AutoTextEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AppendToSpike = js.Any.fromFunction1(AppendToSpike), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoTextEntries_typekey")(WordDotAutoTextEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoTextEntries]
  }
  
  @scala.inline
  implicit class AutoTextEntriesOps[Self <: AutoTextEntries] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (String, Range) => AutoTextEntry): Self = this.set("Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppendToSpike(value: Range => AutoTextEntry): Self = this.set("AppendToSpike", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => AutoTextEntry): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotAutoTextEntries_typekey(value: AutoTextEntries): Self = this.set("Word.AutoTextEntries_typekey", value.asInstanceOf[js.Any])
  }
}
