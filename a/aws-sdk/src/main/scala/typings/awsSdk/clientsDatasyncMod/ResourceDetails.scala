package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDetails extends StObject {
  
  /**
    * The information that DataSync Discovery collects about the cluster in your on-premises storage system.
    */
  var NetAppONTAPClusters: js.UndefOr[typings.awsSdk.clientsDatasyncMod.NetAppONTAPClusters] = js.undefined
  
  /**
    * The information that DataSync Discovery collects about storage virtual machines (SVMs) in your on-premises storage system.
    */
  var NetAppONTAPSVMs: js.UndefOr[typings.awsSdk.clientsDatasyncMod.NetAppONTAPSVMs] = js.undefined
  
  /**
    * The information that DataSync Discovery collects about volumes in your on-premises storage system.
    */
  var NetAppONTAPVolumes: js.UndefOr[typings.awsSdk.clientsDatasyncMod.NetAppONTAPVolumes] = js.undefined
}
object ResourceDetails {
  
  inline def apply(): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceDetails] (val x: Self) extends AnyVal {
    
    inline def setNetAppONTAPClusters(value: NetAppONTAPClusters): Self = StObject.set(x, "NetAppONTAPClusters", value.asInstanceOf[js.Any])
    
    inline def setNetAppONTAPClustersUndefined: Self = StObject.set(x, "NetAppONTAPClusters", js.undefined)
    
    inline def setNetAppONTAPClustersVarargs(value: NetAppONTAPCluster*): Self = StObject.set(x, "NetAppONTAPClusters", js.Array(value*))
    
    inline def setNetAppONTAPSVMs(value: NetAppONTAPSVMs): Self = StObject.set(x, "NetAppONTAPSVMs", value.asInstanceOf[js.Any])
    
    inline def setNetAppONTAPSVMsUndefined: Self = StObject.set(x, "NetAppONTAPSVMs", js.undefined)
    
    inline def setNetAppONTAPSVMsVarargs(value: NetAppONTAPSVM*): Self = StObject.set(x, "NetAppONTAPSVMs", js.Array(value*))
    
    inline def setNetAppONTAPVolumes(value: NetAppONTAPVolumes): Self = StObject.set(x, "NetAppONTAPVolumes", value.asInstanceOf[js.Any])
    
    inline def setNetAppONTAPVolumesUndefined: Self = StObject.set(x, "NetAppONTAPVolumes", js.undefined)
    
    inline def setNetAppONTAPVolumesVarargs(value: NetAppONTAPVolume*): Self = StObject.set(x, "NetAppONTAPVolumes", js.Array(value*))
  }
}
