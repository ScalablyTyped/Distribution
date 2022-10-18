package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSnapshotTierStatusResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the snapshot's storage tier.
    */
  var SnapshotTierStatuses: js.UndefOr[snapshotTierStatusSet] = js.undefined
}
object DescribeSnapshotTierStatusResult {
  
  inline def apply(): DescribeSnapshotTierStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotTierStatusResult]
  }
  
  extension [Self <: DescribeSnapshotTierStatusResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapshotTierStatuses(value: snapshotTierStatusSet): Self = StObject.set(x, "SnapshotTierStatuses", value.asInstanceOf[js.Any])
    
    inline def setSnapshotTierStatusesUndefined: Self = StObject.set(x, "SnapshotTierStatuses", js.undefined)
    
    inline def setSnapshotTierStatusesVarargs(value: SnapshotTierStatus*): Self = StObject.set(x, "SnapshotTierStatuses", js.Array(value*))
  }
}
