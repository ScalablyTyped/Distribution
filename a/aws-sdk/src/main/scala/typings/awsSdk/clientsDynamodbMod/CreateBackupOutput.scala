package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupOutput extends StObject {
  
  /**
    * Contains the details of the backup created for the table.
    */
  var BackupDetails: js.UndefOr[typings.awsSdk.clientsDynamodbMod.BackupDetails] = js.undefined
}
object CreateBackupOutput {
  
  inline def apply(): CreateBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBackupOutput] (val x: Self) extends AnyVal {
    
    inline def setBackupDetails(value: BackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
    
    inline def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
  }
}
