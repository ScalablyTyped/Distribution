package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBSecurityGroupMembership extends StObject {
  
  /**
    * The name of the DB security group.
    */
  var DBSecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the DB security group.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object DBSecurityGroupMembership {
  
  inline def apply(): DBSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSecurityGroupMembership]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBSecurityGroupMembership] (val x: Self) extends AnyVal {
    
    inline def setDBSecurityGroupName(value: String): Self = StObject.set(x, "DBSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupNameUndefined: Self = StObject.set(x, "DBSecurityGroupName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
