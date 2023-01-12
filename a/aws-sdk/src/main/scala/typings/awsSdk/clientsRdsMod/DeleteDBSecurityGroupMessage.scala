package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBSecurityGroupMessage extends StObject {
  
  /**
    * The name of the DB security group to delete.  You can't delete the default DB security group.  Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Must not be "Default"  
    */
  var DBSecurityGroupName: String
}
object DeleteDBSecurityGroupMessage {
  
  inline def apply(DBSecurityGroupName: String): DeleteDBSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(DBSecurityGroupName = DBSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBSecurityGroupMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDBSecurityGroupMessage] (val x: Self) extends AnyVal {
    
    inline def setDBSecurityGroupName(value: String): Self = StObject.set(x, "DBSecurityGroupName", value.asInstanceOf[js.Any])
  }
}
