package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreServerRequest extends StObject {
  
  /**
    *  The ID of the backup that you want to use to restore a server. 
    */
  var BackupId: typings.awsSdk.clientsOpsworkscmMod.BackupId
  
  /**
    *  The type of instance to restore. Valid values must be specified in the following format: ^([cm][34]|t2).* For example, m5.large. Valid values are m5.large, r5.xlarge, and r5.2xlarge. If you do not specify this parameter, RestoreServer uses the instance type from the specified backup. 
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    *  The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has the SSH key. 
    */
  var KeyPair: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.KeyPair] = js.undefined
  
  /**
    *  The name of the server that you want to restore. 
    */
  var ServerName: typings.awsSdk.clientsOpsworkscmMod.ServerName
}
object RestoreServerRequest {
  
  inline def apply(BackupId: BackupId, ServerName: ServerName): RestoreServerRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreServerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreServerRequest] (val x: Self) extends AnyVal {
    
    inline def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKeyPair(value: KeyPair): Self = StObject.set(x, "KeyPair", value.asInstanceOf[js.Any])
    
    inline def setKeyPairUndefined: Self = StObject.set(x, "KeyPair", js.undefined)
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
