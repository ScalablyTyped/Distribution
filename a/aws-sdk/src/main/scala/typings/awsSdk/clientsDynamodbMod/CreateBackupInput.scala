package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupInput extends StObject {
  
  /**
    * Specified name for the backup.
    */
  var BackupName: typings.awsSdk.clientsDynamodbMod.BackupName
  
  /**
    * The name of the table.
    */
  var TableName: typings.awsSdk.clientsDynamodbMod.TableName
}
object CreateBackupInput {
  
  inline def apply(BackupName: BackupName, TableName: TableName): CreateBackupInput = {
    val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupInput]
  }
  
  extension [Self <: CreateBackupInput](x: Self) {
    
    inline def setBackupName(value: BackupName): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
