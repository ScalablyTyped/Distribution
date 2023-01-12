package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSummary extends StObject {
  
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * The unique identifier for the cluster.
    */
  var Id: js.UndefOr[ClusterId] = js.undefined
  
  /**
    * The name of the cluster.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly four times more expensive would result in the normalized instance hours being incremented by four. This result is only an approximation and does not reflect the actual billing rate.
    */
  var NormalizedInstanceHours: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the Outpost where the cluster is launched. 
    */
  var OutpostArn: js.UndefOr[OptionalArnType] = js.undefined
  
  /**
    * The details about the current status of the cluster.
    */
  var Status: js.UndefOr[ClusterStatus] = js.undefined
}
object ClusterSummary {
  
  inline def apply(): ClusterSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterSummary] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: ArnType): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setId(value: ClusterId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNormalizedInstanceHours(value: Integer): Self = StObject.set(x, "NormalizedInstanceHours", value.asInstanceOf[js.Any])
    
    inline def setNormalizedInstanceHoursUndefined: Self = StObject.set(x, "NormalizedInstanceHours", js.undefined)
    
    inline def setOutpostArn(value: OptionalArnType): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setStatus(value: ClusterStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
