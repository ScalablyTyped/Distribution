package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailAuthor extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Parent: js.Any = js.native
  
  val Style: typings.activexWord.Word.Style = js.native
  
  @JSName("Word.EmailAuthor_typekey")
  var WordDotEmailAuthor_typekey: EmailAuthor = js.native
}
object EmailAuthor {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    Style: Style,
    WordDotEmailAuthor_typekey: EmailAuthor
  ): EmailAuthor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EmailAuthor_typekey")(WordDotEmailAuthor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAuthor]
  }
  
  @scala.inline
  implicit class EmailAuthorMutableBuilder[Self <: EmailAuthor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Style): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotEmailAuthor_typekey(value: EmailAuthor): Self = StObject.set(x, "Word.EmailAuthor_typekey", value.asInstanceOf[js.Any])
  }
}
