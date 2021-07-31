package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  val AllPermissions: Double
  
  @JSName("DAO.Container_typekey")
  var DAODotContainer_typekey: Container
  
  def Documents(Item: String): Document
  def Documents(Item: Double): Document
  @JSName("Documents")
  val Documents_Original: Documents
  
  var Inherit: Boolean
  
  val Name: String
  
  var Owner: String
  
  var Permissions: Double
  
  def Properties(Item: String): Property
  def Properties(Item: Double): Property
  @JSName("Properties")
  val Properties_Original: Properties
  
  var UserName: String
}
object Container {
  
  @scala.inline
  def apply(
    AllPermissions: Double,
    DAODotContainer_typekey: Container,
    Documents: Documents,
    Inherit: Boolean,
    Name: String,
    Owner: String,
    Permissions: Double,
    Properties: Properties,
    UserName: String
  ): Container = {
    val __obj = js.Dynamic.literal(AllPermissions = AllPermissions.asInstanceOf[js.Any], Documents = Documents.asInstanceOf[js.Any], Inherit = Inherit.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Container_typekey")(DAODotContainer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllPermissions(value: Double): Self = StObject.set(x, "AllPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDAODotContainer_typekey(value: Container): Self = StObject.set(x, "DAO.Container_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocuments(value: Documents): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "Inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: Double): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
