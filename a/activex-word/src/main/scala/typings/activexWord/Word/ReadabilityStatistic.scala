package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadabilityStatistic extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Value: Double = js.native
  
  @JSName("Word.ReadabilityStatistic_typekey")
  var WordDotReadabilityStatistic_typekey: ReadabilityStatistic = js.native
}
object ReadabilityStatistic {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Name: String,
    Parent: js.Any,
    Value: Double,
    WordDotReadabilityStatistic_typekey: ReadabilityStatistic
  ): ReadabilityStatistic = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ReadabilityStatistic_typekey")(WordDotReadabilityStatistic_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadabilityStatistic]
  }
  
  @scala.inline
  implicit class ReadabilityStatisticOps[Self <: ReadabilityStatistic] (val x: Self) extends AnyVal {
    
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
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotReadabilityStatistic_typekey(value: ReadabilityStatistic): Self = this.set("Word.ReadabilityStatistic_typekey", value.asInstanceOf[js.Any])
  }
}
