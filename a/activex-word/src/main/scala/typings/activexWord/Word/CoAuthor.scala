package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoAuthor extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val EmailAddress: String = js.native
  
  val ID: String = js.native
  
  val IsMe: Boolean = js.native
  
  val Locks: CoAuthLocks = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.CoAuthor_typekey")
  var WordDotCoAuthor_typekey: CoAuthor = js.native
}
object CoAuthor {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    EmailAddress: String,
    ID: String,
    IsMe: Boolean,
    Locks: CoAuthLocks,
    Name: String,
    Parent: js.Any,
    WordDotCoAuthor_typekey: CoAuthor
  ): CoAuthor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IsMe = IsMe.asInstanceOf[js.Any], Locks = Locks.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthor_typekey")(WordDotCoAuthor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthor]
  }
  
  @scala.inline
  implicit class CoAuthorMutableBuilder[Self <: CoAuthor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMe(value: Boolean): Self = StObject.set(x, "IsMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocks(value: CoAuthLocks): Self = StObject.set(x, "Locks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCoAuthor_typekey(value: CoAuthor): Self = StObject.set(x, "Word.CoAuthor_typekey", value.asInstanceOf[js.Any])
  }
}
