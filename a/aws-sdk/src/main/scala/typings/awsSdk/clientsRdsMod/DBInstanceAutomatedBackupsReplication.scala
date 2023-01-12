package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBInstanceAutomatedBackupsReplication extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replicated automated backups.
    */
  var DBInstanceAutomatedBackupsArn: js.UndefOr[String] = js.undefined
}
object DBInstanceAutomatedBackupsReplication {
  
  inline def apply(): DBInstanceAutomatedBackupsReplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceAutomatedBackupsReplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBInstanceAutomatedBackupsReplication] (val x: Self) extends AnyVal {
    
    inline def setDBInstanceAutomatedBackupsArn(value: String): Self = StObject.set(x, "DBInstanceAutomatedBackupsArn", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceAutomatedBackupsArnUndefined: Self = StObject.set(x, "DBInstanceAutomatedBackupsArn", js.undefined)
  }
}
