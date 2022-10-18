package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) associated with the backup.
    */
  var BackupArn: typings.awsSdk.clientsDynamodbMod.BackupArn
}
object DescribeBackupInput {
  
  inline def apply(BackupArn: BackupArn): DescribeBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupInput]
  }
  
  extension [Self <: DescribeBackupInput](x: Self) {
    
    inline def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
  }
}
