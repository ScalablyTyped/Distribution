package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddIns extends js.Object {
  
  def Add(FileName: String): AddIn = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): AddIn = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.AddIns_typekey")
  var PowerPointDotAddIns_typekey: AddIns = js.native
  
  def Remove(Index: js.Any): Unit = js.native
}
object AddIns {
  
  @scala.inline
  def apply(
    Add: String => AddIn,
    Application: Application,
    Count: Double,
    Item: js.Any => AddIn,
    Parent: js.Any,
    PowerPointDotAddIns_typekey: AddIns,
    Remove: js.Any => Unit
  ): AddIns = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove))
    __obj.updateDynamic("PowerPoint.AddIns_typekey")(PowerPointDotAddIns_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIns]
  }
  
  @scala.inline
  implicit class AddInsOps[Self <: AddIns] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: String => AddIn): Self = this.set("Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => AddIn): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotAddIns_typekey(value: AddIns): Self = this.set("PowerPoint.AddIns_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
}
