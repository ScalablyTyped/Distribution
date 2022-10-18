package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupOutput extends StObject {
  
  /**
    * Contains the description of the backup created for the table.
    */
  var BackupDescription: js.UndefOr[typings.awsSdk.clientsDynamodbMod.BackupDescription] = js.undefined
}
object DescribeBackupOutput {
  
  inline def apply(): DescribeBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupOutput]
  }
  
  extension [Self <: DescribeBackupOutput](x: Self) {
    
    inline def setBackupDescription(value: BackupDescription): Self = StObject.set(x, "BackupDescription", value.asInstanceOf[js.Any])
    
    inline def setBackupDescriptionUndefined: Self = StObject.set(x, "BackupDescription", js.undefined)
  }
}
