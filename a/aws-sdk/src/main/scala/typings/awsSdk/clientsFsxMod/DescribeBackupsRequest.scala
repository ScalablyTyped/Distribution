package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupsRequest extends StObject {
  
  /**
    * The IDs of the backups that you want to retrieve. This parameter value overrides any filters. If any IDs aren't found, a BackupNotFound error occurs.
    */
  var BackupIds: js.UndefOr[typings.awsSdk.clientsFsxMod.BackupIds] = js.undefined
  
  /**
    * The filters structure. The supported names are file-system-id, backup-type, file-system-type, and volume-id.
    */
  var Filters: js.UndefOr[typings.awsSdk.clientsFsxMod.Filters] = js.undefined
  
  /**
    * Maximum number of backups to return in the response. This parameter value must be greater than 0. The number of items that Amazon FSx returns is the minimum of the MaxResults parameter specified in the request and the service's internal maximum number of items per page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsFsxMod.MaxResults] = js.undefined
  
  /**
    * An opaque pagination token returned from a previous DescribeBackups operation. If a token is present, the operation continues the list from where the returning call left off.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsFsxMod.NextToken] = js.undefined
}
object DescribeBackupsRequest {
  
  inline def apply(): DescribeBackupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupsRequest]
  }
  
  extension [Self <: DescribeBackupsRequest](x: Self) {
    
    inline def setBackupIds(value: BackupIds): Self = StObject.set(x, "BackupIds", value.asInstanceOf[js.Any])
    
    inline def setBackupIdsUndefined: Self = StObject.set(x, "BackupIds", js.undefined)
    
    inline def setBackupIdsVarargs(value: BackupId*): Self = StObject.set(x, "BackupIds", js.Array(value*))
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
