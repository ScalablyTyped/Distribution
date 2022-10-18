package typings.awsSdk.clientsBackupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObjectInput extends StObject {
  
  /**
    * Backup job Id for the in-progress backup.
    */
  var BackupJobId: String
  
  /**
    * The name of the Object.
    */
  var ObjectName: String
}
object DeleteObjectInput {
  
  inline def apply(BackupJobId: String, ObjectName: String): DeleteObjectInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId.asInstanceOf[js.Any], ObjectName = ObjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectInput]
  }
  
  extension [Self <: DeleteObjectInput](x: Self) {
    
    inline def setBackupJobId(value: String): Self = StObject.set(x, "BackupJobId", value.asInstanceOf[js.Any])
    
    inline def setObjectName(value: String): Self = StObject.set(x, "ObjectName", value.asInstanceOf[js.Any])
  }
}
