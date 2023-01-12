package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsBlockDevice extends StObject {
  
  /**
    * The device name that is exposed to the instance, such as /dev/sdh.
    */
  var Device: js.UndefOr[String] = js.undefined
  
  /**
    * EBS volume specifications such as volume type, IOPS, size (GiB) and throughput (MiB/s) that are requested for the EBS volume attached to an EC2 instance in the cluster.
    */
  var VolumeSpecification: js.UndefOr[typings.awsSdk.clientsEmrMod.VolumeSpecification] = js.undefined
}
object EbsBlockDevice {
  
  inline def apply(): EbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsBlockDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EbsBlockDevice] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: String): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
    
    inline def setVolumeSpecification(value: VolumeSpecification): Self = StObject.set(x, "VolumeSpecification", value.asInstanceOf[js.Any])
    
    inline def setVolumeSpecificationUndefined: Self = StObject.set(x, "VolumeSpecification", js.undefined)
  }
}
