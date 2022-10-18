package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecoverySnapshotsResponse extends StObject {
  
  /**
    * An array of Recovery Snapshots.
    */
  var items: js.UndefOr[RecoverySnapshotsList] = js.undefined
  
  /**
    * The token of the next Recovery Snapshot to retrieve.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeRecoverySnapshotsResponse {
  
  inline def apply(): DescribeRecoverySnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecoverySnapshotsResponse]
  }
  
  extension [Self <: DescribeRecoverySnapshotsResponse](x: Self) {
    
    inline def setItems(value: RecoverySnapshotsList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RecoverySnapshot*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
