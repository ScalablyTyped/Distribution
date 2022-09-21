package typings.activexPowerpoint.PowerPoint

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Author: String
  
  val AuthorIndex: Double
  
  val AuthorInitials: String
  
  val DateTime: VarDate
  
  def Delete(): Unit
  
  val Left: Double
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Comment_typekey")
  var PowerPointDotComment_typekey: Comment
  
  val Text: String
  
  val Top: Double
}
object Comment {
  
  inline def apply(
    Application: Application,
    Author: String,
    AuthorIndex: Double,
    AuthorInitials: String,
    DateTime: VarDate,
    Delete: () => Unit,
    Left: Double,
    Parent: Any,
    PowerPointDotComment_typekey: Comment,
    Text: String,
    Top: Double
  ): Comment = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], AuthorIndex = AuthorIndex.asInstanceOf[js.Any], AuthorInitials = AuthorInitials.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Left = Left.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Comment_typekey")(PowerPointDotComment_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  extension [Self <: Comment](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setAuthorIndex(value: Double): Self = StObject.set(x, "AuthorIndex", value.asInstanceOf[js.Any])
    
    inline def setAuthorInitials(value: String): Self = StObject.set(x, "AuthorInitials", value.asInstanceOf[js.Any])
    
    inline def setDateTime(value: VarDate): Self = StObject.set(x, "DateTime", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotComment_typekey(value: Comment): Self = StObject.set(x, "PowerPoint.Comment_typekey", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
  }
}
