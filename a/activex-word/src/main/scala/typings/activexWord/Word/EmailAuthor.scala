package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailAuthor extends js.Object {
  
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
  implicit class EmailAuthorOps[Self <: EmailAuthor] (val x: Self) extends AnyVal {
    
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
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Style): Self = this.set("Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotEmailAuthor_typekey(value: EmailAuthor): Self = this.set("Word.EmailAuthor_typekey", value.asInstanceOf[js.Any])
  }
}
