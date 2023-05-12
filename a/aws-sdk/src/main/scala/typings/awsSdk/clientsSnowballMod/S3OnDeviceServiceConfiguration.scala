package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3OnDeviceServiceConfiguration extends StObject {
  
  /**
    * &gt;Fault tolerance level of the cluster. This indicates the number of nodes that can go down without degrading the performance of the cluster. This additional input helps when the specified StorageLimit matches more than one Amazon S3 compatible storage on Snow family devices service configuration.
    */
  var FaultTolerance: js.UndefOr[NodeFaultTolerance] = js.undefined
  
  /**
    * Applicable when creating a cluster. Specifies how many nodes are needed for Amazon S3 compatible storage on Snow family devices. If specified, the other input can be omitted.
    */
  var ServiceSize: js.UndefOr[typings.awsSdk.clientsSnowballMod.ServiceSize] = js.undefined
  
  /**
    * If the specified storage limit value matches storage limit of one of the defined configurations, that configuration will be used. If the specified storage limit value does not match any defined configuration, the request will fail. If more than one configuration has the same storage limit as specified, the other input need to be provided.
    */
  var StorageLimit: js.UndefOr[S3StorageLimit] = js.undefined
  
  /**
    * Storage unit. Currently the only supported unit is TB.
    */
  var StorageUnit: js.UndefOr[typings.awsSdk.clientsSnowballMod.StorageUnit] = js.undefined
}
object S3OnDeviceServiceConfiguration {
  
  inline def apply(): S3OnDeviceServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3OnDeviceServiceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3OnDeviceServiceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFaultTolerance(value: NodeFaultTolerance): Self = StObject.set(x, "FaultTolerance", value.asInstanceOf[js.Any])
    
    inline def setFaultToleranceUndefined: Self = StObject.set(x, "FaultTolerance", js.undefined)
    
    inline def setServiceSize(value: ServiceSize): Self = StObject.set(x, "ServiceSize", value.asInstanceOf[js.Any])
    
    inline def setServiceSizeUndefined: Self = StObject.set(x, "ServiceSize", js.undefined)
    
    inline def setStorageLimit(value: S3StorageLimit): Self = StObject.set(x, "StorageLimit", value.asInstanceOf[js.Any])
    
    inline def setStorageLimitUndefined: Self = StObject.set(x, "StorageLimit", js.undefined)
    
    inline def setStorageUnit(value: StorageUnit): Self = StObject.set(x, "StorageUnit", value.asInstanceOf[js.Any])
    
    inline def setStorageUnitUndefined: Self = StObject.set(x, "StorageUnit", js.undefined)
  }
}
