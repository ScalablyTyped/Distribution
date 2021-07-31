package typings.activexWord.Word

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var Author: String
  
  val Creator: Double
  
  val Date: VarDate
  
  def Delete(): Unit
  
  def Edit(): Unit
  
  val Index: Double
  
  var Initial: String
  
  val IsInk: Boolean
  
  val Parent: js.Any
  
  val Range: typings.activexWord.Word.Range
  
  val Reference: typings.activexWord.Word.Range
  
  val Scope: typings.activexWord.Word.Range
  
  var ShowTip: Boolean
  
  @JSName("Word.Comment_typekey")
  var WordDotComment_typekey: Comment
}
object Comment {
  
  @scala.inline
  def apply(
    Application: Application,
    Author: String,
    Creator: Double,
    Date: VarDate,
    Delete: () => Unit,
    Edit: () => Unit,
    Index: Double,
    Initial: String,
    IsInk: Boolean,
    Parent: js.Any,
    Range: Range,
    Reference: Range,
    Scope: Range,
    ShowTip: Boolean,
    WordDotComment_typekey: Comment
  ): Comment = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Edit = js.Any.fromFunction0(Edit), Index = Index.asInstanceOf[js.Any], Initial = Initial.asInstanceOf[js.Any], IsInk = IsInk.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], ShowTip = ShowTip.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Comment_typekey")(WordDotComment_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: VarDate): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEdit(value: () => Unit): Self = StObject.set(x, "Edit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial(value: String): Self = StObject.set(x, "Initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInk(value: Boolean): Self = StObject.set(x, "IsInk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: Range): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Range): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTip(value: Boolean): Self = StObject.set(x, "ShowTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotComment_typekey(value: Comment): Self = StObject.set(x, "Word.Comment_typekey", value.asInstanceOf[js.Any])
  }
}
