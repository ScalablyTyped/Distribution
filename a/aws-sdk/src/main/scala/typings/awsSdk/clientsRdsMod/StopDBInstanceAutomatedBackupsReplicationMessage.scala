package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDBInstanceAutomatedBackupsReplicationMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source DB instance for which to stop replicating automate backups, for example, arn:aws:rds:us-west-2:123456789012:db:mydatabase.
    */
  var SourceDBInstanceArn: String
}
object StopDBInstanceAutomatedBackupsReplicationMessage {
  
  inline def apply(SourceDBInstanceArn: String): StopDBInstanceAutomatedBackupsReplicationMessage = {
    val __obj = js.Dynamic.literal(SourceDBInstanceArn = SourceDBInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDBInstanceAutomatedBackupsReplicationMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopDBInstanceAutomatedBackupsReplicationMessage] (val x: Self) extends AnyVal {
    
    inline def setSourceDBInstanceArn(value: String): Self = StObject.set(x, "SourceDBInstanceArn", value.asInstanceOf[js.Any])
  }
}
