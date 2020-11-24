package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tags extends js.Object {
  
  def Add(Name: String, Value: String): Unit = js.native
  
  def AddBinary(Name: String, FilePath: String): Unit = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  def BinaryValue(Name: String): Double = js.native
  
  val Count: Double = js.native
  
  def Delete(Name: String): Unit = js.native
  
  def Item(Name: String): String = js.native
  
  def Name(Index: Double): String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Tags_typekey")
  var PowerPointDotTags_typekey: Tags = js.native
  
  def Value(Index: Double): String = js.native
}
object Tags {
  
  @scala.inline
  def apply(
    Add: (String, String) => Unit,
    AddBinary: (String, String) => Unit,
    Application: Application,
    BinaryValue: String => Double,
    Count: Double,
    Delete: String => Unit,
    Item: String => String,
    Name: Double => String,
    Parent: js.Any,
    PowerPointDotTags_typekey: Tags,
    Value: Double => String
  ): Tags = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AddBinary = js.Any.fromFunction2(AddBinary), Application = Application.asInstanceOf[js.Any], BinaryValue = js.Any.fromFunction1(BinaryValue), Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction1(Delete), Item = js.Any.fromFunction1(Item), Name = js.Any.fromFunction1(Name), Parent = Parent.asInstanceOf[js.Any], Value = js.Any.fromFunction1(Value))
    __obj.updateDynamic("PowerPoint.Tags_typekey")(PowerPointDotTags_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
  
  @scala.inline
  implicit class TagsOps[Self <: Tags] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (String, String) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddBinary(value: (String, String) => Unit): Self = this.set("AddBinary", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryValue(value: String => Double): Self = this.set("BinaryValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: String => Unit): Self = this.set("Delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: String => String): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: Double => String): Self = this.set("Name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTags_typekey(value: Tags): Self = this.set("PowerPoint.Tags_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double => String): Self = this.set("Value", js.Any.fromFunction1(value))
  }
}
