package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageLensDataExport extends StObject {
  
  /**
    * A container for enabling Amazon CloudWatch publishing for S3 Storage Lens metrics.
    */
  var CloudWatchMetrics: js.UndefOr[typings.awsSdk.clientsS3controlMod.CloudWatchMetrics] = js.undefined
  
  /**
    * A container for the bucket where the S3 Storage Lens metrics export will be located.  This bucket must be located in the same Region as the storage lens configuration.  
    */
  var S3BucketDestination: js.UndefOr[typings.awsSdk.clientsS3controlMod.S3BucketDestination] = js.undefined
}
object StorageLensDataExport {
  
  inline def apply(): StorageLensDataExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageLensDataExport]
  }
  
  extension [Self <: StorageLensDataExport](x: Self) {
    
    inline def setCloudWatchMetrics(value: CloudWatchMetrics): Self = StObject.set(x, "CloudWatchMetrics", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchMetricsUndefined: Self = StObject.set(x, "CloudWatchMetrics", js.undefined)
    
    inline def setS3BucketDestination(value: S3BucketDestination): Self = StObject.set(x, "S3BucketDestination", value.asInstanceOf[js.Any])
    
    inline def setS3BucketDestinationUndefined: Self = StObject.set(x, "S3BucketDestination", js.undefined)
  }
}
