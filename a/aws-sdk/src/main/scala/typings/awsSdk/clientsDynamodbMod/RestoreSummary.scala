package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreSummary extends StObject {
  
  /**
    * Point in time or source backup time.
    */
  var RestoreDateTime: js.Date
  
  /**
    * Indicates if a restore is in progress or not.
    */
  var RestoreInProgress: typings.awsSdk.clientsDynamodbMod.RestoreInProgress
  
  /**
    * The Amazon Resource Name (ARN) of the backup from which the table was restored.
    */
  var SourceBackupArn: js.UndefOr[BackupArn] = js.undefined
  
  /**
    * The ARN of the source table of the backup that is being restored.
    */
  var SourceTableArn: js.UndefOr[TableArn] = js.undefined
}
object RestoreSummary {
  
  inline def apply(RestoreDateTime: js.Date, RestoreInProgress: RestoreInProgress): RestoreSummary = {
    val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreSummary]
  }
  
  extension [Self <: RestoreSummary](x: Self) {
    
    inline def setRestoreDateTime(value: js.Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
    
    inline def setRestoreInProgress(value: RestoreInProgress): Self = StObject.set(x, "RestoreInProgress", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupArn(value: BackupArn): Self = StObject.set(x, "SourceBackupArn", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupArnUndefined: Self = StObject.set(x, "SourceBackupArn", js.undefined)
    
    inline def setSourceTableArn(value: TableArn): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
    
    inline def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
  }
}
