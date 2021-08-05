package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedWorkspaceMember extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  def Delete(): Unit
  
  val DomainName: String
  
  val Email: String
  
  val Id: String
  
  val Name: String
  
  /* private */ @JSName("Office.SharedWorkspaceMember_typekey")
  var OfficeDotSharedWorkspaceMember_typekey: SharedWorkspaceMember
  
  val Parent: js.Any
}
object SharedWorkspaceMember {
  
  inline def apply(
    Application: js.Any,
    Creator: Double,
    Delete: () => Unit,
    DomainName: String,
    Email: String,
    Id: String,
    Name: String,
    OfficeDotSharedWorkspaceMember_typekey: SharedWorkspaceMember,
    Parent: js.Any
  ): SharedWorkspaceMember = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DomainName = DomainName.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SharedWorkspaceMember_typekey")(OfficeDotSharedWorkspaceMember_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkspaceMember]
  }
  
  extension [Self <: SharedWorkspaceMember](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSharedWorkspaceMember_typekey(value: SharedWorkspaceMember): Self = StObject.set(x, "Office.SharedWorkspaceMember_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
