package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupsRequest extends StObject {
  
  /**
    * Describes a single backup. 
    */
  var BackupId: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.BackupId] = js.undefined
  
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.MaxResults] = js.undefined
  
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.NextToken] = js.undefined
  
  /**
    * Returns backups for the server with the specified ServerName. 
    */
  var ServerName: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.ServerName] = js.undefined
}
object DescribeBackupsRequest {
  
  inline def apply(): DescribeBackupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupsRequest]
  }
  
  extension [Self <: DescribeBackupsRequest](x: Self) {
    
    inline def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "BackupId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
  }
}
