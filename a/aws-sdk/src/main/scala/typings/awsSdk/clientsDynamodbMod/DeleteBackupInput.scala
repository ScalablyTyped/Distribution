package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupInput extends StObject {
  
  /**
    * The ARN associated with the backup.
    */
  var BackupArn: typings.awsSdk.clientsDynamodbMod.BackupArn
}
object DeleteBackupInput {
  
  inline def apply(BackupArn: BackupArn): DeleteBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBackupInput] (val x: Self) extends AnyVal {
    
    inline def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
  }
}
