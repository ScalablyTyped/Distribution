package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupJobInput extends StObject {
  
  /**
    * Uniquely identifies a request to AWS Backup to back up a resource.
    */
  var BackupJobId: String
}
object DescribeBackupJobInput {
  
  inline def apply(BackupJobId: String): DescribeBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupJobInput]
  }
  
  extension [Self <: DescribeBackupJobInput](x: Self) {
    
    inline def setBackupJobId(value: String): Self = StObject.set(x, "BackupJobId", value.asInstanceOf[js.Any])
  }
}
