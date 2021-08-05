package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoAuthor extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val EmailAddress: String
  
  val ID: String
  
  val IsMe: Boolean
  
  val Locks: CoAuthLocks
  
  val Name: String
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.CoAuthor_typekey")
  var WordDotCoAuthor_typekey: CoAuthor
}
object CoAuthor {
  
  inline def apply(
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
  
  extension [Self <: CoAuthor](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIsMe(value: Boolean): Self = StObject.set(x, "IsMe", value.asInstanceOf[js.Any])
    
    inline def setLocks(value: CoAuthLocks): Self = StObject.set(x, "Locks", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotCoAuthor_typekey(value: CoAuthor): Self = StObject.set(x, "Word.CoAuthor_typekey", value.asInstanceOf[js.Any])
  }
}
