package typings.activexOffice.Office

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPermission extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  var ExpirationDate: VarDate
  
  @JSName("Office.UserPermission_typekey")
  var OfficeDotUserPermission_typekey: UserPermission
  
  val Parent: js.Any
  
  var Permission: Double
  
  def Remove(): Unit
  
  val UserId: String
}
object UserPermission {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    ExpirationDate: VarDate,
    OfficeDotUserPermission_typekey: UserPermission,
    Parent: js.Any,
    Permission: Double,
    Remove: () => Unit,
    UserId: String
  ): UserPermission = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), UserId = UserId.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.UserPermission_typekey")(OfficeDotUserPermission_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPermission]
  }
  
  @scala.inline
  implicit class UserPermissionMutableBuilder[Self <: UserPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDate(value: VarDate): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotUserPermission_typekey(value: UserPermission): Self = StObject.set(x, "Office.UserPermission_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: Double): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
