package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBInstanceAutomatedBackupMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the automated backups to delete, for example, arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE. This setting doesn't apply to RDS Custom.
    */
  var DBInstanceAutomatedBackupsArn: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the source DB instance, which can't be changed and which is unique to an Amazon Web Services Region.
    */
  var DbiResourceId: js.UndefOr[String] = js.undefined
}
object DeleteDBInstanceAutomatedBackupMessage {
  
  inline def apply(): DeleteDBInstanceAutomatedBackupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBInstanceAutomatedBackupMessage]
  }
  
  extension [Self <: DeleteDBInstanceAutomatedBackupMessage](x: Self) {
    
    inline def setDBInstanceAutomatedBackupsArn(value: String): Self = StObject.set(x, "DBInstanceAutomatedBackupsArn", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceAutomatedBackupsArnUndefined: Self = StObject.set(x, "DBInstanceAutomatedBackupsArn", js.undefined)
    
    inline def setDbiResourceId(value: String): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
    
    inline def setDbiResourceIdUndefined: Self = StObject.set(x, "DbiResourceId", js.undefined)
  }
}
