package typings.activexPowerpoint.PowerPoint

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Author: String = js.native
  
  val AuthorIndex: Double = js.native
  
  val AuthorInitials: String = js.native
  
  val DateTime: VarDate = js.native
  
  def Delete(): Unit = js.native
  
  val Left: Double = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Comment_typekey")
  var PowerPointDotComment_typekey: Comment = js.native
  
  val Text: String = js.native
  
  val Top: Double = js.native
}
object Comment {
  
  @scala.inline
  def apply(
    Application: Application,
    Author: String,
    AuthorIndex: Double,
    AuthorInitials: String,
    DateTime: VarDate,
    Delete: () => Unit,
    Left: Double,
    Parent: js.Any,
    PowerPointDotComment_typekey: Comment,
    Text: String,
    Top: Double
  ): Comment = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], AuthorIndex = AuthorIndex.asInstanceOf[js.Any], AuthorInitials = AuthorInitials.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Left = Left.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Comment_typekey")(PowerPointDotComment_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: String): Self = this.set("Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorIndex(value: Double): Self = this.set("AuthorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorInitials(value: String): Self = this.set("AuthorInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTime(value: VarDate): Self = this.set("DateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotComment_typekey(value: Comment): Self = this.set("PowerPoint.Comment_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
  }
}
