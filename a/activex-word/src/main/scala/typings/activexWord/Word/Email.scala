package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Email extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val CurrentEmailAuthor: EmailAuthor = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.Email_typekey")
  var WordDotEmail_typekey: Email = js.native
}
object Email {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    CurrentEmailAuthor: EmailAuthor,
    Parent: js.Any,
    WordDotEmail_typekey: Email
  ): Email = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CurrentEmailAuthor = CurrentEmailAuthor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Email_typekey")(WordDotEmail_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentEmailAuthor(value: EmailAuthor): Self = StObject.set(x, "CurrentEmailAuthor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotEmail_typekey(value: Email): Self = StObject.set(x, "Word.Email_typekey", value.asInstanceOf[js.Any])
  }
}
