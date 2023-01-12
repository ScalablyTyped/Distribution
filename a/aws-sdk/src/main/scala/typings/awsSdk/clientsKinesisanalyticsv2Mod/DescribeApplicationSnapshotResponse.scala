package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationSnapshotResponse extends StObject {
  
  /**
    * An object containing information about the application snapshot.
    */
  var SnapshotDetails: typings.awsSdk.clientsKinesisanalyticsv2Mod.SnapshotDetails
}
object DescribeApplicationSnapshotResponse {
  
  inline def apply(SnapshotDetails: SnapshotDetails): DescribeApplicationSnapshotResponse = {
    val __obj = js.Dynamic.literal(SnapshotDetails = SnapshotDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationSnapshotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeApplicationSnapshotResponse] (val x: Self) extends AnyVal {
    
    inline def setSnapshotDetails(value: SnapshotDetails): Self = StObject.set(x, "SnapshotDetails", value.asInstanceOf[js.Any])
  }
}
