package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockDeviceMapping extends StObject {
  
  /**
    * The device name assigned to the volume (for example, /dev/sdh or xvdh). For more information, see Device naming on Linux instances in the Amazon EC2 User Guide for Linux Instances.  To define a block device mapping, set the device name and exactly one of the following properties: Ebs, NoDevice, or VirtualName. 
    */
  var DeviceName: XmlStringMaxLen255
  
  /**
    * Information to attach an EBS volume to an instance at launch.
    */
  var Ebs: js.UndefOr[typings.awsSdk.autoscalingMod.Ebs] = js.undefined
  
  /**
    * Setting this value to true prevents a volume that is included in the block device mapping of the AMI from being mapped to the specified device name at launch. If NoDevice is true for the root device, instances might fail the EC2 health check. In that case, Amazon EC2 Auto Scaling launches replacement instances.
    */
  var NoDevice: js.UndefOr[typings.awsSdk.autoscalingMod.NoDevice] = js.undefined
  
  /**
    * The name of the instance store volume (virtual device) to attach to an instance at launch. The name must be in the form ephemeralX where X is a number starting from zero (0), for example, ephemeral0.
    */
  var VirtualName: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object BlockDeviceMapping {
  
  inline def apply(DeviceName: XmlStringMaxLen255): BlockDeviceMapping = {
    val __obj = js.Dynamic.literal(DeviceName = DeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDeviceMapping]
  }
  
  extension [Self <: BlockDeviceMapping](x: Self) {
    
    inline def setDeviceName(value: XmlStringMaxLen255): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setEbs(value: Ebs): Self = StObject.set(x, "Ebs", value.asInstanceOf[js.Any])
    
    inline def setEbsUndefined: Self = StObject.set(x, "Ebs", js.undefined)
    
    inline def setNoDevice(value: NoDevice): Self = StObject.set(x, "NoDevice", value.asInstanceOf[js.Any])
    
    inline def setNoDeviceUndefined: Self = StObject.set(x, "NoDevice", js.undefined)
    
    inline def setVirtualName(value: XmlStringMaxLen255): Self = StObject.set(x, "VirtualName", value.asInstanceOf[js.Any])
    
    inline def setVirtualNameUndefined: Self = StObject.set(x, "VirtualName", js.undefined)
  }
}
