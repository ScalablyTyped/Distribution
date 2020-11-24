package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comments extends js.Object {
  
  def Add(Left: Double, Top: Double, Author: String, AuthorInitials: String, Text: String): Comment = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): Comment = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Comments_typekey")
  var PowerPointDotComments_typekey: Comments = js.native
}
object Comments {
  
  @scala.inline
  def apply(
    Add: (Double, Double, String, String, String) => Comment,
    Application: Application,
    Count: Double,
    Item: Double => Comment,
    Parent: js.Any,
    PowerPointDotComments_typekey: Comments
  ): Comments = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction5(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Comments_typekey")(PowerPointDotComments_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comments]
  }
  
  @scala.inline
  implicit class CommentsOps[Self <: Comments] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (Double, Double, String, String, String) => Comment): Self = this.set("Add", js.Any.fromFunction5(value))
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Comment): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotComments_typekey(value: Comments): Self = this.set("PowerPoint.Comments_typekey", value.asInstanceOf[js.Any])
  }
}
