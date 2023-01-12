package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveRoleFromDBInstanceMessage extends StObject {
  
  /**
    * The name of the DB instance to disassociate the IAM role from.
    */
  var DBInstanceIdentifier: String
  
  /**
    * The name of the feature for the DB instance that the IAM role is to be disassociated from. For information about supported feature names, see DBEngineVersion.
    */
  var FeatureName: String
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB instance, for example, arn:aws:iam::123456789012:role/AccessRole.
    */
  var RoleArn: String
}
object RemoveRoleFromDBInstanceMessage {
  
  inline def apply(DBInstanceIdentifier: String, FeatureName: String, RoleArn: String): RemoveRoleFromDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any], FeatureName = FeatureName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRoleFromDBInstanceMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveRoleFromDBInstanceMessage] (val x: Self) extends AnyVal {
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setFeatureName(value: String): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
