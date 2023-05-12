package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiRegionAccessPointRoute extends StObject {
  
  /**
    * The name of the Amazon S3 bucket for which you'll submit a routing configuration change. Either the Bucket or the Region value must be provided. If both are provided, the bucket must be in the specified Region.
    */
  var Bucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    * The Amazon Web Services Region to which you'll be submitting a routing configuration change. Either the Bucket or the Region value must be provided. If both are provided, the bucket must be in the specified Region.
    */
  var Region: js.UndefOr[RegionName] = js.undefined
  
  /**
    * The traffic state for the specified bucket or Amazon Web Services Region.  A value of 0 indicates a passive state, which means that no new traffic will be routed to the Region.  A value of 100 indicates an active state, which means that traffic will be routed to the specified Region.  When the routing configuration for a Region is changed from active to passive, any in-progress operations (uploads, copies, deletes, and so on) to the formerly active Region will continue to run to until a final success or failure status is reached. If all Regions in the routing configuration are designated as passive, you'll receive an InvalidRequest error.
    */
  var TrafficDialPercentage: typings.awsSdk.clientsS3controlMod.TrafficDialPercentage
}
object MultiRegionAccessPointRoute {
  
  inline def apply(TrafficDialPercentage: TrafficDialPercentage): MultiRegionAccessPointRoute = {
    val __obj = js.Dynamic.literal(TrafficDialPercentage = TrafficDialPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiRegionAccessPointRoute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiRegionAccessPointRoute] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setRegion(value: RegionName): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setTrafficDialPercentage(value: TrafficDialPercentage): Self = StObject.set(x, "TrafficDialPercentage", value.asInstanceOf[js.Any])
  }
}
